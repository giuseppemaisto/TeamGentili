<%@page import="it.accenture.ecommerce.classi.Carrello"%>
<%@page import="it.accenture.ecommerce.classi.Prodotto"%>
<%@page import="it.accenture.ecommerce.classi.CarrelloProdotto"%>
<%@page import="it.accenture.ecommerce.classi.Chiavi"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/Carrello.css">
<title>Carrello</title>


</head>
<body>
<div class="container"><%List<Prodotto> listaCarrelloProdotti=(List<Prodotto>) request.getAttribute(Chiavi.CHIAVE_CARRELLO);
Double prezzoTotale = 0.0;

%> 
 <div class="row d-flex justify-content-center vertical-align-center">
<%for(Prodotto prodotto: listaCarrelloProdotti) {
prezzoTotale+=prodotto.getPrezzo();
%>
            <div class="col-6  carrello ">
                <div class="row row-carrello d-flex justify-content-between mb-2">
                    <div class="col-4 mb-2">
                    <img alt="" src="images/<%=prodotto.getImmagine()%>.jpg">
                    </div>
                    <div class="col-4">
                        <h2><%=prodotto.getNomeProdotto()%></h2>
                    </div>
                    <div class="col-4">
                        <h4><%=prodotto.getPrezzo()%></h4>
                    </div>
                </div>
            </div>
        </div>
<%} %></div>
<h5>prezzo totale: <%=prezzoTotale%></h5>
<a href="pagamento.html" class="btn btn-success"> vai a pagare</a>
</body>
</html>