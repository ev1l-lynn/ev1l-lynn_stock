package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.CustomerException;

public class OracleConnection {
	private Connection con;
	
	public OracleConnection() throws CustomerException
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			open();
		} catch (ClassNotFoundException e) {
			throw new CustomerException("Could not find database driver!");
		}
	}
	
	public void open() throws CustomerException
	{
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL", "demo", "oracle");
		} catch (SQLException e) {
			throw new CustomerException("Could not open database connection!");
		}
	}
	
	public void close() throws CustomerException
	{
		try {
			con.close();
		} catch (SQLException e) {
			throw new CustomerException("Could not close database connection!");
		}
	}
	
	public Connection getConnection()
	{
		return con;
	}
}
