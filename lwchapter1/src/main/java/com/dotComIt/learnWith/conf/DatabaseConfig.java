/**
 * 
 */
package com.dotComIt.learnWith.conf;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Slhabdou
 *
 */
public class DatabaseConfig {

	String host = "localhost";
	String port = "5432";
	String database = "LearnWithApp";
	String username = "LearnWithUser";
	String password = "architect";

	Connection connection = null;

	public Connection opConnection() {

		if (connection != null) {
			return connection;
		}
		String connectionString = host + ":" + port + ";" + "database=" + database + ";" + "user=" + username + ";"
				+ "password=" + password + ";";

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(connectionString);
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return connection;
		
	}

	public void closeConnection(){
		try { connection.close(); } catch(Exception e) {}
	}
	
	

}
