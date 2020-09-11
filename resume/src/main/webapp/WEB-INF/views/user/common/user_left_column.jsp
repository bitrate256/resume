<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<style>
	.hidden-xs {
		color : rgba(255,255,255,.8);
	}

</style>

  <!-- Navbar -->
  <!-- 우상단에 있던 알림/네비게이션 메뉴. 불필요한 메뉴 삭제했으며 아래 항목은 삭제시 화면 깨짐. -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light" >
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="index3.html" class="nav-link">상단 메뉴</a>
      </li>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <!-- 메인 사이드바 -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="javascript:location.href='<c:url value="/"/>userHome'" class="brand-link">
      <!-- 사이트 이미지 아이콘 변경 필요함 -->
      
      <span class="brand-text font-weight-light">이력 관리 시스템</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar os-host os-theme-light os-host-overflow os-host-overflow-y os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-transition"><div class="os-resize-observer-host"><div class="os-resize-observer observed" style="left: 0px; right: auto;"></div></div><div class="os-size-auto-observer" style="height: calc(100% + 1px); float: left;"><div class="os-resize-observer observed"></div></div><div class="os-content-glue" style="margin: 0px -8px; width: 249px; height: 911px;"></div><div class="os-padding"><div class="os-viewport os-viewport-native-scrollbars-invisible" style="overflow-y: scroll; right: 0px; bottom: 0px;"><div class="os-content" style="padding: 0px 8px; height: 100%; width: 100%;">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
      
        <!-- 사용자 이미지 -->
        <div class="image">
          
        </div>
        
        <!-- 사용자 이름  -->
        <div class="info">
		<span class="hidden-xs">${loginUser.u_name}</span>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <!-- 주 사이드바 -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!--
                                 사용자/관리자 메뉴에 사용할 아이콘 변경이 가능 합니다.
                                 아래 링크에서 사용할 아이콘을 찾아 해당 스크립트를 붙여넣으세요.
               https://fontawesome.com/
          -->
          <!-- 사용자 메뉴 -->
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user-circle"></i>
              <p>내 정보
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
            <c:if test="${loginUser != null }">
              <li class="nav-item">
                <a href="javascript:location.href='<c:url value="/"/>user/myPage'" class="nav-link">
                  <i class="fas fa-address-card"></i>
                  <p>마이 페이지</p>
                </a>
              </li>

              <li class="nav-item">
                <a href="javascript:location.href='<c:url value="/"/>resume/resumeList'" class="nav-link">
                  <i class="fas fa-edit"></i>
                  <p>내 이력 관리</p>
                </a>
              </li>
            </ul>
          </li>
            </c:if>
          <!-- 관리자 메뉴 -->
          <c:if test="${loginUser.u_id eq 20200001 }">
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-cogs"></i>
              <p>
                                   관리자 메뉴
                <i class="fas fa-angle-left right"></i>
                
                <!-- 신규 항목 갯수 알림 -->
                <span class="badge badge-info right">6</span>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="javascript:location.href='<c:url value="/"/>admin/adminUserList'" class="nav-link">
                  <i class="fas fa-portrait"></i>
                  <p>부서원 관리</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="pages/layout/top-nav.html" class="nav-link">
                  <i class="fas fa-portrait"></i>
                  <p>부서원 이력 관리</p>
                </a>
              </li>
                <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="fas fa-user-friends"></i>
              <p>부서 관리
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">

 <li class="nav-item">
                <a class="nav-link" href="javascript:location.href='<c:url value="/"/>admin/department'">
                  <i class="fas fa-user-friends"></i>
                  <p>부서 등록</p>
                </a>
              </li>
 <li class="nav-item">
                <a class="nav-link" href="javascript:location.href='<c:url value="/"/>admin/adminDepartmentList'">
                  <i class="fas fa-user-friends"></i>
                  <p>부서 목록</p>
                </a>
              </li>
              
               <li class="nav-item">
                <a class="nav-link" href="javascript:location.href='<c:url value="/"/>admin/adminUserList'">
                  <i class="fas fa-user-friends"></i>
                  <p>재직자 목록</p>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="javascript:location.href='<c:url value="/"/>admin/adminRunUserList'">
                  <i class="fas fa-user-friends"></i>
                  <p>퇴사자 목록</p>
                </a>
              </li>
            </ul>
          </li>
             
              
            </ul>
          </li>
          </c:if>
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div></div></div><div class="os-scrollbar os-scrollbar-horizontal os-scrollbar-unusable os-scrollbar-auto-hidden"><div class="os-scrollbar-track"><div class="os-scrollbar-handle" style="width: 100%; transform: translate(0px, 0px);"></div></div></div><div class="os-scrollbar os-scrollbar-vertical os-scrollbar-auto-hidden"><div class="os-scrollbar-track"><div class="os-scrollbar-handle" style="height: 72.496%; transform: translate(0px, 0px);"></div></div></div><div class="os-scrollbar-corner"></div></div>
    <!-- /.sidebar -->
  </aside>
  <!-- 여기까지 사이드바. -->
