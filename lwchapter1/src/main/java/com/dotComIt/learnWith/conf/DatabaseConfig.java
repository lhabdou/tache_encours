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

	String host = "jdbc:postgresql://localhost";
	String port = "5432";
	String database = "LearnWithApp";
	String username = "LearnWithUser";
	String password = "architect";

	Connection connection = null;

	public Connection opConnection() {

		if (connection != null) {
			return connection;
		}
		String connectionString = host + ":" + port + "/"+  database;

		try {
			Class.forName("org.postgresql.Driver");
			
			return DriverManager.getConnection(connectionString, username, password);
			
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			
		}
		
		return connection;
		
	}

	public void closeConnection(){
		try { connection.close(); } catch(Exception e) {}
	}
	
	

}
