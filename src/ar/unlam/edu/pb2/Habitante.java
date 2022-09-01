package ar.unlam.edu.pb2;

public class Habitante {

	private String nombre;
	private Vivienda vivienda;
	private Integer dni;

	public Habitante(String nombre, Vivienda vivienda, Integer dni) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.vivienda = vivienda;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

}
