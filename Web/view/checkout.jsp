<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<form action="order.mc">

	<div class="site-section">
		<div class="container">
			<div class="row mb-5">
				<div class="col-md-12">
					<div class="border p-4 rounded" role="alert">
						로그인 하셨나요? <a href="#">로그인하기</a> 
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 mb-5 mb-md-0">
					<h2 class="h3 mb-3 text-black">주문자 정보</h2>
					<div class="p-3 p-lg-5 border">

						<div class="form-group row">
							<div class="col-md-12">
								<label for="name" class="text-black">이름 <span
									class="text-danger">*</span></label> <input type="text"
									class="form-control" id="name" name="name"
									value="${checkuser.name }">
							</div>
						</div>



						<div class="form-group row">
							<div class="col-md-12">
								<label for="address" class="text-black">주소 <span
									class="text-danger"></span>*
								</label> <input type="text" class="form-control" id="address"
									name="address" placeholder="Street address"
									value="${checkuser.address }">
							</div>
						</div>

						<div class="form-group row"></div>

						<div class="form-group row">
							<div class="col-md-12">
								<label for="email" class="text-black">이메일 <span
									class="text-danger"></span>*
								</label> <input type="text" class="form-control" id="email" name="email"
									value="${checkuser.email }" readonly>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-12">
								<label for="phone" class="text-black">연락처 <span
									class="text-danger"></span>*
								</label> <input type="text" class="form-control" id="phone" name="phone"
									placeholder="Phone Number" value="${checkuser.phone }">
								<input type="hidden" class="form-control" id="totalprice"
									name="totalprice" placeholder="totalprice" value="${total }">
							</div>
						</div>



					</div>
				</div>

				<div class="col-md-6">


					<div class="row mb-5">
						<div class="col-md-12">
							<h2 class="h3 mb-3 text-black">주문 정보</h2>
							<div class="p-3 p-lg-5 border">
								<table class="table site-block-order-table mb-5">
									<thead>
										<th>상품</th>
										<th>금액</th>
									</thead>
									<tbody>
										<c:forEach var="p" items="${plist }">




											<tr>
												<td>${p.name }<strong class="mx-2">x</strong> ${p.count }
												</td>
												<td>$${p.count * p.price }</td>

											</tr>
											<!--  넘겨주는 부분입니둥 
							<input  type="hidden"  class="form-control" id="totalprice"
								name="dd" placeholder="dd"
								value="${checkuser.phone }" >
									<!--  넘겨주는 부분 끝났습니둥  -->

										</c:forEach>
										<tr>
											<td class="text-black font-weight-bold"><strong>총 결제 금액</strong></td>
											<td class="text-black font-weight-bold"><strong>$${total
													}</strong></td>
										</tr>
									</tbody>
								</table>

								<div class="border p-3 mb-3">
									<h3 class="h6 mb-0">
										<a class="d-block" data-toggle="collapse" href="#collapsebank"
											role="button" aria-expanded="false"
											aria-controls="collapsebank">무통장입금</a>
									</h3>


								</div>

								<div class="border p-3 mb-3">
									<h3 class="h6 mb-0">
										<a class="d-block" data-toggle="collapse"
											href="#collapsecheque" role="button" aria-expanded="false"
											aria-controls="collapsecheque">신용카드 결제</a>
									</h3>


								</div>

								<div class="border p-3 mb-5">
									<h3 class="h6 mb-0">
										<a class="d-block" data-toggle="collapse"
											href="#collapsepaypal" role="button" aria-expanded="false"
											aria-controls="collapsepaypal">네이버페이</a>
									</h3>

									<div class="collapse" id="collapsepaypal">
										<div class="py-2">
											<script
												src="https://nsp.pay.naver.com/sdk/js/naverpay.min.js"
												data-client-id="u86j4ripEt8LRfPGzQ8" data-mode="production"
												data-merchant-user-key="{#_merchantUserKey}"
												data-merchant-pay-key="{#_merchantPayKey}"
												data-product-name="{#_productName}"
												data-total-pay-amount="${total }"
												data-tax-scope-amount="{#_taxScopeAmount}"
												data-tax-ex-scope-amount="{#_taxExScopeAmount}"
												data-return-url="{#_returnUrl}">
												
											</script>
										</div>
									</div>
								</div>

								<button class="btn btn-primary btn-lg py-3 btn-block">결제하기</button>

							</div>
						</div>
					</div>

				</div>
			</div>
			<!-- </form> -->
		</div>
	</div>

</form>

