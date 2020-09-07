<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String contextPath = request.getContextPath();
%>

<div class="row">
	<div class="col-sm-12">
		<table id="gpxBoard" class="table table-bordered table-hover dataTable" role="grid">
			<thead>
				※이력 리스트※
				<br>
				<tr role="row">
					<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">이름</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">사번</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">부서코드</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">결재구분</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">승인구분</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">시작날짜</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">종료날짜</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">신청날짜</th>
					<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">결재날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="statusAllList" items="${statusAllList }">
					<tr role="row">
						<td>${statusAllList.u_name }</td>
						<td onclick="javascript:location.href='<c:url value="/"/>
						user/StatusRecordSelectOne?apv_id=${statusAllList.apv_id }'">${statusAllList.u_id }</td>
						<c:if test="${statusAllList.d_id eq 1 }">
							<td>경영지원</td>
						</c:if>
						<c:if test="${statusAllList.d_id eq 2 }">
							<td>연구소</td>
						</c:if>
						<c:if test="${statusAllList.apv_div eq 'V' }">
							<td>휴가</td>
						</c:if>
						<c:if test="${statusAllList.apv_div eq 'A' }">
							<td>반차</td>
						</c:if>
						<c:if test="${statusAllList.apv_ok eq 'Y' }">
							<td>승인</td>
						</c:if>
						<c:if test="${statusAllList.apv_ok eq 'N' }">
							<td>반려</td>
						</c:if>
						<c:if test="${statusAllList.apv_ok eq 'W' }">
							<td>대기</td>
						</c:if>
						<td onclick="javascript:location.href='<c:url value="/"/>user/StatusRecordSelectOne?apv_id=${statusAllList.apv_id }'">${statusAllList.apv_start }</td>
						<td>${statusAllList.apv_end }</td>
						<td>${statusAllList.apv_aply }</td>
 						<td>${statusAllList.apv_aplydate }</td>
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
						<a href="javascript:userStatusAjaxfn(${boardPager.nextPage})">Next</a>
					</li>

				</c:if>
			</ul>
		</div>
	</div>
</div>