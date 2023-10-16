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
		cta = new Cuenta(0,1369);
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
		assertEquals(0,cta.getSaldo());
	}
	
	 @Test
	    public void testT0014() 
	    {
		 	Cuenta c12345 = new Cuenta(50,12345);
		 	Cuenta c67890 = new Cuenta(0,67890);
		 	//instcuccion cuenta 12345
		 	c12345.Retirar(200);
		 	assertEquals(-150,c12345.getSaldo());
		 	
			c12345.ingresar(100);
			assertEquals(-50,c12345.getSaldo());
			
			c12345.Retirar(200);
			assertEquals(-250,c12345.getSaldo());
			
		 	//instruccion cuenta67890
		 	assertTrue(c67890.Retirar(350));
			assertEquals(-350,c67890.getSaldo());
			
			assertFalse(c67890.Retirar(200));
			assertEquals(-350,c67890.getSaldo());
			
			assertTrue(c67890.Retirar(150));
			assertEquals(-500,c67890.getSaldo());
			
			c67890.ingresar(50);
			assertEquals(-450,c67890.getSaldo());
			
	    }

}
