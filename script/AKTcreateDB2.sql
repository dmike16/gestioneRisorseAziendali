create sequence sequenceConoscenzaLingua
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceIndirizzo
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceLingua
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceAzienda
  start with 1
  increment by 1
  nocache
  nocycle;
 
create sequence sequenceFormazione
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceLavoro
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceCV
  start with 1
  increment by 1
  nocache
  nocycle;  

create sequence sequenceNazionalita
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceAnagraficaCandidato
  start with 1
  increment by 1
  nocache
  nocycle;  
  
create sequence sequenceAnagrafica
  start with 1
  increment by 1
  nocache
  nocycle;  
create sequence sequenceEsito
  start with 1
  increment by 1
  nocache
  nocycle;
create sequence sequenceSelezione
  start with 1
  increment by 1
  nocache
  nocycle;
create sequence sequenceColloquio
  start with 1
  increment by 1
  nocache
  nocycle; 
create sequence sequenceCompetenza
  start with 1
  increment by 1
  nocache
  nocycle;  
create sequence sequenceRisorsa
  start with 1
  increment by 1
  nocache
  nocycle;
create sequence sequenceCandidato
  start with 1
  increment by 1
  nocache
  nocycle;

  create sequence sequenceBatteria
  start with 1
  increment by 1
  nocache
  nocycle;
  
create table cv(
idCv number(6) primary key,
urlImage varchar2(50)
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
cap number(5) not null,
via varchar2(50) not null,
nCivico char(5)
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
stipendio number(5),
datainizio date,
datafine date,
idCv number(6),
FOREIGN KEY (idCv) REFERENCES Cv(idCv)
);

CREATE TABLE nazionalita (
  idNazionalita number(6) NOT NULL,
  siglaNazione varchar2(5) default NULL,
  nomeNazione varchar2(30) default NULL,
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




--Compilato fino a qui--





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
  
create table esito
(
  idEsito number(6),
  valutazione varchar2(250) not null,
  descrizione varchar2(250),
  primary key(idEsito)
);

create table batteria (
codicebatteria char(7),
tipo varchar2(30) not null,
primary key (codicebatteria)
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
codicebattera char(7),
punteggio number(3),
idselezione number(6),
foreign key (idselezione) references selezione(idselezione)
);


create table colloquio
(
  idColloquio number(6),
  valutazioneFinale number(5,2),
  osservazioni varchar2(250),
  tipologia varchar2(30),
  idSelezione number(6) not null,
  potenzialita varchar2(250),
  profiloCaratteriale varchar2(250),
  primary key (idColloquio),
  foreign key (idSelezione) references selezione(idSelezione)
);

CREATE TABLE competenza(
  idCompetenza number(6) PRIMARY KEY,
  settore varchar2(20),
  specializzazione varchar2(30)
);
--Compilato fino a qui--
CREATE TABLE corso(
	idCorso char(7) primary key,
	titoloCorso varchar2(20) not null,
	dataInizio date,
	dataFine date,
	azienda varchar2(20),
	superamento char(1),
	idCompetenza number(6) not null,
	foreign key(idCompetenza) references competenza(idCompetenza)
);


CREATE TABLE modulo(idModulo char(7) PRIMARY KEY,
idCorso char(7) NOT NULL,
dataInizio date,
dataFine date,
CONSTRAINT fk_idCorso FOREIGN KEY (idCorso) REFERENCES corso(idCorso));

CREATE TABLE risorsa(
	idRisorsa number(6) primary key,
	idTirocinio number(6),
	IdAnagrafica number(6),
	foreign key(idAnagrafica) references anagrafica(idAnagrafica),
	foreign key(idTirocinio) references risorsa(idRisorsa)
);

CREATE TABLE CorsoHistory(
	idcorso		CHAR(7),
	idrisorsa	number(6),
	FOREIGN KEY(idcorso) REFERENCES Corso(idCorso),
	FOREIGN KEY(idrisorsa) REFERENCES Risorsa(idRisorsa),
	PRIMARY KEY(idcorso,idrisorsa)
);

CREATE TABLE risultato (
	idModulo char(7) not null,
	idRisorsa number(6) not null,
  valutazione varchar2(250),
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
	CONSTRAINT	refrisorsa FOREIGN KEY(idrisorsa) REFERENCES Risorsa(idRisorsa),
	CONSTRAINT refcv FOREIGN KEY(idcv) REFERENCES Cv(idCV),
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