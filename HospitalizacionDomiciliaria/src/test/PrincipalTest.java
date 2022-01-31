package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hospitalizacion.Principal;
import hospitalizacion.*;


class PrincipalTest {

	@Test
	void test() {
		assertEquals(12,Principal.getValor());
	}

}
