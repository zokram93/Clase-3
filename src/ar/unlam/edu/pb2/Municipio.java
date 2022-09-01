package ar.unlam.edu.pb2;

public class Municipio {

	private Integer numeroMunicipio;
	private String nombreMunicipio;

	public Municipio(Integer numeroMunicipio, String nombreMunicipio) {
		// TODO Auto-generated constructor stub
		this.numeroMunicipio = numeroMunicipio;
		this.nombreMunicipio = nombreMunicipio;
	}

	public Integer getNumeroMunicipio() {
		return numeroMunicipio;
	}

	public void setNumeroMunicipio(Integer numeroMunicipio) {
		this.numeroMunicipio = numeroMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

}
