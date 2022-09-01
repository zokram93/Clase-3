package ar.unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSecretaria {

	@Test
	public void queSePuedaCrearUnaSecretaria () {
		Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
		assertNotNull(nuevaSecretaria);
		
	}
	
	@Test
	public void queSePuedaAgregarUnHabitanteALaSecretaria( ) {
		String nombre = "Juan";
		String calle = "F. Varela";
		Integer altura = 1542;
		Integer numeroMunicipio = 1;
		String nombreMunicipio = "Moron";
		Municipio municipio = new Municipio(numeroMunicipio, nombreMunicipio);
		Vivienda vivienda = new Vivienda (calle, altura, municipio);
		Integer dni = 10;
		Habitante nuevoHabitante = new Habitante (nombre, vivienda, dni);
		Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
		nuevaSecretaria.agregarHabitante(nuevoHabitante);
		Integer valorEsperado = 1;
		Integer valorObtenido = nuevaSecretaria.getCantidadHabitantes();
		assertEquals(valorEsperado,valorObtenido);
		
	}

}
