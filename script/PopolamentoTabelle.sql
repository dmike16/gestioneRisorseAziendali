/*
alter table Nazionalita drop column nomeNazione;
alter table Nazionalita drop column siglaNazione;
alter table Nazionalita add nomeNazionalita varchar2(30);
alter table lavoro modify stipendio number(8,2); 
alter table Lavoro add idAzienda number(6);
alter table Lavoro add foreign key (idAzienda) references Azienda(idAzienda);
alter table corso drop column superamento;
alter table corsohistory add superamento char(1);
alter table testselezione drop column codicebattera;
alter table batteria add idtest char(7);
alter table batteria add foreign key (idtest) references testselezione (idtest);
alter table modulo add nomemodulo varchar2(30);
ALTER TABLE CORSO MODIFY TITOLOCORSO VARCHAR2(100);
alter table colloquio modify valutazionefinale varchar2(20);
*/

/*SEZIONE ANAGRAFICA*/

--Tabella CV
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);
INSERT INTO Cv VALUES (sequenceCV.nextval, 'dog.jpg', null);

--Tabella LINGUA
insert into lingua values(sequenceLingua.nextval, 'Cinese mandarino');
insert into lingua values(sequenceLingua.nextval, 'Inglese');
insert into lingua values(sequenceLingua.nextval, 'Spagnolo');
insert into lingua values(sequenceLingua.nextval, 'Hindi-Urdu');
insert into lingua values(sequenceLingua.nextval, 'Arabo');
insert into lingua values(sequenceLingua.nextval, 'Portoghese');
insert into lingua values(sequenceLingua.nextval, 'Bengalese');
insert into lingua values(sequenceLingua.nextval, 'Russo');
insert into lingua values(sequenceLingua.nextval, 'Giapponese');
insert into lingua values(sequenceLingua.nextval, 'Tedesco');
insert into lingua values(sequenceLingua.nextval, 'Giavanese');
insert into lingua values(sequenceLingua.nextval, 'Punjabi');
insert into lingua values(sequenceLingua.nextval, 'Coreano');
insert into lingua values(sequenceLingua.nextval, 'Wu');
insert into lingua values(sequenceLingua.nextval, 'Francese');
insert into lingua values(sequenceLingua.nextval, 'Telugu');
insert into lingua values(sequenceLingua.nextval, 'Turco');
insert into lingua values(sequenceLingua.nextval, 'Marathi');
insert into lingua values(sequenceLingua.nextval, 'Tamil');
insert into lingua values(sequenceLingua.nextval, 'Vietnamita');
insert into lingua values(sequenceLingua.nextval, 'Italiano');
insert into lingua values(sequenceLingua.nextval, 'Yue');
insert into lingua values(sequenceLingua.nextval, 'Persiano');
insert into lingua values(sequenceLingua.nextval, 'Malese-indonesiano');
insert into lingua values(sequenceLingua.nextval, 'Taiwanese');
insert into lingua values(sequenceLingua.nextval, 'Gujarati');
insert into lingua values(sequenceLingua.nextval, 'Bhojpuri');
insert into lingua values(sequenceLingua.nextval, 'Polacco');
insert into lingua values(sequenceLingua.nextval, 'Kannada');
insert into lingua values(sequenceLingua.nextval, 'Pashto');
insert into lingua values(sequenceLingua.nextval, 'Ucraino');
insert into lingua values(sequenceLingua.nextval, 'Xiang');
insert into lingua values(sequenceLingua.nextval, 'Malayalam');
insert into lingua values(sequenceLingua.nextval, 'Maithili');
insert into lingua values(sequenceLingua.nextval, 'Sondanese');
insert into lingua values(sequenceLingua.nextval, 'Oriya');
insert into lingua values(sequenceLingua.nextval, 'Birmano');
insert into lingua values(sequenceLingua.nextval, 'Curdo');
insert into lingua values(sequenceLingua.nextval, 'Hakka');
insert into lingua values(sequenceLingua.nextval, 'Hausa');
insert into lingua values(sequenceLingua.nextval, 'Azero');
insert into lingua values(sequenceLingua.nextval, 'Filippino');
insert into lingua values(sequenceLingua.nextval, 'Rumeno');
insert into lingua values(sequenceLingua.nextval, 'Fula');
insert into lingua values(sequenceLingua.nextval, 'Amarico');
insert into lingua values(sequenceLingua.nextval, 'Olandese');
insert into lingua values(sequenceLingua.nextval, 'Uzbeco');
insert into lingua values(sequenceLingua.nextval, 'Gan');
insert into lingua values(sequenceLingua.nextval, 'Marwari');
insert into lingua values(sequenceLingua.nextval, 'Sindhi');
insert into lingua values(sequenceLingua.nextval, 'Thailandese');
insert into lingua values(sequenceLingua.nextval, 'Yoruba');
insert into lingua values(sequenceLingua.nextval, 'Igbo');
insert into lingua values(sequenceLingua.nextval, 'Malgascio');
insert into lingua values(sequenceLingua.nextval, 'Oromo');
insert into lingua values(sequenceLingua.nextval, 'Serbo-Croato');
insert into lingua values(sequenceLingua.nextval, 'Cebuano');
insert into lingua values(sequenceLingua.nextval, 'Nepalese');
insert into lingua values(sequenceLingua.nextval, 'Singalese');
insert into lingua values(sequenceLingua.nextval, 'Rangpuri');
insert into lingua values(sequenceLingua.nextval, 'Zhuang');
insert into lingua values(sequenceLingua.nextval, 'Khmer');
insert into lingua values(sequenceLingua.nextval, 'Magahi');
insert into lingua values(sequenceLingua.nextval, 'Somalo');
insert into lingua values(sequenceLingua.nextval, 'Chhattisgarhi');
insert into lingua values(sequenceLingua.nextval, 'Greco');
insert into lingua values(sequenceLingua.nextval, 'Assamese');
insert into lingua values(sequenceLingua.nextval, 'Chittagonian');
insert into lingua values(sequenceLingua.nextval, 'Deccan');
insert into lingua values(sequenceLingua.nextval, 'Ungherese');
insert into lingua values(sequenceLingua.nextval, 'Rajasthani');
insert into lingua values(sequenceLingua.nextval, 'Zulu');
insert into lingua values(sequenceLingua.nextval, 'Shona');
insert into lingua values(sequenceLingua.nextval, 'Sylheti');
insert into lingua values(sequenceLingua.nextval, 'Min Bei');
insert into lingua values(sequenceLingua.nextval, 'Ceco');
insert into lingua values(sequenceLingua.nextval, 'Chicewa');
insert into lingua values(sequenceLingua.nextval, 'Kanuji');
insert into lingua values(sequenceLingua.nextval, 'Min Dong');
insert into lingua values(sequenceLingua.nextval, 'Quechua');
insert into lingua values(sequenceLingua.nextval, 'Svedese');
insert into lingua values(sequenceLingua.nextval, 'Uiguro');
insert into lingua values(sequenceLingua.nextval, 'Akan');
insert into lingua values(sequenceLingua.nextval, 'Bulgaro');
insert into lingua values(sequenceLingua.nextval, 'Kazako');
insert into lingua values(sequenceLingua.nextval, 'Xhosa');
insert into lingua values(sequenceLingua.nextval, 'Turkmeno');
insert into lingua values(sequenceLingua.nextval, 'creole Haitiano');
insert into lingua values(sequenceLingua.nextval, 'Rwanda');
insert into lingua values(sequenceLingua.nextval, 'Madurese');
insert into lingua values(sequenceLingua.nextval, 'Baluchi');
insert into lingua values(sequenceLingua.nextval, 'Ilocano');
insert into lingua values(sequenceLingua.nextval, 'varhadi-nagpuri');
insert into lingua values(sequenceLingua.nextval, 'Gikuyu');
insert into lingua values(sequenceLingua.nextval, 'Konkani');
insert into lingua values(sequenceLingua.nextval, 'Armeno');
insert into lingua values(sequenceLingua.nextval, 'Danese');
insert into lingua values(sequenceLingua.nextval, 'Finlandese');
insert into lingua values(sequenceLingua.nextval, 'Ebraico');
insert into lingua values(sequenceLingua.nextval, 'Tataro');
insert into lingua values(sequenceLingua.nextval, 'Slovacco');

