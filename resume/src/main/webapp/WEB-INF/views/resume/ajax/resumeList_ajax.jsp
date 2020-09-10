<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String contextPath = request.getContextPath();
%>
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
<div class="row">
	<div class="col-sm-12">
		<table id="gpxBoard" class="table table-bordered table-hover dataTable" role="grid">
			<thead>
				※이력 리스트※
				<br>
				<tr role="row">
    				<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">이력관리번호</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">이력상태</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">이력수정날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="resumeAllList" items="${resumeAllList }">
					<tr role="row">
						<td onclick="javascript:location.href='<c:url value="/"/>
						resume/resumeSelectOne?r_id=${resumeAllList.r_id }'">${resumeAllList.r_id }</td>
						<c:if test="${resumeAllList.r_status eq Y }">
							<td>상태값Y</td>
						</c:if>
						<c:if test="${resumeAllList.r_status eq N }">
							<td>상태값N</td>
						</c:if>
						<td>${resumeAllList.r_newdate }</td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
	</div>
</div>
<div class="row">
	<div class="col-sm-5">
		<div class="dataTables_info" id="example1_info" role="status" aria-live="polite"></div>
	</div>
	<div class="col-sm-7">
		<div class="dataTables_paginate paging_simple_numbers">
			<ul class="pagination">
				<c:if test="${boardPager.curBlock > 1 }">

					<li class="paginate_button previous disabled"><a
							href="javascript:userStatusAjaxfn(${boardPager.prevPage})">Previous</a>
					</li>

				</c:if>
				<c:forEach var="num" begin="${boardPager.blockBegin }" end="${boardPager.blockEnd }">
					<c:choose>
						<c:when test="${num == boardPager.curPage }">
							<li class="paginate_button active"><a href="#">${num }</a></li>
						</c:when>
						<c:otherwise>
							<li class="paginate_button"><a href="javascript:userStatusAjaxfn(${num})">${num}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${boardPager.curBlock <= boardPager.totBlock }">

					<li class="paginate_button next" id="example1_next">
						<a href="javascript:resumeListAjaxfn(${boardPager.nextPage})">Next</a>
					</li>

				</c:if>
			</ul>
		</div>
	</div>
</div>