
  create sequence sequenceMateria
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
 
  create sequence sequenceDocente
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;

create sequence sequenceIndirizzo
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceLingua
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceAzienda
  start with 0
  minvalue 0 
  increment by 1
  nocache
  nocycle;
 
 create sequence sequenceCertificazione
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
 
create sequence sequenceFormazione
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceLavoro
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceCV
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;  

create sequence sequenceNazionalita
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceAnagraficaCandidato
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;  
  
create sequence sequenceAnagrafica
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceEsito
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceSelezione
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceColloquio
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle; 
create sequence sequenceCompetenza
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;  
create sequence sequenceRisorsa
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
create sequence sequenceCandidato
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;

  create sequence sequenceBatteria
  start with 0
  minvalue 0
  increment by 1
  nocache
  nocycle;
  
/*SEZIONE DOCENTE*/

create table docente(
idDocente number(6) primary key,
nome varchar2(20) not null,
cognome varchar2(20) not null,
dataNascita date not null,
telefono varchar2(20),
cellulare varchar2(10) not null,
email varchar2(30) not null,
titoloStudio varchar2(20) not null,
sesso char(1) not null,
luogoNascita varchar2(50) not null,
idNazionalita number(6) not null,
codiceFiscale varchar2(16),
partitaIva varchar2(11) not null,
note varchar2(250),
tariffa number(5,2),
idIndirizzo number(6) not null,
foreign key(idIndirizzo) references Indirizzo(idIndirizzo),
foreign key(idNazionalita) references nazionalita(idNazionalita)
);

create table materia(
idMateria number(6) primary key,
argomentoMateria varchar2(30) not null
);

create table materieDocente(
idMateria number(6),
idDocente number(6),
primary key(idMateria,idDocente),
foreign key (idMateria) references materia(idMateria),
foreign key (idDocente) references docente(idDocente)
);


  
/*SEZIONE ANAGRAFICA*/

create table cv(
idCv number(6) primary key,
urlImage varchar2(50),
competenzeInformatiche varchar2(255)
);

create table lingua(
idLingua number(6) primary key,
lingua varchar2(20) not null
);

create table conoscenzaLingua(
idLingua number(6),
idCv number(6),
scritta char(2),
parlata char(2),
comprensione char(2),
primary key (idLingua, idCv),
foreign key (idLingua) references Lingua(idLingua),
foreign key (idCv) references Cv(idCv)
);

create table indirizzo(
idIndirizzo number(6) primary key,
citta varchar2(50) not null,
cap char(5) not null,
via varchar2(50) not null,
nCivico varchar2(5)
);

create table azienda(
idAzienda number(6) primary key,
nome varchar2(100) not null,
tipoAzienda varchar2(50),
settore varchar2(30) not null,
idIndirizzo number(6), 
foreign key(idIndirizzo) references Indirizzo(idIndirizzo)
);

create table formazione(
idFormazione number(6) primary key,
titoloStudio varchar2(20) not null,
descrizione varchar2(255) not null,
votazione varchar2(20) not null,
datainizio date,
datafine date,
idCv number(6),
idAzienda number(6),
constraint fk_cv foreign key(idCv) references Cv(idCv),
constraint fk_azienda foreign key (idAzienda) references Azienda(idAzienda) 
);

CREATE TABLE lavoro(
idLavoro number(6) PRIMARY KEY,
ambito varchar2(15) NOT NULL,
impiego varchar2(20) NOT NULL,
stipendio number(8,2),
datainizio date,
datafine date,
idCv number(6),
idAzienda number(6),
FOREIGN KEY (idCv) REFERENCES Cv(idCv),
FOREIGN KEY (idAzienda) REFERENCES Azienda(idAzienda)
);

CREATE TABLE nazionalita (
  idNazionalita number(6) NOT NULL,
  nomeNazionalita varchar2(30) default NULL,
  PRIMARY KEY  (idnazionalita)
); 

CREATE TABLE anagraficaCandidato(
idAnagraficaCandidato number(6) PRIMARY KEY,
nome varchar2(20) not null,
cognome varchar2(20) not null,
dataNascita date not null,
cellulare varchar2(10) not null,
email varchar2(30) not null,
titoloStudio varchar2(20) not null,
idIndirizzo number(6) not null,
FOREIGN KEY(idIndirizzo) REFERENCES indirizzo(idIndirizzo)
);

CREATE TABLE certificazione(
idCertificazione number(6) primary key,
settore varchar2(20),
specializzazione varchar2(30),
idCv number(6) not null,
foreign key (idCv) references cv(idCv)
);

