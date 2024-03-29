<%@page import="it.accenture.ecommerce.classi.Prodotto"%>
<%@page import="java.util.List"%>
<%@page import="it.accenture.ecommerce.classi.Chiavi"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
	integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<link href="css/prodotti.css" rel="stylesheet" type="text/css">
<title>Prodotti</title>
</head>
<body>

	<nav class="navbar  nav-home">
		<div class="container-fluid">
			<a class="navbar-brand text-white" href="home.html">Manga Shop</a>
			<div class="d-flex justify-content-between">
				<a href="<%=request.getContextPath() + "/ServletCarrello"%>"
					class="nav-link mx-2 text-white">Carrello</a>

			</div>
		</div>
	</nav>
	<div class="container">
		<div class="d-flex justify-content-between">
			<h1 class="titolo">I nostri prodotti</h1>

		</div>
		<form class="d-flex justify-content-between mb-4 p-1 " role="search">
			<input oninput="searchByName()" class="form-control mr-3"
				id="searchInput" type="search"
				placeholder="Cerca il tuo funko pop preferito" aria-label="Search">

		</form>
		<form action="<%=request.getContextPath() + "/ServletAggiungi"%>"
			method="Post">
			<div id="productContainer"
				class="row row-cols-1 row-cols-md-3 g-4 d-flex flex-wrap">
				<%
				List<Prodotto> listaProdotti = (List<Prodotto>) request.getAttribute(Chiavi.CHIAVE_LISTA_PRODOTTI);
				%>

				<%
				for (Prodotto prodotto : listaProdotti) {
				%>

				<div class="col-md-4 card-container">
					<div class="card h-100">
						<div class="h-100">
							<img src="images/<%=prodotto.getImmagine()%>.jpg"
								class="card-img-top h-100 img" alt="funko-pop">
						</div>

						<div class="descrizione card-text">
							<%=prodotto.getDescrizione()%></div>
						<div class="card-body">
							<input type="hidden" name="prodottoId"
								value="<%=prodotto.getProdottoId()%>">
							<h4 class="card-title"><%=prodotto.getNomeProdotto()%></h4>
							<p class="card-text"></p>
							<h6><%=prodotto.getCategoria()%></h6>
							<h5><%=prodotto.getPrezzo()%>
								&euro;
							</h5>
							<button type="submit"
								onclick="alert('Elemento aggiunto correttamente')"
								class="btn add">Aggiungi al carrello</button>

						</div>
					</div>
				</div>

				<%
				}
				%>

			</div>
		</form>
	</div>




	<footer class="text-center text-white">

		<div class="container pt-4">

			<section class="mb-4">

				<a class="btn btn-link btn-floating btn-lg text-white m-1" href="#!"
					role="button" data-mdb-ripple-color="dark"><i
					class="fab fa-facebook-f"></i></a> <a
					class="btn btn-link btn-floating btn-lg text-white m-1" href="#!"
					role="button" data-mdb-ripple-color="dark"><i
					class="fab fa-twitter"></i></a> <a
					class="btn btn-link btn-floating btn-lg text-white m-1" href="#!"
					role="button" data-mdb-ripple-color="dark"><i
					class="fab fa-google"></i></a> <a
					class="btn btn-link btn-floating btn-lg text-white m-1" href="#!"
					role="button" data-mdb-ripple-color="dark"><i
					class="fas fa-instagram"></i></a>



			</section>

		</div>



		<div class="text-center text-white p-3">
			� 2024 Copyright: <a class="text-white">manga shop</a>
		</div>

	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>


	<script type="text/javascript" src="js/SearchBar.js"></script>
</body>
</html>