--Tabella NAZIONALITA
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Russo');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Tedesco');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Francese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Inglese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Italiano');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Spagnolo');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Ucraino');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Polacco');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Romeno');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Olandese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Portoghese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Belga');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Ceco');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Greco');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Svedese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Cinese');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Indiano');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Brasiliano');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Argentino');
INSERT INTO Nazionalita VALUES (sequenceNazionalita.nextval, 'Turco');

--Tabella CONOSCENZALINGUA 
insert into conoscenzalingua(idlingua, idcv) values(1,1);
insert into conoscenzalingua(idlingua, idcv) values(2,2);
insert into conoscenzalingua(idlingua, idcv) values(3,3);
insert into conoscenzalingua(idlingua, idcv) values(4,4);
insert into conoscenzalingua(idlingua, idcv) values(5,5);
insert into conoscenzalingua(idlingua, idcv) values(6,6);
insert into conoscenzalingua(idlingua, idcv) values(7,7);
insert into conoscenzalingua(idlingua, idcv) values(8,8);
insert into conoscenzalingua(idlingua, idcv) values(9,9);
insert into conoscenzalingua(idlingua, idcv) values(10,10);

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

--Tabella FORMAZIONE = FK ultima colonna -> 1-CV 2-AZIENDA
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','80/100',(TO_DATE ('2005-OTT-10', 'YYYY-MON-DD')) ,(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),1,1);
insert into Formazione values (sequenceFormazione.nextval,'diploma linguistico','diploma','75/100',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),2,2);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','90/100',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),3,3);
insert into Formazione values (sequenceFormazione.nextval,'diploma perito','diploma','60/100',(TO_DATE ('2004-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2009-GIU-20', 'yyyy-mon-dd')),4,4);
insert into Formazione values (sequenceFormazione.nextval,'laurea ingegneria','laurea','87/110',(TO_DATE ('2003-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2008-GIU-20', 'yyyy-mon-dd')),5,5);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','laurea','80/110',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),6,6);
insert into Formazione values (sequenceFormazione.nextval,'diploma scientifico','diploma','80/100',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),7,7);
insert into Formazione values (sequenceFormazione.nextval,'laurea matematica','laurea','100/110',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),8,8);
insert into Formazione values (sequenceFormazione.nextval,'laurea economia','laurea','102/110',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),9,9);
insert into Formazione values (sequenceFormazione.nextval,'laurea turismo','laurea','84/110',(TO_DATE ('2005-OTT-10', 'yyyy-mon-dd')),(TO_DATE ('2010-GIU-20', 'yyyy-mon-dd')),10,10);

