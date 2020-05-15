package VGL1505Bases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejemplo {
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/chiikibriki?serverTimezone=UTC","root","");  
				
			Statement stmt=con.createStatement();  
	
			ResultSet rs=stmt.executeQuery("select * from top");				
			while(rs.next()) {
				System.out.println("campeon: " + rs.getString(1)+" tier: "+rs.getInt(2)+"  skill: "+rs.getString(3));
			}
			con.close();  
		} catch(Exception e){
			System.out.println(e);
		}  
	}
}