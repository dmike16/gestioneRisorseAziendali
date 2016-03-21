<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Aggiungi dati anagrafici</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form commandName="datiAnagrafici" action="inserimentoDatiAnagrafici3.action" method="post">
    <fieldset>
        <legend>Aggiungi dati anagrafici</legend>
        <p class="errorLine">
            <form:errors path="nome" cssClass="error"/>
        </p>
        <p>
            <label for="nome">*Nome: </label>
            <form:input id="nome" path="nome" tabindex="1"/>
        </p>
         <p class="errorLine">
            <form:errors path="cognome" cssClass="error"/>
        </p>
        <p>
            <label for="cognome">*Cognome: </label>
            <form:input id="cognome" path="cognome" tabindex="2"/>
        </p>
        <p class="errorLine">
            <form:errors path="dataNascita" cssClass="error"/>
        </p>
        <p>
            <label for="dataNascita">*Data di nascita: </label>
            <form:input id="dataNascita" path="dataNascita" tabindex="3"/>
       </p>
       <p class="errorLine">
            <form:errors path="cellulare" cssClass="error"/>
        </p>
       <p>
            <label for="cellulare">*Cellulare: </label>
            <form:input id="cellulare" path="cellulare" tabindex="4"/>
        </p>
        <p class="errorLine">
            <form:errors path="email" cssClass="error"/>
        </p>
         <p>
            <label for="email">*E-mail: </label>
            <form:input id="email" path="email" tabindex="5"/>
        </p>
         <p class="errorLine">
            <form:errors path="titoloStudio" cssClass="error"/>
        </p>
         <p>
            <label for="titoloStudio">*Titolo di studio: </label>
            <form:input id="titoloStudio" path="titoloStudio" tabindex="6"/>
        </p>
         <p class="errorLine">
            <form:errors path="citta" cssClass="error"/>
        </p>
         <p>
            <label for="citta">*Citta: </label>
            <form:input id="citta" path="citta" tabindex="7"/>
        </p>
        <p class="errorLine">
            <form:errors path="cap" cssClass="error"/>
        </p>
         <p>
            <label for="cap">*Cap: </label>
            <form:input id="cap" path="cap" tabindex="8"/>
        </p>
        <p class="errorLine">
            <form:errors path="via" cssClass="error"/>
        </p>
         <p>
            <label for="via">*Via: </label>
            <form:input id="via" path="via" tabindex="9"/>
        </p>
         <p>
            <label for="nCivico">Numero civico: </label>
            <form:input id="nCivico" path="nCivico" tabindex="10"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="11">
            <input id="submit" type="submit" tabindex="12" 
                value="Indietro">
            <input id="submit" type="submit" tabindex="13" 
                value="Salva">
            <input id="submit" type="submit" tabindex="14" 
                value="Salva e inserisci CV">        
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>