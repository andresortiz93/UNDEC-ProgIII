package practiUno;

import java.util.Collection;
import java.util.LinkedList;

public class GestorPilotos {
	private static int contadorParaPiloto=0;
	public static LinkedList<Piloto> coleccionPilotos = new LinkedList<Piloto>();
	
	public GestorPilotos() {
		
	}
	public GestorPilotos(LinkedList<Piloto> linkedList) {
		coleccionPilotos.addAll(linkedList);
	}
	public static boolean crearPiloto(Piloto nuevoPiloto) {
		int banderaDeIDPiloto =0;		
		if(contadorParaPiloto == 0) {
			coleccionPilotos.add(nuevoPiloto);			
			contadorParaPiloto++;
			return true;
		}
		for(Piloto pilotosRegistrados : coleccionPilotos) {
			if(pilotosRegistrados.getIdPiloto() == nuevoPiloto.getIdPiloto()) {				
				banderaDeIDPiloto = 1;				
			}			
		}	
		if(banderaDeIDPiloto == 1) {
			return false;
			}		
		else {	
				coleccionPilotos.add(nuevoPiloto);
				return true;
					
					}
					
			}
	
	public int horasVueloPiloto(Collection<Vuelo> crearVuelos, Piloto piloto1) {
		int duracion = 0;
		for(Vuelo vuelos : crearVuelos) {
				if(vuelos.getPilotos() != null) {
					if(vuelos.getPilotos().getFirst().equals(piloto1)) {					
						if(vuelos.getFechaHoraArribo().getHour() > vuelos.getFechaHoraSalida().getHour()) {
							duracion += ((vuelos.getFechaHoraArribo().getHour() - vuelos.getFechaHoraSalida().getHour())*60) + 
									(vuelos.getFechaHoraArribo().getMinute() - vuelos.getFechaHoraSalida().getMinute());
							
							}
					
					else {
							duracion += ((vuelos.getFechaHoraArribo().getHour() - vuelos.getFechaHoraSalida().getHour())*60) - 
									(vuelos.getFechaHoraSalida().getMinute() - vuelos.getFechaHoraSalida().getMinute());
							
							}
					}
						}
		}
		return duracion/60;
		
	}
		

}
