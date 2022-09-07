package ar.unlam.edu.pb2;

import java.util.ArrayList;

public class Vivienda {

	private String calle;
	private Integer numero;
	private String localidad;
	private Integer codigoPostal;
	private Integer metrosCuadradosTotales;
	private Integer metrosCuadradosEdificados;
	private Municipio municipio;
	private Integer id = 0;
	private ArrayList <Propietario> propietario;
	private ArrayList <Habitante> habitantes;
	private final Integer PORCENTAJE_POSECION_MAXIMO = 100;
	private final Integer PORCENTAJE_POSECION_MINIMO = 0;
	private Integer posecion;

	public Vivienda(String calle, Integer numero, String localidad, Integer codigoPostal,
			Integer metrosCuadradosTotales, Integer metrosCuadradosEdificados, Municipio municipio) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.metrosCuadradosTotales = metrosCuadradosTotales;
		this.metrosCuadradosEdificados = metrosCuadradosEdificados;
		this.municipio = municipio;
		this.id++;
		this.habitantes = new ArrayList <>();
		this.posecion = 0;
		this.propietario = new ArrayList<>();
	}
	public void agregarHabitante(Habitante nuevoHabitante) {
		
		habitantes.add(0,nuevoHabitante);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getMetrosCuadradosTotales() {
		return metrosCuadradosTotales;
	}

	public void setMetrosCuadradosTotales(Integer metrosCuadradosTotales) {
		this.metrosCuadradosTotales = metrosCuadradosTotales;
	}

	public Integer getMetrosCuadradosEdificados() {
		return metrosCuadradosEdificados;
	}

	public void setMetrosCuadradosEdificados(Integer metrosCuadradosEdificados) {
		this.metrosCuadradosEdificados = metrosCuadradosEdificados;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<Propietario> getPropietario() {
		return propietario;
	}

	public void setPropietario(ArrayList<Propietario> propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Habitante> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(ArrayList<Habitante> habitantes) {
		this.habitantes = habitantes;
	}

	public Integer getCantidadHabitantes() {
		return habitantes.size();
	}
	public boolean agregarPropietario (Propietario nuevoPropietario) {
		if(propietario.add(nuevoPropietario))
			return true;
		else
			return false;

	}

}
