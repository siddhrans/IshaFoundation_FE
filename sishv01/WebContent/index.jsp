<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<!-- bootstrap css files -->
<link rel="stylesheet" href="css/bootstrap-theme.css">
<link rel="stylesheet" href="css/bootstrap-theme.css.map">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css.map">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.css.map">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css.map">

<!-- Bootstrap js files -->
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/npm.js"></script>

<!-- bootstrap fonts -->

<!-- angularjs js file -->
<script type="text/javascript" src="js/angular.js"></script>

<!-- css files -->

<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<div class="container">
		<div class="row">
			 <div class="col-xs-6 col-md-4"></div>
  			 <div class="col-xs-6 col-md-4">
  			 	<div class="panel panel-default" id="log-form">
  			 		<div class="panel-header" id="log-header">
  			 			<ul class="nav nav-tabs nav-justified">
							<li  class="active"><a href="#login">LOGIN</a></li>
							<li ><a href="#register">REGISTER</a></li>
						</ul>
  			 		</div>
  			 		
  			 		<div class="panel-body">
	  			 		<div id="login">
	  			 			<form id="login_form">
	  			 				<div class="form-horizontally">		
									<div class="input-group" id="form_group1">
									  <span class="input-group-addon" id="first_add"><span class="glyphicon glyphicon-user"></span></span>
									  <input type="text" class="form-control" placeholder="Username" aria-describedby="first_add">
									</div>
									<div class="input-group" id="form_group2">
									  <span class="input-group-addon" id="second_add"><span class="glyphicon glyphicon-lock"></span></span>
									  <input type="text" class="form-control" placeholder="Enter password" aria-describedby="second_add">
									</div>
									<input type="checkbox" id="terms-box">&ensp;I accept <a href="">terms &amp; conditions</a>	
									<button class="btn  btn-default btn-lg btn-block" >LOGIN</button>
									<h5 ><a href="#">Forgot Passcode</a></h5>
									
								
	  			 				</div>
	  			 			
	  			 			</form>
	  			 		
	  			 		</div>
		  			 		<div id="register">
		  			 		
		  			 		</div>
  			 		</div>
  			 	</div>

				
				
			
  			 </div>
  			 <div class="col-xs-6 col-md-4"></div>
		
		</div>
	</div>
</body>
</html>