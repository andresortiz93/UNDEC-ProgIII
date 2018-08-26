package clases;

import java.time.LocalDate;

public class Service {

	private int ID;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private LocalDate fechaService;
	private String Detalle;
	private float PreciFinal;
	public Service(int id2, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService2, String detalle2,
			float precioFinal) {
		this.ID = id2;
		this.vehiculo = elVehiculo;
		this.cliente = elCliente;
		this.fechaService = fechaService2;
		this.Detalle = detalle2;
		this.PreciFinal = precioFinal;
	}
	public static Service instancia(int id, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService,
			String detalle,	float precioFinal) {
			Service s = new Service(id,elVehiculo,elCliente,fechaService,detalle,precioFinal);
			if(elVehiculo == null)
				return null;
			else
				return s;
	}
	
	public String mostrarResumen() {
		
		return "Service Nro: "+this.ID+"\n"+"Cliente: "+this.cliente.mostrarCliente()+"\n"+
		"Vehiculo: "+this.vehiculo.mostrarVehiculo()+"\n"+"Trabajo Realizado: "+this.Detalle+"\n"+
		"Total: $ "+this.PreciFinal;
	}
}
