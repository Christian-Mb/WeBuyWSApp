<!DOCTYPE html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


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
				<li class="nav-item">
					<a class="nav-link" href="/Deals">Deals</a>
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
								<th>Numero</th>
								<th>Creee le</th>
								<th>Promouvoir</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.getUser_id()}</td>
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
								<th>Numero</th>
								<th>Cree le</th>
								<th>Retrograder</th>
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
									<td><a href="/retrograde-admin?id=${user.user_id}"><span
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
					<button class="btn btn-primary" data-target="#modal" data-toggle="modal" style="float: left;font-size: 16px;left:50px;position: relative">Ajouter</button>
				<h3>Magazins</h3>
				<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Logo</th>
								<th>Name</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="store" items="${stores }">
								<tr>
									<td>${store.getStore_id()}</td>
									<td><img src="${store.logo}" width="75px" height="75"></td>
									<td><a href="/StoreAddress?id=${store.store_id}">${store.name}</a></td>
									<td><a href="/delete-store?id=${store.store_id}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="modal" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
					 aria-hidden="true">
					<div class="modal-dialog" role="document" >
						<div class="modal-content">
							<div class="modal-header text-center">
								<h4 class="modal-title w-100 font-weight-bold">Ajouter</h4>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body mx-3" >
								<form class="form-horizontal" method="POST" action="addStore">
									<div class="form-group">
										<label class="control-label col-md-3">Nom</label>
										<div >
											<input type="text" name="name" value="${store.name }"/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3">Logo</label>
										<div>
											<input type="logo" name="logo" value="${store.logo }"/>
										</div>
									</div>

							</div>
							<div class="modal-footer d-flex justify-content-center">
								<div class="form-group">
									<input type="submit" class="btn btn-primary" value="Register"/>
								</div>
							</div>
							</form>
						</div>
					</div>
				</div>
			</c:when>
			<c:when test="${mode == 'allStoreAddress' }">

				<div class="container text-center" id="tasksDiv">
					<br>
					<button type="button" class="btn btn-primary" style="float: left;font-size: 16px;left:50px;position: relative">Ajouter</button>
					<h3>Addresses de ${magazin.name}</h3>
					<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
						<tr>
							<th>Id</th>
							<th>Longitude</th>
							<th>Latitude</th>
							<th>Departement</th>
							<th>Supprimer</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="store" items="${allStoreAddress }">
							<tr>
								<td>${store.address_id}</td>
								<td>${store.longitude}</td>
								<td>${store.latitude}</td>
								<td>${store.department}</td>
								<td><a href="/delete-storeAddress?id=${store.address_id}&store_id=${store.store.store_id}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</c:when>
			<c:when test="${mode == 'AllDeals'}">
				<div class="container text-center" id="tasksDiv">
					<br>
					<button type="button" class="btn btn-primary" style="float: left;font-size: 16px;left:50px;position: relative">Modifier</button>
					<h3>Tous les deals</h3>
					<hr>
					<table id="table" class="table table-striped table-bordered">
						<thead>
						<tr>
							<th>Id</th>
							<th>Posté le</th>
							<th>Fini le</th>
							<th>Prix (hors promo)</th>
							<th>Prix (promo)</th>
							<th>Quantitee disponible</th>
							<th>Quantitee à acheté</th>
							<th>Commence le</th>
							<th>J'aime pas</th>
							<th>J'aime</th>
							<th>Modifier</th>
							<th>Supprimer</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="deal" items="${allDeals }">
							<tr>
								<td>${deal.getDeal_id()}</td>
								<td>${deal.createdAt}</td>
								<td>${deal.endedAt}</td>
								<td>${deal.price}</td>
								<td>${deal.price_pomo}</td>
								<td>${deal.quantity_available}</td>
								<td>${deal.quantity_to_buy}</td>
								<td>${deal.startedAt}</td>
								<td>${deal.userDislike}</td>
								<td>${deal.userLike}</td>
								<td><a href="/modifyDeal?id=${deal.getDeal_id()}">modifier</a></td>
								<td><a href="/delete-deal?id=${deal.getDeal_id()}"><span
										class="glyphicon glyphicon-trash"></span></a></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>

			</c:when>
			<c:when test="${mode == 'dealform'}">
				<div class="container text-center">
					<h3>Modifier le deal ${deal.deal_id} (NON FONCTIONNEL)</h3>
					<hr>
					<form class="form-horizontal" method="POST" action="modifyDeal">
						<div class="form-group">
							<label class="control-label col-md-3">Creer le</label>
							<div >
								<input type="datetime-local" id="created"name="create" value="${deal.createdAt }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Fini le </label>
							<div>
								<input type="datetime-local" name="end" value="${deal.endedAt }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">price hors promo </label>
							<div>
								<input type="number" name="priceHP" step="0.01" value="${deal.price }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">prix promo </label>
							<div>
								<input type="number" name="priceP" value="${deal.price_pomo }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Quantite disponible </label>
							<div>
								<input type="number" name="quantityAvailable" value="${deal.quantity_available }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Quantite a achete </label>
							<div>
								<input type="number" name="quantityBuy" value="${deal.quantity_to_buy }"/>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Commence le </label>
							<div>
								<input type="date" name="started" value="${deal.startedAt }"/>
							</div>
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-primary" value="Modifier"/>
						</div>
					</form>
				</div>
			</c:when>
		</c:choose>
	</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

	<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
		    $('#table').DataTable();
		} );
		
	</script>


</html>