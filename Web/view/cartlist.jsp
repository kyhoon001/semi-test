<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/aos.js"></script>
<script src="js/main.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script>
$(document).ready(function(){
	//초기 total price 출력
var nn = ${listamount};
	for(var i = 0; i < nn; i ++) {
		
	document.getElementsByClassName("totalprice")[i].innerHTML =
		parseInt($(document.getElementsByClassName("amount")[i]).val()) * $(document.getElementsByClassName("hiddenprice")[i]).val();
	$('#forupdate').append('<input id="list_id'+i+'" type=hidden type="number" value='+$(document.getElementsByClassName("basket_id")[i]).val()+')>');
	}
	//total price 값 출력 끝
	
//	document.getElementsByClassName("total").innerHTML = 
		var stotal = 0;
		for(var i = 0; i < nn; i ++) {
			stotal += parseInt($(document.getElementsByClassName("amount")[i]).val()) * $(document.getElementsByClassName("hiddenprice")[i]).val();
		}
		$(document.getElementById("subtotal").innerHTML = stotal);
		$(document.getElementById("total").innerHTML = stotal);


$('#updatecart').on('click', function(event){
	event.preventDefault();

	var nn = ${listamount};
	var ss = "cartupdate.mc?list_amount="+nn + "&";
	for(var i = 0; i < nn; i ++) {
		var s = "list_id" + i;
		$(document.getElementById(s)).val($(document.getElementsByClassName("hiddenbasket_id")[i]).val());
		ss += "basket_id" + i + "=" + $(document.getElementById(s)).val() + "&count"+i+"=" + $(document.getElementsByClassName("amount")[i]).val() + "&";
	}
	location.href = ss;
	
})
		
		//main.js에서 plus,minus관련 함수 지웠음. ==> 살려야함. 여기 함수에서 +하고 -만 삭제해주면 정상작동함.
// BUTTON_PLUS PART START
$('.js-btn-minus').on('click', function (e) {
	e.preventDefault();
	if ($(this).closest('.input-group').find('.form-control').val() != 0) {
		$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) );

		//TO UPDATE TOTAL PRICE
		var test = 'totalprice';
		test += $(this).closest('.input-group').find('.hiddenbasket_id').val();
		$(this).closest('.input-group').find('.hiddentotalprice').val((parseInt($(this).closest('.input-group').find('.form-control').val()))
			* parseInt($(this).closest('.input-group').find('.hiddenprice').val()));
		document.getElementById(test).innerHTML = $(this).closest('.input-group').find('.hiddentotalprice').val();

var stotal = 0;
		for(var i = 0; i < nn; i ++) {
			stotal += parseInt($(document.getElementsByClassName("amount")[i]).val()) * $(document.getElementsByClassName("hiddenprice")[i]).val();
		}
		$(document.getElementById("subtotal").innerHTML = stotal);



		//여기에 cart total 가격 곱해주는거 해주면 됨.
	} else {
		$(this).closest('.input-group').find('.form-control').val(parseInt(0));
	}
});
// BUTTON_PLUS PART END


// BUTTON_MINUS PART START
$('.js-btn-plus').on('click', function (e) {
	e.preventDefault();
	$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) );


	//TO UPDATE TOTAL PRICE
	var test = 'totalprice';
	test += $(this).closest('.input-group').find('.hiddenbasket_id').val();
	$(this).closest('.input-group').find('.hiddentotalprice').val((parseInt($(this).closest('.input-group').find('.form-control').val()))
		* parseInt($(this).closest('.input-group').find('.hiddenprice').val()));
	document.getElementById(test).innerHTML = $(this).closest('.input-group').find('.hiddentotalprice').val();

	
	var stotal = 0;
	for(var i = 0; i < nn; i ++) {
		stotal += parseInt($(document.getElementsByClassName("amount")[i]).val()) * $(document.getElementsByClassName("hiddenprice")[i]).val();
	}
	$(document.getElementById("subtotal").innerHTML = stotal);

});

//BUTTON_MINUS PART END
		
		
		
});



</script>
<!--  반복문을 통해 넣어주기 위한 파트 -->
<div id ="forupdate">
		<input id="listamount" type=hidden type="number" value=${list.amount }>
		</div>

