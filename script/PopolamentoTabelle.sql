alter table Nazionalita drop column nomeNazione;
alter table Nazionalita drop column siglaNazione;
alter table Nazionalita add nomeNazionalita varchar2(30);
alter table Lavoro modify stipendio number(5,2);
alter table Lavoro add idAzienda number(6);
alter table Lavoro add foreign key (idAzienda) references Azienda(idAzienda);


--Tabella LAVORO = FK ultima colonna -> CV 
insert into Lavoro values (sequenceLavoro.nextval,'edilizia','operaio',13150.64,'2005-APR-01','2006-OCT-10',1);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','dipendente',15718.25,'2003-APR-22','2004-DEC-10',2);
insert into Lavoro values (sequenceLavoro.nextval,'medicina','farmacista',22718.35,'2010-MAY-22','2015-DEC-10',3);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','analista',17000.35,'2010-MAY-13','2013-JUN-13',4);
insert into Lavoro values (sequenceLavoro.nextval,'onlus','promoter',15718.43,'2010-MAY-22','2015-DEC-10',5);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','programmatore',18456.26,'2007-JAN-30','2015-DEC-10',6);
insert into Lavoro values (sequenceLavoro.nextval,'immobiliare','segretario',12333.75,'2004-MAY-22','2015-DEC-10',7);
insert into Lavoro values (sequenceLavoro.nextval,'ristorazione','barista',14987.36,'2013-MAY-22','2015-DEC-10',8);
insert into Lavoro values (sequenceLavoro.nextval,'istruzione','insegnante',13765.24,'2011-FEB-17','2015-DEC-10',9);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','programmatore',11001.44,'2014-NOV-22','2015-DEC-10',10);

--Tabella FORMAZIONE = FK ultima colonna -> 1-CV 2-AZIENDA
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','80/100','2005-OCT-10','2010-JUN-20',1,1);
insert into Formazione values (sequenceFormazione.nextval,'diploma linguistico','diploma','75/100','2005-OCT-10','2010-JUN-20',2,2);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','90/100','2005-OCT-10','2010-JUN-20',3,3);
insert into Formazione values (sequenceFormazione.nextval,'diploma perito','diploma','60/100','2004-OCT-10','2009-JUN-20',4,4);
insert into Formazione values (sequenceFormazione.nextval,'laurea ingegneria','laurea','87/110','2003-OCT-10','2008-JUN-20',5,5);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','laurea','80/110','2005-OCT-10','2010-JUN-20',6,6);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','80/100','2005-OCT-10','2010-JUN-20',7,7);
insert into Formazione values (sequenceFormazione.nextval,'laurea matematica','laurea','100/110','2005-OCT-10','2010-JUN-20',8,8);
insert into Formazione values (sequenceFormazione.nextval,'laurea economia','laurea','102/110','2005-OCT-10','2010-JUN-20',9,9);
insert into Formazione values (sequenceFormazione.nextval,'laurea turismo','laurea','84/110','2005-OCT-10','2010-JUN-20',10,10);

--Tabella AZIENDA = FK ultima colonna -> INDIRIZZO
insert into Azienda values (sequenceAzienda.nextval,'AKT srl','formazione','it',1);
insert into Azienda values (sequenceAzienda.nextval,'TopNetwork spa','consulenza','it',2);
insert into Azienda values (sequenceAzienda.nextval,'New Energy Group spa','software house','it',3);
insert into Azienda values (sequenceAzienda.nextval,'Barilla spa','produzione','ristorazione',4);
insert into Azienda values (sequenceAzienda.nextval,'Poste Italiane','servizi','servizi',5);
insert into Azienda values (sequenceAzienda.nextval,'Blizzard','software house','it',6);
insert into Azienda values (sequenceAzienda.nextval,'Ducati','produzione','automotive',7);
insert into Azienda values (sequenceAzienda.nextval,'Pastificio Giovanni Rana','produzione','ristorazione',8);
insert into Azienda values (sequenceAzienda.nextval,'Mediaset','intrattenimento','intrattenimento',9);
insert into Azienda values (sequenceAzienda.nextval,'Bar del pomeriggio','fornitura','ristorazione',10);

--Tabella INDIRIZZO
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00143','via giunio antonio resti',71);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00173','viale luigi schiavonetti',270);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00153','via di porta via',54);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00115','via del gianicolo',15);
insert into Indirizzo values (sequenceIndirizzo.nextval,'napoli','80153','via del gallitello',1);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00153','via del mar della cina',90);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00123','via magliana',557);
insert into Indirizzo values (sequenceIndirizzo.nextval,'milano','20153','viale regina margherita',23);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00153','via alessio baldovinetti',4);
insert into Indirizzo values (sequenceIndirizzo.nextval,'roma','00153','via vittorio veneto',13);

--Tabella ANAGRAFICA = FK : 1 - ANAGRAFICACANDIDATO 2 - INDIRIZZO 3 - NAZIONALITA
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','SNOREB90T56H501B','m',1,1,1);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','APTILR70E54H501C','f',2,2,2);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','MNTSLV65T56H501B','m',3,3,3);
insert into Anagrafica values (sequenceAnagrafica.nextval,'cagliari','068035167','TSGVJM77T56B380C','m',4,4,4);
insert into Anagrafica values (sequenceAnagrafica.nextval,'ravenna','068035167','GYSBKB96T56Y200P','f',5,5,5);
insert into Anagrafica values (sequenceAnagrafica.nextval,'milano','068035167','PIPTER91T56I560R','m',6,6,6);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','AZCSIL93T56H501V','f',7,7,7);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','ERTUGO95T56H501E','f',8,8,8);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','POURBR89T56H501F','m',9,9,9);
insert into Anagrafica values (sequenceAnagrafica.nextval,'roma','068035167','GTGCRT90T56H501J','f',10,10,10);

--Tabella ANAGRAFICACANDIDATO = FK INDIRIZZO
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'carlo alberto','rago','1987-MAY-13','3337864189','carloalb@erto.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'marco','mena','1990-MAY-22','3475437909','marc99@men.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'giulia','romi','1983-MAR-17','3898489005','giul88o.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'rosa','uggesi','1995-NOV-18','3345678997','rosaugg@esi.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'alessio','roberti','1989-DEC-11','3352679089','alex89@roby.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'bruno','opute','1986-JUL-04','3678990653','oput78@brun.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'jessica','perto','1988-JAN-03','3398732158','jessi88@perto.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'maria','cuccia','1995-FEB-15','3467543578','mary25@cuccia.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'girolama','prende','1996-DEC-22','3309764314','giro96@prend.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'rocco','re','1985-JUN-21','3787653215','rocco@er.it','diploma',1);
