package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.operacionesMovil;
import model.Movil;

class operacionesMovilTest {

	@Test
	void testCalculoDatos() {
		Movil m1= new Movil("xiaomi","redmi 6", 634543432, 10, 2.3);
		assertEquals(7.3,operacionesMovil.calcularDatos(m1));
	}

}
