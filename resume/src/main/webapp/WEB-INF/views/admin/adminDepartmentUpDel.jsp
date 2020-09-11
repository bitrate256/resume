<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@include file="../common/head.jsp"%>
<%@include file="../user/common/user_main_header.jsp"%>
<%@include file="../user/common/user_left_column.jsp"%>
<script>
$(document).ready(function() {
	
	$("#adminDepartmentUpdate").click(function() {

		

		var url = "<%=contextPath%>"+"/admin/adminDepartmentUpdate"; 
				$("#adminDepartmentUpDel").attr("action", url);
				$("#adminDepartmentUpDel").submit();

		});

	
$("#adminDepartmentDelete").click(function() {

		

		var url = "<%=contextPath%>"+"/admin/adminDepartmentDelete";
			$("#adminDepartmentUpDel").attr("action", url);
			$("#adminDepartmentUpDel").submit();

		});
	});
</script>

<body class="sidebar-mini layout-fixed" style="height: auto;">


	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper" style="min-height: 855px;">
		<!-- Content Header (Page header) -->
		<div class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1 class="m-0 text-dark">부서 수정/삭제</h1>
					</div>
					<!-- /.col -->
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><button id="adminDepartmentUpdate"
									class="btn btn-warning btn-flat">수정</button></li>
							<li class="breadcrumb-item active"><button
									id="adminDepartmentDelete" class="btn btn-danger btn-flat">삭제</button></li>
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



				<div class="card card-primary col-md-5">
					<div class="card-header">
						<h3 class="card-title">1. 부서 코드</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">
						<form id="adminDepartmentUpDel">
							<strong>부서 코드</strong> <input type="text" class="form-control"
								id="d_id" name="d_id" placeholder="부서 코드" value="${department.d_id }" readonly="readonly">
					</div>
					<!-- /.card-body -->
				</div>
				<!-- /.card -->

				<!-- /.card -->

				<div class="card card-primary col-md-5">
					<div class="card-header">
						<h3 class="card-title">2. 부서 이름</h3>
					</div>
					<!-- /.card-header -->
					<div class="card-body">


						<strong>부서 이름</strong> <input type="text" class="form-control"
							id="d_name" name="d_name" placeholder="부서 이름" value="${department.d_name }">
					</div>

				</div>
				<!-- /.card -->
				<!-- </section>  -->

			</div>

		</div>
		</form>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<%@include file="../user/common/user_main_footer.jsp"%>

		

