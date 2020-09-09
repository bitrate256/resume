<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@include file="../common/head.jsp"%>
<%@include file="../user/common/user_main_header.jsp"%>
<%@include file="../user/common/user_left_column.jsp"%>
<%
	pageContext.setAttribute("replaceChar", "\n");
%>

<!-- jQuery UI CSS파일  -->
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />


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

<head>

<!-- 자격증 선택 함수 -->
<script type="text/javascript">
	function SetCertiTail(certiValue) {
		/* 	  var certi = document.all("certi") */// 사용자 입력
		var certiTail = document.all("certi_value") // Select box

		if (certiValue == "notSelected")
			return;
		else if (certiValue == "etc") {
			certiTail.readOnly = false;
			certiTail.value = "";
			certiTail.focus();
		} else {
			certiTail.readOnly = true;
			certiTail.value = certiValue;
		}
	}
</script>

<!-- 자격 취득일자 date picker 함수 -->
<!-- 같은 함수 사용하는 것으로 변경. 해당 함수는 사용하지 않음. -->
<!-- <script>
	$(function() {
		//input을 datepicker로 선언
		$("#certi_date").datepicker(
				{
					dateFormat : 'yy-mm-dd', //Input Display Format 변경
					showOtherMonths : true, //빈 공간에 현재월의 앞뒤월의 날짜를 표시
					showMonthAfterYear : true, //년도 먼저 나오고, 뒤에 월 표시
					changeYear : true, //콤보박스에서 년 선택 가능
					changeMonth : true, //콤보박스에서 월 선택 가능
					yearSuffix : "년", //달력의 년도 부분 뒤에 붙는 텍스트
					monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
							'9', '10', '11', '12' ], //달력의 월 부분 텍스트
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ], //달력의 월 부분 Tooltip 텍스트
					dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ], //달력의 요일 부분 텍스트
					dayNames : [ '일요일', '월요일', '화요일', '수요일', '목요일', '금요일',
							'토요일' ], //달력의 요일 부분 Tooltip 텍스트
					maxDate : "+0" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
				});
		//초기값을 오늘 날짜로 설정
		$('#certi_date').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
	}); -->
</script>

<!-- 최종학력 date picker 함수 -->
<!-- 같은 함수 사용하는 것으로 변경. 함수 이름은 datepicker 로 정의. -->
<script>
	$(function() {
		//input을 datepicker로 선언
		$(".datepicker").datepicker(
				{
					dateFormat : 'yy-mm-dd', //Input Display Format 변경
					showOtherMonths : true, //빈 공간에 현재월의 앞뒤월의 날짜를 표시
					showMonthAfterYear : true, //년도 먼저 나오고, 뒤에 월 표시
					changeYear : true, //콤보박스에서 년 선택 가능
					changeMonth : true, //콤보박스에서 월 선택 가능
					yearSuffix : "년", //달력의 년도 부분 뒤에 붙는 텍스트
					monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
							'9', '10', '11', '12' ], //달력의 월 부분 텍스트
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ], //달력의 월 부분 Tooltip 텍스트
					dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ], //달력의 요일 부분 텍스트
					dayNames : [ '일요일', '월요일', '화요일', '수요일', '목요일', '금요일',
							'토요일' ], //달력의 요일 부분 Tooltip 텍스트
					maxDate : "+0" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
				});
		//초기값을 오늘 날짜로 설정
		$('#date_picker').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
	});
</script>

</head>

