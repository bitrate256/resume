<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="../common/head.jsp"%>
<script>
	var searchSort = "";	//변수 초기화
	var searchVal = "";		//변수 초기화

	$(function () {
		// 페이지 처음 접근시 리스트 표시 좌표
		adminUserListAjaxfn(1);	//현재 page =1 ->기본시작, 접근하는 순간 시작
	})

	// 리스트 Ajax 처리
	function adminUserListAjaxfn(cPage) {
		$.ajax({
			url: "<c:url value="/"/>admin/adminUserListAjax",
			data: {
				"cPage": cPage,
				"searchSort": searchSort,
				"searchVal": searchVal,
			},
			dataType: "html",
			success: function (data) {
				$('#admin_userList').html(data);
			}
		})
	}

	//search ----------------------
	function searchBoxFn() {
		searchSort = $('#searchSort').val();
		searchVal = $('#searchVal').val();
		adminUserListAjaxfn(1);
	}

</script>
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

<div id="example1_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
									<div class="row">
										<div class="col-sm-6"></div>
										<div class="col-sm-6">
											<div id="example1_filter" class="dataTables_filter">

											</div>

										</div>
									</div>

									<div id="admin_userList"></div>

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