package ar.unlam.edu.pb2;

public class Propietario {

	private String nombre;
	private Integer portangeDePosecion;
	
	public Propietario(String nombre, Integer portangeDePosecion) {
		this.nombre = nombre;
		this.portangeDePosecion = portangeDePosecion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPortangeDePosecion() {
		return portangeDePosecion;
	}

	public void setPortangeDePosecion(Integer portangeDePosecion) {
		this.portangeDePosecion = portangeDePosecion;
	}
	
}
