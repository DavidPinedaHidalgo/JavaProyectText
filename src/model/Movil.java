package model;

public class Movil {

	private String marca;
	private String modelo;
	private int numero;
	private double DatosMovilesTotales;
	private double DatosMovilesGastados;

	public Movil() {

	}

	public Movil(String marca, String modelo, int numero, double datosMovilesTotales, double datosMovilesGastados) {
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
		DatosMovilesTotales = datosMovilesTotales;
		DatosMovilesGastados = datosMovilesGastados;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getDatosMovilesTotales() {
		return DatosMovilesTotales;
	}

	public void setDatosMovilesTotales(double d) {
		DatosMovilesTotales = d;
	}

	public double getDatosMovilesGastados() {
		return DatosMovilesGastados;
	}

	public void setDatosMovilesGastados(double d) {
		DatosMovilesGastados = d;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", numero=" + numero + ", DatosMovilesTotales="
				+ DatosMovilesTotales + ", DatosMovilesGastados=" + DatosMovilesGastados + "]";
	}

}
