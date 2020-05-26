<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>WeBuy</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
	<body>
	
	<br>
	<br>
	<div class="container text-center">
		<h3>Se connecter</h3>
		<hr>
		<form class="form-horizontal" method="POST" action="isAdmin">
			<div class="form-group">
				<label class="control-label col-md-3">Email</label>
				<div >
					<input type="text" name="email" value="${user.email }"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Mot de passe</label>
				<div>
			<input type="password" name="password" value="${user.password }"/>
				</div>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Register"/>
			</div>
		</form>
	</div>
	<div>
	<br>
	<% if(request.getAttribute("errorMessage") != null) { %>
		<div class="container text-center">
			<h5 style="color:red"><%= request.getAttribute("errorMessage") %></h5>
		</div>
		<% }%>
	
	</div>
	
		<script src="static/js/jquery-1.11.1.min.js"></script>
		<script src="static/js/bootstrap.min.js"></script>
	</body>
	
</html>