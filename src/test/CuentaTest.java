  package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta cta;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testIngresar() {
		cta.ingresar(3000);
		assertEquals(3000,cta.getSaldo());
	}
	@Test
	void testRetirar() {
		assertFalse(cta.Retirar(3000));
		assertEquals(-3000,cta.getSaldo());
	}

}