--Tabella LAVORO = FK ultima colonna -> CV 
insert into Lavoro values (sequenceLavoro.nextval,'edilizia','operaio',131.56,(TO_DATE ('2005-APR-10', 'yyyy-mon-dd')),(TO_DATE ('2006-OTT-10', 'yyyy-mon-dd')),1,2);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','dipendente',1571.2,(TO_DATE ('2003-APR-22', 'yyyy-mon-dd')),(TO_DATE ('2004-DIC-10', 'yyyy-mon-dd')),2,2);
insert into Lavoro values (sequenceLavoro.nextval,'medicina','farmacista',2271.3,(TO_DATE ('2010-MAG-22', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),3,2);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','analista',1700.3,(TO_DATE ('2010-MAG-13', 'yyyy-mon-dd')),(TO_DATE ('2013-GIU-13', 'yyyy-mon-dd')),4,3);
insert into Lavoro values (sequenceLavoro.nextval,'onlus','promoter',1571.4,(TO_DATE ('2010-MAG-22', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),5,1);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','programmatore',1845.2,(TO_DATE ('20-GEN-30', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),6,1);
insert into Lavoro values (sequenceLavoro.nextval,'immobiliare','segretario',1233.7,(TO_DATE ('2004-MAG-22', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),7,5);
insert into Lavoro values (sequenceLavoro.nextval,'ristorazione','barista',1498.3,(TO_DATE ('2013-MAG-22', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),8,5);
insert into Lavoro values (sequenceLavoro.nextval,'istruzione','insegnante',1376.2,(TO_DATE ('2013-FEB-17', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),9,3);
insert into Lavoro values (sequenceLavoro.nextval,'informatica','programmatore',1100.4,(TO_DATE ('2014-NOV-22', 'yyyy-mon-dd')),(TO_DATE ('2015-DIC-10', 'yyyy-mon-dd')),10,3);

--Tabella ANAGRAFICACANDIDATO = FK INDIRIZZO
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'carlo alberto','rago',(TO_DATE ('1987-MAG-13', 'yyyy-mon-dd')),'3337864189','carloalb@erto.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'marco','mena',(TO_DATE ('1990-MAG-22', 'yyyy-mon-dd')),'3475437909','marc99@men.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'giulia','romi',(TO_DATE ('1983-MAR-17', 'yyyy-mon-dd')),'3898489005','giul88o.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'rosa','uggesi',(TO_DATE ('1995-NOV-18', 'yyyy-mon-dd')),'3345678997','rosaugg@esi.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'alessio','roberti',(TO_DATE ('1989-DIC-11', 'yyyy-mon-dd')),'3352679089','alex89@roby.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'bruno','opute',(TO_DATE ('1986-LUG-04', 'yyyy-mon-dd')),'3678990653','oput78@brun.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'jessica','perto',(TO_DATE ('1988-GEN-03', 'yyyy-mon-dd')),'3398732158','jessi88@perto.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'maria','cuccia',(TO_DATE ('1995-FEB-15', 'yyyy-mon-dd')),'3467543578','mary25@cuccia.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'girolama','prende',(TO_DATE ('1996-DIC-22', 'yyyy-mon-dd')),'3309764314','giro96@prend.it','diploma',1);
insert into AnagraficaCandidato values (sequenceAnagraficaCandidato.nextval,'rocco','re',(TO_DATE ('1985-GIU-21', 'yyyy-mon-dd')),'3787653215','rocco@er.it','diploma',1);

--Tabella ANAGRAFICA = FK : 1 - ANAGRAFICACANDIDATO 2 - INDIRIZZO 3 - NAZIONALITA
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'m','roma','068035167','SNOREB90T56H501B',1,1,1);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'f','roma','068035167','APTILR70E54H501C',2,2,2);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'m','roma','068035167','MNTSLV65T56H501B',3,3,3);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'m','cagliari','068035167','TSGVJM77T56B380C',4,4,4);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'f','ravenna','068035167','GYSBKB96T56Y200P',5,5,5);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'m','milano','068035167','PIPTER91T56I560R',6,6,6);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO)values (sequenceAnagrafica.nextval,'f','roma','068035167','AZCSIL93T56H501V',7,7,7);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'f','roma','068035167','ERTUGO95T56H501E',8,8,8);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'m','roma','068035167','POURBR89T56H501F',9,9,9);
insert into Anagrafica(idanagrafica, sesso, luogonascita, telefono, codicefiscale, idnazionalita, idindirizzo, IDANAGRAFICACANDIDATO) values (sequenceAnagrafica.nextval,'f','roma','068035167','GTGCRT90T56H501J',10,10,10);

