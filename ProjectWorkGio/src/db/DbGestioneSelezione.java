package db;

import db.ConnessioneDb;
import java.sql.*;
import java.util.ArrayList;


public class DbGestioneSelezione{

	private ConnessioneDb db = new ConnessioneDb();
	private Connection con=db.getConnection();
	

	public ArrayList<String> selectNomeCognomeTestPreselettivo (String test)throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		
		String sql =" select nome ,cognome ,bt.punteggio from AnagraficaCandidato a ,"
				+ " Candidato c , Partecipa p ,Selezione s ,testSelezione t ,"
				+ " batteriaTest bt ,batteria bat "
				+ " where a.idAnagraficaCandidato = c.idAnagraficaCandidato and "
				+ " c.idCandidato = p.idCandidato and "
				+ " p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = bt.idSelezione and "
				+ " t.idTest = b.idTest and "
				+ " bt.codiceBatteria = bat.codiceBatteria and "
				+ " b.tipo = ? ";
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, test);
		
		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
			 "cognome: "+result.getString(2)+" "+
			"Punteggio: "+result.getInt(3));
		}
		return list;
	}
	
	public ArrayList<String> selectNomeCognomeBatterieEPunteggio(String nome,String cognome)throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		String sql =" select nome ,cognome ,bat.tipo,bt.punteggio from AnagraficaCandidato a ,"
				+ " Candidato c , Partecipa p ,Selezione s ,testSelezione t ,"
				+ " batteriaTest bt ,batteria bat "
				+ " where a.idAnagraficaCandidato = c.idAnagraficaCandidato and "
				+ " c.idCandidato = p.idCandidato and "
				+ " p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = t.idSelezione and "
				+ " t.idTest = bt.idTest and "
				+ " bt.codiceBatteria = bat.codiceBatteria and "
				+ " a.nome = ? and a.cognome = ?";
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);

		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
			 "cognome: "+result.getString(2)+" "+
			"tipo: "+result.getString(3)+" "+
			"punteggio: "+result.getInt(4));
			
		}

		return list;
	}
	public ArrayList<String> selectIntervalloMaxMinBatteria(int max , int min , String batteria )throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		
		String sql =" select nome,cognome,bat.tipo,bt.punteggio from anagraficaCandidato a , "
				+ " Candidato c , Partecipa p ,Selezione s ,testSelezione t ,"
				+ " batteriaTest bt ,batteria bat "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idCandidato = p.idCandidato and "
				+ " p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = t.idSelezione and "
				+ " t.idTest = bt.idTest and "
				+ " bt.codiceBatteria = bat.codiceBatteria and "
				+ " punteggio between ? and ? and bat.tipo = ? ";
		
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setInt(1, max);
		prep.setInt(2, min);
		prep.setString(3,batteria);
		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
			 "cognome: "+result.getString(2)+" "+
			"tipoBatteria: "+result.getString(3)+" "+
			"punteggio: "+result.getInt(4));	
		}
		return list;
	}
	public ArrayList<String> selectValutazioniColloquio (String nome,String cognome)throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		
		String sql ="select from nome ,cognome ,valutazioneFinale,osservazioni from  "
				+ " anagraficaCandidato a , Candidato c , Partecipa p ,Selezione s , "
				+ " colloquio cl "
				+ "where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idCandidato = p.idCandidato and "
				+ " p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = cl.idSelezione and "
				+ " nome = ? and cognome = ?";
		
		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);

		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
			 "cognome: "+result.getString(2)+" "+
			"valutazione Finale: "+result.getString(3)+" "+
			 "osservazioni"+result.getString(4));
		}
		
		return list;
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
	

	/**
	 * visualizza l'elenco di candidati ammessi e non di un determinato modulo
	 * @param modulo
	 * @return ArrayList<String>
	 * @throws SQLException
	 */
	public ArrayList<String> selectModuloAmmessoE(String modulo)throws SQLException{
		ArrayList<String> list = new ArrayList<>();
		
		String sql=" select ammessi , nonAmmessi from ";
		return list;
	}
	public ArrayList<String> selectNomeCognomeElencoModuli(String nome,String cognome)throws SQLException{
	
		 ArrayList<String> list = new ArrayList<>();
		 
		 String sql="select nome,cognome,nomeModulo,valutazione from  anagraficaCandidato a ,"
		 		+ "Candidato c ,Risorsa r , Risultato ris , Modulo m "
		 		+ " where a.idAnagraficaCandidato = c.idAnagraficaCandidato and "
		 		+ " c.idAnagraficaCandidato = r.idAnagrafica and "
		 		+ " r.idRisorsa = ris.idRisorsa and "
		 		+ " ris.idModulo = m.idModulo and "  
		 		+ "  where nome = ? and cognome = ? ";
		 
		 PreparedStatement prep = con.prepareStatement(sql);
		 prep.setString(1, nome);
			prep.setString(2, cognome);
			ResultSet result =prep.executeQuery(); 	
			while(result.next()){

				list.add( "nome: "+result.getString(1)+" "+
						 "cognome: "+result.getString(2)+" "+
						"nomeModulo: "+result.getString(3)+" "+
						"valutazione: "+result.getString(4));
			}
		 return list;
	}
		
	
		


}