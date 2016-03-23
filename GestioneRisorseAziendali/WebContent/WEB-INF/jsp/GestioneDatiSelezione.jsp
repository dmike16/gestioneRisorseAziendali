<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Gestione dati selezione</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="../../js/jquery-2.2.0.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../../css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="../../css/style.css" />
    <link rel="stylesheet" href="../../css/GestioneDatiSelezione.css" />
</head>

<body>
    <!--Page Header-->
    <header>
        <img src="../../img/basetop1.png" />
        <div class="headerbar">
            <h1>Gestione Risorse Umane AKT</h1>
        </div>
    </header>
    <!--End Header-->

    <!--container start-->
    <div class="container">
        <div class="ricercaToggle" style="margin-bottom:10px;border:2px solid black; width:200px">Ricerca per nome e cognome</div>
        <div class="row main" style="display:none">
            <form action="gestioneDatiSelezione1.action" method="post">
                <fieldset>
                    <div class="col-md-6">
                        <p>
                            <label for="nome" style="width:75px">Nome: </label>
                            <input id="nome" required/>
                        </p>
                        <p>
                            <label for="cognome" style="width:75px">Cognome: </label>
                            <input id="cognome" required/>
                        </p>
                    </div>
                    <div class="col-md-6">
                        <p>
                            <input type="radio" id="batterieTest" name="ricerca" value="batterieTest" checked/>
                            <label for="batterieTest">Batterie test</label>
                            <br/>
                            <input type="radio" id="valutazioniOsservazioniColloquio" name="ricerca" value="valutazioniOsservazioniColloquio" />
                            <label for="valutazioniOsservazioniColloquio">Valutazione e osservazioni colloquio</label>
                            <br/>
                            <input type="radio" id="potenzialita" name="ricerca" value="potenzialita" />
                            <label for="potenzialita">Potenzialità</label>
                            <br/>
                            <input type="radio" id="profiloCaratteriale" name="ricerca" value="profiloCaratteriale" />
                            <label for="profiloCaratteriale">Profilo caratteriale</label>
                            <br/>
                            <input type="radio" id="moduli" name="ricerca" value="moduli" />
                            <label for="moduli">Moduli</label>
                            <br/>
                            <input type="radio" id="listaValutazioni" name="ricerca" value="listaValutazioni" />
                            <label for="listaValutazioni">Lista valutazioni</label>
                            <br/>
                            <input type="radio" id="modulo" name="ricerca" value="modulo" />
                            <label for="modulo">Modulo:</label>
                            <br/>
                            <input type="text" id="moduloText" disabled="true" />
                        </p>
                    </div>
                    <p id="buttons">
                        <input id="reset" type="reset">
                        <input id="submit" type="submit" value="Cerca">
                    </p>
                </fieldset>
            </form>
        </div>
        <div class="ricercaToggle2" style="margin-bottom:10px;border:2px solid black; width:200px">Ricerca Per Altro</div>
        <div class="row main2" style="display:none">
            <form action="gestioneDatiSelezione2.action" method="post">
                <fieldset>
                    <input type="radio" name="scelta" id="testPreselettivo" value="testPreselettivo" checked>
                    <label for="testPreselettivo">Test preselettivo</label>
                    <select id="listaTest" name="listaTest">
                        <c:forEach items="${tests}" var="test">
                            <option value="${test}">${test}</option>
                        </c:forEach>
                    </select>
                    <br/>
                    <input type="radio" name="scelta" id="intervalloPunteggio" value="intervalloPunteggio">
                    <label for="intervalloPunteggio">Intervallo Punteggio Batteria</label>
                    <input type="text" id="max" placeholder="max" disabled="true" />
                    <input type="text" id="min" placeholder="min" disabled="true" />
                    <br/>
                    <input type="radio" name="scelta" id="corsoModulo" value="corsoModulo" />
                    <label for="listaCorsi">Corso</label>
                    <select id="listaCorsi" name="listaCorsi">
                        <c:forEach items="${corsi}" var="corso">
                            <option value="${corso}">${corso}</option>
                        </c:forEach>
                    </select>
                    <label for="listaModuli">Modulo</label>
                    <select id="listaModuli" name="listaModuli">
                        <c:forEach items="${moduli}" var="modulo">
                            <option value="${modulo}">${modulo}</option>
                        </c:forEach>
                    </select>
                    <br/>
                    <input type="radio" name="scelta" id="moduloPunteggio" value="moduloPunteggio" />
                    <label for="listaModuli2">Modulo</label>
                    <select id="listaModuli2" name="listaModuli2">
                        <c:forEach items="${moduli}" var="modulo">
                            <option value="${modulo}">${modulo}</option>
                        </c:forEach>
                    </select>
                    <label for="punteggio">Punteggio</label>
                    <input id="punteggio" type="text" disabled="true" />
                    <p id="buttons">
                        <input id="reset" type="reset">
                        <input id="submit" type="submit" value="Cerca">
                    </p>
                </fieldset>
            </form>
        </div>
    </div>
    <!--container end-->

    <footer>
        <p>Copyright &copy; 2016 AKT Srl. Tutti i diritti riservati.</p>
    </footer>
    <script src="../../js/GestioneDatiSelezione.js"></script>
</body>
</html>
