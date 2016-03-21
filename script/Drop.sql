REM =====================
REM Cancella DataBase Risorsa
REM =====================

DROP TABLE Partecipa;
DROP TABLE Candidato;
DROP TABLE Risultato;
DROP TABLE CorsoHistory;
DROP TABLE Risorsa;
DROP TABLE Modulo;
DROP TABLE Corso;
DROP TABLE Competenza;
DROP TABLE Colloquio;
DROP TABLE TestSelezione;
DROP TABLE Selezione;
DROP TABLE Batteria;
DROP TABLE Esito;
DROP TABLE Anagrafica;
DROP TABLE AnagraficaCandidato;
DROP TABLE Nazionalita;
DROP TABLE CV;
DROP TABLE Lavoro;
DROP TABLE Formazione;
DROP TABLE LuogoData;
DROP TABLE Azienda;
DROP TABLE Sede;
DROP TABLE Lingua;
DROP TABLE Indirizzo;
DROP TABLE ConoscenzaLingua;

REM =================
REM Drop Sequence
REM =================

DROP SEQUENCE sequenceSelezione;
DROP SEQUENCE sequenceEsito;
DROP SEQUENCE sequenceColloquio;
DROP SEQUENCE sequenceNazionalita;