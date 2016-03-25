import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class DBGestioneAnagraficoRisorse {

	//ultimo da inserire 
	public void inserimentoCandidato(Candidato candidato)throws SQLException{
		String sql = "INSERT INTO CANDIDATO VALUES(sequenceCandidato.nextval,?,?,?)";
		
		PreparedStatement ps = con.preparedStatement(sql);
		
		int idCv = candidato.getIdCv();
		int idAnagraficaCandidato=candidato.getIdAnagraficaCandidato();
		int idRisorsa = candidato.getIdRisorsa(); 
		
		ps.setInt(2,idCv);
		ps.setInt(3, idAnagraficaCandidato);
		
		ps.executeUpdate();
	}
	
	public void inserimentoAnagraficaCandidato(AnagraficaCandidato anag)throws SQLException{
	String sql = "INSERT INTO ANAGRAFICACANDIDATO VALUES(sequenceAnagraficaCandidato.nextval,?,?,?,?,?,sequenceIndirizzo.currval)";
	
	PreparedStatement ps = con.preparedStatement(sql);
	
	
	String nome = anag.getNome();
	String cognome = anag.getCognome();
	LocalDate dataNascita = anag.getDataNascita();
	String cellulare = anag.getCellulare();
	
	
	
	ps.setString(2, nome);
	ps.setString(3, cognome);
	ps.setDate(4, java.sql.Date.valueOf(dataNascita));
	ps.setString(5, cellulare);
	
	
	ps.executeUpdate();
	
	}
	
	public void inserimentoIndirizzo(Indirizzo indirizzo)throws SQLException{
	String sql= "INSERT INTO INDIRIZZO VALUES(sequenceIndirizzo.nextval,?,?,?,?)";
	
	PreparedStatement ps = con.preparedStatement(sql);
	String citta = indirizzo.getCitta();
	String cap = indirizzo.getCap();
	String via = indirizzo.getVia();
	String nCivico = indirizzo.getNcivico();
	
	ps.executeUpdate();
		
	}
	
	//Modifica Candidato che diventa risorsa
	public void modificaCandidato(int idCandidato)throws SQLException{
		String sql = "update candidato set idRisorsa = sequenceRisorsa.nextval where idCandidato =?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,idCandidato);
		
		ps.executeUpdate();
	}
	
	public Risorsa selectRisorsaCandidato(int idRisorsa)throws SQLException{
		String sql ="select * from risorsa where idRisorsa = ?";
		
		PreparedStatement ps = con.preparedStament(sql);
		Risorsa risorsa = null;
		ps.setInt(1,idRisorsa);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			do{
				risorsa= new Risorsa();
				risorsa.setIdTirocinio(rs.getString(2));
				risorsa.setIdAnagrafica(rs.getInt(3));
			}while(rs.next());
		}
		return risorsa;
			
		
		
	}
	
	
	public int modificaIndirizzo(Indirizzo indirizzo)throws SQLException{
		String sql = "update Indirizzo set citta=?,cap=?,via=?,nCivico=?  where idIndirizzo=?";
		
		Indirizzo iniz = ricercaIndirizzo(indirizzo.getIdIndirizzo());
		if(iniz != null){
			PreparedStatement ps = con.preparedStatement(sql);
			ps.setString(1,indirizzo.getCitta()== null ? iniz.getCitta() : indirizzo.getCitta());
			ps.setString(2,indirizzo.getCap()== null ? iniz.getCap() : indirizzo.getCap());
			ps.setString(1,indirizzo.getVia()== null ? iniz.getVia() : indirizzo.getVia());
			ps.setString(1,indirizzo.getNcivico()== null ? iniz.getNcivico() : indirizzo.getNcivico());
			
			return ps.executeUpdate();
		}else{
			return 0;
		}
		
	}
	
	public int modificaAnagrafica(AnagraficaCandidato anagraficaCandidato)throws SQLException{
		String sql = "update AnagraficaCandidato set cellulare=?, email=?, titolodiStudi=? where idAnagraficaCandidato=?";
		
		anagraficaCandidato iniz = ricercaAnagraficoCandidato(anagraficaCandidato.getIdAnagraficaCandidato());
		
		if(iniz=!null){
			PreparedStatement ps = con.preparedStatement(sql);
			ps.setString(1,anagraficaCandidato.getCellulare()==null ? iniz.getCellulare() : anagraficaCandidato.getCellulare());
			ps.setString(2, anagraficaCandidato.getEmail()==null ? iniz.getEmail() : anagraficaCandidato.getEmail());
			ps.setString(1,anagraficaCandidato.getTitoloDiStudi()== null ? iniz.getTitoloDiStudi(): anagraficaCandidato.getTitoloDiStudi());
			
			return ps.executeUpdate();
		}else{
			return 0;
			
		}
	}
	
	

}
