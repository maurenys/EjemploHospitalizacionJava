package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hospitalizacion.Paciente;

class PacienteTest {


	@Test
	void testNombre() {
		assertEquals("Andres", new Paciente( 1, "Andres").getNombre());
	}


	
	
}
