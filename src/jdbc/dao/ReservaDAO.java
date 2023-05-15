package jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import jdbc.modelo.Reserva;

public class ReservaDAO {
	
	private Connection connection;
		
	public ReservaDAO(Connection connection) {
		this.connection = connection;  	
	}
	
	public void guardar(Reserva reserva) {
		
	}
	
	//video
	public List<Reserva> buscar() {
		List<Reserva> reservas = new ArrayList<Reserva>();
		try {
			String sql = "SELECT id, fecha_entrada,  fecha_salida, valor, formaPago FROM reservas";
			
			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.execute();
				
				transformarResultSetEnReserva(reservas, pstm);
			}
			return reservas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//video	
	public List<Reserva> buscarId(String id) {
		return null;
			
	}
		
	//video
	public void Eliminar(Integer id) {
		
	}
	//video
	public void Actualizar(Date FechaE, Date FechaS, String valor, String formaPago, Integer id) {
		
	}
	
	//video
	private void transformarResultSetEnReserva(List<Reserva> reservas, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Reserva reserva = new Reserva(rst.getInt(1), rst.getDate(2), rst.getDate(3), rst.getString(4), rst.getString(5));
				reservas.add(reserva);
			}
		}
		
	}
}

/*
 * public void conectar() { String db = "hotelDB"; String user = "root"; String
 * password = "alura123"; String host = "localhost"; String puerto = "8080";
 * String driver = "com.mysql.jdbc.Driver"; String conexionUrl = "jdbc:mysql://"
 * + host + ":" + puerto + "/" + db;
 * 
 * Connection conexion = null;
 * 
 * 
 * try { Class.forName(driver); DriverManager.getConnection(conexionUrl, user,
 * password);
 * 
 * String sql = "INSERT...."; Statement statement = conexion.createStatement();
 * statement.execute(sql);
 * 
 * 
 * } catch (Exception ex) { Logger.getLogger(ReservaDAO.class.getName()).log(
 * null); }
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */
