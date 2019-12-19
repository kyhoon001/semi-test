<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="js/jquery-1.10.2.min.js"></script>
<!-- //header-ends -->
<style>
div#page-wrapper {
	padding: 2em 2em;
}

canvas#doughnut, canvas#line, canvas#polarArea, #bar, #pie, #radar {
	background-color: rgb(255, 255, 255);
}

.graph_box {
	margin-bottom: 1.5em;
}

.legend {
	float: left;
	font-size: 12px;
	border: 1px solid #E6E6E6;
	padding: 10px;
	width: 176px;
	margin: 7em 0 0 6em;
}

.legend div {
	margin: 3px 0;
}

.legend span {
	float: right;
	padding-left: .5em;
}

#os-Win-lbl {
	border-left: #8BC34A solid 1em;
	padding-left: .5em;
	font-size: 1em;
	color: #777F8C;
}

#os-Mac-lbl {
	border-left: #EF553A solid 1em;
	padding-left: .5em;
	font-size: 1em;
	color: #777F8C;
}

#os-Other-lbl {
	border-left: #00ACED solid 1em;
	padding-left: .5em;
	font-size: 1em;
	color: #777F8C;
}

.grid_1 {
	background: #fff;
}

.grid_2 {
	padding: 0 12px;
}

.line-bottom-grid {
	padding: 1.5em 0 0;
}

.grid_1 h4 {
	text-align: center;
	font-size: 1.5em;
	color: #000;
	font-weight: 300;
	padding: 1em 0;
}
#t1{
	text-align:center;
}
</style>
<div id="page-wrapper">
	<div class="graphs">
		<h3 class="blank1" style="float:left">Q & A Board</h3>
		<a href="bregister.mc">
			<button id="productUpdate" class="buy-now btn btn-sm btn-primary" style="float:right; margin-right:70px; margin-bottom:30px;">
			Write Q&A</button></a>
		<div class="xs tabls"></div>
		<div class="bs-example4" data-example-id="simple-responsive-table">
			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr id = "t1">
							<th>글번호</th>
							<th>작성자(Email)</th>
							<th>제목</th>
							<th>카테고리</th>
							<th>작성 일자</th>
							<th>수정 일자</th>
						</tr>
					</thead>
					<tbody>
					
							<c:forEach var="b" items="${blist }">
						<tr id = "t1">
							<th scope="row">${b.board_id}</th>
							<td>${b.email}</td>
							<td><a href = "selectboardimpl.mc?board_id=${b.board_id }">${b.board_contents}</a></td> <!-- 제목으로 쓸것이니 컨트롤러에서 수정 -->
							<td>${b.board_category}</td> 
							<td>${b.inp_board_dt}</td>
							<td>${b.mdf_board_dt}</td>
						</tr>
						</c:forEach>
					
					</tbody>
				</table>
			</div>
			<!-- /.table-responsive -->
		</div>
	</div>
</div>



		<div class="row mb-5">
		<div class="row" data-aos="fade-up" style=" margin: 0 auto;">
			<div class="col-md-12 text-center">
				<div class="site-block-27">
					<ul>
						<c:choose>
							<c:when test="${page.curPage > 1}">
								<li><a href="${filter }.mc?curPage=${page.curPage-1}">&lt;</a></li>
							</c:when>
							<c:otherwise>
							</c:otherwise>
						</c:choose>

						<c:forEach var="r" begin="${page.startPage }"
							end="${page.endPage }">
							<c:choose>
								<c:when test="${page.curPage eq r}">
									<li class="active"><a href="${filter }.mc?curPage=${r}">${r}</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="${filter }.mc?curPage=${r}">${r}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:choose>
							<c:when test="${page.endcheck}">
								<li><a href="${filter }.mc?curPage=${page.curPage+1}">&gt;</a></li>
							</c:when>
							<c:otherwise>
							</c:otherwise>

						</c:choose>

					</ul>
				</div>
			</div>
		</div>

</div>


