<!DOCTYPE html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">


</head>
    <body>
		    <nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">WeBuy</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/Admins">Administrateurs</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/Users">Utilisateurs</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/Stores">Magazins</a>
		      </li>
		    </ul>
		  </div>
		</nav>
    	<script src="static/js/jquery-1.11.1.min.js"></script>
		<script src="static/js/bootstrap.min.js"></script>
		<c:choose>
			<c:when test="${mode=='allUsers' }">
			<div class="container text-center" id="tasksDiv">
				<br>
				<h3>Utlisateurs</h3>
				<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Email</th>
								<th>Username</th>
								<th>Numéro</th>
								<th>Créée le</th>
								<th>Promouvoir</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.user_id}</td>
									<td>${user.email}</td>
									<td>${user.username}</td>
									<td>${user.mobileNumber}</td>
									<td>${user.createdAt}</td>
									<td><a href="/promote-user?id=${user.user_id}"><span
										 class="glyphicon glyphicon-plus"></span></a></td>
									<td><a href="/delete-user?id=${user.user_id}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
								
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:when>
			
			<c:when test="${mode == 'allAdmins' }">
			<div class="container text-center" id="tasksDiv">
				<br>
				<h3>Administrateurs</h3>
				<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Email</th>
								<th>Username</th>
								<th>Numéro</th>
								<th>Créée le</th>
								<th>Rétrograder</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.user_id}</td>
									<td>${user.email}</td>
									<td>${user.username}</td>
									<td>${user.mobileNumber}</td>
									<td>${user.createdAt}</td>
									<td><a href="/promote-user?id=${user.user_id}"><span
										 class="glyphicon glyphicon-minus"></span></a></td>
									<td><a href="/delete-user?id=${user.user_id}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
								
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:when>
			
			<c:when test="${mode == 'allStores' }">
			<div class="container text-center" id="tasksDiv">
				<br>
				<h3>Magazins</h3>
				<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Logo</th>
								<th>Name</th>
								<th>longitude</th>
								<th>latitude</th>
								<th>departement</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="store" items="${stores }">
								<tr>
									<td>${store.store_id}</td>
									<td>${store.store_logo}</td>
									<td>${store.store_name}</td>
									<td>${store.longitude}</td>
									<td>${store.latitude}</td>
									<td>${store.department }</td>
									<td><a href="/delete-user?id=${user.user_id}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
								
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:when>
		</c:choose>
	</body>
	
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
		    $('#table').DataTable();
		} );
	</script>
	
</html>