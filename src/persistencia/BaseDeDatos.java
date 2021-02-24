package persistencia;

import java.sql.*;

public class BaseDeDatos {
	static String url = "";
	static Connection con = null;

	public static Connection conectar() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://127.0.0.1:3306/automotora";
			con = DriverManager.getConnection(url, "root", "1234");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Problema de conexion");
			System.out.println(e.getMessage());

		}
		return con;
	}

	public static void desconectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://127.0.0.1:3306/automotora";
			con = DriverManager.getConnection(url, "root", "1234");
			con.close();

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Problema de desconexion");

		}
	}

}