/*SEZIONE CORSO*/

--Tabella COMPETENZA
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Html5');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Javascript');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'jQuery');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Css3');
insert into Competenza  values (sequenceCompetenza.nextval, 'Grafica', 'Adobe Photoshop');
insert into Competenza  values (sequenceCompetenza.nextval, 'Sistemistica', 'SQL');
insert into Competenza  values (sequenceCompetenza.nextval, 'Sistemistica', 'PL SQL');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Framework Spring');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Java SE');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Java EE');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Framework Spring');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Framework Spring');
insert into Competenza  values (sequenceCompetenza.nextval, 'Informatica', 'Framework Liferay');

--Tabella CORSO  -> ULTIMO CAMPO FK IDCOMPETENZA
insert into Corso values ('AKT000C', 'Corso Analista Programmatore Java-Oracle', (TO_DATE ('2016-GEN-07', 'yyyy-mon-dd')), (TO_DATE ('2016-MAR-17', 'yyyy-mon-dd')), 'AKT S.r.l', 10);
insert into Corso values ('AKT001C', 'Corso Sistemista', (TO_DATE ('2016-MAR-01', 'yyyy-mon-dd')), (TO_DATE ('2016-MAG-01', 'yyyy-mon-dd')), 'AKT S.r.l', 7);
insert into Corso values ('AKT002C', 'Corso Sviluppatore Android', (TO_DATE ('2015-SET-07', 'yyyy-mon-dd')), (TO_DATE ('2015-NOV-17', 'yyyy-mon-dd')), 'AKT S.r.l', 11);

