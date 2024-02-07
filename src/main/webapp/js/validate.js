/**
 * 
 */
var psw= document.myForm.psw.value;
var passwordlength=document.myForm.psw.value.length;  


function validate() {

	var status = true;

	status = validateName() && status;
	status = validateCognome()&& status; 
	status = validateEmail()&& status;
	status = validateIndirizzo() && status;
	status = validateNumero()&& status;
	
	return status;

}

function validateName() {
	var name = document.myForm.nome.value;
	if (name == "") {
		document.getElementById("nameValidate").innerHTML = " inserisci nome valido";
		return false;
	}
}

function validateCognome(){
	var cognome=document.myForm.cognome.value;
	if(cognome==""){
		document.getElementById("cognomeValidate").innerHTML="inserisci cognome valido";
		return false 
	}
}

function validateEmail() {
	var email = document.myForm.email.value;
	var reg = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	var result = reg.test(email);

	if (result == false) {
		document.getElementById("mailValidate").innerHTML = "mail non corretta";
		return false;
	}
}

function validateIndirizzo(){
	var indirizzo= document.myForm.indirizzo.value;
	if(indirizzo==""){
		document.getElementById("indirizzoValidate").innerHTML="inserisci un indirizzo valido";
		return false;
	}
}

function validateNumero(){
	var numero_telefono= document.myForm.numero_telefono.value;
	if(numero_telefono==""){
		document.getElementById("numeroValidate").innerHTML="inserisci numero valido";
		return false;
	}
}


function validatePsw(){
	
var psw= document.myForm.psw.value;
var confermaPassword = document.myForm.confermaPassword.value;


if(psw==confermaPassword){
return true;
}
else{
document.getElementById("pswValidate").innerHTML="inserisci la stessa password";
return false;
}
}


////cognome
//
//if(cognome== ""){
//	document.getElementById("cognomeValidate").innerHTML = "inserisci un cognome"
//}
//
////mail 
//
//var reg = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
// var result = reg.test(email);
//
//  if (result == false) {
//  document.getElementById("mailValidate").innerHTML="mail non corretta";  
//    return false;
//  }
//
//  
//
//if(indirizzo== ""){
//	document.getElemventById("indirizzoValidate").innerHTML ="inserisci indirizzo valido";
//	    return false;
//}
//
//
//
//
//if (numero_telefono=="" || numero_telefono == null){
//  document.getElementById("numloc").innerHTML="Inserisci numero valido";
//  return false;
//
//}
//return true;
//
//return status;  
//} 



