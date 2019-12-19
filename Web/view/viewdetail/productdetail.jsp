<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="row">


	<div class="col-md-6">
		<img src="images/${dbproduct.img }" alt="Image" class="img-fluid">

	</div>
	<div class="col-md-6">
		<h2 class="text-black">${dbproduct.name }</h2>
		<p>${dbproduct.description }</p>
		<p class="mb-4"></p>
		<p>
			<strong class="text-primary h4">$${dbproduct.price }</strong>
		</p>
		<p>남은 갯수 : ${dbproduct.stock }</p>
		<p>판매한 수량 : ${dbproduct.soldamount }</p>
		<div class="mb-1 d-flex"></div>
		<form action="cartAdd.mc" method="get">
		<div class="mb-5">
			<div class="input-group mb-3" style="max-width: 120px;">
				<div class="input-group-prepend">
					<button class="btn btn-outline-primary js-btn-minus" type="button">&minus;</button>
				</div>
				<input type="text" name="count" class="form-control text-center"
					value="1" placeholder=""
					aria-label="Example text with button addon"
					aria-describedby="button-addon1">
				<div class="input-group-append">
					<button class="btn btn-outline-primary js-btn-plus" type="button">&plus;</button>
				</div>
			</div>
		

		</div>
	
			<input type="hidden" name="email" value=${email }> <input
				type="hidden" name="product_id" value="${dbproduct.product_id}"
				id="product_id"> <input id="cartAdd" type="submit"
				class="buy-now btn btn-sm btn-primary" value="장바구니"
				style="float: left; margin-right: 3px;">
		</form>
		<c:if test="${email eq 'Admin@admin.a'}">
			<a href="pupdatego.mc?product_id=${dbproduct.product_id}">
			<button id="productUpdate" class="buy-now btn btn-sm btn-primary">
			상품수정</button></a>

			<a href="pdelete.mc?product_id=${dbproduct.product_id}">
			<button id="productDelete" class="buy-now btn btn-sm btn-primary"
				>상품삭제</button></a>

		</c:if>

	</div>

</div>


<script>
	window.load
</script>