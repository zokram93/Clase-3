package ar.unlam.edu.pb2;

public class Habitante {

	private String nombre;
	private String apellido;
	private Integer fechaDeNacimiento;
	private Integer edad;
	private Vivienda vivienda;
	private Integer dni;
	private TipoDeDocumento tipo;
	private Integer id = 0;
	




	public Habitante(String nombre, String apellido, Integer fechaDeNacimiento, Integer edad, Vivienda vivienda,
			Integer dni, TipoDeDocumento tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
		this.vivienda = vivienda;
		this.dni = dni;
		this.tipo = tipo;
		this.id++;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Vivienda getVivienda() {
		return vivienda;
	}


	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public TipoDeDocumento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeDocumento tipo) {
		this.tipo = tipo;
	}


	

}
