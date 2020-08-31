<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="../common/head.jsp"%>
<style>

.cursor {

	cursor: pointer;
}

</style>



<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<!-- Main Header -->
		<%@ include file="../user/common/user_main_header.jsp" %>

		<!-- Left side column. contains the logo and sidebar -->
		<%@ include file="../user/common/user_left_column.jsp" %>
		
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">

			<!-- Main content -->
			<section class="content container-fluid">

				<div class="row">
					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<div class="row">
									<div class="col flexBox" style="justify-content: flex-start; padding: 0 16px;">
										<h2 class="box-title">이력 관리</h2>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
													
									</div>
									
									
									

  			<div class="cursor">
			<img name="userInfo" class="col-xs-6" src="<c:url value='/img/inout.jpg'/>"
			id="workList" onclick="javascript:location.href='<c:url value = '/'/>user/userInfo'" align="left">
			</div>
			<div class="cursor">
			<img name="userResume" class="col-xs-6" src="<c:url value='/img/vacation.jpg'/>"
			id="workList" onclick="javascript:location.href='<c:url value = '/'/>user/userResume'" align="left">
			</div>
			</div>
			<button type="button" class="btn btn-danger col-xs-6" onclick="javascript:location.href='<c:url value = '/'/>user/userInfo'">내 정보 수정</button>
			<button type="button" class="btn btn-info col-xs-6" onclick="javascript:location.href='<c:url value = '/'/>user/userResume'">내 이력 확인</button>
			</div>


								

			</section>
			<!-- /.content -->



		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<%@ include file="../user/common/user_main_footer.jsp" %>
	</div>
	<!-- ./wrapper -->

</body>

</html>