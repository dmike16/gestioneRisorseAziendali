<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->
<!doctype html>

<html>


<head>
    <title> Gestione Dati Anagrafici </title>


    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" />
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="../../css/GestioneDatiAnagrafici.css" />
    <script src="../../js/jquery-2.2.0.min.js"></script>



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
                        <a href="InserimentoDatiAnagrafici.action">
                            <h2>Inserimento Dati Anagrafici</h2>
                            <input type="image" src="../../img/GestioneDatiAnagrafici_form_input.png" width="30%" class="inserimento" style="cursor:pointer" />
                        </a>
                    </div>

                </div>




                <div class="col-xs-6 col-md-6 colonna">

                    <div class="box">
                        <a href="RicercaDatiAnagrafici.action">
                            <h2>Ricerca Dati Anagrafici</h2>
                            <input type="image" src="../../img/GestioneDatiAnagrafici_form_search.png" width="30%" class="ricerca" style="cursor:pointer" />
                        </a>
                    </div>

                </div>

            </div>

        </section>



        <footer>FOOTER</footer>
    </div>
    <script src="../../js/bootstrap.min.js"></script>
</body>