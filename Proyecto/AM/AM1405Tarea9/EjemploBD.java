package AM1405Tarea9;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
public class EjemploBD {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/pau?serverTimezone=UTC","root","dorian123alexandro456");  
				
			Statement stmt=con.createStatement();  
	
			ResultSet rs=stmt.executeQuery("select * from persona");				
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			con.close();  
		} catch(Exception e){
			System.out.println(e);
		}  
	}
}

