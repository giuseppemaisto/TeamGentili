<%@page import="it.accenture.ecommerce.classi.Prodotto"%>
<%@page import="java.util.List"%>
<%@page import="it.accenture.ecommerce.classi.Chiavi"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prodotti</title>
</head>
<body>
<h1>prodotti</h1>
<%List<Prodotto> listaProdotti=(List<Prodotto>) request.getAttribute(Chiavi.CHIAVE_LISTA_PRODOTTI);%>
<%for(Prodotto prodotto:listaProdotti) { %>
<ul><li><%=prodotto.getNomeProdotto()%></li></ul>
<% } %>
</body>
</html>