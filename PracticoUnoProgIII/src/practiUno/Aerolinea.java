package practiUno;

public class Aerolinea {
	
	private int idAerolineas;
	private String nombre;
	public Aerolinea(int idAerolineas, String nombre) {
		super();
		this.idAerolineas = idAerolineas;
		this.nombre = nombre;
	}
	public int getIdAerolineas() {
		return idAerolineas;
	}
	public void setIdAerolineas(int idAerolineas) {
		this.idAerolineas = idAerolineas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
