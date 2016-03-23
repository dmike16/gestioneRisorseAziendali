alter table Nazionalita drop column nomeNazione;
alter table Nazionalita drop column siglaNazione;
alter table Nazionalita add nomeNazionalita varchar2(30);
alter table Lavoro modify stipendio number(5,2);
alter table Lavoro add idAzienda number(6);
alter table Lavoro add foreign key (idAzienda) references Azienda(idAzienda);


--Tabella LAVORO = FK ultima colonna -> CV 
insert into Lavoro values (1,'edilizia','operaio',13150.64,'2005-APR-01','2006-OCT-10',1);
insert into Lavoro values (2,'informatica','dipendente',15718.25,'2003-APR-22','2004-DEC-10',2);
insert into Lavoro values (3,'medicina','farmacista',22718.35,'2010-MAY-22','2015-DEC-10',3);
insert into Lavoro values (4,'informatica','analista',17000.35,'2010-MAY-13','2013-JUN-13',4);
insert into Lavoro values (5,'onlus','promoter',15718.43,'2010-MAY-22','2015-DEC-10',5);
insert into Lavoro values (6,'informatica','programmatore',18456.26,'2007-JAN-30','2015-DEC-10',6);
insert into Lavoro values (7,'immobiliare','segretario',12333.75,'2004-MAY-22','2015-DEC-10',7);
insert into Lavoro values (8,'ristorazione','barista',14987.36,'2013-MAY-22','2015-DEC-10',8);
insert into Lavoro values (9,'istruzione','insegnante',13765.24,'2011-FEB-17','2015-DEC-10',9);
insert into Lavoro values (10,'informatica','programmatore',11001.44,'2014-NOV-22','2015-DEC-10',10);

--Tabella FORMAZIONE = FK ultima colonna -> 1-CV 2-AZIENDA
insert into Formazione values (1,'diploma scientifico','diploma','80/100','2005-OCT-10','2010-JUN-20',1,1);
insert into Formazione values (2,'diploma linguistico','diploma','75/100','2005-OCT-10','2010-JUN-20',2,2);
insert into Formazione values (3,'diploma scientifico','diploma','90/100','2005-OCT-10','2010-JUN-20',3,3);
insert into Formazione values (4,'diploma perito','diploma','60/100','2004-OCT-10','2009-JUN-20',4,4);
insert into Formazione values (5,'laurea ingegneria','laurea','87/110','2003-OCT-10','2008-JUN-20',5,5);
insert into Formazione values (6,'diploma scientifico','laurea','80/110','2005-OCT-10','2010-JUN-20',6,6);
insert into Formazione values (7,'diploma scientifico','diploma','80/100','2005-OCT-10','2010-JUN-20',7,7);
insert into Formazione values (8,'laurea matematica','laurea','100/110','2005-OCT-10','2010-JUN-20',8,8);
insert into Formazione values (9,'laurea economia','laurea','102/110','2005-OCT-10','2010-JUN-20',9,9);
insert into Formazione values (10,'laurea turismo','laurea','84/110','2005-OCT-10','2010-JUN-20',10,10);

--Tabella AZIENDA = FK ultima colonna -> INDIRIZZO
insert into Azienda values (1,'AKT srl','formazione','it',1);
insert into Azienda values (2,'TopNetwork spa','consulenza','it',2);
insert into Azienda values (3,'New Energy Group spa','software house','it',3);
insert into Azienda values (4,'Barilla spa','produzione','ristorazione',4);
insert into Azienda values (5,'Poste Italiane','servizi','servizi',5);
insert into Azienda values (6,'Blizzard','software house','it',6);
insert into Azienda values (7,'Ducati','produzione','automotive',7);
insert into Azienda values (8,'Pastificio Giovanni Rana','produzione','ristorazione',8);
insert into Azienda values (9,'Mediaset','intrattenimento','intrattenimento',9);
insert into Azienda values (10,'Bar del pomeriggio','fornitura','ristorazione',10);

--Tabella INDIRIZZO
insert into Indirizzo values (1,'roma','00143','via giunio antonio resti',71);
insert into Indirizzo values (2,'roma','00173','viale luigi schiavonetti',270);
insert into Indirizzo values (3,'roma','00153','via di porta via',54);
insert into Indirizzo values (4,'roma','00115','via del gianicolo',15);
insert into Indirizzo values (5,'napoli','80153','via del gallitello',1);
insert into Indirizzo values (6,'roma','00153','via del mar della cina',90);
insert into Indirizzo values (7,'roma','00123','via magliana',557);
insert into Indirizzo values (8,'milano','20153','viale regina margherita',23);
insert into Indirizzo values (9,'roma','00153','via alessio baldovinetti',4);
insert into Indirizzo values (10,'roma','00153','via vittorio veneto',13);

--Tabella ANAGRAFICA = FK : 1 - ANAGRAFICACANDIDATO 2 - INDIRIZZO 3 - NAZIONALITA
insert into Anagrafica values (1,'roma','068035167','SNOREB90T56H501B','m',1,1,1);
insert into Anagrafica values (2,'roma','068035167','APTILR70E54H501C','f',2,2,2);
insert into Anagrafica values (3,'roma','068035167','MNTSLV65T56H501B','m',3,3,3);
insert into Anagrafica values (4,'cagliari','068035167','TSGVJM77T56B380C','m',4,4,4);
insert into Anagrafica values (5,'ravenna','068035167','GYSBKB96T56Y200P','f',5,5,5);
insert into Anagrafica values (6,'milano','068035167','PIPTER91T56I560R','m',6,6,6);
insert into Anagrafica values (7,'roma','068035167','AZCSIL93T56H501V','f',7,7,7);
insert into Anagrafica values (8,'roma','068035167','ERTUGO95T56H501E','f',8,8,8);
insert into Anagrafica values (9,'roma','068035167','POURBR89T56H501F','m',9,9,9);
insert into Anagrafica values (10,'roma','068035167','GTGCRT90T56H501J','f',10,10,10);

--Tabella ANAGRAFICACANDIDATO = FK INDIRIZZO
insert into AnagraficaCandidato values (1,'carlo alberto','rago','1987-MAY-13','3337864189','carloalb@erto.it','diploma',1);
insert into AnagraficaCandidato values (2,'marco','mena','1990-MAY-22','3475437909','marc99@men.it','diploma',1);
insert into AnagraficaCandidato values (3,'giulia','romi','1983-MAR-17','3898489005','giul88o.it','diploma',1);
insert into AnagraficaCandidato values (4,'rosa','uggesi','1995-NOV-18','3345678997','rosaugg@esi.it','diploma',1);
insert into AnagraficaCandidato values (5,'alessio','roberti','1989-DEC-11','3352679089','alex89@roby.it','diploma',1);
insert into AnagraficaCandidato values (6,'bruno','opute','1986-JUL-04','3678990653','oput78@brun.it','diploma',1);
insert into AnagraficaCandidato values (7,'jessica','perto','1988-JAN-03','3398732158','jessi88@perto.it','diploma',1);
insert into AnagraficaCandidato values (8,'maria','cuccia','1995-FEB-15','3467543578','mary25@cuccia.it','diploma',1);
insert into AnagraficaCandidato values (9,'girolama','prende','1996-DEC-22','3309764314','giro96@prend.it','diploma',1);
insert into AnagraficaCandidato values (10,'rocco','re','1985-JUN-21','3787653215','rocco@er.it','diploma',1);