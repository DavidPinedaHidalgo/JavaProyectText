package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.operacionesMovil;
import model.Movil;

class operacionesMovilTest {

	@Test
	void testCalculoDatos() {
		double DELTA= 1e-15;
		Movil m1= new Movil("xiaomi","redmi 6", 634543432, 10, 2.3);
		assertEquals(7.7,operacionesMovil.calcularDatos(m1),DELTA);
	}
	
	@Test
	void testSumarDatos() {
		double DELTA= 1e-15;
		Movil m2= new Movil("iPhone","X", 636233743, 20, 7.8);
		assertEquals(24.2,operacionesMovil.aumentarDatos(m2,4.2),DELTA);
	}
}
