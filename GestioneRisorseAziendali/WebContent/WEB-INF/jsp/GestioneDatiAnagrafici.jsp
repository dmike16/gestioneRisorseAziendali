<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->
<!doctype html>

<html>


<head>
    <title> Gestione Dati Anagrafici </title>


    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" />
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="GestioneDatiAnagrafici.css" />
    <script src="jquery-2.2.0.min.js"></script>
	<script src="bootstrap.min.js"></script>


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
                            <!-- <input type="image" src="../../img/GestioneDatiAnagrafici_form_input.png" width="30%" class="inserimento" style="cursor:pointer" />-->
                        </a>
                    </div>

                </div>




                <div class="col-xs-6 col-md-6 colonna">

                    <div class="box">

                        <form action="RicercaDatiAnagrafici.action" method="post">
                            <h2>Ricerca Dati Anagrafici</h2>
                            <input type="checkbox" name="scelta" value="Corsisti" /> Corsisti
                            <input type="checkbox" name="scelta" value="Candidati" /> Candidati
                            <br/>
                            <input type="image" src="GestioneDatiAnagrafici_form_search.png" width="30%" class="ricerca" style="cursor:pointer" alt="Submit Form" />
                        </form>

                    </div>

                </div>

            </div>

        </section>



        <footer>FOOTER</footer>
    </div>
</body>