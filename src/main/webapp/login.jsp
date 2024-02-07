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
<title>accedi</title>
</head>

<body>

<nav class="navbar  nav-home">
  <div class="container-fluid">
    <a class="navbar-brand text-white" href="home.html">Manga Shop</a>
    <div class="d-flex justify-content-between" >
     <a class="nav-link mx-2 text-white" href="registrazione.jsp">Registrazione</a> 
    </div>
  </div>
</nav>

	<div class="container">
		<div class="row">
			<div class="col-5 mx-auto text-center div-form p-4">

				<h3>Accedi</h3>


				<form action="ServletLogin" method="post">
					<div class="mb-3">
						<label for="exampleDropdownFormEmail1"
							class="d-flex justify-content-start mb-2">Indirizzo mail</label>
						<input type="email" class="form-control" id="email" name="email"
							placeholder="inserisci la tua mail">
					</div>
					<div class="mb-3">
						<label for="exampleDropdownFormPassword1"
							class="d-flex justify-content-start mb-2">Password</label> <input
							type="password" class="form-control" id="psw"
							placeholder="Password" name="psw">
					</div>


					<button type="submit" class="accedi">Accedi</button>
				</form>
				<div class="dropdown-divider mt-3"></div>
				<a class="dropdown-item" href="registrazione.jsp">Sei nuovo qui?
					Registrati</a>
			</div>
		</div>
	</div>
	
	


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

</body>
</html>
