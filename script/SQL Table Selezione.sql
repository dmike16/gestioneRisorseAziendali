INSERT INTO Esito VALUES (sequenceEsito.nextval, 'Ammesso');
INSERT INTO Esito VALUES (sequenceEsito.nextval, 'Non ammesso');

INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '23-APR-15', 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '15-MAY-15', 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '10-JUL-15', 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '22-SEP-15', 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '13-OCT-15', 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '24-NOV-15', 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '02-DEC-15', 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '13-GEN-15', 2);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '26-FEB-16', 1);
INSERT INTO Selezione VALUES (sequenceSelezione.nextval, '09-MAR-16', 1);

INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Selezionato', 'Il candidato sembra predisposto per l'informatica.', 'Conoscitivo', 'Buona conoscenza dell'inglese','Determinato e sicuro', 1);
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Positiva', 'Il candidato sembra avere le competenze adeguate', 'Tecnico', 'Ottima capicità di problem solving', 'Determinato e sicuro', 1);
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Non selezionato', 'Il candidato sembra non avere una predisposizione per l'informativa.', 'Conoscitivo', 'Nessuna','Insicuro e troppo teso', 2);
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Selezionato', 'Il candidato sembra avere una spiccata propedeudicità per questo settore', 'Conoscitivo', 'Entusiasmo e voglia di imparare', 'Energico e sveglio', 3);
INSERT INTO Colloquio VALUES (sequenceColloquio.nextval, 'Negativa', 'Il candidato non sembra essere pronto per questo tipo di percorso', 'Tecnico', 'Buona conoscenza dell'inglese',3);

INSERT INTO TestSelezione VALUES ('frak98c', 70, 1);
INSERT INTO TestSelezione VALUES ('frib43n', 60, 2;
INSERT INTO TestSelezione VALUES ('gesu47b', 90, 3);
INSERT INTO TestSelezione VALUES ('lallo44', 44, 4);
INSERT INTO TestSelezione VALUES ('filos39', 32, 5);
INSERT INTO TestSelezione VALUES ('jurk98c', 50, 6);
INSERT INTO TestSelezione VALUES ('lupw92c', 97, 7);
INSERT INTO TestSelezione VALUES ('caio993', 78, 8);
INSERT INTO TestSelezione VALUES ('gepi98e', 100, 9);
INSERT INTO TestSelezione VALUES ('chiap33', 77, 10);

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

INSERT INTO Partecipa VALUES (1,1);
INSERT INTO Partecipa VALUES (2,2);
INSERT INTO Partecipa VALUES (3,3);
INSERT INTO Partecipa VALUES (4,4);
INSERT INTO Partecipa VALUES (5,5);
INSERT INTO Partecipa VALUES (6,6);
INSERT INTO Partecipa VALUES (7,7);
INSERT INTO Partecipa VALUES (8,8);
INSERT INTO Partecipa VALUES (9,9);
INSERT INTO Partecipa VALUES (10,10);