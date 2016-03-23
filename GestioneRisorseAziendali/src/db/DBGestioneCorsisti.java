package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.corso.*;
import domain.RicercaScelta;

public class DBGestioneCorsisti{

	public ArrayList<Risorsa> selectNomeCognomeCorsistiStudi(RicercaScelta ricercaScelta) throws SQLexception
	{
		ArrayList<Risorsa> listaRisorse = new ArrayList<Risorsa>();
		ConnessioneDb db = new ConnessioneDb();
		Connection conn = db.returnConnection();
		if(ricercaScelta.getScelta().equals("studi"))
		{
			String sql="select f.*"
					+ "from risorsa r, anagrfica a,anagraficacandidato ac ,candidato c, cv , formazione f"
					+ "where r.idAnagrafica=a.idAnagrafica and a.idAnagraficaCandidato=ac.idAnagraficaCandidato"
					+ "and ac.nome=? and ac.cognome=? and c.idRisorsa=r.idRisorsa and cv.idCV=c.idCV and"
					+ "cv.idDV=f.idCV"
					+ "order by f.dataInizio asc";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,ricercaScelta.getNome());
			statement.setString(2,ricercaScelta.getCognome());
			ResultSet resultSet = statement.executeQuery();
			
		}
		else
		if(ricercaScelta.getScelta().equals("lavoro"))
		{
			
		}
		else
		if(ricercaScelta.getScelta().equals("certificazioni"))
		{
			
		}
		else
		if(ricercaScelta.getScelta().equals("corsi"))
		{
			
		}
		
		
		
	} 
}
