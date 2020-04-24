package controller;

import logic.operacionesMovil;
import model.Movil;

public class Main {

	public static void main(String[] args) {
		
		Movil m1= new Movil("xiaomi","redmi 6", 634543432, 10, 2.3);
		Movil m2= new Movil("iPhone","X", 636233743, 20, 7.8);

		System.out.println(m1.toString());

		System.out.println("Al movil "+m1.getNumero() +" le quedan "+ operacionesMovil.calcularDatos(m1) + "GB");
		
		operacionesMovil.hacerLlamada(m1,m2);
		operacionesMovil.aumentarDatos(m2, 4.2);
		System.out.println("El movil "+m2.getNumero()+" ha aumentado sus datos a "+ m2.getDatosMovilesTotales()+"GB");
		System.out.println(m2.toString());
	}
}
