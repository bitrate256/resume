<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


		<header class="main-header">

			<!-- Logo -->
			<a href="javascript:location.href='<c:url value="/"/>userHome'" class="logo">
				<!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>이력</b>관리</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>이력</b>관리</span>
			</a>

			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button"> <span class="sr-only">Toggle
						navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<c:choose>
							<c:when test="${loginUser == null}">
								<li>
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/userlogin'" style="margin: 10px">Login</button>
								</li>
							</c:when>
							<c:otherwise>
								<li class="user user-menu">
									<a href="#">
										<img src="<c:url value="/"/>dist/img/profile.png" class="user-image" alt="User Image" style="background-color: white;">
										<span class="hidden-xs">${loginUser.u_email }</span>
									</a>
								</li>
								<li>
									<c:if test="${loginUser.u_id eq 1 }">
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/userSignUp'" style="margin: 10px">사용자 등록</button>
									</c:if>
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>myPage/myUserInfo'" style="margin: 10px">내 정보</button>
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/userlogout'" style="margin: 10px">로그아웃</button>
								</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
			</nav>
		</header>