<div class="site-section">
	<div class="container">
		<div class="row mb-5">
			<form class="col-md-12" method="post">
				<div class="site-blocks-table">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th class="product-thumbnail">Image</th>
								<th class="product-name">Product</th>
								<th class="product-price">Price</th>
								<th class="product-quantity">Quantity</th>
								<th class="product-total">Total</th>
								<th class="product-remove">Remove</th>
							</tr>
						</thead>
						<tbody>
						
							<c:forEach var="p" items="${plist }">
								<tr class="trtest">  <!-- TEST CASE -->


									<td class="product-thumbnail"><img src="images/${p.img }"
										alt="Image" class="img-fluid"></td>
									<td class="product-name">
										<h2 class="h5 text-black">${p.name }</h2>
									</td>
									<td>$${p.price }</td>
									<td>
										<!-- 버튼을 눌러서 수량 추가하는 부분 시작 -->
										<div class="input-group mb-3" style="max-width: 120px;">
											<div class="input-group-prepend">
												<button class="btn btn-outline-primary js-btn-minus"
													type="button">&minus;</button>
											</div>
											<input id = "count${p.basket_id }" name = ${p.basket_id } type="text" class="form-control text-center amount" value=${p.count }
												placeholder="" aria-label="Example text with button addon"
												aria-describedby="button-addon1" readonly>
												<input class="hiddentotalprice" type=hidden type="number" value="">
												<input class="hiddenprice" type=hidden type="number" value=${p.price }>
												<input id="basket${p.basket_id }" class="hiddenbasket_id" type=hidden type="number" value=${p.basket_id }>

											<div class="input-group-append">
												<button class="btn btn-outline-primary js-btn-plus"
													type="button">&plus;</button>
											</div>
										</div>

									</td>

									<!-- 버튼을 눌러서 수량 추가하는 부분 끝 -->
									<td class="totalprice" id="totalprice${p.basket_id }">totalprice</td>
									
									<!--  x를 누르면 cart 테이블에서 삭제해주는 역할을 해야함. delete. -->
									<!--  아니면 밑에 cart updat를 눌렀을 때 페이지가 새로고침되면서 바꿔야함.. -->
									<td><a href="#" class="btn btn-primary btn-sm" onclick="window.location='cartdelete.mc?basket_id=${p.basket_id }'">X</a></td>
									<!-- "userDetail.mc?email=${email }"  -->
								</tr>

							</c:forEach>

								
											


						</tbody>
					</table>
				</div>
			</form>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="row mb-5">
					<div class="col-md-6 mb-3 mb-md-0">
						<!-- 버튼을 클릭하면 데이터베이스 update하고 지금 페이지로 돌아오는부분 시작-->
						<!-- 고민해봐야되는게 이용자 입장에서 헷갈릴 수 있음. -->
						<button
							id="updatecart" class="btn btn-primary btn-sm btn-block "> <!-- onclick="window.location='cartupdate.mc'" -->Update Cart</button>

						<!-- 버튼을 클릭하면 데이터베이스 update하고 지금 페이지로 돌아오는부분 끝-->

					</div>
					<div class="col-md-6">
						<!-- 버튼을 클릭하면 쇼핑하는 페이지로 리다이렉트하는 부분 시작 -->
						<a href="shop.mc"><button
								class="btn btn-outline-primary btn-sm btn-block" onclick="window.location='shop.mc'">Continue
								Shopping</button></a>
						<!-- 버튼을 클릭하면 쇼핑하는 페이지로 리다이렉트하는 부분 종료 -->
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<!--
													<label class="text-black h4" for="coupon">Coupon</label>
													<p>Enter your coupon code if you have one.</p>
													 -->
					</div>
					<div class="col-md-8 mb-3 mb-md-0">
						<!-- 
													<input type="text" class="form-control py-3" id="coupon"
														placeholder="Coupon Code">
														 -->
					</div>
					<div class="col-md-4">
						<!-- 
													<button class="btn btn-primary btn-sm">Apply
														Coupon</button>
														 -->
					</div>
				</div>
			</div>
			<div class="col-md-6 pl-5">
				<div class="row justify-content-end">
					<div class="col-md-7">
						<div class="row">
							<div class="col-md-12 text-right border-bottom mb-5">
								<h3 class="text-black h4 text-uppercase">Cart Totals</h3>
							</div>
						</div>
						<div class="row mb-3">
							<div class="col-md-6">
								<span class="text-black">Subtotal</span>
							</div>
							<div class="col-md-6 text-right">
								<strong id="subtotal" class="text-black">$230.00</strong>
							</div>
						</div>
						<div class="row mb-5">
							<div class="col-md-6">
								<span class="text-black">Total</span>
							</div>
							<div class="col-md-6 text-right">
								<strong  id="total" class="text-black">$230.00</strong>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<button class="btn btn-primary btn-lg py-3 btn-block"
									onclick="window.location='checkout.html'">Proceed To
									Checkout</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--  컨테이너가 끝나는지점 -->
</div>