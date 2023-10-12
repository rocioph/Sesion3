package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	@Test
	void testResta() {
		assertEquals(5, Calculadora.resta(2,3));
	}
	@Test
	void testMultiplicar() {
		assertEquals(5, Calculadora.multiplicar(2,3));
	}
	@Test
	void testDividir() {
		assertEquals(5, Calculadora.dividir(2,3));
	}

}
