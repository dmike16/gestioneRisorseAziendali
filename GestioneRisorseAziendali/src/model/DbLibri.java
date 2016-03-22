package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


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
	
	private Connection conn;
}
