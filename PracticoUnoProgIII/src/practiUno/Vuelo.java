package practiUno;

import java.time.LocalDate;
import java.util.LinkedList;

public class Vuelo {
	
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDate fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDate fechaHoraArribo;
	private Aerolinea aerolinea;
	private LinkedList<Piloto> pilotos;
	private Avion avion;
	private LinkedList<Asignacion> pasajeros;
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDate fechaHoraSalida, Aeropuerto arribo,
			LocalDate fechaHoraArribo, Aerolinea aerolinea, LinkedList<Piloto> pilotos, Avion avion,
			LinkedList<Asignacion> pasajeros) {
		super();
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDate getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDate fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDate getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDate fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public LinkedList<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(LinkedList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public LinkedList<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(LinkedList<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
	

}
