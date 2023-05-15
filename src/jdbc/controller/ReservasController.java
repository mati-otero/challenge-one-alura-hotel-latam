package jdbc.controller;

import java.sql.Connection;
import java.util.List;
import jdbc.dao.ReservaDAO;
import jdbc.factory.ConnectionFactory;
import jdbc.modelo.Reserva;

public class ReservasController {
	private ReservaDAO reservaDAO;
	
public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexion();
		this.reservaDAO = new ReservaDAO(connection);
	}

	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}
	public List<Reserva> buscar() {
		return this.reservaDAO.buscar();
	}
	public List<Reserva> buscarId(String id) {
		return this.reservaDAO.buscarId(id);
	}

}
