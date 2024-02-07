	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
		crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<title>Registrazione</title>
	</head>
	
	<body>
	
	<nav class="navbar  nav-home">
	  <div class="container-fluid">
	    <a class="navbar-brand text-white" href="home.html">Manga Shop</a>
	    <div class="d-flex justify-content-between" >
	    <a class="nav-link mx-2 text-white" href="login.jsp">Login</a>
	     
	    </div>
	  </div>
	</nav>
	
	
		<div class="container">
			<div class="row">
				<div class="col-5 mx-auto text-center div-form p-4">
	
					<h3>Registrati</h3>
	
					<form method="Post" action="ServletRegistrazione">
	
						<div class="mb-3 row">
							<div class="col">
								<label for="firstName" class="d-flex justify-content-start mb-2">Nome</label>
								<input type="text" class="form-control" placeholder="Nome"
									name="nome">
							</div>
							<div class="col">
								<label for="lastName" class="d-flex justify-content-start mb-2">Cognome</label>
								<input type="text" class="form-control" name="cognome"
									placeholder="Cognome">
							</div>
						</div>
						<div class="mb-3">
							<label for="exampleInputEmail1"
								class="d-flex justify-content-start mb-2 ml-0">Mail</label> <input
								type="text" class="form-control" name="email"
								aria-describedby="emailHelp" placeholder="Email">
						</div>
						<div class="mb-3">
							<label for="inputAddress"
								class="d-flex justify-content-start mb-2">Indirizzo</label> <input
								type="text" class="form-control" name="indirizzo"
								placeholder="Inserisci indirizzo">
						</div>
						<div class="mb-3">
							<label for="inputPhone" class="d-flex justify-content-start mb-2">Numero
								di Telefono</label> <input type="text" class="form-control"
								name="numero_telefono" placeholder="Numero di Telefono">
						</div>
						<div class="mb-3">
							<label for="inputPassword"
								class="d-flex justify-content-start mb-2">Password</label> <input
								type="password" class="form-control" name="psw"
								aria-describedby="passwordHelpBlock" placeholder="Password">
						</div>
						<div class="mb-3">
							<label for="confirmPassword"
								class="d-flex justify-content-start mb-2">Conferma
								Password</label> <input type="password" class="form-control"
								name="confermaPassword" aria-describedby="passwordHelpBlock"
								placeholder="Conferma Password">
	
						</div>
	
						<button type="submit" class="px-3 invia">Invia</button>
	
					</form>
				</div>
			</div>
		</div>
	
	
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
			crossorigin="anonymous"></script>
	
	</body>
	</html>