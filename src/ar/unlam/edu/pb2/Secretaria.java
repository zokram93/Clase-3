package ar.unlam.edu.pb2;

import java.util.ArrayList;

public class Secretaria {
	private String nombre;
	private ArrayList<Municipio> municipio;
	private ArrayList<Vivienda> vivienda;
	private ArrayList<Habitante> habitantes;

	public Secretaria(String nombre) {
		this.nombre = nombre;
		this.municipio = new ArrayList<>();
		this.vivienda = new ArrayList<>();
		this.habitantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Municipio> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(ArrayList<Municipio> municipio) {
		this.municipio = municipio;
	}

	public boolean agregarMunicipio(Municipio nuevoMunicipio) {
		if (municipio.add(nuevoMunicipio))
			return true;
		else
			return false;
	}

	public boolean agregarHabitante(Habitante nuevoHabitante) {
		if (habitantes.add(nuevoHabitante))
			return true;
		else
			return false;
	}

	public void agregarVivienda(Municipio nuevoMunicipio, Vivienda nuevaVivienda) {
		nuevoMunicipio.agregarVivienda(nuevaVivienda);

	}

	public Integer cantidadDeHabitantesEnUnMunicipio(Municipio nuevoMunicipio) {
		Integer contadorDeHabitantes = 0;
		for (int i = 0; i < nuevoMunicipio.getViviendas().size(); i++) {
			if (nuevoMunicipio.getViviendas().get(i)!= null) {
				for (int j = 0; j < nuevoMunicipio.getViviendas().get(i).getHabitantes().size(); j++) {
					if (nuevoMunicipio.getViviendas().get(i).getHabitantes().get(j)!= null) {
					contadorDeHabitantes++;
					}
				}
				
			}

		}
		return contadorDeHabitantes;
	}

	public Integer cantidadDeViviendasEnElMunicipio(Municipio nuevoMunicipio) {
			Integer contadorDeViviendas = nuevoMunicipio.getViviendas().size();
			return contadorDeViviendas;
		
	}

}
