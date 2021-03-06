<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%String contextPath = request.getContextPath(); %>

<script type="text/javascript">


//버튼 클릭시 Row 값 가져오기
$("#checkBtn").click(function(){ 
	
	var str = ""
	var tdArr = new Array();	// 배열 선언
	var checkBtn = $(this);
	
	// checkBtn.parent() : checkBtn의 부모는 <td>이다.
	// checkBtn.parent().parent() : <td>의 부모이므로 <tr>이다.
	var tr = checkBtn.parent().parent();
	var td = tr.children();
	
	console.log("클릭한 Row의 모든 데이터 : "+tr.text());
	var u_id = td.eq(0).text();
	var d_id = td.eq(1).text();
	var u_name = td.eq(2).text();
	var u_phone = td.eq(3).text();
	var u_email = td.eq(4).text();
	var u_position = td.eq(5).text();
	var u_status = td.eq(6).text();
	
	// 반복문을 이용해서 배열에 값을 담아 사용할 수 도 있다.
	td.each(function(i){	
		tdArr.push(td.eq(i).text());
		
		
	});
	
	console.log("배열에 담긴 값 : "+tdArr);
	
	str =u_id+ d_id+ u_name + u_phone +u_email+ u_position+ u_status;		
	
	$("#ex2_Result1").html(" * 클릭한 Row의 모든 데이터 = " + tr.text());		
	$("#ex2_Result2").html(str);	


	
});

		



</script>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">

			<!-- Main content -->
			<section class="content container-fluid">

<div class="card-body">
					<div id="example1_wrapper" class="dataTables_wrapper dt-bootstrap4">
						<div class="row">
							<div class="col-sm-12 col-md-6">
								
							</div>
							<div id="example1_filter" class="dataTables_filter">
												<form action="javascript:searchBoxFn()">
													<div class="box-tools">
														<select class="form-control" name="searchSort" id="searchSort">
															<option value="u_name">이름</option>
															<option value="d_id">부서</option>
														</select>
														<div class="input-group input-group-sm" style="width: 150px;">
															<input type="text" name="searchVal" id="searchVal"
																class="form-control pull-right" placeholder="Search">
															<div class="input-group-btn">
																<button type="submit" class="btn btn-default"><i
																		class="fa fa-search"></i></button>
															</div>
														</div>
													</div>
												</form>
											</div>
						</div>
						<div class="row">
							<div class="col-sm-12">
								<table id="example-table-2"
									class="table table-bordered table-striped dataTable dtr-inline"
									role="grid" aria-describedby="example1_info">
									<thead>
										<tr role="row">
											<th class="sorting_asc" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1" aria-sort="ascending"
												aria-label="Rendering engine: activate to sort column descending">
												사번</th>
											<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="Browser: activate to sort column ascending">부서</th>
											<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="Platform(s): activate to sort column ascending">이름</th>
											<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="Engine version: activate to sort column ascending">
												핸드폰번호</th>
											<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="CSS grade: activate to sort column ascending">
												이메일</th>
												<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="CSS grade: activate to sort column ascending">
												직위</th>
												<th class="sorting" tabindex="0" aria-controls="example1"
												rowspan="1" colspan="1"
												aria-label="CSS grade: activate to sort column ascending">
												재직여부</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach var="adminRunUserList" items="${adminRunUserList }">
										<c:choose>
										<c:when test="${adminRunUserList.u_status eq 'N' }">
										<tr role="row" class="odd">
											<td onclick="javascript:location.href='<c:url value="/"/>admin/adminUserSelectOne?u_id=${adminRunUserList.u_id }'">${adminRunUserList.u_id }</td>
											<c:if test="${adminRunUserList.d_id eq 1}">
											<td>경영지원</td>
											</c:if>
											<c:if test="${adminRunUserList.d_id eq 2}">
											<td>연구소</td>
											</c:if>
											<td>${adminRunUserList.u_name }</td>
											<td>${adminRunUserList.u_phone }</td>
											<td>${adminRunUserList.u_email }</td>
											<c:if test="${adminRunUserList.u_position eq 1}">
											<td>대표이사</td>
											</c:if>
											<c:if test="${adminRunUserList.u_position eq 2}">
											<td>부장</td>
											</c:if>
											<c:if test="${adminRunUserList.u_position eq 3}">
											<td>차장</td>
											</c:if>
											<c:if test="${adminRunUserList.u_position eq 4}">
											<td>과장</td>
											</c:if>
											<c:if test="${adminRunUserList.u_position eq 5}">
											<td>대리</td>
											</c:if>
											<c:if test="${adminRunUserList.u_position eq 6}">
											<td>사원</td>
											</c:if>
											<c:if test="${adminRunUserList.u_status eq 'N'}">
											<td id="status">퇴사</td>
											</c:if>
										</tr>
										</c:when>
										</c:choose>
										
										</c:forEach>
										
								</tbody>
								
								</table>
								<div id="ex2_Result1"></div>
								<div id="ex2_Result2"></div>
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
							href="javascript:adminRunUserListAjaxfn(${boardPager.prevPage})">Previous</a>
					</li>
				</c:if>
				<c:forEach var="num" begin="${boardPager.blockBegin }" end="${boardPager.blockEnd }">
					<c:choose>
						<c:when test="${num == boardPager.curPage }">
							<li class="paginate_button active"><a href="#">${num }</a>
							</li>
						</c:when>
						<c:otherwise>
							<li class="paginate_button"><a href="javascript:adminRunUserListAjaxfn(${num})">${num}</a></li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${boardPager.curBlock <= boardPager.totBlock }">
					<li class="paginate_button next" id="example1_next">
						<a href="javascript:adminRunUserListAjaxfn(${boardPager.nextPage})">Next</a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
</div>