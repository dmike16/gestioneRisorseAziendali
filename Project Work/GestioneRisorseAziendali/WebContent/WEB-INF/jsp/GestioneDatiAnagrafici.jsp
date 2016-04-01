<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!doctype html>

<html>


<head>
    <title> Gestione Dati Anagrafici </title>


    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" />
   
    
    
    <s:url value="/resources/css/bootstrap-theme.min.css" var="boot1"/>
	<s:url value="/resources/css/bootstrap.min.css" var="boot2"/>
	<s:url value="/resources/css/GestioneDatiAnagrafici.css" var="css"/>
	
	<link href="${css}" rel="stylesheet"></link>
	<link href="${boot1}" rel="stylesheet"></link>
	<link href="${boot2}" rel="stylesheet"></link>



</head>

<body>
    <div class="container">
        <header>HEADER</header>


        <section>


            <div class="row" id="GestioneDatiAnagraficiTitolo">
                <h1>Gestione Dati Anagrafici</h1>
            </div>
            <div class="row">

                <div class="col-xs-6 col-md-6 colonna">

                    <div class="box">
                        <a href="inserimentoDatiAnagrafici.action">
                            <h2>Inserimento Dati Anagrafici</h2>
                            <input type="image" src="/img/GestioneDatiAnagrafici_form_input.png" width="30%" class="inserimento" style="cursor:pointer" />
                        </a>
                    </div>

                </div>




                <div class="col-xs-6 col-md-6 colonna">

                    <div class="box">
                        <a href="ricercaDatiAnagrafici.action">
                            <h2>Ricerca Dati Anagrafici</h2>
                            <input type="image" src="/img/GestioneDatiAnagrafici_form_search.png" width="30%" class="ricerca" style="cursor:pointer" />
                        </a>
                    </div>

                </div>

            </div>

        </section>



        <footer>FOOTER</footer>
    </div>
    
</body>
