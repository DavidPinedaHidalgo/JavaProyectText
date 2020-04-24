package logic;

import model.Movil;

public class operacionesMovil {

	public static double calcularDatos(Movil movil){
		double datosActuales= movil.getDatosMovilesTotales()-movil.getDatosMovilesGastados();
		return datosActuales;
	}
	
	public static void hacerLlamada(Movil m1, Movil m2) {
		int haceLlamada=m1.getNumero();
		int recibeLlamada=m2.getNumero();
		System.out.println("El movil "+haceLlamada+ " está llamando a "+recibeLlamada);
	}
	
	public static double aumentarDatos(Movil movil, double cantidad) {
		double datos=(movil.getDatosMovilesTotales()+cantidad);
		movil.setDatosMovilesTotales(datos);
		return datos;
	}
}
