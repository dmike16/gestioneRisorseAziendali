<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>


    <head>
        <title> Gestione Dati Anagrafici </title>


        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="../css/GestioneDatiAnagrafici.css" />
        <script src="../js/jquery-2.2.0.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>


    </head>

    <body>
        <div class="container">
            <header>HEADER</header>


            <section>


                <div class="row">
                    <h1>Gestione Dati Anagrafici</h1>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-md-6" style="display: flex;align-items: center;justify-content: center;">
                        <div class="box">

                            <a href="InserimentoDatiAnagrafici.action">
                                <h2>Inserimento Dati Anagrafici</h2>
                                <input type="image" src="../img/GestioneDatiAnagrafici_form_input.png" width="30%" class="inserimento" style="cursor:pointer" />
                            </a>
                        </div>


                    </div>

                    <div class="col-xs-6 col-md-6" style="display: flex;align-items: center;justify-content: center;">

                        <div class="box">
                            <a href="RicercaDatiAnagrafici.action">
                                <h2>Ricerca Dati Anagrafici</h2>
                                <input type="image" src="../img/GestioneDatiAnagrafici_form_search.png" width="30%" class="ricerca" style="cursor:pointer" />
                            </a>
                        </div>
                    </div>
                </div>

            </section>



            <footer>FOOTER</footer>
        </div>
    </body>