package ar.unlam.edu.pb2;

import java.util.ArrayList;

public class Municipio {

	private Integer numeroMunicipio;
	private String nombreMunicipio;
	private ArrayList<Vivienda> viviendas;
	private Secretaria secretaria;

	public Municipio(Integer numeroMunicipio, String nombreMunicipio, Secretaria secretaria) {
		// TODO Auto-generated constructor stub
		this.numeroMunicipio = numeroMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.secretaria = secretaria;
		this.viviendas = new ArrayList<>();
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
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
	public void agregarVivienda (Vivienda nuevaVivienda) {
		this.viviendas.add(nuevaVivienda);
	}
}
