
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import domain.anagrafica.Anagrafica;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.Indirizzo;
import domain.corso.Candidato;
import domain.corso.Competenza;
import domain.corso.Corso;
import domain.corso.CorsoHistory;
import domain.corso.Modulo;
import domain.corso.Risorsa;
import domain.corso.Risultato;
import domain.anagrafica.Nazionalita;
import db.ConnessioneDb;

public class DbGestioneAnagraficaRisorse {
	
	Connection con;
	
	public DbGestioneAnagraficaRisorse(){
		
			try {
				con =(new ConnessioneDb()).getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}    
    
	/**
	 * Visualizzazione dati Candidato a partire dalla lista della ricerca
	 * @param idCandidato
	 * @return AnagraficaCandidato
	 * @throws SQLException
	 */
    public AnagraficaCandidato selectAnagraficaCandidato(int idCandidato) throws SQLException{
    	AnagraficaCandidato anagraficaCandidato =new AnagraficaCandidato();
    	String sql = "select * from anagraficaCandidato where idCandidato = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setInt(1, idCandidato);
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		anagraficaCandidato.setIdAnagraficaCandidato(rs.getInt("idAnagraficaCandidato"));
    		anagraficaCandidato.setNome(rs.getString("nome"));
    		anagraficaCandidato.setCognome(rs.getString("cognome"));
    		anagraficaCandidato.setDataNascita(rs.getDate("datanascita").toLocalDate());
    		anagraficaCandidato.setCellulare(rs.getString("cellulare"));
    		anagraficaCandidato.setEmail(rs.getString("email"));
    		anagraficaCandidato.setTitoloStudio(rs.getString("titolostudio"));
    		   		
    	}
    	return anagraficaCandidato;
    }    
    public Candidato selectCandidato (int idCandidato) throws SQLException{
    	Candidato candidato =new Candidato();
    	String sql = "select * from Candidato where idCandidato=?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setInt(1, idCandidato);
    	
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		candidato.setIdAnagrafica(rs.getInt("idAnagrafica"));
    		candidato.setIdCandidato(rs.getInt("idcandidato"));
    		candidato.setIdCv(rs.getInt("idCv"));
    		candidato.setIdRisorsa(rs.getInt("idRisorsa"));
    		   		
    	}
    	return candidato;
    }
    //*fine visualizzazione
    
    //ricerca per nome e cognome
    public List<AnagraficaCandidato> selectCandidato(String nomeCandidato, String cognomeCandidato) throws SQLException{
    	List<AnagraficaCandidato> anagraficaCandidati =new ArrayList<>();
    	String sql = "select * from anagraficaCandidato where nome = ? and cognome = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeCandidato);
    	stm.setString(1, cognomeCandidato);
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		AnagraficaCandidato candidato = new AnagraficaCandidato();
    		candidato.setIdAnagraficaCandidato(rs.getInt("idanagraficacandidato"));
    		candidato.setNome(rs.getString("nome"));
    		candidato.setCognome(rs.getString("cognome"));
    		candidato.setDataNascita(rs.getDate("datanascita").toLocalDate());
    		candidato.setCellulare(rs.getString("cellulare"));
    		candidato.setEmail(rs.getString("email"));
    		candidato.setTitoloStudio(rs.getString("titolostudio"));
    		anagraficaCandidati.add(candidato); 		
    	}
    	return anagraficaCandidati;
    }
    //memorizzazione idCandidato da mettere come campo hidden 
    public List<Candidato> selectCandidatoId(String nomeCandidato, String cognomeCandidato) throws SQLException{
    	List<Candidato> candidati =new ArrayList<>();
    	String sql = "select * from anagraficaCandidato where nome = ? and cognome = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeCandidato);
    	stm.setString(2, cognomeCandidato);
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		Candidato candidato = new Candidato();
    		candidato.setIdAnagrafica(rs.getInt("idanagrafica"));
    		candidato.setIdCandidato(rs.getInt("idcandidato"));
    		candidato.setIdCv(rs.getInt("idCv"));
    		candidato.setIdRisorsa(rs.getInt("idrisorsa"));
    		candidati.add(candidato);
    		   		
    	}
    	return candidati;
    }
    //*fine ricerca per nome e cognome
    
    //ricerca per email
    public List<AnagraficaCandidato> selectCandidato(String email) throws SQLException{
    	List<AnagraficaCandidato> anagraficaCandidati =new ArrayList<>();
    	String sql = "select * from anagraficaCandidato where email = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, email);    	
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		AnagraficaCandidato candidato = new AnagraficaCandidato();
    		candidato.setIdAnagraficaCandidato(rs.getInt("idanagraficacandidato"));
    		candidato.setNome(rs.getString("nome"));
    		candidato.setCognome(rs.getString("cognome"));
    		candidato.setDataNascita(rs.getDate("datanascita").toLocalDate());
    		candidato.setCellulare(rs.getString("cellulare"));
    		candidato.setEmail(rs.getString("email"));
    		candidato.setTitoloStudio(rs.getString("titolostudio"));
    		anagraficaCandidati.add(candidato);    		   		
    	}
    	return anagraficaCandidati;
    }


    //da controllare e fare subselect
    public List<Candidato> selectCandidatoId(String email) throws SQLException{
    	List<Candidato> candidati =new ArrayList<>();
    	String sql = "select * from anagraficaCandidato where email=?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, email);
    	
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		Candidato candidato = new Candidato();
    		candidato.setIdAnagrafica(rs.getInt("idanagrafica"));
    		candidato.setIdCandidato(rs.getInt("idcandidato"));
    		candidato.setIdCv(rs.getInt("idCv"));
    		candidati.add(candidato);
    		   		
    	}
    	return candidati;
    }
    //*fine ricerca per email
    
    public Nazionalita selectNazionalita(String nomeNazionalita) throws SQLException{
    	String sql = "select * from Nazionalita where nomeNazionalita = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeNazionalita);
    	Nazionalita nazionalita = null;
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		nazionalita.setIdNazionalita(rs.getInt(1));
    		nazionalita.setNomeNazionalita(nomeNazionalita);    		
    	}
    	return nazionalita;
    	
    }
    
    public void insertAnagrafica(Anagrafica anagrafica, Nazionalita nazionalita)throws SQLException{    	
    	String sql = "insert into Anagrafica values(sequenceAnagrafica.nextval,?,?,?,?,?,sequenceIndirizzo.currval,?)";
    	PreparedStatement stm = con.prepareStatement(sql);
    	
    	stm.setString(1,anagrafica.getLuogoNascita());
    	stm.setString(2, anagrafica.getTelefono());
    	stm.setString(3,anagrafica.getCodiceFiscale());
    	stm.setString(4, anagrafica.getSesso());
    	stm.setInt(5, anagrafica.getIdAnagraficaCandidato());
    	stm.setInt(7, nazionalita.getIdNazionalita());
    	
    	stm.executeUpdate();   	
    	
    }
    
    public void insertRisorsa(Risorsa risorsa) throws SQLException{
    	String sql = "insert into Risorsa values (sequenceRisorsa.nextval,sequenceTirocinio.currval,sequenceAnagrafica.currval)";
    	Statement stm = con.createStatement();
    	stm.executeUpdate(sql);
    	//da finire
    }
    
    public void insertCorsoHistory(CorsoHistory ch, Corso corso) throws  SQLException{
    	String sql = "insert into CorsoHistory values (?,sequenceRisorsa.currval,?)";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, corso.getIdCorso());
    	stm.setString(2, ch.getSuperamento());
    	stm.executeUpdate();
    }
    
    public List<Corso> selectRisorsaCorso(Risorsa risorsa) throws SQLException {
    	List<Corso> corsi = new ArrayList<>();
    	String sql = "select * from corso where idCorso in " +
    				" (select idCorso from corsoHistory where idRisorsa = ?)";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setInt(1, risorsa.getIdRisorsa());
    	ResultSet rs = stm.executeQuery();
    	
    	while(rs.next()){
    		Corso corso = new Corso();
    		corso.setIdCorso(rs.getString(1));
    		corso.setTitoloCorso(rs.getString(2));
    		corso.setDataInizio(rs.getDate(3).toLocalDate());
    		corso.setDataFine(rs.getDate(4).toLocalDate());
    		corso.setAzienda(rs.getString(5));
    		corsi.add(corso);   		
    	}
    	return corsi;
    }
    
    public List<Modulo> selectModuloCorso(String nomeCorso) throws SQLException{
    	List<Modulo> moduli = new ArrayList<>();
    	String sql = "select * from Modulo where idModulo in "+
    				 " (select idModulo from ModuloCorso where idCorso = "+
    				 "( select idCorso from Corso where titoloCorso = ?)";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeCorso);
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		Modulo modulo = new Modulo();
    		modulo.setIdModulo(rs.getString(1));
    		modulo.setNomeModulo(rs.getString(2));
    		moduli.add(modulo);    		
    	}
    	return moduli;
    }
    
    public Modulo selectModulo(String nomeModulo) throws SQLException {
    	String sql = "select * from modulo where nomeModulo = ?";
    	Modulo modulo = new Modulo();
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeModulo);
    	ResultSet rs = stm.executeQuery();
    	while(rs.next()){
    		modulo.setIdModulo(rs.getString(1));
    		modulo.setNomeModulo(nomeModulo);
    	}
    	return modulo;
    }
    public void insertCorso(Corso corso) throws SQLException{
    	String sql = "insert into Corso values (sequenceCorso.nextval, ?,?,?,?,sequenceCompetenza.currval)";
    	
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, corso.getTitoloCorso());
    	stm.setDate(2, java.sql.Date.valueOf(corso.getDataInizio().toString()));
    	stm.setDate(3, java.sql.Date.valueOf(corso.getDataFine().toString()));
    	stm.setString(4,corso.getAzienda());
    	
    	stm.executeUpdate();
    }
    
    public void insertCompetenza(Competenza competenza) throws SQLException {
    	String sql = "insert into competenza values (sequenceCompetenza.nextval,?,?)";
    	PreparedStatement stm = con.prepareStatement(sql);    	
    	stm.setString(1, competenza.getSettore());
    	stm.setString(2, competenza.getSpecializzazione());
    	stm.executeUpdate();    	
    }
    
    public void insertModulo(Modulo modulo) throws SQLException {
    	String sql = "insert into Modulo values (sequenceModulo.nextval,?)";
    	PreparedStatement stm = con.prepareStatement(sql);   	
    	stm.setString(3, modulo.getNomeModulo());
    	stm.executeUpdate();    	
   	
    }
    
    public void insertRisultato(Risultato risultato, Modulo modulo, Risorsa risorsa ) throws SQLException {
    	String sql = "insert into Risultato values (?,?,?,?)";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, modulo.getIdModulo() );
    	stm.setInt(2, risorsa.getIdRisorsa());
    	stm.setString(3, risultato.getValutazione());
    	stm.setString(4, risultato.getEsito());    	
    	stm.executeUpdate();
    }
    
    
    
    
  //MODIFICA: lista corsi da inserire come input select nel form
    public List<Corso> selectCorsi() throws SQLException {
    	List<Corso> corsi = new ArrayList<>();
    	String sql = "select * from corso";
    	Statement stm = con.createStatement();
    	ResultSet rs = stm.executeQuery(sql);
    	
    	while(rs.next()){
    		Corso corso = new Corso();
    		corso.setIdCorso(rs.getString(1));
    		corso.setTitoloCorso(rs.getString(2));
    		corso.setDataInizio(rs.getDate(3).toLocalDate());
    		corso.setDataFine(rs.getDate(4).toLocalDate());
    		corso.setAzienda(rs.getString(5));
    		corso.setSuperamento(rs.getString(6).charAt(0));
    		corso.setIdCompetenza(rs.getInt(7));
    		corsi.add(corso);
    	}
    	return corsi;
    }
    //MODIFICA: select dopo la scelta dell'utente, per recuperare i dati del corso
    public Corso selectCorso(String nomeCorso) throws SQLException {
    	Corso corso = new Corso();
    	String sql = "select * from corso where titoloCorso = ?";
    	PreparedStatement stm = con.prepareStatement(sql);
    	stm.setString(1, nomeCorso);
    	ResultSet rs = stm.executeQuery();
    	
    	while(rs.next()){
    		corso.setIdCorso(rs.getString(1));
    		corso.setTitoloCorso(rs.getString(2));
    		corso.setDataInizio(rs.getDate(3).toLocalDate());
    		corso.setDataFine(rs.getDate(4).toLocalDate());
    		corso.setAzienda(rs.getString(5));
    		corso.setSuperamento(rs.getString(6).charAt(0));
    		corso.setIdCompetenza(rs.getInt(7));

    		
    	}
    	return corso;
    	
    }
  //ultimo da inserire 
  	public void insertCandidato(Candidato candidato)throws SQLException{
  		String sql = "INSERT INTO CANDIDATO (idCandidato,idCv,idAnagraficaCandidato)"+
  					" VALUES(sequenceCandidato.nextval,sequenceCv.currval,sequenceAnagraficaCandidato.currval)";
  		
  		PreparedStatement ps = con.prepareStatement(sql);
  	
  		ps.executeUpdate();
  	}
  	
  	public void insertIndirizzo(Indirizzo indirizzo)throws SQLException{
  		//String sql= "INSERT INTO INDIRIZZO VALUES (sequenceIndirizzo.nextval,?,?,?,?)";
  		String sql= "INSERT INTO INDIRIZZO (idindirizzo,citta) VALUES (sequenceIndirizzo.nextval,?)";
  		PreparedStatement ps = con.prepareStatement(sql);
  		

  		String citta = indirizzo.getCitta();
  		//String cap = indirizzo.getCap();
  		//String via = indirizzo.getVia();
  		//String nCivico = indirizzo.getnCivico();
  		
  		ps.setString(1, citta);
  		//ps.setString(2, cap);
  		//ps.setString(3, via);
  		//ps.setString(4,nCivico);
  		
  		ps.executeUpdate();
  			
  		}
  		
  	public void insertAnagraficaCandidato(AnagraficaCandidato anag)throws SQLException{
  	String sql = "INSERT INTO ANAGRAFICACANDIDATO VALUES(sequenceAnagraficaCandidato.nextval,?,?,?,?,?,sequenceIndirizzo.currval)";
  	
  	PreparedStatement ps = con.prepareStatement(sql);
  	
  	
  	String nome = anag.getNome();
  	String cognome = anag.getCognome();
  	LocalDate dataNascita = anag.getDataNascita();
  	String cellulare = anag.getCellulare();
  	
  	
  	
  	ps.setString(1, nome);
  	ps.setString(2, cognome);
  	ps.setDate(3, java.sql.Date.valueOf(dataNascita));
  	ps.setString(4, cellulare);
  	
  	
  	ps.executeUpdate();
  	
  	}
  	
  	

  	
  	public Risorsa selectRisorsaCandidato(int idRisorsa)throws SQLException{
  		String sql ="select * from risorsa where idRisorsa = ?";
  		
  		PreparedStatement ps = con.prepareStatement(sql);
  		Risorsa risorsa = null;
  		ps.setInt(1,idRisorsa);
  		ResultSet rs = ps.executeQuery();
  		if(rs.next()){
  			do{
  				risorsa= new Risorsa();
  				risorsa.setIdRisorsa(rs.getInt(1));
  				risorsa.setIdTirocinio(rs.getInt(2));
  				risorsa.setIdAnagrafica(rs.getInt(3));
  			}while(rs.next());
  		}
  		return risorsa;
  			
  		
  		
  	}
  	
  	public int modificaIndirizzo(Indirizzo indirizzo)throws SQLException{
  		String sql = "update Indirizzo set citta=?,cap=?,via=?,nCivico=?  where idIndirizzo=?";
  		
  		
  		PreparedStatement ps = con.prepareStatement(sql);
  		
  			ps.setString(1,indirizzo.getCitta());
  			ps.setString(2,indirizzo.getCap());
  			ps.setString(3,indirizzo.getVia());
  			ps.setString(4,indirizzo.getnCivico());
  			
  			return ps.executeUpdate();
  		
  		
  	}
  	
  	public int modificaAnagrafica(AnagraficaCandidato anagraficaCandidato)throws SQLException{
  		String sql = "update AnagraficaCandidato set cellulare=?, email=?, titolodiStudi=? where idAnagraficaCandidato=?";
  		
  		
  			PreparedStatement ps = con.prepareStatement(sql);
  			ps.setString(1,anagraficaCandidato.getCellulare());
  			ps.setString(2, anagraficaCandidato.getEmail());
  			ps.setString(3,anagraficaCandidato.getTitoloStudio());
  			
  			return ps.executeUpdate();
  		
  	}
  	
  	public void modificaCandidato(int idCandidato)throws SQLException{
  		String sql = "UPDATE CANDIDATO SET IDRISORSA = sequenceRisorsa.currval WHERE IDCANDIDATO = ?";
  		
  		PreparedStatement ps = con.prepareStatement(sql);
  		
  		ps.setInt(1,idCandidato );
  		ps.executeUpdate();
  		
  	}
  	// Controllo se torna 0
  	public int selectIdSelezione(int idCandidato)throws SQLException{
  		String sql = " SELECT IDSELEZIONE FROM PARTECIPA WHERE IDCANDIDATO = ?";
  		
  		PreparedStatement ps = con.prepareStatement(sql);
  		
  		ps.setInt(1, idCandidato);
  		ResultSet rs = ps.executeQuery();
  		if(rs.next()){
  		return  rs.getInt(1);
  		}else{
  			return 0;
  		}
  	}
    //elimina Risorsa e corso
    public int eliminaRisorsaCorsoHistory(int idRisorsa)throws SQLException{
    	
    	String sql = "DELETE CORSOHISTORY WHERE IDRISORSA = ? ";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idRisorsa);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaRisultato(int idRisorsa)throws SQLException{
    	
    	String sql= "DELETE RISULTATO WHERE IDRISORSA = ? ";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idRisorsa);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaRisorsa(int idRisorsa)throws SQLException{
    	String sql = "DELETE RISORSA WHERE IDRISORSA = ?";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idRisorsa);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaColloquio(int idCandidato)throws SQLException{
    	String sql = " DELETE COLLOQUIO WHERE IDCANDIDATO = ? ";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idCandidato);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaEsito(int idSelezione)throws SQLException{
    	String sql = " DELETE ESITO WHERE IDESITO = "
    			+" (SELECT IDESITO FROM SELEZIONE WHERE IDSELEZIONE = ?)";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idSelezione);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaBatteriaTest(int idSelezione)throws SQLException{
    	String sql = "DELETE BATTERIATEST WHERE IDTEST = "
    			+ "(SELECT IDTEST FROM TESTSELEZIONE WHERE IDSELEZIONE = ?) ";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	
    	ps.setInt(1, idSelezione);
    	
    	return ps.executeUpdate();
    	
    }
    
    public int eliminaTestSelezione(int idSelezione)throws SQLException{
    	String sql = "DELETE FROM TESTSELEZIONE WHERE IDSELEZIONE = ? ";
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1, idSelezione);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaSelezione(int idSelezione)throws SQLException{
    	String sql = "DELETE FROM SELEZIONE WHERE IDSELEZIONE = ? ";
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1, idSelezione);
    	
    	return ps.executeUpdate();
    }
    
    public int eliminaPartecipa(int idSelezione)throws SQLException{
    	String sql = "DELETE FROM PARTECIPA WHERE IDSELEZIONE = ? ";
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1, idSelezione);
    	
    	return ps.executeUpdate();
    }
}
