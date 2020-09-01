<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<<<<<<< HEAD


		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="index3.html" class="brand-link"> 
				<span class="brand-text font-weight-light">이력관리</span>
			</a>
			

			<!-- Sidebar -->
			<div
				class="sidebar os-host os-theme-light os-host-overflow os-host-overflow-y os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-transition">
				<div class="os-resize-observer-host observed">
					<div class="os-resize-observer" style="left: 0px; right: auto;"></div>
				</div>
				<div class="os-size-auto-observer observed"
					style="height: calc(100% + 1px); float: left;">
					<div class="os-resize-observer"></div>
				</div>
				<div class="os-content-glue"
					style="margin: 0px -8px; width: 249px; height: 648px;"></div>
				<div class="os-padding">
					<div class="os-viewport os-viewport-native-scrollbars-invisible"
						style="overflow-y: scroll;">
						<div class="os-content"
							style="padding: 0px 8px; height: 100%; width: 100%;">
							<!-- Sidebar user panel (optional) -->
							<div class="user-panel mt-3 pb-3 mb-3 d-flex">
								<div class="info">
									<a href="#" class="d-block">메뉴</a>
								</div>
							</div>

							<!-- Sidebar Menu -->
							<nav class="mt-2">
								<ul class="nav nav-pills nav-sidebar flex-column"
									data-widget="treeview" role="menu" data-accordion="false">
									<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
									<li class="nav-item has-treeview menu-open"><a href="#"
										class="nav-link active"> <i
											class="nav-icon fas fa-tachometer-alt"></i>
											<p>
												HOME <i class="right fas fa-angle-left"></i>
											</p>
									</a>
										
									<li class="nav-item"><a href="pages/widgets.html"
										class="nav-link"> <i class="nav-icon fas fa-th"></i>
											<p>
												마이페이지 <span class="right badge badge-danger">내 정보수정</span>
											</p>
									</a></li>
									<li class="nav-item has-treeview"><a href="#"
										class="nav-link"> <i class="nav-icon fas fa-copy"></i>
											<p>
												이력관리 <i class="fas fa-angle-left right"></i> <span
													class="badge badge-info right">경력업데이트</span>
											</p>
									</a>
										<ul class="nav nav-treeview">
											<li class="nav-item"><a href="pages/layout/top-nav.html"
												class="nav-link"> <i class="far fa-circle nav-icon"></i>
													<p>Top Navigation</p>
											</a></li>
											<li class="nav-item"><a
												href="pages/layout/top-nav-sidebar.html" class="nav-link">
													<i class="far fa-circle nav-icon"></i>
													<p>Top Navigation + Sidebar</p>
											</a></li>
											<li class="nav-item"><a href="pages/layout/boxed.html"
												class="nav-link"> <i class="far fa-circle nav-icon"></i>
													<p>Boxed</p>
											</a></li>
											<li class="nav-item"><a
												href="pages/layout/fixed-sidebar.html" class="nav-link">
													<i class="far fa-circle nav-icon"></i>
													<p>Fixed Sidebar</p>
											</a></li>
											<li class="nav-item"><a
												href="pages/layout/fixed-topnav.html" class="nav-link">
													<i class="far fa-circle nav-icon"></i>
													<p>Fixed Navbar</p>
											</a></li>
											<li class="nav-item"><a
												href="pages/layout/fixed-footer.html" class="nav-link">
													<i class="far fa-circle nav-icon"></i>
													<p>Fixed Footer</p>
											</a></li>
											<li class="nav-item"><a
												href="pages/layout/collapsed-sidebar.html" class="nav-link">
													<i class="far fa-circle nav-icon"></i>
													<p>Collapsed Sidebar</p>
											</a></li>
										</ul></li>
									<li class="nav-item has-treeview"><a href="#"
										class="nav-link"> <i class="nav-icon fas fa-chart-pie"></i>
											<p>
												???? <i class="right fas fa-angle-left"></i>
											</p>
									</a>
										<ul class="nav nav-treeview">
											<li class="nav-item"><a href="pages/charts/chartjs.html"
												class="nav-link"> <i class="far fa-circle nav-icon"></i>
													<p>ChartJS</p>
											</a></li>
											<li class="nav-item"><a href="pages/charts/flot.html"
												class="nav-link"> <i class="far fa-circle nav-icon"></i>
													<p>Flot</p>
											</a></li>
											<li class="nav-item"><a href="pages/charts/inline.html"
												class="nav-link"> <i class="far fa-circle nav-icon"></i>
													<p>Inline</p>
											</a></li>
										</ul></li>
								
							</nav>
							<!-- /.sidebar-menu -->
						</div>
					</div>
				</div>
