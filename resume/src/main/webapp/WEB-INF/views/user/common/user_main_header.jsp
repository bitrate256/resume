<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button"> <span class="sr-only">Toggle
						navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu" align="rigth">
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
									</a>
								</li>
								<li>
									<c:if test="${loginUser.u_id eq 20200001 }">
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/userSignUp'" style="margin: 10px">사용자 등록</button>
									</c:if>
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/myPage'" style="margin: 10px">내 정보</button>
									<button type="button" class="btn btn-sm bg-gray color-palette" onclick="javascript:location.href='<c:url value="/"/>user/userlogout'" style="margin: 10px">로그아웃</button>
								</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
			</nav>
		</header>