
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
  
create sequence sequenceSede
  start with 1
  increment by 1
  nocache
  nocycle;
  
create sequence sequenceAzienda
  start with 1
  increment by 1
  nocache
  nocycle;
create sequence sequenceLuogoData
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

create table conoscenzaLingua(
idConoscenzaLingua number(3) primary key,
scritta varchar2(2),
parlata varchar2(2),
comprensione varchar2(2));

create table indirizzo(
idIndirizzo number(6) primary key,
citta varchar2(50),
cap number(5),
via varchar2(50),
nCivico varchar2(5)
);

create table lingua(
idLingua number(3) primary key,
lingua varchar2(20),
idConoscenzaLingua number(3),
constraint fk_idConoscenzaLingua foreign key (idConoscenzaLingua) references conoscenzaLingua(idConoscenzaLingua)
);

create table sede(idSede number(3) not null  primary key,
tipoSede varchar2(20),
idIndirizzo number(6),
constraint fk_idIndirizzo foreign key(idIndirizzo) references indirizzo(idIndirizzo));

create table azienda(idAzienda number(3) not null primary key,
nome varchar2(100) not null,
tipoAzienda varchar2(50),
settore varchar2(30),
idSede number(3), constraint fk_idSede foreign key(idSede) references sede(idSede)
);

create table luogoData(idLuogoData number(3) not null primary key,
dataInizio date not null,
dataFine date not null,
idAzienda,constraint fk_idAzienda foreign key(idAzienda) references azienda(idAzienda)
);

create table formazione(idFormazione number(3) primary key,
titoloStudio varchar2(20),
descrizione varchar2(255),
votazione varchar2(20),
idLuogoData number(3),constraint fk_idLuogoData foreign key(idLuogoData) references luogoData(idLuogoData)
);

CREATE TABLE lavoro(idLavoro number(3) NOT NULL PRIMARY KEY,
ambito varchar2(15),
impiego varchar2(20) NOT NULL,
idLuogoData number(3) NOT NULL,
stipendio number(5) NOT NULL,
CONSTRAINT fk_luogoData FOREIGN KEY (idLuogoData) REFERENCES luogoData(idLuogoData));

create table cv(
idCv number(6) primary key,
idFormazione number(3),
idLavoro number(3),
urlImage varchar2(50),
idLingua number(3),
constraint fk_idFormazione foreign key(idFormazione) references formazione(idFormazione),
constraint fk_idLavoro foreign key(idLavoro) references lavoro(idLavoro),
constraint fk_idLingua foreign key(idLingua) references lingua(idLingua)
);


CREATE TABLE nazionalita (
  idNazionalita number(3) NOT NULL,
  siglaNazione varchar2(5) default NULL,
  nomeNazione varchar2(30) default NULL,
  PRIMARY KEY  (idnazionalita)
); 

CREATE TABLE anagraficaCandidato(
idAnagraficaCandidato number(6) NOT NULL PRIMARY KEY,
nome varchar2(20),
cognome varchar2(20),
dataNascita date,
cellulare varchar2(10),
email varchar2(30),
titoloStudio varchar2(20),
idIndirizzo number(6),
CONSTRAINT fk_residenza FOREIGN KEY(idIndirizzo) REFERENCES indirizzo(idIndirizzo)
);




--Compilato fino a qui--





create table anagrafica(
idAnagrafica number(6) primary key,
sesso char(1),
luogoNascita varchar(50),
idNazionalita number(3),
codiceFiscale varchar(16),
telefono varchar2(20),
idIndirizzo number(6),
idAnagraficaCandidato number(6),
foreign key(idIndirizzo) references indirizzo(idIndirizzo),
foreign key(idAnagraficaCandidato) references anagraficaCandidato(idAnagraficaCandidato),
foreign key(idNazionalita) references nazionalita(idNazionalita)
);
  
create table esito
(
  idEsito number(3),
  valutazione varchar2(250),
  descrizione varchar2(250),
  primary key(idEsito)
);

create table batteria (
codicebatteria number(3),
tipo varchar2(30) not null,
primary key (codicebatteria)
);

create table selezione
(
  idSelezione number(3) primary key,
  dataSelezione date not null,
  esito number(3),
  foreign key (esito) references esito(idEsito)
);

create table testselezione (
idtest char(7) primary key,
codicebattera number(3),
punteggio number(3),
idselezione number(3),
foreign key (idselezione) references selezione(idselezione)
);



create table colloquio
(
  idColloquio number(3),
  valutazioneFinale number(5,2),
  osservazioni varchar2(250),
  tipologia varchar2(30),
  idSelezione number(3),
  potenzialita varchar2(250),
  profiloCaratteriale varchar2(250),
  primary key (idColloquio),
  foreign key (idSelezione) references selezione(idSelezione)
);

CREATE TABLE competenza(
  idCompetenza number(6) NOT NULL PRIMARY KEY,
  settore varchar2(20) NOT NULL,
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
	idCompetenza varchar2(3) not null,
	foreign key(idCompetenza) references competenza(idCompetenza)
);


CREATE TABLE modulo(idModulo char(7) NOT NULL PRIMARY KEY,
idCorso char(7) NOT NULL,
dataInizio date NOT NULL,
dataFine date NOT NULL,
CONSTRAINT fk_idCorso FOREIGN KEY (idCorso) REFERENCES corso(idCorso));

CREATE TABLE risorsa(
	idRisorsa number(6) primary key not null,
	idTirocinio number(6),
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
	idanagrafica	NUMBER(6),
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
  idSelezione number(3),
  primary key (idCandidato,idSelezione),
  foreign key (idCandidato) references candidato(idCandidato),
  foreign key (idSelezione) references selezione(idSelezione)
);




  
  
