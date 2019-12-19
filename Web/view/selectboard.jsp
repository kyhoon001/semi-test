
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">
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
<body>

	<div class="site-wrap">

		<div class="bg-light py-3">
			<div class="container">
				<div class="row">
					<div class="col-md-12 mb-0">
						<a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong
							class="text-black">Q&A</strong>
					</div>
				</div>
			</div>
		</div>

		<div class="site-section">
			<div class="container">
				<div>
					<div class="col-md-12"></div>

					<div class="col-md-7" style="margin: 0 auto">
						<h2 style="margin: 0 auto;">Q&A</h2>
							<c:if test="${email eq boardVO.email}">
									<a href="bdelete.mc?board_id=${boardVO.board_id }">
										<button id="productUpdate"
											class="buy-now btn btn-sm btn-primary"
											style="float: right; margin-right: 10%;   margin-top: 6%;">
											Delete</button>
									</a>
								</c:if>
						<form enctype="multipart/form-data"
							action="bupdatego.mc?board_id=${boardVO.board_id }" method="post"
							id="inform">

							<div class="p-3 p-lg-5 border">

								<div class="form-group row">
									<div class="col-md-12">
										<label for="c_subject" class="text-black">Category :
											${boardVO.board_category}</label>

									</div>
								</div>

								<div class="form-group row">
									<div class="col-md-12">
										<label for="c_message" class="text-black">Contents </label>




										<textarea id="c_message" cols="50" rows="15"
											class="form-control" readonly="readonly"> ${boardVO.board_contents}</textarea>

									</div>
								</div>
								<div class="form-group row">
									<div class="col-lg-12">
										<c:if test="${email eq boardVO.email}">
											<a href="bupdatego.mc?board_id=${boardVO.board_id }">
												<button id="productUpdate"
													class="buy-now btn btn-sm btn-primary"
													style="float: right; margin-right: 10%; margin-bottom: 30px;">
													Modify</button>
											</a>
										</c:if>
										<c:if test="${email eq 'Admin@admin.a'}">
											<a href="bupdatego.mc">
												<button id="productUpdate"
													class="buy-now btn btn-sm btn-primary"
													style="float: right;">
													reply</button>
											</a>
										</c:if>
									</div>
								</div>
								</div>
						</form>
						<div class="form-group row">
							<div class="col-lg-12">
							


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

	<script src="js/main.js"></script>

</body>
</html>