<body class="sidebar-mini layout-fixed" style="height: auto;">

	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper" style="min-height: 855px;">
		<!-- Content Header (Page header) -->
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0 text-dark">개 인 이 력 카 드</h1>
					</div>
					<!-- /.col -->
					<div class="col-sm-6">
						<ol class="float-sm-right">
							<div class="btn-group">
								<!-- 좌우 버튼 크기차이 왜 발생하지??? -->
								<input type="hidden" value="${info.r_id }">
								<input type="hidden" value="${info.u_id }">
								<input type="hidden" value="${info.d_id }">
								<button type="submit" id="" name=""
									class="btn btn-block bg-gradient-success">등록</button>
								<button type="button" id=""	class="btn btn-block bg-gradient-danger">삭제</button>
							</div>
						</ol>
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /.content-header -->

		<!-- Main content -->
		<div class="container-fluid">

			<div class="row">

				<!-- <section class="col-md-3 connectedSortable ui-sortable"> -->
				<!-- 이쪽에서 섹션 클래스를 묶어버려서 의도한 정렬이 되지 않았던 것. -->

				<!-- Profile Image -->
				<div class="card card-primary card-outline col-md-2">
					<div class="card-body box-profile">
						<div class="text-center">
							<img class="profile-user-img img-fluid img-circle"
								src="../../dist/img/user4-128x128.jpg"
								alt="User profile picture">
						</div>

						<h3 class="profile-username text-center">${loginUser.u_name}</h3>

						<!-- <p class="text-muted text-center">직군or직무or직위</p> -->

						<ul class="list-group list-group-unbordered mb-3">
							<li class="list-group-item text-center"><b>${loginUser.u_position}</b>
								<!-- <a class="float-right">수치/갯수</a> --></li>
						</ul>

						<a href="#" class="btn btn-primary btn-block"><b>사진 업로드</b></a>
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->

				<div class="card card-primary col-md-5">
					<div class="card-header">
						<h3 class="card-title">1. 신상기록</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form action="<%=contextPath%>/resume/resumeCreate" method="post"
							name="form" onsubmit="return checkSubmit();">
							<strong><i class="fas fa-mobile-alt"></i> 성명</strong>
							<p class="text-muted">${loginUser.u_name}</p>
							<hr>

							<strong><i class="fas fa-envelope"></i> 소속회사</strong>
							<p class="text-muted">비앤오소프트(주)</p>
							<hr>

							<strong><i class="fas fa-map-marker-alt mr-1"></i> 부서</strong>
							<p class="text-muted">${loginUser.d_id}</p>
							<hr>

							<strong><i class="fas fa-map-marker-alt mr-1"></i> 병역</strong>
							<p class="text-muted">
								<c:if test="${ loginUser.u_ms eq 'F'}">
									<option>필</option>
								</c:if>
								<c:if test="${ loginUser.u_ms eq 'FN'}">
									<option>미필</option>
								</c:if>
								<c:if test="${ loginUser.u_ms eq 'N'}">
									<option>면제</option>
								</c:if>
								<c:if test="${ loginUser.u_ms eq 'NA'}">
									<option>해당없음</option>
								</c:if>
							</p>
							<hr>
						</form>
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->

				<!-- /.card -->

				<div class="card card-primary col-md-5">
					<div class="card-header">
						<h3 class="card-title">_</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">

						<strong><i class="fas fa-map-marker-alt mr-1"></i> 기술등급</strong>
						<p class="text-muted">
							<c:if test="${loginUser.u_tgrade eq 'S' }">
								<option>특급</option>
							</c:if>
							<c:if test="${loginUser.u_tgrade eq 'H' }">
								<option>고급</option>
							</c:if>
							<c:if test="${loginUser.u_tgrade eq 'M' }">
								<option>중급</option>
							</c:if>
							<c:if test="${loginUser.u_tgrade eq 'B' }">
								<option>초급</option>
							</c:if>
						</p>
						<hr>

						<strong><i class="fas fa-envelope"></i> 결혼</strong>
						<p class="text-muted">
							<c:if test="${loginUser.u_marry eq 'Y' }">
								<option>기혼</option>
							</c:if>
							<c:if test="${loginUser.u_marry eq 'N'}">
								<option>미혼</option>
							</c:if>
						</p>
						<hr>

						<strong><i class="fas fa-map-marker-alt mr-1"></i> 직위</strong>
						<p class="text-muted">${loginUser.u_position}</p>
						<hr>

						<strong><i class="fas fa-map-marker-alt mr-1"></i> 경력</strong>
						<p class="text-muted">${loginUser.u_career}</p>
						<hr>

					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->
				<!-- </section>  -->

			</div>

			<div class="card card-primary">
				<div class="card-header">
					<h3 class="card-title"></h3>
				</div>
				<!-- /.card-header -->
				<div class="card-body">

					<strong><i class="fas fa-mobile-alt"></i> 전화</strong>
					<p class="text-muted">${loginUser.u_phone}</p>
					<hr>

					<strong><i class="fas fa-envelope"></i> 이메일</strong>
					<p class="text-muted">${loginUser.u_email}</p>
					<hr>

					<strong><i class="fas fa-map-marker-alt mr-1"></i> 주소</strong>
					<p class="text-muted">${loginUser.u_address}</p>
					<hr>

				</div>
				<!-- /.card-body -->
			</div>

			<!-- 2. 학력 -->
			<div class="card card-primary col-md-12">
				<!-- general form elements disabled -->

				<div class="card card-warning">
					<div class="card-header">
						<h3 class="card-title">2. 최종학력</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form role="form" action="<%=contextPath%>/resume/resumeInsert"
							mothod="post" name="form">
							<div class="row">
								<div class="col-sm-6">
									<!-- text input -->
									<div class="form-group">
										<label>학교/과정명</label> <input type="text" class="form-control" name="a_hschool">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label>졸업 날짜</label> <input type="text"
											class="form-control datepicker" name="a_hschooldate">
									</div>
								</div>
								<!-- 비활성화 폼	
                                <div class="col-sm-6">
									<div class="form-group">
										<label>Text Disabled</label> <input type="text"
											class="form-control" placeholder="Enter ..." disabled="">
									</div>
								</div> -->
							</div>
							<button type="submit" id="resumeInsert" name="resumeInsert"
								class="btn btn-block bg-gradient-success">등록</button>
								
						</form>
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->
			</div>

			<!-- 3. 자격증 -->
			<div class="card card-primary col-md-12">
				<!-- general form elements disabled -->
				<div class="card card-warning">
					<div class="card-header">
						<h3 class="card-title">3. 자격증</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form role="form">
							<div class="row">
								<!-- selectbox / input -->
								<div class="col-sm-6">
									<div class="form-group">
										<label>자격증 선택</label> <input type="text" name="certi_value"
											value="" ReadOnly="true" class="form-control"></input> <select
											name="certiCheck"
											onchange="SetCertiTail(certiCheck.options[this.selectedIndex].value)">
											<option value="notSelected">::선택하세요::</option>
											<option value="etc">직접입력</option>
											<option value="정보처리기사">정보처리기사</option>
											<option value="정보처리산업기사">정보처리산업기사</option>
											<option value="리눅스마스터">리눅스마스터</option>
											<option value="네트워크관리사">네트워크관리사</option>
										</select>
									</div>
								</div>

								<!-- 데이트 picker -->
								<div class="col-sm-6">
									<div class="form-group">
										<label>취득 날짜</label> <input type="text"
											class="form-control datepicker">
									</div>
								</div>
							</div>
							<div class="row">
								<!-- selectbox / input -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" name="certi_value" value="" ReadOnly="true"
											class="form-control"></input> <select name="certiCheck"
											onchange="SetCertiTail(certiCheck.options[this.selectedIndex].value)">
											<option value="notSelected">::선택하세요::</option>
											<option value="etc">직접입력</option>
											<option value="정보처리기사">정보처리기사</option>
											<option value="정보처리산업기사">정보처리산업기사</option>
											<option value="리눅스마스터">리눅스마스터</option>
											<option value="네트워크관리사">네트워크관리사</option>
										</select>
									</div>
								</div>

								<!-- 데이트 picker -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
							</div>
							<div class="row">
								<!-- selectbox / input -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" name="certi_value" value="" ReadOnly="true"
											class="form-control"></input> <select name="certiCheck"
											onchange="SetCertiTail(certiCheck.options[this.selectedIndex].value)">
											<option value="notSelected">::선택하세요::</option>
											<option value="etc">직접입력</option>
											<option value="정보처리기사">정보처리기사</option>
											<option value="정보처리산업기사">정보처리산업기사</option>
											<option value="리눅스마스터">리눅스마스터</option>
											<option value="네트워크관리사">네트워크관리사</option>
										</select>
									</div>
								</div>

								<!-- 데이트 picker -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
							</div>
							<div class="row">
								<!-- selectbox / input -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" name="certi_value" value="" ReadOnly="true"
											class="form-control"></input> <select name="certiCheck"
											onchange="SetCertiTail(certiCheck.options[this.selectedIndex].value)">
											<option value="notSelected">::선택하세요::</option>
											<option value="etc">직접입력</option>
											<option value="정보처리기사">정보처리기사</option>
											<option value="정보처리산업기사">정보처리산업기사</option>
											<option value="리눅스마스터">리눅스마스터</option>
											<option value="네트워크관리사">네트워크관리사</option>
										</select>
									</div>
								</div>

								<!-- 데이트 picker -->
								<div class="col-sm-6">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
							</div>
					</div>
					</form>
				</div>
				<!-- /.card-body -->
			</div>
			<!-- /.card -->
		</div>

		<!-- 4. 경력 -->
		<div class="row">
			<div class="card card-primary col-md-12">
				<!-- general form elements disabled -->
				<div class="card card-warning">
					<div class="card-header">
						<h3 class="card-title">4. 경력</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form role="form">
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<label>근무 회사명</label> <input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<label>시작일</label> <input type="text"
											class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<label>종료일</label> <input type="text"
											class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-2">
									<!-- text input -->
									<div class="form-group">
										<label>직 위</label> <input type="text" class="form-control">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<label>담당 업무</label> <input type="text" class="form-control">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-2">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-2">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-2">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-2">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
						</form>
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->
			</div>
		</div>

		<!-- 5. 교육 -->
		<div class="row">
			<div class="card card-primary col-md-7">
				<div class="card card-warning">
					<div class="card-header">
						<h3 class="card-title">5. 교육</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form role="form">
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<label>교육기관</label> <input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<label>시작일</label> <input type="text"
											class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<label>종료일</label> <input type="text"
											class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<label>교육과정명</label> <input type="text" class="form-control">
									</div>
								</div>
							</div>
						</form>
						<form role="form">
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
						</form>
						<form role="form">
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
						</form>
						<form role="form">
							<div class="row">
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<!-- 데이트 picker -->
								<div class="col-sm-3">
									<div class="form-group">
										<input type="text" class="form-control datepicker">
									</div>
								</div>
								<div class="col-sm-3">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
							</div>
						</form>
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->
			</div>

			<!-- 6. 특수기술 -->
			<div class="card card-primary col-md-5">
				<div class="card card-warning">
					<div class="card-header">
						<h3 class="card-title">6. 특수기술</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form role="form">
							<div class="row">
								<div class="col-sm-8">
									<!-- text input -->
									<div class="form-group">
										<label>사용 가능한 프로그램</label> <input type="text"
											class="form-control">
									</div>
								</div>
								<!-- 셀렉트 박스 -->
								<div class="col-sm-4">
									<div class="form-group">
										<label>숙련도</label> <select class="form-control">
											<option>상</option>
											<option>중</option>
											<option>하</option>
										</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-8">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 셀렉트 박스 -->
								<div class="col-sm-4">
									<div class="form-group">
										<select class="form-control">
											<option>상</option>
											<option>중</option>
											<option>하</option>
										</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-8">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 셀렉트 박스 -->
								<div class="col-sm-4">
									<div class="form-group">
										<select class="form-control">
											<option>상</option>
											<option>중</option>
											<option>하</option>
										</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-8">
									<!-- text input -->
									<div class="form-group">
										<input type="text" class="form-control">
									</div>
								</div>
								<!-- 셀렉트 박스 -->
								<div class="col-sm-4">
									<div class="form-group">
										<select class="form-control">
											<option>상</option>
											<option>중</option>
											<option>하</option>
										</select>
									</div>
								</div>
							</div>
						</form>

					</div>
					<!-- /.card-body -->
				</div>
			</div>

			<!-- SKILL INVENTORY -->
			<div class="card card-primary col-md-12">
				<div class="card card-success">
					<div class="card-header">
						<h3 class="card-title">SKILL INVENTORY</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<div class="row">
							<div class="col-sm-2">
								<!-- text input -->
								<div class="form-group">
									<label>프로젝트명(업무명)</label> <input type="text"
										class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>참여기간</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>고객사</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>근무회사</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>역할</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>기종</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>OS</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>언어</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>DBMS</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>TOOL</label> <input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<label>기타</label> <input type="text" class="form-control">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-2">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="col-sm-1">
								<!-- text input -->
								<div class="form-group">
									<input type="text" class="form-control">
								</div>
							</div>
						</div>

						<!-- 7개 ROW 추가 필요. -->

					</div>
					<!-- /.card-body -->
				</div>
			</div>
			<button type="submit" id="resumeInsert" name="resumeInsert"
				class="btn btn-block bg-gradient-success">등록</button>
		</div>
	</div>
	<!-- Main Footer -->
	<%@ include file="../user/common/user_mainFooter.jsp"%>
	</div>
</body>
</html>