=======
<aside class="main-sidebar">

	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">

	<!-- Sidebar Menu -->
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header">Main Menu</li>
			<!-- Optionally, you can add icons to the links -->
			<li class="home">
				<a href="javascript:location.href='<c:url value="/"/>userHome'"><i class="fa fa-home"></i><span>HOME</span></a>
			</li>
			
			<c:choose>
				<c:when test="${loginUser != null}">
					<c:if test="${loginUser.u_id eq 1}">
					<li class="myPage treeview">
						<a href="#">
							<i class="fa fa-user"></i> <span>부서 페이지</span>
							<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
						</a>
						<ul class="myGpx treeview-menu">
							<li><a href="javascript:location.href='<c:url value="/"/>admin/adminUserList'">부서원 정보</a></li>
							<li><a href="javascript:location.href='<c:url value="/"/>admin/adminRunUserList'">퇴사자 정보</a></li>
							<li class="myGpx treeview">
								<a href="#">
									<i class="fa fa-circle-o"></i> 부서 이력관리
									<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
								</a>
<%-- 								<ul class="treeview-menu" style="display: none;">
									<li><a href="javascript:location.href='<c:url value="/"/>admin/adminWorkList'">부서원 출퇴근관리</a></li>
								</ul> --%>
							</li>
<%-- 							<li class="myGpx treeview">
								<a href="#">
									<i class="fa fa-circle-o"></i> 상태 관리
									<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
								</a>
								<ul class="treeview-menu" style="display: none;">
									<li><a href="javascript:location.href='<c:url value="/"/>admin/adminUserStatus'">결재 승인 관리</a></li>
								</ul>
							</li> --%>

						</ul>
					</li>
					</c:if>
					</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${loginUser != null && loginUser.u_id eq 1}">
			<li class="gpx treeview" hidden>
				<a href="#">
					<i class="fa fa-map"></i>
					<span>내 이력 리스트</span>
					<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
				</a>
<%-- 				<ul class="treeview-menu">
					<li><a href="javascript:location.href='<c:url value="/"/>user/userWorkList'">출퇴근 입력</a></li>
				</ul> --%>
			</li>
<%-- 			<li class="community treeview" hidden>
				<a href="#">
					<i class="fa fa-commenting"></i>
					<span>상태관리</span>
					<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
				</a>
				<ul class="treeview-menu">
					<li><a href="javascript:location.href='<c:url value="/"/>user/userStatus'">조퇴/반차/휴가</a></li>
				</ul>
			</li> --%>
			</c:when>
			<c:otherwise>
<%-- 			<li class="gpx treeview"> 
				<a href="#">
					<i class="fa fa-map"></i>
					<span>출퇴근</span>
					<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
				</a>
				<ul class="treeview-menu">
					<li><a href="javascript:location.href='<c:url value="/"/>user/userWorkList'">출퇴근 입력</a></li>
				</ul>
			</li> --%>
<%-- 			<li class="community treeview">
				<a href="#">
					<i class="fa fa-commenting"></i>
					<span>상태관리</span>
					<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
				</a>
				<ul class="treeview-menu">
					<li><a href="javascript:location.href='<c:url value="/"/>user/userStatus'">조퇴/반차/휴가</a></li>
				</ul>
			</li> --%>
			</c:otherwise>
			</c:choose>
		</ul>
		<!-- /.sidebar-menu -->
	</section>
	<!-- /.sidebar -->
</aside>
>>>>>>> branch 'master' of https://github.com/bitrate256/resume.git
