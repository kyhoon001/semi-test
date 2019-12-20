<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="site-blocks-cover"
	style="background-image: url(images/main.jpg);" data-aos="fade">
	<div class="container">
		<div
			class="row align-items-start align-items-md-center justify-content-end">
			
				<h1 class="col-md-3 text-center " style ="color:white;background:black;opacity:0.8;">Shoppers</h1><br><br>
				<h1 class="col-md-10 text-center " style ="color:white; background:black;opacity:0.8;">새로운 IoT 장비들을 만나보세요!</h1>
			
		</div>
	</div>
</div>

<div class="site-section site-section-sm site-blocks-1">
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4"
				data-aos="fade-up" data-aos-delay="">
				<div class="icon mr-4 align-self-start">
					<span class="icon-truck"></span>
				</div>
				<div class="text">
					<h2 class="text-uppercase">무료 배송</h2>
					<p>60,000이상 구매 시 무료 배송!</p>
					<p>오후 3시 이전 구매 완료 시 당일 발송!</p>
				</div>
			</div>
			<div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4"
				data-aos="fade-up" data-aos-delay="100">
				<div class="icon mr-4 align-self-start">
					<span class="icon-refresh2"></span>
				</div>
				<div class="text">
					<h2 class="text-uppercase">반품 비용 무료</h2>
					<p>품질 문제시 반품 배송비 무료!</p>

					<p>단순 변심은.. 안돼요..</p>
				</div>
			</div>
			<div class="col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4"
				data-aos="fade-up" data-aos-delay="200">
				<div class="icon mr-4 align-self-start">
					<span class="icon-help"></span>
				</div>
				<div class="text">
					<h2 class="text-uppercase">빵빵한 고객서비스!</h2>
					<p>빠른 AS를 보장합니다!</p>
					<p>편하고~빠르게~</p>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="site-section block-3 site-blocks-2 bg-light">
	<div class="container">
		<div class="row justify-content-center">
		
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="nonloop-block-3 owl-carousel">

					<c:forEach var="b" items="${board }">
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<img src="${b.img }" alt="Image placeholder"
										class="img-fluid">
								</figure>
								<div class="block-4-text p-4">
									<h3>
										<a href="#">${b.title }</a>
									</h3>
									<p class="mb-0">${b.description }</p>
									<p class="text-primary font-weight-bold">${b.category }</p>
								</div>
							</div>
						</div>
					</c:forEach>
					
				</div>
			</div>
		</div>
	</div>
</div>

