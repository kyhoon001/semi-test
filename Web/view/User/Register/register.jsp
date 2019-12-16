<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V14</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="view/User/Register/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="view/User/Register/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="view/User/Register/css/util.css">
	<link rel="stylesheet" type="text/css" href="view/User/Register/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">
				<form action="registerimpl.mc" class="login100-form validate-form flex-sb flex-w" method = "post">
					<span class="login100-form-title p-b-32">
						Sign Up
					</span>
					
					<span class="txt1 p-b-11">
						Email
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Email is required">
						<input class="input100" type="text" name="email" id="email" >
						<span class="focus-input100"></span>
					</div>
					<div class="m-b-3 w-100" id = "id_check"></div>
					
					<span class="txt1 p-b-11">
						Password
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Password is required">
						<span class="btn-show-pass">
							<i class="fa fa-eye"></i>
						</span>
						<input class="input100" type="password" name="pwd" >
						<span class="focus-input100"></span>
					</div>
					
					<span class="txt1 p-b-11 w-100">
						Re-Password
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Re-Password is required">
						<span class="btn-show-pass">
							<i class="fa fa-eye"></i>
						</span>
						<input class="input100" type="password" name="pwd2" >
						<span class="focus-input100"></span>
					</div>
					
					<div class="m-b-3 w-100" id="pw_check"></div>
					

					<span class="txt1 p-b-11">
						Name
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Name is required">
						<input class="input100" type="text" name="name" >
						<span class="focus-input100"></span>
					</div>

					<span class="txt1 p-b-11">
						Address
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Address is required">
						<input class="input100" type="text" name="address" >
						<span class="focus-input100"></span>
					</div>
					
					<span class="txt1 p-b-11">
						Phone
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Phone Number is required">
						<input class="input100" type="text" name="phone" >
						<span class="focus-input100"></span>
					</div>
					
					<span class="txt1 p-b-11">
						Birth
					</span>
					<div class="wrap-input100 validate-input m-b-12" data-validate = "Birth is required">
						<input class="input100" type="date" name="b_date" >
						<span class="focus-input100"></span>
					</div>
					
					
					<span class="txt1 p-b-11">
						Gender
					</span>
					<div class="validate-input m-b-12" data-validate = "Gender is required">
						<input type="radio" name="sex" value="M">Male
						<input type="radio" name="sex" value="F">Female
					</div>
					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn" id="signup">
							Sign Up
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/bootstrap/js/popper.js"></script>
	<script src="view/User/Register/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/daterangepicker/moment.min.js"></script>
	<script src="view/User/Register/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="view/User/Register/js/main.js"></script>

</body>
</html>