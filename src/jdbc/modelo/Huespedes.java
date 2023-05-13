package jdbc.modelo;

public class Huespedes {
	
	private Integer id;
	private String Nombre;
	private String Apellido;
	private String FechaDeNacimiento;
	private String Nacionalidad;
	private Integer Telefono;
	private Integer idReserva;
	
	
	
	public Huespedes(Integer id, String nombre, String apellido, String fechaDeNacimiento, String nacionalidad,
			Integer telefono, Integer idReserva) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
		FechaDeNacimiento = fechaDeNacimiento;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		this.idReserva = idReserva;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public Integer getTelefono() {
		return Telefono;
	}
	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	
	

}
