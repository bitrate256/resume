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

<script>
	var searchSort = "";	//변수 초기화
	var searchVal = "";		//변수 초기화

	$(function () {
		// 페이지 처음 접근시 리스트 표시 좌표
		resumeListAjaxfn(1);	//현재 page =1 ->기본시작, 접근하는 순간 시작
	})

	// 리스트 Ajax 처리
	function resumeListAjaxfn(cPage) {
		$.ajax({
			url: "<c:url value="/"/>resume/resumeListAjax",
			data: {
				"cPage": cPage,
				"searchSort": searchSort,
				"searchVal": searchVal,
			},
			dataType: "html",
			success: function (data) {
				$('#resumeList').html(data);
			}
		})
	}
</script>

<body class="sidebar-mini layout-fixed" style="height: auto;">

<div id="example1_wrapper"
	class="dataTables_wrapper form-inline dt-bootstrap">
	<div class="row">
		<div class="col-sm-6"></div>
		<div class="col-sm-6">
			<div id="example1_filter" class="dataTables_filter"></div>

		</div>
	</div>

	<div id="resumeList"></div>

</div>

<%-- 	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper" style="min-height: 855px;">
		<!-- Content Header (Page header) -->
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0 text-dark">이력 관리</h1>
					</div>
					<!-- /.col -->
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="#">우상단 메뉴</a></li>
							<li class="breadcrumb-item active">이력 등록</li>
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
		<section class="content">

			<div class="register-box-body">
				<form action="<%=contextPath%>/resume/resumeCreate" method="post"
					name="form">
					<br> <input hidden="${loginUser.u_id }"> <input
						hidden="${loginUser.d_id }">
					<div class="row">
						<div class="col-xs-8">
							<div class="checkbox icheck"></div>
						</div>
						<!-- /.col -->
						<div class="col-xs-4">
							<input type="submit" class="btn btn-primary" id="submit"
								name="submit" value="새 이력 등록">
							<button type="button" class="btn btn-primary"
								onclick="javascript:location.href='<c:url value="/"/>user/userlogin'">취소</button>
						</div>
						<!-- /.col -->
					</div>
				</form>

			</div>

			<div class="row">
				<div class="col-sm-12">
					<table id="example1"
						class="table table-bordered table-striped dataTable dtr-inline"
						role="grid" aria-describedby="example1_info">
						<thead>
							<tr role="row">
							<th class="sorting_asc" tabindex="0" aria-controls="example1"
									rowspan="1" colspan="1" aria-sort="ascending"
									aria-label="Rendering engine: activate to sort column descending">
									이력관리번호</th>
								<th class="sorting_asc" tabindex="0" aria-controls="example1"
									rowspan="1" colspan="1" aria-sort="ascending"
									aria-label="Rendering engine: activate to sort column descending">
									이력상태</th>
								<th class="sorting" tabindex="0" aria-controls="example1"
									rowspan="1" colspan="1"
									aria-label="Browser: activate to sort column ascending">이력수정날짜</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="resumeAllList" items="${resumeAllList }">
								<tr role="row" class="odd">
									<td onclick="javascript:location.href='<c:url value="/"/>resume/resumeSelectOne?d_id=${resumeAllList.r_id }'">${resumeAllList.r_id }</td>
									<td tabindex="0" class="sorting_1">${resumeAllList.r_status }</td>
									<td tabindex="0" class="sorting_1">${resumeAllList.r_newdate }</td>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>

		</section>
		<!-- /.content -->



	</div> --%>
	<!-- /.content-wrapper -->

	<!-- Main Footer -->
	<%@include file="../user/common/user_main_footer.jsp"%>
	<!-- ./wrapper -->



	<div class="jqvmap-label" style="display: none;"></div>
</body>
</html>

