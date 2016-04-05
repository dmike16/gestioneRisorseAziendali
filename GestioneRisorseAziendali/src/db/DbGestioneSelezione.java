package db;


import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.springframework.stereotype.Service;



@Service
public class DbGestioneSelezione{

	Connection con;
	
	public DbGestioneSelezione(){
		
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

	//dato un certo corsista si ottera la descrizione delle sue potenzialita
	
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