--Tabella MODULO 
insert into modulo(idmodulo, nomemodulo) values('AKT000M',  'Strutturata');
insert into modulo(idmodulo, nomemodulo) values('AKT002M',  'PL-SQL');
insert into modulo(idmodulo, nomemodulo) values('AKT001M', 'SQL');
insert into modulo(idmodulo, nomemodulo) values('AKT003M', 'Java SE');

--Tabella MODULOCORSO
insert into modulocorsi values ('AKT001C', 'AKT000M', null, null);
insert into modulocorsi values ('AKT001C', 'AKT002M', null, null);
insert into modulocorsi values ('AKT001C', 'AKT001M', null, null);
insert into modulocorsi values ('AKT000C', 'AKT000M', null, null);
insert into modulocorsi values ('AKT000C', 'AKT003M', null, null);

--Tabella RISORSA -> SECONDO CAMPO FK IDTIROCINIO -> TERZO CAMPO FK IDANAGRAFICA
insert into Risorsa values(sequenceRisorsa.nextval, null, 1);
insert into Risorsa values(sequenceRisorsa.nextval, null, 3);
insert into Risorsa values(sequenceRisorsa.nextval, null, 4);
insert into Risorsa values(sequenceRisorsa.nextval, null, 5);
insert into Risorsa values(sequenceRisorsa.nextval, null, 6);
insert into Risorsa values(sequenceRisorsa.nextval, null, 7);
insert into Risorsa values(sequenceRisorsa.nextval, null, 8);
insert into Risorsa values(sequenceRisorsa.nextval, null, 9);
insert into Risorsa values(sequenceRisorsa.nextval, null, 10);


--Tabella CORSOHISTORY -> PRIMO CAMPO IDCORSO --> SECONDO CAMPO IDRISORSA
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT000C', 1);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT000C', 3);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT000C', 4);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT000C', 5);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT001C', 6);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT001C', 7);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT001C', 8);
insert into corsohistory(IDCORSO, IDRISORSA) values('AKT001C', 9);

--Tabella Risultato (non abbiamo risultati, tutti in corso)

--Tabella CANDIDATO -> secondo campo FK IDCV -> TERZO CAMPO FK IDANAGRAFICA -> QUARTOCAMPO FK IDRISORSA
insert into Candidato values (sequenceCandidato.nextval, 1, 1, 1);
insert into Candidato values (sequenceCandidato.nextval, 2, 2, 2);
insert into Candidato values (sequenceCandidato.nextval, 3, 3, 3);
insert into Candidato values (sequenceCandidato.nextval, 4, 4, 4);
insert into Candidato values (sequenceCandidato.nextval, 5, 5, 5);
insert into Candidato values (sequenceCandidato.nextval, 6, 6, 6);
insert into Candidato values (sequenceCandidato.nextval, 7, 7, 7);
insert into Candidato values (sequenceCandidato.nextval, 8, 8, 8);
insert into Candidato values (sequenceCandidato.nextval, 9, 9, 9);

/*SEZIONE SELEZIONE*/

