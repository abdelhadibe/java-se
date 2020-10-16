package com.aelion.database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;


public class MySqlConnect {
	private static Connection dbInstance;
	
	private HashMap<String, String> credentials = new HashMap<String, String>();
	/**
	 * Singleton pattern
	 * Le constructeur est privé :
	 * On ne peut pas faire un new MySqlConnect ailleurs que
	 * dans la classe MySqlConnect
	 * @throws SQLException 
	 */
	private MySqlConnect() throws SQLException {
		this.credentials.put("host", "127.0.0.1");
		this.credentials.put("port", "3306");
		this.credentials.put("user", "root");
		this.credentials.put("password", "root");
		this.credentials.put("dbName", "my_test");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			MySqlConnect.dbInstance = DriverManager.getConnection(  
				"jdbc:mysql://" + this.credentials.get("host") + ":" + this.credentials.get("port") + 
				"/" + this.credentials.get("dbName"), 
				this.credentials.get("user"), 
				this.credentials.get("password")
			);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static Connection getInstance() {
		if (MySqlConnect.dbInstance == null) {
			try {
				new MySqlConnect();
				System.out.println("I'm connected to mysql server");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return MySqlConnect.dbInstance;
	}
}
