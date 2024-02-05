<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Utente</title>
</head>
<body>
<div align=center>
	<form method="Post" action="ServletRegistrazione">
		<div style='margin-top: 10px'>
			<label>Nome:</label> <input id='nome' type="text" name='nome'></input>
		</div>
		<div style='margin-top: 10px'>
			<label>Cognome:</label> <input id='cognome' type="text" name='cognome'></input>
		</div>
		<div style='margin-top: 10px'>
			<label>E-Mail:</label><input id='email' type="text" name='email'>
		</div>
		<div style='margin-top: 10px'>
			<label>Numero Telefono:</label> <input id='numeroTelefono'
				type="text" name='numeroTelefono'></input>
		</div>
		<div style='margin-top: 10px'>
			<label>Password:</label> <input id='password'
				type="text" name='password'></input>
		</div>
			<div style='margin-top: 10px'>
			<label>Conferma Password:</label> <input id='confermaPassword'
				type="text" name='confermaPassword'></input>
		</div>
		<button style='margin-top: 10px' type='submit'>Invia</button>
	</form>
</div>
</body>
</html>