--Tabella ESITO
INSERT INTO Esito VALUES (sequenceEsito.nextval, 'Ammesso', null);
INSERT INTO Esito VALUES (sequenceEsito.nextval, 'Non ammesso', null);

--Tabella SELEZIONE -> FK IDESITO
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-APR-12', 'yyyy-mon-dd')), 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-MAG-15', 'yyyy-mon-dd')), 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-LUG-15', 'yyyy-mon-dd')), 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-SET-22', 'yyyy-mon-dd')), 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-OTT-13', 'yyyy-mon-dd')), 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-NOV-15', 'yyyy-mon-dd')), 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-DIC-15', 'yyyy-mon-dd')), 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2015-GEN-13', 'yyyy-mon-dd')), 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2016-FEB-20', 'yyyy-mon-dd')), 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, (TO_DATE ('2016-MAR-16', 'yyyy-mon-dd')), 1);

--Tabella TESTSELEZIONE -> FK IDSELEZIONE
INSERT INTO TestSelezione VALUES ('frak98c', 70, 1);
INSERT INTO TestSelezione VALUES ('frib43n', 60, 2);
INSERT INTO TestSelezione VALUES ('gesu47b', 90, 3);
INSERT INTO TestSelezione VALUES ('lallo44', 44, 4);
INSERT INTO TestSelezione VALUES ('filos39', 32, 5);
INSERT INTO TestSelezione VALUES ('jurk98c', 50, 6);
INSERT INTO TestSelezione VALUES ('lupw92c', 97, 7);
INSERT INTO TestSelezione VALUES ('caio993', 78, 8);
INSERT INTO TestSelezione VALUES ('gepi98e', 100, 9);
INSERT INTO TestSelezione VALUES ('chiap33', 77, 10);

--Tabella BATTERIA
INSERT INTO Batteria VALUES ('batt001', 'JSE', 'frak98c');
INSERT INTO Batteria VALUES ('batt002', 'strutturata', 'frib43n');
INSERT INTO Batteria VALUES ('batt003', 'JEE', 'gesu47b');
INSERT INTO Batteria VALUES ('batt004', 'SQL', 'lallo44');
INSERT INTO Batteria VALUES ('batt005', 'jbdc', 'filos39');
INSERT INTO Batteria VALUES ('batt006', 'html', 'jurk98c');
INSERT INTO Batteria VALUES ('batt007', 'xml', 'lupw92c');
INSERT INTO Batteria VALUES ('batt008', 'css', 'caio993');
INSERT INTO Batteria VALUES ('batt009', 'javascript', 'gepi98e');
INSERT INTO Batteria VALUES ('batt010', 'logica', 'chiap33');

--Tabella COLLOQUIO -> FK IDSELEZIONE
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Selezionato', 'Il candidato sembra predisposto per l informatica.', 'Conoscitivo', 1,'Buona conoscenza dell inglese','Determinato e sicuro');
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Positiva', 'Il candidato sembra avere le competenze adeguate', 'Tecnico', 1,'Ottima capicità di problem solving', 'Determinato e sicuro');
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Non selezionato', 'Il candidato sembra non avere una predisposizione per l informativa.', 'Conoscitivo', 2,'Nessuna','Insicuro e troppo teso');
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Selezionato', 'Il candidato sembra avere una spiccata propedeudicità per questo settore', 'Conoscitivo', 3,'Entusiasmo e voglia di imparare', 'Energico e sveglio');
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Negativa', 'Il candidato non sembra essere pronto per questo tipo di percorso', 'Tecnico', 3, 'Entusiasmo e voglia di imparare','Buona conoscenza dell inglese');

--Tabella PARTECIPA 
INSERT INTO Partecipa VALUES (1,1);
INSERT INTO Partecipa VALUES (2,2);
INSERT INTO Partecipa VALUES (3,3);
INSERT INTO Partecipa VALUES (4,4);
INSERT INTO Partecipa VALUES (5,5);
INSERT INTO Partecipa VALUES (6,6);
INSERT INTO Partecipa VALUES (7,7);
INSERT INTO Partecipa VALUES (8,8);
INSERT INTO Partecipa VALUES (9,9);