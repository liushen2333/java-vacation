package JavaVacationProjecte3.db;

import java.sql.*;
import java.util.*;

public class DBUtil {

	
		private static final String URL = "jdbc:mysql://localhost:3306/cache-demo";
		private static final String USER = "root";
		private static final String PASSWORD = "root";
		
		private static Connection conn=null;
		
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		public static Connection getConnection() {
			return conn;
		}
		
		
		public static void main(String[] args) throws Exception  {
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); 
			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select playeruser_name from 2333_user");
			
			while (rs.next()) {
				System.out.println(rs.getString("playeruser_name"));
			}
			
		}
	
}
