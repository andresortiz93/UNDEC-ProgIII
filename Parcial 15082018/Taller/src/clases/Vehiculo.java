package clases;

public class Vehiculo {
	private int ID;
	private String marcaModelo;
	private String patente;
	private int año;
	public Vehiculo(int id2, String marcaModelo2, String patente2, int año2) {
		this.ID = id2;
		this.marcaModelo = marcaModelo2;
		this.patente = patente2;
		this.año = año2;
		
	}
	public static Vehiculo instancia(int id, String marcaModelo, String Patente, int año) {
		Vehiculo v = new Vehiculo(id,marcaModelo,Patente,año);
		if(Patente == null)
			return null;
		else
			return v;
		
	}
	
	public String mostrarVehiculo() {
		return this.marcaModelo+" modelo "+this.año+" - Patente "+this.patente;	
	}
	
	


}


