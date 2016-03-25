package service;




import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Service;



import service.ConnessioneService;

@Service
public class DbGestioneSelezione implements ConnessioneService{

	private Connection con;

	public DbGestioneSelezione() throws ClassNotFoundException, SQLException, NamingException {
		establishConnection();
	}

	// method used to establish connection with database
	private void establishConnection() {

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/hrdb");
			con = ds.getConnection();
		} catch (SQLException e) {
			System.out.println("SQLException "+e);
		} catch (NamingException e) {
			System.out.println("NamingException "+e);
		}
	}

	

	//dato un certo corsista si ottera la descrizione delle sue potenzialita
	@Override
	public ArrayList<String> selectNomeCognomePotenzialita(String nome,String cognome)throws SQLException{
		ArrayList<String> s= new ArrayList<>();
		String sql = "select nome,cognome,dataNascita,email , potenzialita from AnagraficaCandidato a,Candidato c, "
				+ " Partecipa p, Selezione s, Colloquio cl "
				+ " where a.idAnagraficaCandidato = c.idAnagraficaCandidato and "
				+ " c.idCandidato = p.idCandidato and p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = cl.idSelezione and "
				+ " a.nome = ? and a.cognome = ? " ;
		
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);

		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			s .add( "nome: "+result.getString(1)+" "+
			 "cognome: "+result.getString(2)+" "+
			"data Nascita: "+result.getString(3)+" "+
			"email: "+result.getString(4)+" "+
			 "potenzialita"+result.getString(5));
			
		}
		return s;

	}
	@Override
	public ArrayList<String> selectNomeCognomeProfiloCaratteriale(String nome,String cognome)throws SQLException{
		ArrayList<String> s= new ArrayList<>();

		String sql = "select nome,cognome,dataNascita,email ,profiloCaratteriale from AnagraficaCandidato a,Candidato c, "
				+ " Partecipa p, Selezione s, Colloquio cl "
				+ " where a.idAnagraficaCandidato = c.idAnagraficaCandidato and "
				+ " c.idCandidato = p.idCandidato and p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = cl.idSelezione and "
				+ " a.nome = ? and a.cognome = ? " ;

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);

		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			s .add( "nome: "+result.getString(1)+" "+
					 "cognome: "+result.getString(2)+" "+
					"data Nascita: "+result.getString(3)+" "+
					"email: "+result.getString(4)+" "+
					"profilo Caratteriale: "+result.getString(5));
		}
		return s;

	}
	
	
		


}