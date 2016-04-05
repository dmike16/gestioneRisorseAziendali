package db;

import db.ConnessioneDb;
import java.sql.*;
import java.util.ArrayList;




public class DbGestioneSelezione{

	ConnessioneDb db = new ConnessioneDb(); 
	Connection con=db.getConnection();

	/**
	 * dato un testPreselettivo si otterra un elenco di tutte le risorse che lo hanno fatto 
	 * con il relativo punteggio
	 * @param test
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> selectNomeCognomeTestPreselettivo (String test)throws SQLException{
		ArrayList<String> list= new ArrayList<>();

		String sql =" select nome ,cognome ,bt.punteggio from AnagraficaCandidato a ,"
				+ " Candidato c , Partecipa p ,Selezione s ,testSelezione t ,"
				+ " batteriaTest bt ,batteria bat "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
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
	
	/**
	 * dato un corsista si ottera l'elenco di batterie di test da lui effettuate con i relativi punteggi
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> selectNomeCognomeBatterieEPunteggio(String nome,String cognome)throws SQLException{
		ArrayList<String> list= new ArrayList<>();
		String sql =" select nome ,cognome ,bat.tipo,bt.punteggio from AnagraficaCandidato a ,"
				+ " Candidato c , Partecipa p ,Selezione s ,testSelezione t ,"
				+ " batteriaTest bt ,batteria bat "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
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
	
	/**
	 * dato un intervall odi punteggio e una certa batteria si otterrà un elenco con le risorse che hanno ottenuto 
	 * un valore che rientri nell'intervallo ,estremi inclusi
	 * @param max
	 * @param min
	 * @param batteria
	 * @return
	 * @throws SQLException
	 */
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
	
	/**
	 * dato un certo corsista si ottera la descrizione delle valutazioni fatte in fase di colloquio
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */
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


	/**
	 * dato un certo corsista si ottera la descrizione delle sue potenzialita
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */

