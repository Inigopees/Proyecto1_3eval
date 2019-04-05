package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	
	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
}
