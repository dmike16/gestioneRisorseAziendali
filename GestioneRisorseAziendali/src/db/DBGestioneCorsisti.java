package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import domain.corso.*;
import domain.anagrafica.*;
import domain.RicercaScelta;

public class DBGestioneCorsisti{
	
	private Connection conn;
	
	public DBGestioneCorsisti() throws ClassNotFoundException, SQLException, NamingException{
		establishConnection();
	}
	
	private void establishConnection(){
		try{
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/hrakt");
			conn = ds.getConnection();
		} catch(SQLException e){
			System.out.println("SQLException "+e);
		} catch(NamingException e){
			System.out.println("NamingException "+e);
		}
	}
		
		
	// Seleziona la formazione dei corsisti partendo da nome e cognome presi da input(TASK C SUBTASK 2)
	public ArrayList<Formazione> selectFormazioneCorsisti(RicercaScelta ricercaScelta) throws SQLException
	{
		ArrayList<Formazione> listaFormazioni = new ArrayList<>();
		String sql="select f.* "
				+ "from risorsa r,anagraficaCandidato ac ,candidato c, cv , formazione f "
				+ "where r.idRisorsa = c.idRisorsa and c.idAnagraficaCandidato=ac.idAnagraficaCandidato "
				+ "and ac.nome=? and ac.cognome=? and cv.idCV=c.idCV and "
				+ "cv.idCV=f.idCV "
				+ "order by f.dataInizio asc";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,ricercaScelta.getNome());
		statement.setString(2,ricercaScelta.getCognome());
		ResultSet result = statement.executeQuery();
			
		while(result.next())
		{
			Formazione formazione = new Formazione();
			formazione.setId(result.getInt(1));
			formazione.setTitoloStudio(result.getString(2));
			formazione.setDescrizione(result.getString(3));
			formazione.setVotazione(result.getString(4));
			formazione.setDataInizio(result.getDate(5).toLocalDate());
			formazione.setDataFine(result.getDate(6).toLocalDate());
			formazione.setIdCv(result.getInt(7));
			formazione.setIdAzienda(result.getInt(8));
			listaFormazioni.add(formazione);
		}
		
