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
	public void queSePuedaAgregarUnMunicipio( ) {
		Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
		Municipio nuevoMunicipio = new Municipio(1, "VillaCarlosPaz", nuevaSecretaria);
		Vivienda nuevaVivienda = new Vivienda ("Punilla",276,"Villa Carlos Paz", 1763, 300, 150, nuevoMunicipio);
		Habitante nuevoHabitante = new Habitante ("juan","martinez",30111993,28,nuevaVivienda,38046528,TipoDeDocumento.DNI);
		boolean esperado = true;
		boolean obtenido = nuevaSecretaria.agregarMunicipio(nuevoMunicipio);
		assertEquals(esperado, obtenido);
	}
		
		@Test
		public void queSeConsulteLaCantidadDeHabitantesEnVillaCarlosPaz( ) {
			Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
			Municipio nuevoMunicipio = new Municipio(1,"Villa Carlos Paz",nuevaSecretaria);
			Vivienda nuevaVivienda = new Vivienda ("Punilla",276,"Villa Carlos Paz", 1763, 300, 150, nuevoMunicipio);
			Habitante nuevoHabitante = new Habitante ("juan","martinez",30111993,28,nuevaVivienda,38046528,TipoDeDocumento.DNI);
			Habitante nuevoHabitante2 = new Habitante ("juan","martinez",30111993,28,nuevaVivienda,38046528,TipoDeDocumento.DNI);
			nuevaVivienda.agregarHabitante(nuevoHabitante);
			nuevaVivienda.agregarHabitante(nuevoHabitante2);
			nuevaSecretaria.agregarVivienda(nuevoMunicipio, nuevaVivienda);
			
			Integer esperado = 2;
			Integer obtenido = nuevaSecretaria.cantidadDeHabitantesEnUnMunicipio(nuevoMunicipio);
			assertEquals(esperado, obtenido);
		
	}
		@Test
		public void cantidadDeViviendasEnElMunicipio() {
			Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
			Municipio nuevoMunicipio = new Municipio(1,"Villa Carlos Paz",nuevaSecretaria);
			Vivienda nuevaVivienda = new Vivienda ("Punilla",276,"Villa Carlos Paz", 1763, 300, 150, nuevoMunicipio);
			Vivienda nuevaVivienda2 = new Vivienda ("Punill3",266,"Villa Carlos Paz", 1763, 300, 150, nuevoMunicipio);
			nuevoMunicipio.agregarVivienda(nuevaVivienda);
			nuevoMunicipio.agregarVivienda(nuevaVivienda2);
			Integer valorEsperado = 2;
			Integer valorObtenido= nuevaSecretaria.cantidadDeViviendasEnElMunicipio(nuevoMunicipio);
			assertEquals(valorEsperado, valorObtenido);
			
			
		}
		@Test
		public void AgregarDueñosDeUnaVivienda() {
			Secretaria nuevaSecretaria = new Secretaria ("Cordoba");
			Municipio nuevoMunicipio = new Municipio(1,"Villa Carlos Paz",nuevaSecretaria);
			Vivienda nuevaVivienda = new Vivienda ("Punilla",276,"Villa Carlos Paz", 1763, 300, 150, nuevoMunicipio);
			Propietario juan = new Propietario ("juan",100);
			boolean valorEsperado = true;
			boolean valorObtenido = nuevaVivienda.agregarPropietario(juan);
			assertEquals(valorEsperado, valorObtenido);
		}

}
