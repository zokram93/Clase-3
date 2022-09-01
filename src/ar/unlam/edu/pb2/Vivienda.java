package ar.unlam.edu.pb2;

public class Vivienda {

	private String calle;
	private Integer altura;
	private Municipio municipio;

	public Vivienda(String calle, Integer altura, Municipio municipio) {
		// TODO Auto-generated constructor stub
		this.calle = calle;
		this.altura = altura;
		this.municipio = municipio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}
