package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import act14.Jugador;

class Actividad14_Junit_Jugador {

	private Jugador j1; //creamos el atributo Jugador j1 y lo hacemos de forma dinámica para poder acceder en todos los métodos
	
	//Creamos el beforeEach para indicar lo que se va a hacer antes de cada prueba(@test".
	
	@BeforeEach
	void crearJugador() {
		j1 = new Jugador(); //antes de cada prueba va a crear el objeto jugador j1
	}
	
	@Test
	void ponerDorsalenRango() {
		int dorsal1 = 10;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = 10;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ponerDorsalFueraRango() {
		int dorsal1 = -2;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ponerDorsalFueraRangoPositivo() {
		int dorsal1 = 31;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void estaExpulsado() {
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		assertFalse(j1.estaExpulsado());
	}
	
	@Test
	void estaExpulsado2() {
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		assertTrue(j1.estaExpulsado());
	}
	
	@Test
	void estaExpulsado3() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado());
	}
	
	@Test
	void estaExpulsado4() {
		j1.setNumeroTarjetasAmarillas(3);
		j1.setNumeroTarjetasRojas(2);
		assertTrue(j1.estaExpulsado());
	}
	
	
	@Test
	void probarGeterySeter() {
		j1.setDorsal(10);
		assertEquals(10, j1.getDorsal());
		j1.setNumeroTarjetasAmarillas(2);
		assertEquals(2, j1.getNumeroTarjetasAmarillas());
		j1.setNumeroTarjetasRojas(3);
		assertEquals(3, j1.getNumeroTarjetasRojas());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
