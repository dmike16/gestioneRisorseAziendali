package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import domain.anagrafica.AnagraficaCandidato;
import domain.corso.Ricerca;


public class DbLibri {
	public DbLibri() throws NamingException, SQLException{
		Context init = new InitialContext();
		Context env = (Context) init.lookup("java:comp/env");
		DataSource jdbc = (DataSource) env.lookup("jdbc/hr");
		conn = jdbc.getConnection();
	}
	
	public List<Libri> listAll() throws SQLException{
		List<Libri> libri = new ArrayList<>();
		
		String sql = "select * from libri";
		Statement stmt = conn.createStatement();
		ResultSet rslt = stmt.executeQuery(sql);
		
		while(rslt.next()){
			Libri l = new Libri();
			
			l.setId(rslt.getString(1));
			l.setTitolo(rslt.getString(2));
			l.setAutore(rslt.getString(3));
			l.setPrezzo(rslt.getFloat(4));
			
			libri.add(l);
		}
		
		return libri;
	}
	
	public List<AnagraficaCandidato> cercaPerNomeCognome(Ricerca sch) throws SQLException
	{
		List<AnagraficaCandidato> risultati = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try{
			String sql = "SELECT nome, cognome, cellulare, email FROM AnagraficaCandidato\n"+
					"WHERE nome like ? and cognome like ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, 
					((sch.getNome().isEmpty())? "%":sch.getNome().toLowerCase()+"%"));
			pstmt.setString(2, 
				((sch.getCognome().isEmpty())? "%":sch.getCognome().toLowerCase()+"%"));
			
			rslt = pstmt.executeQuery();
			
			while(rslt.next()){
				AnagraficaCandidato ag = new AnagraficaCandidato();
				
				ag.setNome(rslt.getString(1));
				ag.setCognome(rslt.getString(2));
				ag.setCellulare(rslt.getString(3));
				ag.setEmail(rslt.getString(4));
				
				risultati.add(ag);
			}
			
			
		}finally{
			if(pstmt != null){
				if(rslt != null){
					rslt.close();
				}
				pstmt.close();
			}
		}
		
		
		return risultati;
	}
	private Connection conn;
}
