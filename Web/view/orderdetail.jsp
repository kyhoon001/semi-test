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
		<h3 class="blank1">주문 상세 내역</h3>
		<div class="xs tabls"></div>
		<div class="bs-example4" data-example-id="simple-responsive-table">
			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr id = "t1">
							<th>주문 번호</th>
							<th>주문상세번호</th>
							<th>상품명</th>
							<th>주소</th>
							<th>받는분</th>
							<th>수량</th>
							<th>결제금액</th>
							<th>결제상태</th>
							<th>배송상태</th>
						</tr>
					</thead>
					<tbody>
					
							<c:forEach var="od" items="${odlist }">
						<tr id = "t1">
							<th scope="row">${od.order_id }</th>
							<td>${od.orderdetail_id }</td>
							<td>${od.product_name }</td>
							<td>${od.user_address }</td>
							<td>${od.user_name }</td>
							<td>${od.count }</td>
							<td>${od.totalprice }</td>
							<td>ok</td>
							<td>${od.order_stat }</td>
						</tr>
						</c:forEach>
					
					</tbody>
				</table>
			</div>
			<!-- /.table-responsive -->
		</div>
	</div>
</div>
