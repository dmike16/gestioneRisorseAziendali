package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import domain.selezione.*;
import domain.anagrafica.*;

public class DBGestioneSelezione{

	public List<Anagrafica> intervalloPunteggio(int min, int max, int codBatteria) throws SQLException, ClassNotFoundException, NamingException{
		ConnessioneDb db = new ConnessioneDb();
		Connection conn = db.returnConnection();
		String sql = "SELECT a.* "
				+ "FROM Anagrafica a join AnagraficaCandidato ac on (a.idAnagraficaCandidato=ac.idAnagraficaCandidato) "
				+ "join Candidato c on (ac.idAnagraficaCandidato=c.idAnagraficaCandidato) "
				+ "join Partecipa p on(c.idCandidato = p.idCandidato) "
				+ "join Selezione s on(p.idSelezione=s.idSelezione) "
				+ "join TestSelezione ts on(s.idSelezione=ts.idSelezione) "
				+ "join Batteria b on(ts.idTest=b.idTest) "
				+ "WHERE b.punteggioBatteria between ? and ? "
				+ "and b.codiceBatteria = ?";
		PreparedStatement prepStatement = conn.prepareStatement(sql);
		prepStatement.setInt(1, min);
		prepStatement.setInt(2, max);
		prepStatement.setInt(3, codBatteria);
		ResultSet result = prepStatement.executeQuery();
		List<Anagrafica> list = new ArrayList<>();
		while(result.next()){
			Anagrafica a = new Anagrafica();
			a.setIdAnagrafica(result.getInt(1));
			a.setSesso(result.getString(2));
			a.setLuogoNascita(result.getString(3));
			a.setIdNazionalita(result.getInt(4));
			a.setCodiceFiscale(result.getString(5));
			a.setTelefono(result.getString(6));
			a.setIdIndirizzo(result.getInt(7));
			a.setIdAnagraficaCandidato(result.getInt(8));
			list.add(a);
		}
		return list;
	} 
}
