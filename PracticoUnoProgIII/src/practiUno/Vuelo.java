package practiUno;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.LinkedList;

import java.util.Locale;

public class Vuelo {
	
	private Locale S = new Locale("es","ES");
	private int duracion=0;
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private LinkedList<Piloto> pilotos;
	private Avion avion;
	private LinkedList<Asignacion> pasajeros;
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, LinkedList<Piloto> pilotos, Avion avion,
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
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
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
	@Override
	public String toString() {
		return "Vuelo [codigoVuelo=" + codigoVuelo + ", salida=" + salida + ", fechaHoraSalida=" + fechaHoraSalida
				+ ", arribo=" + arribo + ", fechaHoraArribo=" + fechaHoraArribo + ", aerolinea=" + aerolinea
				+ ", pilotos=" + pilotos + ", avion=" + avion + ", pasajeros=" + pasajeros + "]";
	}
	
	private void convertirHoras() {
		
	
		if(fechaHoraArribo.getHour() > fechaHoraSalida.getHour()) {
				duracion = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())*60) + (fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
				avion.acumuladorHoras(duracion);
				}
		
		else {
				duracion = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())*60) - (fechaHoraSalida.getMinute() - fechaHoraArribo.getMinute());
				avion.acumuladorHoras(duracion);
				}
		//System.out.println(x);
		//return x;
		//for(Piloto pil : pilotos)
			//pil.acumulaHoras(duracion);
	}
	public String mostrarVuelo() {
		convertirHoras();
		return "Vuelo " + codigoVuelo + " - " + avion.getModelo() + " \n"+
				fechaHoraSalida.getDayOfWeek() +" "+fechaHoraSalida.getDayOfMonth()+" de "+fechaHoraSalida.getMonth()+" "+fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+ " " + salida.getCodigo() + "("+salida.verCiudad()+" "+salida.getNombre()+")"
				+"\n"+fechaHoraArribo.getDayOfWeek() +" " +fechaHoraArribo.getDayOfMonth()+" de "+fechaHoraArribo.getMonth()+ " "+fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+" " + arribo.getCodigo() + "("+arribo.verCiudad()+" "+arribo.getNombre()+")"+
				"\nOperado por "+ aerolinea.getNombre()+ " Duración "+duracion/60+"h "+duracion%60+"m";
		
	} 
	
	public String verAsignaciones() {
		int señal=0;
		System.out.println("Detalle de asignacion - Vuelo "+this.getCodigoVuelo());
		for(Asiento a: avion.getListaAsientos()) {
			for(Asignacion as: pasajeros) {
					if(a.getIdAsiento() == as.getAsiento().getIdAsiento()) {
						señal=1;
						System.out.println("Asiento " +a.getNumeroAsiento() + " - Ocupado");
						break;
						
					}
					else señal=0;
					}
			if(señal == 0) 
				System.out.println("Asiento "+a.getNumeroAsiento()+" - Libre");
				
			
		}
		
		return "";
	}

	public String getDetails() {
		convertirHoras();
		return "Vuelo " + codigoVuelo + " - " + avion.getModelo() + "\r\n"+
		Character.toUpperCase(fechaHoraSalida.getDayOfWeek().getDisplayName(TextStyle.FULL, S).charAt(0))+
		fechaHoraSalida.getDayOfWeek().getDisplayName(TextStyle.FULL, S).substring(1, fechaHoraSalida.getDayOfWeek().getDisplayName(TextStyle.FULL, S).length()).toLowerCase()
		+" "+fechaHoraSalida.getDayOfMonth()+" de "+
		fechaHoraSalida.getMonth().getDisplayName(TextStyle.FULL, S)+
		
		" "+fechaHoraSalida.getHour()+":"+fechaHoraSalida.getMinute()+ " " + salida.getCodigo() +
		" ("+salida.verCiudad()+" - "+salida.getNombre()+")"
				+"\r\n"+Character.toUpperCase(fechaHoraArribo.getDayOfWeek().getDisplayName(TextStyle.FULL, S).charAt(0))
				+fechaHoraArribo.getDayOfWeek().getDisplayName(TextStyle.FULL, S).substring(1, fechaHoraArribo.getDayOfWeek().getDisplayName(TextStyle.FULL, S).length()).toLowerCase() +
				" " +fechaHoraArribo.getDayOfMonth()+" de "+fechaHoraArribo.getMonth().getDisplayName(TextStyle.FULL, S)+
				" "+fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+" " + arribo.getCodigo() +
				" ("+arribo.verCiudad()+" - "+arribo.getNombre()+")"+
				"\r\nOperado por "+ aerolinea.getNombre()+ ". Duración "+duracion/60+"h "+duracion%60+"m";
		
	}

}
