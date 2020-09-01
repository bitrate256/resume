<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="../common/head.jsp"%>
<html>
<style>

.register-box {
    width: 400px;
    margin: 3% auto;
}

.form-control-feedback {
    position: absolute;
    top: 0;
    right: 0;
    z-index: 2;
    display: block;
    width: 34px;
    height: 34px;
    line-height: 34px;
    text-align: center;
    pointer-events: none;
}

</style>
<script>
$(document).ready(function() {

	$("#myPageUserInfoResult").click(function() {
		var confirmUpdate = confirm('변경된 내용을 저장 하시겠습니까?');
		
		if(confirmUpdate == true) {
		var url = "<%=contextPath%>"+"/userMyPage/myUserInfoResult";
		$("#updateUserInfo").attr("action", url);
		$("#updateUserInfo").submit();
		}
		else false;		
	});

});

// 아이디 유효성 검사(1 = 중복 / 0 != 중복)
$(function(){
	

	$("#u_email").blur(function() {
		// id = "id_reg" / name = "userId"
		var u_email = $('#u_email').val();
		
		$.ajax({
			url : '${pageContext.request.contextPath}/user/emailCheck?u_email='+ u_email,
			type : 'get',
			dataType : 'text',
			success : function(data) {
				console.log("1 = 중복o / 0 = 중복x : "+ data);	
				
				
				var email = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
				
				if (u_email == "") {
						
						$("#email_check").text("이메일을 입력해주세요");
						$("#email_check").css("color", "red");
						
					} else if(!email.test($("input[id='u_email']").val())){
	
							$('#email_check').text('올바르지않은 이메일 형식입니다');
							$('#email_check').css('color', 'red');
										
							
						} else if(data == '1'){
							
						$('#email_check').text("이미 사용중인 이메일입니다.");
						$('#email_check').css('color', 'red');
						
						} else {
							$('#email_check').text("사용가능한 이메일입니다.");
							$('#email_check').css('color', 'blue');
					}
							
					
					}, error : function() {
							console.log("실패");
				}
			});
		});
});

//패스워드 일치 체크
$(function(){ 
	
	$("#pwd_success").hide(); 
	$("#pwd_fail").hide();
	
	$("input").keyup(function(){
		
		var pwd1=$("#u_pwd").val(); 
		var pwd2=$("#u_pwd2").val();
		
		var password = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{6,15}$/;
		
			if(!password.test($("input[id='u_pwd']").val())){
			
				$('#pwd_check').text('6~15자 영문/숫자/특수문자 포함 입력해주세요');
				$('#pwd_check').css('color', 'red');
				
				
			} else {
					$("#pwd_check").hide();
					
					if(pwd1 != "" || pwd2 != "") {
					
					
						if(pwd1 == pwd2){
					
							$("#pwd_success").show(); 
							$("#pwd_success").css("color", "blue"); 
							$("#pwd_fail").hide(); 
							
							
						} else {
					
							$("#pwd_success").hide(); 
							$("#pwd_fail").show();
							$("#pwd_fail").css("color", "red");
					} 
				} 
			}
			
			
	}); 
});


//휴대폰번호 정규식
$(function(){ 
	
	$("#u_phone").blur(function(){
		var phone = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/;

		if (phone.test($("input[id='u_phone']").val())) {
	
			$("#phone_check").text('');
		} else {
			$('#phone_check').text('번호를 확인해주세요');
			$('#phone_check').css('color', 'red');
		}		
	}); 
});



// onsubmit
function checkSubmit() {
	
	if(form.u_phone.value == "") {
		$('#phone_check').text('번호를 입력해주세요');
		$('#phone_check').css('color', 'red');
		
		return false;
	} 
	
	if(form.u_name.value == "") {
		$('#name_check').text('이름을 입력해주세요');
		$('#name_check').css('color', 'red');
		
		return false;
		
	} 

	
	
}

</script>
<body class="hold-transition register-page skin-blue sidebar-mini">
	
	<!-- Main Header -->


    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="../user/common/user_left_column.jsp" %>
    
    <div class="register-box">
	<div class="register-logo">
	<a href="#">
		<b>Work</b>Record</a>
	</div>
	
	<div class="register-box-body">
	<p class="login-box-msg">사용자 정보 수정</p>
	<form id="updateUserInfo" method="post" name="form" onsubmit="return checkSubmit();">
	<input type="hidden" name="u_id" value="${user.u_id }">
		<br>
		<div class="form-group has-feedback">
			이메일<input type="text" class="form-control" id="u_email" name="u_email" value="${user.u_email }" readonly>
			
			<div id="email_check"></div>
      	</div>
		
		<div class="form-group has-feedback">
        	<input type="password" class="form-control" id="u_pwd" name="u_pwd" maxlength="15" placeholder="비밀번호">
        	
      	</div>
      	
      	<div class="form-group has-feedback">
        	<input type="password" class="form-control" id="u_pwd2" name="u_pwd2" maxlength="15" placeholder="비밀번호 확인">
        	
			<div id="pwd_check"></div>
			<div id="pwd_success">비밀번호가 일치합니다</div>
			<div id="pwd_fail">비밀번호가  일치하지 않습니다</div>
      	</div>
      	
      	<div class="form-group has-feedback">
        	핸드폰번호<input type="text" class="form-control" id="u_phone" name="u_phone" value="${ user.u_phone}">
        	
			<div id="phone_check"></div>
      	</div>
      	
      	<div class="form-group has-feedback">
        	이름<input type="text" class="form-control" id="u_name" name="u_name" value="${user.u_name }" readonly>
        	
      	</div>
      	
      	<div class="form-group has-feedback">
        	부서코드<input type="text" class="form-control" id="d_id" name="d_id" value="${user.d_id }" readonly>
        	
      	</div>
      	<div class="form-group has-feedback">
        	직급<input type="text" class="form-control" id="u_position" name="u_position" value="${user.u_position }" readonly>
        	</div>
		<div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <div class="icheckbox_square-blue checked" aria-checked="true" aria-disabled="false" style="position: relative;">
              	<input type="checkbox" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;">
              	<ins class="iCheck-helper" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
              </div> <!--  I agree to the <a href="#">terms</a> -->
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
			<button type="button" class="btn btn-primary btn-block btn-flat" id="myPageUserInfoResult">저장</button>
        </div>
        <!-- /.col -->
     	</div>
		
					
		
	</form>
			
	</div>
	
	
	</div>
	 <%@ include file="../user/common/user_main_footer.jsp" %>
</body>

</html>