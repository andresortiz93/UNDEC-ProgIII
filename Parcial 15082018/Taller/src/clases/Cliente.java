package clases;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private int ID;
	private String Apellido;
	private String Nombres;
	private String Documento;
	private LocalDate fechaNacimiento;
	private String Direccion;
	private String Telefono;
	private LinkedList<Vehiculo> coleccionVehiculo = new LinkedList<>();
	public Cliente(int id2, String apellido2, String nombres2, String documento2, LocalDate fechaNacimiento2,
			String direccion2, String telefono2) {
		this.ID = id2;
		this.Apellido = apellido2;
		this.Nombres = nombres2;
		this.Documento = documento2;
		this.fechaNacimiento = fechaNacimiento2;
		this.Direccion = direccion2;
		this.Telefono = telefono2;
	}
	public static Cliente instancia(int id, String apellido, String nombres,
			String documento, LocalDate fechaNacimiento, String direccion, String telefono) {
		Cliente c = new Cliente(id,apellido,nombres,documento,fechaNacimiento,direccion,telefono);
		if(documento == null)
			return null;
		else
			return c;
	}
	public String mostrarCliente() {
		return this.Apellido+", "+this.Nombres+" - "+this.Telefono;
		
	}
	public List<Vehiculo> devolverVehiculos() {
		return coleccionVehiculo;
	}
	public void asignarVehiculo(Vehiculo elVehiculo) {
		coleccionVehiculo.add(elVehiculo);
		
	}
	
	
	
	
}
