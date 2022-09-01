package ar.unlam.edu.pb2;

import java.util.ArrayList;

public class Secretaria {
	private String nombre;
	private ArrayList <Habitante> habitantes;

	 
	public Secretaria (String nombre){
		this.nombre = nombre;
		this.habitantes =  new ArrayList <Habitante>();
	}

	public ArrayList<Habitante> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(ArrayList<Habitante> habitantes) {
		this.habitantes = habitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarHabitante(Habitante nuevoHabitante) {
		// TODO Auto-generated method stub
		habitantes.add(nuevoHabitante);
		
	}

	public Integer getCantidadHabitantes() {
		// TODO Auto-generated method stub
		return habitantes.size();
	}
}
