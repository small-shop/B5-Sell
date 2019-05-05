<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<meta name="keywords"
	content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="../../css/style1.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link
	href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet'
	type='text/css'>
<!--//webfonts-->
<script
	src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
	<script>
		$(document).ready(function(c) {
			$('.close').on('click', function(c) {
				$('.login-form').fadeOut('slow', function(c) {
					$('.login-form').remove();
				});
			});
		});
	</script>
	<!--SIGN UP-->
	<h1>用户注册</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"> </label> <label class="lbl-2"> </label> <label
				class="lbl-3"> </label>
		</div>
		<div class="clear"></div>
		<div class="avtar">
			<img src="../../images/avtar.png" />
		</div>
		<form:form action="toregister" method="post" id="registerForm"
			modelAttribute="Clientinfo">
			<form:input type="text" class="text" path="clientname" value="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}"></form:input>
			<form:errors path="clientname"></form:errors>
			<form:input path="phone" type="text" class="text" value="phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'phone';}"/>
			<form:input path="sex" type="text" class="text" value="sex" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'sex';}"/>
			<div class="key">
				<form:input type="password" path="pwd" value="Password" onfocus="this.value = '';" id="pwd" ></form:input>
				<form:errors path="pwd"></form:errors>
				<form:input type="password" path="repwd" value="Password" onfocus="this.value = '';" id="pwd" ></form:input>
			</div>
			<div class="signin">
				<input type="submit" value="注册">
			</div>
		</form:form>
	</div>
	

</body>
</html>