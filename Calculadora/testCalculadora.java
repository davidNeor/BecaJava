package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testCalculadora {

	static Calculadora calc;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
		calc=new Calculadora();
	}
	

	@Test
	void sumaTest() {
		assertEquals(calc.suma(6, 5),11);
	}

	@Test
	void cuadradoTest() {
		assertEquals(calc.cuadrado(4),16);
	}

	@Test
	void restaTest() {
		assertEquals(calc.resta(20, 10),10);
	}
	
	@Test
	void negativoTest() {
		assertEquals(calc.negativo(10),-10);
	}

	
}
