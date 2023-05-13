package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotelalura?useTime");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("aluraLatam1234");
		
		this.dataSource = comboPooledDataSource;	
	}
	
	public Connection recuperarConexion() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}