package kr.co.controller;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class aTest {
	
	   private static final String DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	   private static final String URL = "jdbc:log4jdbc:oracle:thin:@localhost:1521:XE";
	   private static final String username = "board_table0";
	   private static final String password = "123";

	   @Test
	   public void testConnection() throws Exception {
	      Class.forName(DRIVER);
	      try {
	         Connection connection = DriverManager.getConnection(URL, username, password);
	         System.out.println(connection);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

}
