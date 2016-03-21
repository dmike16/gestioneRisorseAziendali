<!DOCTYPE HTML>
<html>

<head>
    <title>
        Gestione dati selezione
    </title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <script src="../../js/jquery-2.2.0.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../../css/bootstrap-theme.min.css" />
    <!--<link rel="stylesheet" href="../../css/style.css" />-->
</head>

<header>
</header>

<body>
    <div class="container">
        <div class="row">
            <form>
                <fieldset>
                    <legend>Ricerca</legend>
                    <div class="col-md-6">
                        <p>
                            <label for="nome" style="width:75px">Nome: </label>
                            <input id="nome" />
                        </p>
                        <p>
                            <label for="cognome" style="width:75px">Cognome: </label>
                            <input id="cognome"/>
                        </p>
                    </div>
                    <div class="col-md-6">
                        <p>
                            <input type="radio" id="batterieTest" name="ricerca" value="batterieTest" />
                            <label for="batterieTest">Batterie test</label><br/>
                            <input type="radio" id="valutazioniOsservazioniColloquio" name="ricerca" value="valutazioniOsservazioniColloquio" />
                            <label for="valutazioniOsservazioniColloquio">Valutazione e osservazioni colloquio</label><br/>
                            <input type="radio" id="potenzialita" name="ricerca" value="potenzialita" />
                            <label for="potenzialita">Potenzialità</label><br/>
                            <input type="radio" id="profiloCaratteriale" name="ricerca" value="profiloCaratteriale" />
                            <label for="profiloCaratteriale">Profilo caratteriale</label><br/>
                            <input type="radio" id="moduli" name="ricerca" value="moduli" />
                            <label for="moduli">Moduli</label><br/>
                            <input type="radio" id="listaValutazioni" name="ricerca" value="listaValutazioni" />
                            <label for="listaValutazioni">Lista valutazioni</label><br/>
                            <input type="radio" id="modulo" name="ricerca" value="modulo" />
                            <label for="modulo">Modulo:</label><br/>
                            <input type="text" id="modulo" />
                        </p>
                    </div>
                    <p id="buttons">
                        <input id="reset" type="reset">
                        <input id="submit" type="button" value="Cerca">
                    </p>
                </fieldset>
            </form>
        </div>
    </div>
    <script src="../../js/GestioneDatiSelezione1.js"></script>
</body>

<footer>
</footer>

</html>