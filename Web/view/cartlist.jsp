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
	//�ʱ� total price ���
var nn = ${listamount};
	for(var i = 0; i < nn; i ++) {
		
	document.getElementsByClassName("totalprice")[i].innerHTML =
		parseInt($(document.getElementsByClassName("amount")[i]).val()) * $(document.getElementsByClassName("hiddenprice")[i]).val();
	$('#forupdate').append('<input id="list_id'+i+'" type=hidden type="number" value='+$(document.getElementsByClassName("basket_id")[i]).val()+')>');
	}
	//total price �� ��� ��
	
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
		
		//main.js���� plus,minus���� �Լ� ������. ==> �������. ���� �Լ����� +�ϰ� -�� �������ָ� �����۵���.
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



		//���⿡ cart total ���� �����ִ°� ���ָ� ��.
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
<!--  �ݺ����� ���� �־��ֱ� ���� ��Ʈ -->
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
								<th class="product-thumbnail">��ǰ</th>
								<th class="product-name">��ǰ��</th>
								<th class="product-price">��ǰ �ݾ�</th>
								<th class="product-quantity">���� ����</th>
								<th class="product-total">�ݾ�</th>
								<th class="product-remove">�����ϱ�</th>
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
										<!-- ��ư�� ������ ���� �߰��ϴ� �κ� ���� -->
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

									<!-- ��ư�� ������ ���� �߰��ϴ� �κ� �� -->
									<td class="totalprice" id="totalprice${p.basket_id }">totalprice</td>
									
									<!--  x�� ������ cart ���̺��� �������ִ� ������ �ؾ���. delete. -->
									<!--  �ƴϸ� �ؿ� cart updat�� ������ �� �������� ���ΰ�ħ�Ǹ鼭 �ٲ����.. -->
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
						<!-- ��ư�� Ŭ���ϸ� �����ͺ��̽� update�ϰ� ���� �������� ���ƿ��ºκ� ����-->
						<!-- ����غ��ߵǴ°� �̿��� ���忡�� �򰥸� �� ����. -->
						<button
							id="updatecart" class="btn btn-primary btn-sm btn-block "> <!-- onclick="window.location='cartupdate.mc'" -->���ΰ�ħ</button>

						<!-- ��ư�� Ŭ���ϸ� �����ͺ��̽� update�ϰ� ���� �������� ���ƿ��ºκ� ��-->

					</div>
					<div class="col-md-6">
						<!-- ��ư�� Ŭ���ϸ� �����ϴ� �������� �����̷�Ʈ�ϴ� �κ� ���� -->
						<a href="shop.mc"><button
								class="btn btn-outline-primary btn-sm btn-block" onclick="window.location='shop.mc'">��� �����ϱ�</button></a>
						<!-- ��ư�� Ŭ���ϸ� �����ϴ� �������� �����̷�Ʈ�ϴ� �κ� ���� -->
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
								<h3 class="text-black h4 text-uppercase">��ٱ��� �ݾ�</h3>
							</div>
						</div>
						<div class="row mb-3">
							<div class="col-md-6">
								<span class="text-black">���� ���� �ݾ�</span>
							</div>
							<div class="col-md-6 text-right">
								<strong id="subtotal" class="text-black">$230.00</strong>
							</div>
						</div>
						<div class="row mb-5">
							<div class="col-md-6">
								<span class="text-black">�� �ݾ� </span>
							</div>
							<div class="col-md-6 text-right">
								<strong  id="total" class="text-black">$230.00</strong>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<button class="btn btn-primary btn-lg py-3 btn-block"
									onclick="window.location='checkout.mc?email=${email }'">�����ϱ�</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--  �����̳ʰ� ���������� -->
</div>