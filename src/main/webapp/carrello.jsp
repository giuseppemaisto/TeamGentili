<%@page import="it.accenture.ecommerce.classi.Chiavi"%>
<%@page import="it.accenture.ecommerce.classi.CarrelloProdotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrello</title>
</head>
<body>
<h1><%List<CarrelloProdotto> listaCarrelloProdotti=(List<CarrelloProdotto>) request.getAttribute(Chiavi.CHIAVE_CARRELLO);
out.print(listaCarrelloProdotti.size());

%></h1>
</body>
</html>