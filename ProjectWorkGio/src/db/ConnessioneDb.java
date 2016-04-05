package db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class ConnessioneDb {
	private Connection con;

    public ConnessioneDb() {
    	try
    	{
    		establishConnection();
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	catch(NamingException n)
    	{
    		n.printStackTrace();
    	}
    }

    // method used to establish connection with database
    private void establishConnection() throws SQLException, NamingException{

    		Context initContext = new InitialContext();
    		Context envContext = (Context) initContext.lookup("java:comp/env");
    		DataSource ds = (DataSource) envContext.lookup("jdbc/hrakt");
    		con = ds.getConnection();
    		Log logger = LogFactory.getLog(ConnessioneDb.class);
    }
    
    public Connection getConnection()
    {
    	return con;
    }
}
