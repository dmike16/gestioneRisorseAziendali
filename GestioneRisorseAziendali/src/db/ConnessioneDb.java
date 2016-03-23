package db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnessioneDb {
	private Connection con;

    public ConnessioneDb() throws ClassNotFoundException, SQLException, NamingException {
        establishConnection();
    }

    // method used to establish connection with database
    private void establishConnection() {

    	try {
    		Context initContext = new InitialContext();
    		Context envContext = (Context) initContext.lookup("java:comp/env");
    		DataSource ds = (DataSource) envContext.lookup("jdbc/hrakt");
    		con = ds.getConnection();
    	} catch (SQLException e) {
    		System.out.println("SQLException "+e);
    	} catch (NamingException e) {
    		System.out.println("NamingException "+e);
    	}

    }
}
