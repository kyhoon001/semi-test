<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <html lang="en">
  <head>
    <title>Shoppers &mdash; Colorlib e-Commerce Template</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">


    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">
    
  </head>
  <body>
  
  <div class="site-wrap">
    <header class="site-navbar" role="banner">
			<div class="site-navbar-top">
				<div class="container">
					<div class="row align-items-center">

						<div
							class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-left">
							<form action="search.mc" class="site-block-top-search"
								method="post">
								<span class="icon icon-search2"></span> <input type="text"
									class="form-control border-0" name="search"
									placeholder="Search">
							</form>
						</div>

						<div
							class="col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center">
							<div class="site-logo">
								<a href="index.html" class="js-logo-clone">Shoppers</a>
							</div>
						</div>

						<div class="col-6 col-md-4 order-3 order-md-3 text-right">
							<div class="site-top-icons">
								<ul>
									<c:choose>
                     <c:when test="${email == null }">
                     <!-- Not loginned -->
                        <li><a href="login.mc"><span class="icon icon-person"></span></a></li>
                       <li>
                    <a href="cart.mc" class="site-cart">
                      <span class="icon icon-shopping_cart"></span>
                    </a>
                  </li>  
                     </c:when>
                     <c:otherwise>
                     <!-- loginned -->
                       <li><div class="d-flex">
									<div class="dropdown mr-1 ml-md-auto">
										<button type="button"
											class="btn btn-secondary btn-sm dropdown-toggle"
											id="dropdownMenuOffset" data-toggle="dropdown"
											aria-haspopup="true" aria-expanded="false">
												
											<a href="userDetail.mc?email=${email }">${name }님</a>
										</button>
										<div class="dropdown-menu"
											aria-labelledby="dropdownMenuOffset">
											<a class="dropdown-item" href="userDetail.mc?email=${email }">마이페이지</a> <a
												class="dropdown-item" href="orderlist.mc?email=${email }">주문내역</a> 
										</div>
									</div>
									</div></li>
                        <li><a href="logout.mc"><i class="fas fa-sign-out-alt"></i></a></li>
                       <li>
                    <a href="cart.mc" class="site-cart">
                      <span class="icon icon-shopping_cart"></span>
                      <!--  ㅎㅎㅎㅎ --> <c:choose>
                                    <c:when test="${cartcount == null || cartcount ==0 }">
                                    </c:when>

                                    <c:otherwise>
                                       <span class="count">${cartcount }</span>
                                    </c:otherwise>
                                 </c:choose>

                           </a>
                  </li> 
                     </c:otherwise>
                  </c:choose>
                  
                  <li class="d-inline-block d-md-none ml-md-0"><a href="#" class="site-menu-toggle js-menu-toggle"><span class="icon-menu"></span></a></li>
								</ul>
							</div>
						</div>

					</div>
				</div>
			</div>
			<nav class="site-navigation text-right text-md-center"
				role="navigation">
				<div class="container">
					<ul class="site-menu js-clone-nav d-none d-md-block">
						<li class="has-children active"><a href="index.html">Home</a>
							<!-- <ul class="dropdown">
								<li><a href="#">Menu One</a></li>
								<li><a href="#">Menu Two</a></li>
								<li><a href="#">Menu Three</a></li>
								<li class="has-children"><a href="#">Sub Menu</a>
									<ul class="dropdown">
										<li><a href="#">Menu One</a></li>
										<li><a href="#">Menu Two</a></li>
										<li><a href="#">Menu Three</a></li>
									</ul></li>
							</ul></li> -->
						<!-- <li class="has-children"><a href="about.mc">About</a>
							<ul class="dropdown">
								<li><a href="#">Menu One</a></li>
								<li><a href="#">Menu Two</a></li>
								<li><a href="#">Menu Three</a></li>
							</ul></li>-->
						<li><a href="shop.mc">Shop</a></li>
						
						<li><a href="#">New Arrivals</a></li>
						<li><a href="board.mc">Board</a></li>
					</ul>
				</div>
			</nav>
		</header>


	<div class="bg-light py-3">
      <div class="container">
        <div class="row">
          <div class="col-md-12 mb-0"><a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">User Detail</strong></div>
        </div>
      </div>
    </div> 
	
	<div class="site-section">
		<div class="container">
	        <div class="row">
	          <div class="col-md-12">
	            <h2 class="h3 mb-3 text-black">마이페이지</h2>
	          </div>
	          <div class="col-md-12">
	            <form id="userDetail" action="userUpdate.mc" method="post">
	              <div class="p-3 p-lg-5 border">
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="name" class="text-black">이메일</label>
	                    <input type="email" class="form-control" id="email" name="email" placeholder="" readonly value="${user.email }">
	                  </div>
	                </div>
	                
	                <div id = "id_check"></div>
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="Password" class="text-black">비밀번호</label>
	                    <input type="password" class="form-control" id="pwd" name="pwd" placeholder="" readonly value="${user.pwd }">
	                  </div>
	                </div>
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="Name" class="text-black">이름</label>
	                    <input type="text" class="form-control" id="name" name="name" placeholder="" readonly value="${user.name }">
	                  </div>
	                </div>
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="Address" class="text-black">주소</label>
	                    <input type="text" class="form-control" id="address" name="address" placeholder="" readonly value="${user.address }">
	                  </div>
	                </div>
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="phone" class="text-black">연락처</label>
	                    <input type="text" class="form-control" id="phone" name="phone" placeholder="" readonly value="${user.phone }">
	                  </div>
	                </div>
	                
	                <div class="form-group row">
	                  <div class="col-md-12">
	                    <label for="Birthdate" class="text-black">생년월일</label>
	                    <fmt:formatDate value="${user.b_date}" var="dateFmt" pattern="yyyy-MM-dd"/>
	                    <input type="date" class="form-control" id="b_date" name="b_date" placeholder="" readonly value="${dateFmt }">
	                  </div>
	                </div>
	                
	                <c:choose>
	                	<c:when test='${user.sex == "M" }'>
	                		<input type="radio" name="sex" value="M" checked>Male
							<input type="radio" name="sex" value="F" disabled>Female
	                	</c:when>
	                	<c:otherwise>
	                		<input type="radio" name="sex" value="M" disabled>Male
							<input type="radio" name="sex" value="F" checked>Female
	                	</c:otherwise>
	                </c:choose>
	                <div class="m-6">
		                <button id="update">수정하기</button>
		                <button id="confirm">확인</button>
		                <button id="cancel">취소</button>
		                <button id="withdrawl">회원탈퇴</button>
	                </div>
	              </div>
	            </form>
	          </div>
	          
	        </div>
	      </div>
	    </div>
	
	
    <footer class="site-footer border-top">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 mb-5 mb-lg-0">
            <div class="row">
              <div class="col-md-12">
                <h3 class="footer-heading mb-4">Navigations</h3>
              </div>
              <div class="col-md-6 col-lg-4">
                <ul class="list-unstyled">
                  <li><a href="#">Sell online</a></li>
                  <li><a href="#">Features</a></li>
                  <li><a href="#">Shopping cart</a></li>
                  <li><a href="#">Store builder</a></li>
                </ul>
              </div>
              <div class="col-md-6 col-lg-4">
                <ul class="list-unstyled">
                  <li><a href="#">Mobile commerce</a></li>
                  <li><a href="#">Dropshipping</a></li>
                  <li><a href="#">Website development</a></li>
                </ul>
              </div>
              <div class="col-md-6 col-lg-4">
                <ul class="list-unstyled">
                  <li><a href="#">Point of sale</a></li>
                  <li><a href="#">Hardware</a></li>
                  <li><a href="#">Software</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3 mb-4 mb-lg-0">
            <h3 class="footer-heading mb-4">Promo</h3>
            <a href="#" class="block-6">
              <img src="images/hero_1.jpg" alt="Image placeholder" class="img-fluid rounded mb-4">
              <h3 class="font-weight-light  mb-0">Finding Your Perfect Shoes</h3>
              <p>Promo from  nuary 15 &mdash; 25, 2019</p>
            </a>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="block-5 mb-5">
              <h3 class="footer-heading mb-4">Contact Info</h3>
              <ul class="list-unstyled">
                <li class="address">203 Fake St. Mountain View, San Francisco, California, USA</li>
                <li class="phone"><a href="tel://23923929210">+2 392 3929 210</a></li>
                <li class="email">emailaddress@domain.com</li>
              </ul>
            </div>

            <div class="block-7">
              <form action="#" method="post">
                <label for="email_subscribe" class="footer-heading">Subscribe</label>
                <div class="form-group">
                  <input type="text" class="form-control py-4" id="email_subscribe" placeholder="Email">
                  <input type="submit" class="btn btn-sm btn-primary" value="Send">
                </div>
              </form>
            </div>
          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <p>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            Copyright &copy;<script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" class="text-primary">Colorlib</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            </p>
          </div>
          
        </div>
      </div>
    </footer>
  </div>	

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>
	    <script src="https://kit.fontawesome.com/14d7f3870b.js" crossorigin="anonymous"></script>
	
  <script src="js/main.js"></script>
  <script src="view/User/UserDetail/main.js"></script>
  
    
  </body>
</html>