package jdbc.dao;

import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class ReservaDAO {

	public void conectar() {
		String db = "hotelDB";
		String user = "root";
		String password = "alura123";
		String host = "localhost";
		String puerto = "8080";
		String driver = "com.mysql.jdbc.Driver";
		String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + db;
		
		Connection conexion = null;
		
		
		try {
			Class.forName(driver);
			DriverManager.getConnection(conexionUrl, user, password);		
			
			String sql = "INSERT....";
			Statement statement = conexion.createStatement();
			statement.execute(sql);
			
			
		} catch (Exception ex) {
			Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	
		
	
	
	}
	
}