		return listaFormazioni;
			
	}
	
	//Seleziona tutti i lavori dei corsisti partendo da nome e cognome presi da input(TASK D SUBTASK 2) query 1/2
	public List<Lavoro> selectLavoriCorsisti(RicercaScelta ricercaScelta) throws SQLException
	{
		List<Lavoro>listaLavori = new ArrayList<>();
		String sql ="select l.* "
					+ "from risorsa r, candidato c, anagraficaCandidato ac, cv cv, lavoro l, azienda az "
					+ "where r.idRisorsa = c.idRisorsa and c.idAnagraficaCandidato = ac.idAnagraficaCandidato and ac.nome = ? "
					+ "and ac.cognome = ? and c.idCv = cv.idCv and cv.idCv = l.idCv "
					+ "order by l.dataInizio asc";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,ricercaScelta.getNome());
			statement.setString(2,ricercaScelta.getCognome());
			ResultSet result = statement.executeQuery();
			
			while(result.next())
			{
				Lavoro lavoro = new Lavoro();
				lavoro.setIdLavoro(result.getInt(1));
				lavoro.setAmbito(result.getString(2));
				lavoro.setImpiego(result.getString(3));
				lavoro.setStipendio(result.getDouble(4));
				lavoro.setDataInizio(result.getDate(5).toLocalDate());
				lavoro.setDataFine(result.getDate(6).toLocalDate());
				lavoro.setIdCv(result.getInt(7));
				lavoro.setIdAzienda(result.getInt(8));
				listaLavori.add(lavoro);
			}
			return listaLavori;
			
	}
	/*Seleziona tutte le aziende relative alle esperienze lavorative dei corsisti, partendo da
	 * nome e cognome presi da input(TASK D SUBTASK 2) query 2/2 */
	public List<Azienda> selectAziendeCorsisti(RicercaScelta ricercaScelta) throws SQLException
	{
		List<Azienda>listaAziende = new ArrayList<>();
		String sql ="select az.* "
				+"from anagraficaCandidato ac, indirizzo i, azienda az "
				+ "where ac.nome = ? and ac.cognome = ? and ac.idIndirizzo = i.idIndirizzo and az.idIndirizzo = i.idIndirizzo";
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Azienda azienda = new Azienda();
			azienda.setIdAzienda(result.getInt(1));
			azienda.setNome(result.getString(2));
			azienda.setTipoAzienda(result.getString(3));
			azienda.setSettore(result.getString(4));
			azienda.setIdIndirizzo(result.getInt(5));
			listaAziende.add(azienda);
		}
		return listaAziende;
	}
	
	/*Seleziona la lista delle certificazioni informatiche dei corsisti partendo da nome e cognome
	 * presi da input(NON IN ORDINE CRONOLOGICO) (TASK E SUBTASK 2)*/
	public List<Certificazione> selectCompetenzeInformaticheCorsisti(RicercaScelta ricercaScelta) throws SQLException
	{
		List<Certificazione> listCertificazioni = new ArrayList<>();
		String sql = "select ce.* "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.nome = ? and ac.cognome = ? and ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv "
				+ "and cv.idCv = ce.idCv";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,ricercaScelta.getNome());
		statement.setString(2,ricercaScelta.getCognome());
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Certificazione certificazione = new Certificazione();
			certificazione.setIdCertificazione(result.getInt(1));
			certificazione.setSettore(result.getString(2));
			certificazione.setSpecializzazione(result.getString(3));
			certificazione.setIdCv(result.getInt(4));
			listCertificazioni.add(certificazione);
		}
		return listCertificazioni;
	}
	
	/*Seleziona l'insieme dei corsi frequentati dai corsisti, partendo da nome e cognome presi da input (TASK F SUBTASK 2)*/
	public List<Corso> selectCorsiCorsisti(RicercaScelta ricercaScelta) throws SQLException
	{
		List<Corso> listCorsi = new ArrayList<>();
		String sql = "select co.* "
				+ "from risorsa r, candidato c, anagraficaCandidato ac, corsoHistory ch, corso co "
				+ "where r.idRisorsa = c.idRisorsa and c.idAnagraficaCandidato = ac.idAnagraficaCandidato and ac.nome = ? "
				+ "and ac.cognome = ? and r.idRisorsa = ch.idRisorsa and ch.idCorso = co.idCorso "
				+ "order by co.dataInizio asc";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,ricercaScelta.getNome());
		statement.setString(2,ricercaScelta.getCognome());
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Corso corso = new Corso();
			corso.setIdCorso(result.getString(1));
			corso.setTitoloCorso(result.getString(2));
			corso.setDataInizio(result.getDate(3).toLocalDate());
			corso.setDataFine(result.getDate(4).toLocalDate());
			corso.setAzienda(result.getString(5));
			corso.setIdCompetenza(result.getInt(6));
			listCorsi.add(corso);
		}
		return listCorsi;
	}
	/*Fornisce il nome e cognome dei candidati, partendo da un titolo di studio preso da input
	 * (TASK C SUBTASK 1) query 1/2
	 */
	public List<AnagraficaCandidato> selectCorsistiPerStudio(String formazione) throws SQLException 
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String sql = "select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, candidato c, cv cv, formazione f "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv and cv.idCv = f.idCv "
				+ "and f.titoloStudio = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,formazione);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato anagraficaCandidato = new AnagraficaCandidato();
			anagraficaCandidato.setNome(result.getString(1));
			anagraficaCandidato.setCognome(result.getString(2));
			listCandidati.add(anagraficaCandidato);
		}
		return listCandidati;
	}
	
	/*Fornisce una lista di votazioni, partendo da un titolo di studio preso da input (TASK C SUBTASK 1) query 2/2*/
	public List<Formazione> selectCorsistiPerVotoStudio(String formazione)throws SQLException{
		List<String>listVoti = new ArrayList<>();
		String sql = "select f.votazione "
				+ "from anagraficaCandidato ac, candidato c, cv cv, formazione f "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv and cv.idCv = f.idCv "
				+ " and f.titoloStudio = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,formazione);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Formazione formazione = new Formazione();
			formazione.setVotazione(result.getString(1));
			listVoti.add(formazione);
		}
	}
	
	
	/*seleziona una lista di nomi e cognomi di corsisti, partendo da un settore lavorativo preso da input
	 * (TASK D SUBTASK 1) query 1/2 */
	public List<AnagraficaCandidato> selectCorsistiSettoreLavorativo(String settore) throws SQLException
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String sql = "select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, indirizzo i, azienda az "
				+ "where ac.idIndirizzo = i.idIndirizzo and az.idIndirizzo = i.idIndirizzo and az.settore = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,settore);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato candidato = new AnagraficaCandidato();
			candidato.setNome(result.getString(1));
			candidato.setCognome(result.getString(2));
			listCandidati.add(candidato);
		}
		return listCandidati;
	}
	
	/*seleziona una lista di nomi e cognomi dei corsisti, partendo dal nome di un'azienda, preso da input
	 * (TASK D SUBTASK 1) query 2/2*/
	public List<AnagraficaCandidato> selectCorsistiNomeAzienda(String azienda) throws SQLException
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String sql = "select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, indirizzo i, azienda az "
				+ "where ac.idIndirizzo = i.idIndirizzo and az.idIndirizzo = i.idIndirizzo and az.nome = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,settore);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato candidato = new AnagraficaCandidato();
			candidato.setNome(result.getString(1));
			candidato.setCognome(result.getString(2));
			listCandidati.add(candidato);
		}
		return listCandidati;
	}
	
	/*seleziona una lista di nomi e cognomi di corsisti, partendo da un'area di competenza informatica, presa da input
	 * (TASK F SUBTASK 1)*/
	public List<AnagraficaCandidato>selectCorsistiCompetenzeInformatiche(String competenza)throws SQLException
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String sql ="select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv "
				+ "and cv.idCv = ce.idCv and ce.specializzazione = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,competenza);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato candidato = new AnagraficaCandidato();
			candidato.setNome(result.getString(1));
			candidato.setCognome(result.getString(2));
			listCandidati.add(candidato);
		}
		return listCandidati;
	}
	
	/*fornisce una lista di nomi e cognomi dei candidati, partendo da un'area di competenza informatica, presa da input
	 * (task E subtask1) query 1 di 4 coppia A 1 di 2*/
	public List<AnagraficaCandidato> selectCorsistiCertificazioniDaCompetenze(String competenza) throws SQLException
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String comp = "%" + competenza;
		String sql = "select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv "
				+ "and cv.idCv = ce.idCv and ce.settore = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1,comp);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato candidato = new AnagraficaCandidato();
			candidato.setNome(result.getString(1));
			candidato.setCognome(result.getString(2));
			listCandidati.add(candidato);
		}
		return listCandidati;
	}
	
	/*fornisce una lista di certificazioni, partendo da un'area di competenza informatica
	 * (task E subtask1) query 2 di 4 coppia A 2 di 2*/
	public List<AnagraficaCandidato>selectCertificazioniDaCompetenze(String competenza) throws SQLException
	{
		List<Certificazione>listCertificazioni = new ArrayList<>();
		String sql = "select ce.* "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv "
				+ "and cv.idCv = ce.idCv and ce.settore = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, competenza);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Certificazione certificazione = new Certificazione();
			certificazione.setIdCertificazione(result.getInt(1));
			certificazione.setSettore(result.getString(2));
			certificazione.setSpecializzaziomne(result.getString(3));
			certificazione.setIdCv(result.getInt(4));
			listCertificazioni.add(certificazione);
		}
		return listCertificazioni;
	}
	
	/*fornisce una lista di nomi e cognomi dei corsisti, partendo dalla specializzazione di una certificazione presa da input
	 * (Task E subtask1) query 3 di 4 coppia B 1 di 2 */
	public List<AnagraficaCandidato> selectCorsistiDaCertificazioni(Certificazione certificazione) throws SQLException
	{
		List<AnagraficaCandidato>listCandidati = new ArrayList<>();
		String sql = "select ac.nome, ac.cognome "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv and cv.idCv = ce.idCv "
				+ "and ce.specializzazione = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(certificazione.getSpecializzazione());
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			AnagraficaCandidato candidato = new AnagraficaCandidato();
			candidato.setNome(result.getString(1));
			candidato.setCognome(result.getString(2));
			listCandidati.add(candidato);
		}
		return listCandidati;
	}
	
	/*fornisce una lista di certificazioni, partendo dalla specializzazione di una certificazione presa da input
	 * (Task E subtask 1)query 4 di 4 coppia B 2 di 2*/
	public List<Certificazione> selectCertificazioniDaCertificazione(Certificazione certificazione) throws SQLException
	{
		List<Certificazione>listCertificazioni = new ArrayList<>();
		String sql = "select ce.* "
				+ "from anagraficaCandidato ac, candidato c, cv cv, certificazione ce "
				+ "where ac.idAnagraficaCandidato = c.idAnagraficaCandidato and c.idCv = cv.idCv and cv.idCv = ce.idCv "
				+ "and ce.specializzazione = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			Certificazione certificazione = new Certificazione();
			certificazione.setIdCertificazione(result.getInt(1));
			certificazione.setSettore(result.getString(2));
			certificazione.setSpecializzazione(result.getString(3));
			certificazione.setIdCv(result.getInt(4));
			listCertificazioni.add(certificazione);
		}
		return listCertificazioni;
	}
	
	
			
}
