package CRS0515Bases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Prog?autoReconnect=true&useSSL=false", "root", "1234");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from Cosas");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}