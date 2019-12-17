<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="js/jquery-1.10.2.min.js"></script>
<!-- //header-ends -->
<style>
div#page-wrapper {
	padding: 3.5em 3.5em;
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
</style>
<div id="page-wrapper">
	<div class="graphs">
		<h3 class="blank1">주문 내역</h3>
		<div class="xs tabls">
			<div class="bs-example4" data-example-id="contextual-table">
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Column heading</th>
							<th>Column heading</th>
							<th>Column heading</th>
						</tr>
					</thead>
					<tbody>
						<tr class="active">
							<th scope="row">1</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr class="success">
							<th scope="row">3</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr>
							<th scope="row">4</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr class="info">
							<th scope="row">5</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr>
							<th scope="row">6</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr class="warning">
							<th scope="row">7</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr>
							<th scope="row">8</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						<tr class="danger">
							<th scope="row">9</th>
							<td>Column content</td>
							<td>Column content</td>
							<td>Column content</td>
						</tr>
						
					</tbody>
				</table>
			</div>
<a href = "orderdetail.mc">주문 상세 보기</a>
		</div>
	</div>
</div>