create table anagrafica(
idAnagrafica number(6) primary key,
sesso char(1) not null,
luogoNascita varchar2(50) not null,
idNazionalita number(6) not null,
codiceFiscale varchar2(16) not null,
telefono varchar2(20) not null,
idIndirizzo number(6) not null,
idAnagraficaCandidato number(6) not null,
foreign key(idIndirizzo) references indirizzo(idIndirizzo),
foreign key(idAnagraficaCandidato) references anagraficaCandidato(idAnagraficaCandidato),
foreign key(idNazionalita) references nazionalita(idNazionalita)
);

/*SEZIONE SELEZIONE*/

create table esito
(
  idEsito number(6),
  valutazione varchar2(250) not null,
  descrizione varchar2(250),
  primary key(idEsito)
);

create table selezione
(
  idSelezione number(6) primary key,
  dataSelezione date,
  esito number(6),
  foreign key (esito) references esito(idEsito)
);

create table testselezione (
idtest char(7) primary key,
punteggio number(3) not null,
idselezione number(6),
foreign key (idselezione) references selezione(idselezione)
);

create table batteria (
codicebatteria char(7) primary key,
tipo varchar2(30) not null
);

create table batteriatest (
idTest char(7),
codiceBatteria char(7),
punteggio number(3) not null,
primary key (codiceBatteria, idTest),
foreign key (idTest) references testselezione (idTest),
foreign key (codicebatteria) references batteria(codiceBatteria)
);

create table colloquio
(
  idColloquio number(6),
  valutazioneFinale varchar2(20),
  osservazioni varchar2(250),
  tipologia varchar2(30),
  idSelezione number(6) not null,
  potenzialita varchar2(250),
  profiloCaratteriale varchar2(250),
  primary key (idColloquio),
  foreign key (idSelezione) references selezione(idSelezione)
);

/*SEZIONE CORSO*/


CREATE TABLE corso(
	idCorso char(7) primary key,
	titoloCorso varchar2(100) not null,
	dataInizio date,
	dataFine date,
	azienda varchar2(20),
	settore varchar2(20),
  	specializzazione varchar2(30)
	
);


CREATE TABLE modulo(
idModulo char(7) PRIMARY KEY,
nomeModulo varchar2(30)
);

CREATE TABLE ModuloCorso(
idCorso char(7),
idModulo char(7),
dataInizio date,
dataFine date,
foreign key (idCorso) references corso(idCorso),
foreign key (idModulo) references modulo (idModulo),
primary key (idCorso, idModulo)
);

CREATE TABLE risorsa(
	idRisorsa number(6) primary key,
	idTirocinio number(6),
	IdAnagrafica number(6),
	foreign key(idAnagrafica) references anagrafica(idAnagrafica)
	--foreign key(idTirocinio) references risorsa(idRisorsa)
);

CREATE TABLE CorsoHistory(
	idcorso		CHAR(7),
	idrisorsa	number(6),
  	superamento char(1),
	FOREIGN KEY(idcorso) REFERENCES Corso(idCorso),
	FOREIGN KEY(idrisorsa) REFERENCES Risorsa(idRisorsa),
	PRIMARY KEY(idcorso,idrisorsa)
);

CREATE TABLE risultato (
	idModulo char(7) not null,
	idRisorsa number(6) not null,
  	valutazione number(1,0),
  	esito varchar2(250),
  	primary key(idModulo,idRisorsa),
	foreign key(idModulo) references modulo(idModulo),
	foreign key(idRisorsa) references risorsa (idRisorsa)
);

CREATE TABLE Candidato(
	idcandidato		number(6),
	idanagrafica		NUMBER(6),
	idrisorsa 		number(6),
	idcv			NUMBER(6),
	CONSTRAINT idprimary PRIMARY KEY(idcandidato),
	CONSTRAINT	refrisorsa FOREIGN KEY(idrisorsa) REFERENCES Risorsa(idRisorsa) set null,
	CONSTRAINT refcv FOREIGN KEY(idcv) REFERENCES Cv(idCV) set null,
	CONSTRAINT refanagrafica FOREIGN KEY(idanagrafica) REFERENCES AnagraficaCandidato(idAnagraficaCandidato)
);

create table partecipa
(
  idCandidato number(6),
  idSelezione number(6),
  primary key (idCandidato,idSelezione),
  foreign key (idCandidato) references candidato(idCandidato),
  foreign key (idSelezione) references selezione(idSelezione)
);
