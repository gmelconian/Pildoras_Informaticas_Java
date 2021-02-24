package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dominio.Vehiculo;

public class Auto {

	public static void seleccionarTodos() {
		String sql = "SELECT marca, vin, modelo, motor, ruedas, aire_acondicionado, asientos_cuero FROM autos";

		try {
			
			Statement stmt = BaseDeDatos.conectar().createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getString("marca") + "\t\t");
				System.out.print(rs.getString("modelo") + "\t\t");
				System.out
						.print(rs.getString("vin") + "\t" + rs.getInt("motor") + "\t\t" + rs.getInt("ruedas") + "\t\t");
				System.out.print(rs.getBoolean("aire_acondicionado") + "\t\t");
				System.out.println(rs.getBoolean("asientos_cuero"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			BaseDeDatos.desconectar();
		}

	}

	public static void agregar_auto(Vehiculo a) {
		String sql = "INSERT INTO autos (marca, modelo, vin, motor, ruedas, aire_acondicionado, asientos_cuero) VALUES(?,?,?,?,?,?,?)";

		try {
			
			PreparedStatement pstmt = BaseDeDatos.conectar().prepareStatement(sql);
			pstmt.setString(1, a.get_marca());
			pstmt.setString(2, a.get_modelo());
			pstmt.setString(3, a.get_vinNumber());
			pstmt.setInt(4, a.getCc_motor());
			pstmt.setInt(5, a.getRuedas());
			if (a.get_tieneAA()) {
				pstmt.setInt(6, 1);
			} else {
				pstmt.setInt(6, 0);
			}
			if (a.get_tieneAsientosDeCuero()) {
				pstmt.setInt(7, 1);
			} else {
				pstmt.setInt(7, 0);
			}

			pstmt.executeUpdate();
			System.out.println("Se agrego correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			BaseDeDatos.desconectar();
		}

	}
}
