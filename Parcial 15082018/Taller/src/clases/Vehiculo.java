package clases;

public class Vehiculo {
	private int ID;
	private String marcaModelo;
	private String patente;
	private int a�o;
	public Vehiculo(int id2, String marcaModelo2, String patente2, int a�o2) {
		this.ID = id2;
		this.marcaModelo = marcaModelo2;
		this.patente = patente2;
		this.a�o = a�o2;
		
	}
	public static Vehiculo instancia(int id, String marcaModelo, String Patente, int a�o) {
		Vehiculo v = new Vehiculo(id,marcaModelo,Patente,a�o);
		if(Patente == null)
			return null;
		else
			return v;
		
	}
	
	public String mostrarVehiculo() {
		return this.marcaModelo+" modelo "+this.a�o+" - Patente "+this.patente;	
	}
	
	


}


