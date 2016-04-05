<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Aggiungi dati anagrafici</title>

</head>
<body>

<div id="global">
<form:form commandName="FormDatiAnagrafici" modelAttribute="form" action="inserimentoCandidato.action" method="post">
    <fieldset>
        <legend>Aggiungi dati anagrafici</legend>
        <p class="errorLine">
            <form:errors path="anagraficaCandidato.nome" cssClass="error"/>
        </p>
        <p>
            <label for="nome">*Nome: </label>
            <form:input id="nome" path="anagraficaCandidato.nome" tabindex="1"/>
        </p>
         <p class="errorLine">
            <form:errors path="anagraficaCandidato.cognome" cssClass="error"/>
        </p>
        <p>
            <label for="cognome">*Cognome: </label>
            <form:input id="cognome" path="anagraficaCandidato.cognome" tabindex="2"/>
        </p>
        <p class="errorLine">
            <form:errors path="anagraficaCandidato.dataNascita" cssClass="error"/>
        </p>
        <p>
            <label for="dataNascita">*Data di nascita: </label>
            <form:input id="dataNascita" path="anagraficaCandidato.dataNascita" tabindex="3"/>
       </p>
       <p class="errorLine">
            <form:errors path="anagraficaCandidato.cellulare" cssClass="error"/>
        </p>
       <p>
            <label for="cellulare">*Cellulare: </label>
            <form:input id="cellulare" path="anagraficaCandidato.cellulare" tabindex="4"/>
        </p>
        <p class="errorLine">
            <form:errors path="anagraficaCandidato.email" cssClass="error"/>
        </p>
         <p>
            <label for="email">*E-mail: </label>
            <form:input id="email" path="anagraficaCandidato.email" tabindex="5"/>
        </p>
         <p class="errorLine">
            <form:errors path="anagraficaCandidato.titoloStudio" cssClass="error"/>
        </p>
         <p>
            <label for="titoloStudio">*Titolo di studio: </label>
            <form:input id="titoloStudio" path="anagraficaCandidato.titoloStudio" tabindex="6"/>
        </p>
         <p class="errorLine">
            <form:errors path="indirizzo.citta" cssClass="error"/>
        </p>
         <p>
            <label for="citta">*Citta: </label>
            <form:input id="citta" path="indirizzo.citta" tabindex="7"/>
        </p>
        <p class="errorLine">
            <form:errors path="indirizzo.cap" cssClass="error"/>
        </p>
         <p>
            <label for="cap">*Cap: </label>
            <form:input id="cap" path="indirizzo.cap" tabindex="8"/>
        </p>
        <p class="errorLine">
            <form:errors path="indirizzo.via" cssClass="error"/>
        </p>
         <p>
            <label for="via">*Via: </label>
            <form:input id="via" path="indirizzo.via" tabindex="9"/>
        </p>
         <p>
            <label for="nCivico">Numero civico: </label>
            <form:input id="nCivico" path="indirizzo.nCivico" tabindex="10"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="11">
            
            <input id="submit" type="submit" tabindex="12" 
                value="Salva">
            <input id="submit" type="submit" tabindex="13" 
                value="Salva e inserisci CV">        
        </p>
    </fieldset>
</form:form>
<form:form action="gestioneDatiAnagrafici.action" method="post">
<input id="submit" type="submit" tabindex="14" 
                value="Indietro">
</form:form>
</div>
</body>
</html>