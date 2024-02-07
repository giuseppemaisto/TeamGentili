<%@page import="it.accenture.ecommerce.classi.Prodotto"%>
<%@page import="java.util.List"%>
<%@page import="it.accenture.ecommerce.classi.Chiavi"%>
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
		

<title>Prodotti</title>
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
	<h1>I nostri prodotti</h1>
	
	
	
	
<%List<Prodotto> listaProdotti=(List<Prodotto>) request.getAttribute(Chiavi.CHIAVE_LISTA_PRODOTTI);%>
	

		
	<div class="row row-cols-1 row-cols-md-3 g-4">
	
		<%for(Prodotto prodotto:listaProdotti) { %>

		


		

<div class="col">
    <div class="card h-100">
      <img src="..." class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title"><%=prodotto.getNomeProdotto()%></h5>
        <p class="card-text"><%=prodotto.getDescrizione()%></p>
      </div>
    </div>
  </div>
	


	<% } %>





  
</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>