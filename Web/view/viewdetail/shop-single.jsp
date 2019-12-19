<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Shoppers &mdash; Colorlib e-Commerce Template</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Mukta:300,400,700">
<link rel="stylesheet" href="fonts/icomoon/style.css">

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">


<link rel="stylesheet" href="css/aos.css">

<link rel="stylesheet" href="css/style.css">

</head>

<div class="site-wrap">
	
	<div class="bg-light py-3">
		<div class="container">
			<div class="row">
				<div class="col-md-12 mb-0">
					<a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong
						class="text-black">${dbproduct.name }</strong>
				</div>
			</div>
		</div>
	</div>


	<div class="site-section">
		<div class="container">
			

				<c:choose>
					<c:when test="${dbproduct == null }">
						<jsp:include page="shop.mc"></jsp:include>
					</c:when>

					<c:otherwise>
						<jsp:include page="productdetail.jsp" />
					</c:otherwise>
				</c:choose>
				<!--  <div class="col-md-6">
            <img src="images/${dbproduct.img }" alt="Image" class="img-fluid">
           
          </div>
          <div class="col-md-6">
            <h2 class="text-black">${dbproduct.name }</h2>
            <p>${dbproduct.description }</p>
            <p class="mb-4"></p>
            <p><strong class="text-primary h4">${dbproduct.price }</strong></p>
          	<p>${dbproduct.soldamount }
            <div class="mb-1 d-flex">
              
            </div>
            <div class="mb-5">
              <div class="input-group mb-3" style="max-width: 120px;">
              <div class="input-group-prepend">
                <button class="btn btn-outline-primary js-btn-minus" type="button">&minus;</button>
              </div>
              <input type="text" class="form-control text-center" value="1" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
              <div class="input-group-append">
                <button class="btn btn-outline-primary js-btn-plus" type="button">&plus;</button>
              </div>
            </div>

            </div>
            <p><a href="cart.mc" class="buy-now btn btn-sm btn-primary">장바구니</a></p>

          </div>-->
			
		</div>
	</div>

	<div class="site-section block-3 site-blocks-2 bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-7 site-section-heading text-center pt-4">
					<h2>리뷰보기</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="nonloop-block-3 owl-carousel">
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<!-- <img src="images/cloth_1.jpg" alt="Image placeholder" class="img-fluid"> -->

								</figure>
								<div class="block-4-text p-4">
									<!-- <h3><a href="#">Tank Top</a></h3>
                    <p class="mb-0">Finding perfect t-shirt</p>
                    <p class="text-primary font-weight-bold">$50</p> -->

								</div>
							</div>
						</div>
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<!-- <img src="images/shoe_1.jpg" alt="Image placeholder" class="img-fluid"> -->
								</figure>
								<div class="block-4-text p-4">
									<!-- <h3><a href="#">Corater</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p> -->
								</div>
							</div>
						</div>
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<!-- <img src="images/cloth_2.jpg" alt="Image placeholder" class="img-fluid"> -->
								</figure>
								<div class="block-4-text p-4">
									<!-- <h3><a href="#">Polo Shirt</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p> -->
								</div>
							</div>
						</div>
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<!-- <img src="images/cloth_3.jpg" alt="Image placeholder" class="img-fluid"> -->
								</figure>
								<div class="block-4-text p-4">
									<!-- <h3><a href="#">T-Shirt Mockup</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p> -->
								</div>
							</div>
						</div>
						<div class="item">
							<div class="block-4 text-center">
								<figure class="block-4-image">
									<!-- <img src="images/shoe_1.jpg" alt="Image placeholder" class="img-fluid"> -->
								</figure>
								<div class="block-4-text p-4">
									<!-- <h3><a href="#">Corater</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p> -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	
</div>

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>

	    <script src="https://kit.fontawesome.com/14d7f3870b.js" crossorigin="anonymous"></script>
	