	public ArrayList<String> selectNomeCognomePotenzialita(String nome,String cognome)throws SQLException{
		ArrayList<String> s= new ArrayList<>();
		String sql = "select nome,cognome,dataNascita,email , potenzialita from AnagraficaCandidato a,Candidato c, "
				+ " Partecipa p, Selezione s, Colloquio cl "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
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

	/**
	 * dato un corsista si otterraa la descrizione del suo profilo caratteriale
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> selectNomeCognomeProfiloCaratteriale(String nome,String cognome)throws SQLException{
		ArrayList<String> s= new ArrayList<>();

		String sql = "select nome,cognome,dataNascita,email ,profiloCaratteriale from AnagraficaCandidato a,Candidato c, "
				+ " Partecipa p, Selezione s, Colloquio cl "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idCandidato = p.idCandidato and p.idSelezione = s.idSelezione and "
				+ " s.idSelezione = cl.idSelezione and "
				+ " a.nome = ? and a.cognome = ? " ;

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);

		ResultSet result =prep.executeQuery(); 
		while(result.next()){

			s.add( "nome: "+result.getString(1)+" "+
					"cognome: "+result.getString(2)+" "+
					"data Nascita: "+result.getString(3)+" "+
					"email: "+result.getString(4)+" "+
					"profilo Caratteriale: "+result.getString(5));
			System.out.println(s.toString());
		}
		return s;

	}


	/**
	 * dato un modulo visualizza l'elenco di candidati ammessi e non di un determinato modulo
	 * @param modulo
	 * @return ArrayList<String>
	 * @throws SQLException
	 */
	public ArrayList<String> selectModuloAmmesso(String modulo)throws SQLException{
		ArrayList<String> list = new ArrayList<>();

		String sql=" select nome ,cognome ,nomeModulo, esito, valutazione from anagraficaCandidato Candidato c ,Risorsa r , Risultato ris , Modulo m "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idAnagraficaCandidato = r.idAnagrafica and "
				+ " r.idRisorsa = ris.idRisorsa and "
				+ " ris.idModulo = m.idModulo and "  
				+ "  where nomeModulo = ?";

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, modulo);

		ResultSet result =prep.executeQuery(); 	
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
					"cognome: "+result.getString(2)+" "+
					"nomeModulo: "+result.getString(3)+" "+
					"esito: "+result.getString(4)+" "+
					"valutazione: "+result.getString(5));
		}

		return list;
	}

	/**
	 * visualizza l'elenco di candidati non ammessi di un determinato modulo
	 * @param modulo
	 * @return ArrayList<String>
	 * @throws SQLException
	 */
	public ArrayList<String> selectModuloNonAmmesso(String modulo )throws SQLException{
		ArrayList<String> list = new ArrayList<>();

		String sql=" select nome ,cognome ,nomeModulo, esito ,valutazione from anagraficaCandidato Candidato c ,Risorsa r , Risultato ris , Modulo m "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idAnagraficaCandidato = r.idAnagrafica and "
				+ " r.idRisorsa = ris.idRisorsa and "
				+ " ris.idModulo = m.idModulo and "  
				+ "  where nomeModulo = ? and esito = 'Non ammesso'";

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, modulo);

		ResultSet result =prep.executeQuery(); 	
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
					"cognome: "+result.getString(2)+" "+
					"nomeModulo: "+result.getString(3)+" "+
					"esito: "+result.getString(4)+" "+
					"valutazione: "+result.getString(5));
		}
		return list;
	}
	
	
	/**
	 * dato un corsista ritorna l'elenco dei moduli con relative valutazioni finali
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> selectNomeCognomeElencoModuli(String nome,String cognome)throws SQLException{

		ArrayList<String> list = new ArrayList<>();

		String sql="select nome,cognome,nomeModulo,valutazione from  anagraficaCandidato a ,"
				+ "Candidato c ,Risorsa r , Risultato ris , Modulo m "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
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
	
	
	/**
	 * dato un modulo e un punteggio si otterrà una lista con nome e cognome dei corsisti
	 * con quel punteggio in quel determinato modulo
	 * @param modulo
	 * @param punteggio
	 * @return ArrayList<String>
	 * @throws SQLException
	 */
	public ArrayList<String> selectModuloPunteggio(String modulo,int punteggio )throws SQLException{
		ArrayList<String> list = new ArrayList<>();

		String sql=" select nome ,cognome ,nomeModulo,punteggio from anagraficaCandidato Candidato c ,Risorsa r , Risultato ris , Modulo m "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idAnagraficaCandidato = r.idAnagrafica and "
				+ " r.idRisorsa = ris.idRisorsa and "
				+ " ris.idModulo = m.idModulo and "  
				+ "  where nomeModulo = ? and punteggio = ? ";

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, modulo);
		prep.setInt(2, punteggio);

		ResultSet result =prep.executeQuery(); 	
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
					"cognome: "+result.getString(2)+" "+
					"nomeModulo: "+result.getString(3)+" "+
					"punteggio: "+result.getString(4));
					
		}
		return list;
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<String> selectNomeCognomeModuloValutazioni(String nome,String cognome,String modulo)throws SQLException{

		ArrayList<String> list = new ArrayList<>();

		String sql="select nome,cognome,nomeModulo,valutazione from  anagraficaCandidato a ,"
				+ "Candidato c ,Risorsa r , Risultato ris , Modulo m "
				+ " where a.idAnagraficaCandidato = c.idAnagrafica and "
				+ " c.idAnagraficaCandidato = r.idAnagrafica and "
				+ " r.idRisorsa = ris.idRisorsa and "
				+ " ris.idModulo = m.idModulo and "  
				+ "  where nome = ? and cognome = ? and nomeModulo = ? ";

		PreparedStatement prep = con.prepareStatement(sql);
		prep.setString(1, nome);
		prep.setString(2, cognome);
		prep.setString(3, modulo);
		ResultSet result =prep.executeQuery(); 	
		while(result.next()){

			list.add( "nome: "+result.getString(1)+" "+
					"cognome: "+result.getString(2)+" "+
					"nomeModulo: "+result.getString(3)+" "+
					"valutazioni: "+result.getString(4));
		}
		return list;
	}
	
	 

	 



}