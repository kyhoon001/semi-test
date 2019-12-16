<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<form action="order.mc">

<div class="site-section">
	<div class="container">
		<div class="row mb-5">
			<div class="col-md-12">
				<div class="border p-4 rounded" role="alert">
					Returning customer? <a href="#">Click here</a> to login
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 mb-5 mb-md-0">
				<h2 class="h3 mb-3 text-black">Billing Details</h2>
				<div class="p-3 p-lg-5 border">

					<div class="form-group row">
						<div class="col-md-12">
							<label for="c_lname" class="text-black">Name <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" id="c_lname" name="c_lname"
								value="${checkuser.name }">
						</div>
					</div>



					<div class="form-group row">
						<div class="col-md-12">
							<label for="c_address" class="text-black">Address <span
								class="text-danger"></span>*
							</label> <input type="text" class="form-control" id="c_address"
								name="c_address" placeholder="Street address"
								value="${checkuser.address }">
						</div>
					</div>

					<div class="form-group row"></div>

					<div class="form-group row">
						<div class="col-md-12">
							<label for="c_email_address" class="text-black">Email
								Address <span class="text-danger"></span>*
							</label> <input type="text" class="form-control" id="c_email_address"
								name="c_email_address" value="${checkuser.email }" readonly>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-md-12">
							<label for="c_phone" class="text-black">Phone <span
								class="text-danger"></span>*
							</label> <input type="text" class="form-control" id="c_phone"
								name="c_phone" placeholder="Phone Number"
								value="${checkuser.phone }">
						</div>
					</div>



				</div>
			</div>

			<div class="col-md-6">


				<div class="row mb-5">
					<div class="col-md-12">
						<h2 class="h3 mb-3 text-black">Your Order</h2>
						<div class="p-3 p-lg-5 border">
							<table class="table site-block-order-table mb-5">
								<thead>
									<th>Product</th>
									<th>Total</th>
								</thead>
								<tbody>
									<c:forEach var="p" items= "${plist }" >
										<tr>
											<td>${p.name }<strong class="mx-2">x</strong> ${p.count }
											</td>
											<td>
											$${p.count * p.price }</td>
										</tr>
										</c:forEach>
									<tr>
										<td class="text-black font-weight-bold"><strong>Order
												Total</strong></td>
										<td class="text-black font-weight-bold"><strong>$${total }</strong></td>
									</tr>
								</tbody>
							</table>

							<div class="border p-3 mb-3">
								<h3 class="h6 mb-0">
									<a class="d-block" data-toggle="collapse" href="#collapsebank"
										role="button" aria-expanded="false"
										aria-controls="collapsebank">Direct Bank Transfer</a>
								</h3>

								<div class="collapse" id="collapsebank">
									<div class="py-2">
										<p class="mb-0">Make your payment directly into our bank
											account. Please use your Order ID as the payment reference.
											Your order won’t be shipped until the funds have cleared in
											our account.</p>
									</div>
								</div>
							</div>

							<div class="border p-3 mb-3">
								<h3 class="h6 mb-0">
									<a class="d-block" data-toggle="collapse"
										href="#collapsecheque" role="button" aria-expanded="false"
										aria-controls="collapsecheque">Cheque Payment</a>
								</h3>

								<div class="collapse" id="collapsecheque">
									<div class="py-2">
										<p class="mb-0">Make your payment directly into our bank
											account. Please use your Order ID as the payment reference.
											Your order won’t be shipped until the funds have cleared in
											our account.</p>
									</div>
								</div>
							</div>

							<div class="border p-3 mb-5">
								<h3 class="h6 mb-0">
									<a class="d-block" data-toggle="collapse"
										href="#collapsepaypal" role="button" aria-expanded="false"
										aria-controls="collapsepaypal">Paypal</a>
								</h3>

								<div class="collapse" id="collapsepaypal">
									<div class="py-2">
										<p class="mb-0">Make your payment directly into our bank
											account. Please use your Order ID as the payment reference.
											Your order won’t be shipped until the funds have cleared in
											our account.</p>
									</div>
								</div>
							</div>

							<div class="form-group">
								<button class="btn btn-primary btn-lg py-3 btn-block"
									onclick="window.location='order.mc?email=${email }&totalprice=${total }'">Place Order</button>
							</div>

						</div>
					</div>
				</div>

			</div>
		</div>
		<!-- </form> -->
	</div>
</div>

</form>

