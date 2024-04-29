package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import act14.Soldado;

class Actividad14_Junit_Soldado {
	
	private Soldado s1;
	
	@BeforeEach
	void crearSoldado() {
		s1 =  new Soldado();
	}
	
	@Test
	void puedeDisparar() {
		int numeroBalas = 10;
		s1.setNumeroBalas(numeroBalas);
		assertTrue(s1.puedeDisparar());
	}
	
	@Test
	void puedeDispararCero() {
		int numeroBalas = 0;
		s1.setNumeroBalas(numeroBalas);
		assertFalse(s1.puedeDisparar());
	}
	
	@Test
	void puedeDispararNegativo() {
		int numeroBalas = -10;
		s1.setNumeroBalas(numeroBalas);
		assertFalse(s1.puedeDisparar());
	}
	
	@Test
	void disparar(){
		Soldado sol = new Soldado();
		sol.setEstaMuerto(false);
		s1.setNumeroBalas(10);
		s1.disparar(sol);
		assertTrue(sol.isEstaMuerto());
		assertEquals(9, s1.getNumeroBalas());
	}
	
	@Test
	void disparar2(){
		Soldado sol = new Soldado();
		sol.setEstaMuerto(false);
		s1.setNumeroBalas(-10);
		s1.disparar(sol);
		assertTrue(sol.isEstaMuerto());
		assertEquals(-11, s1.getNumeroBalas());
	}
	
	@Test
	void disparar3(){
		Soldado sol = new Soldado();
		sol.setEstaMuerto(true);
		s1.setNumeroBalas(-10);
		s1.disparar(sol);
		assertTrue(sol.isEstaMuerto());
		assertEquals(-11, s1.getNumeroBalas());
	}
	
	
	
	
	
	
	
	

}
