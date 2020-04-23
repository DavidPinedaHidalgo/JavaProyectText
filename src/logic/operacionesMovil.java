package logic;

import model.Movil;

public class operacionesMovil {

	public static double calcularDatos(Movil movil){
		double datosActuales= movil.getDatosMovilesTotales()-movil.getDatosMovilesGastados();
		return datosActuales;
	}
	
	public static void hacerLlamada(int numero) {
		System.out.println("Se esta llamando al número: "+numero);
	}
}
