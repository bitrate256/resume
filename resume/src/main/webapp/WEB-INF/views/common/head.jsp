<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<% String contextPath = request.getContextPath(); %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Resume</title>


	 <link rel="stylesheet" href="<%=contextPath %>/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Tempusdominus Bbootstrap 4 -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- JQVMap -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/jqvmap/jqvmap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=contextPath %>/dist/css/adminlte.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/daterangepicker/daterangepicker.css">
  <!-- summernote -->
  <link rel="stylesheet" href="<%=contextPath %>/plugins/summernote/summernote-bs4.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
	
    
    <!-- jQuery -->
    <script src="<%=contextPath %>/plugins/jquery/jquery-3.3.1.min.js"></script>
	<script src="<%=contextPath %>/plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="<%=contextPath %>/plugins/jquery-ui/jquery-ui.min.js"></script>

	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button)
	</script>
	<!-- Bootstrap 4 -->
	<script src="<%=contextPath %>/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- ChartJS -->
	<script src="<%=contextPath %>/plugins/chart.js/Chart.min.js"></script>
	<!-- Input Mask -->
	<script src="<%=contextPath %>/plugins//inputmask/min/jquery.inputmask.bundle.min.js"></script>
	<script src="<%=contextPath %>/plugins/moment/moment.min.js"></script>
	<!-- Sparkline -->
	<script src="<%=contextPath %>/plugins/sparklines/sparkline.js"></script>
	<!-- JQVMap -->
	<script src="<%=contextPath %>/plugins/jqvmap/jquery.vmap.min.js"></script>
	<script src="<%=contextPath %>/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
	<!-- jQuery Knob Chart -->
	<script src="<%=contextPath %>/plugins/jquery-knob/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script src="<%=contextPath %>/plugins/moment/moment.min.js"></script>
	<script src="<%=contextPath %>/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- Tempusdominus Bootstrap 4 -->
	<script
		src="<%=contextPath %>/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
	<!-- Summernote -->
	<script src="<%=contextPath %>/plugins/summernote/summernote-bs4.min.js"></script>
	<!-- overlayScrollbars -->
	<script
		src="<%=contextPath %>/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
	<!-- AdminLTE App -->
	<script src="<%=contextPath %>/dist/js/adminlte.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="<%=contextPath %>/dist/js/pages/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="<%=contextPath %>/dist/js/demo.js"></script>
	
	<!-- jqGrid -->
	<script type="text/javascript" src="<%= contextPath %>/plugins/jqGrid/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="<%= contextPath %>/plugins/jqGrid/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="<%= contextPath %>/plugins/jqGrid/grid.locale-kr.js"></script>
	<script type="text/javascript" src="<%= contextPath %>/plugins/jqGrid/jquery-ui.js"></script>
	<script type="text/javascript" src="<%= contextPath %>/plugins/jqGrid/jquery.jqGrid.min.js"></script>


	<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
	

</head>
