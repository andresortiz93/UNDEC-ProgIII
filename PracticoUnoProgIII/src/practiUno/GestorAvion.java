package practiUno;

import java.util.Collection;
import java.util.LinkedList;

public class GestorAvion {
	private static int contadorParaAvion=0;
	public static LinkedList<Avion> coleccionAviones = new LinkedList<Avion>();
	
	public GestorAvion() {
		
	}
	public GestorAvion(LinkedList<Avion> linkedList) {
		coleccionAviones.addAll(linkedList);
	}
	public static boolean crearAvion(Avion nuevoAvion) {
		int banderaDeIDAvion =0;
		int banderaDeMatriculaAvion = 0;
		if(contadorParaAvion == 0) {
			coleccionAviones.add(nuevoAvion);			
			contadorParaAvion++;
			return true;
		}
		for(Avion avionesRegistrados : coleccionAviones) {
			if(avionesRegistrados.getIdAvion() == nuevoAvion.getIdAvion()) {				
				banderaDeIDAvion = 1;				
			}
			if(avionesRegistrados.getMatricula() == nuevoAvion.getMatricula()) {				
				banderaDeMatriculaAvion= 1;				
			}
		} 	
		
		if(banderaDeIDAvion == 1) {
			return false;
			}
		if(banderaDeMatriculaAvion == 1) {
			return false;
			}
		else {
			if(nuevoAvion.getListaAsientos().isEmpty()) {
				return false;
			}
			else {
				coleccionAviones.add(nuevoAvion);
				return true;
					
					}
					
			}
		}
	
	public static void modificarAvion(Avion datosAvionViejo, Avion datosAvionNuevo) {
		//int banderaDeRegistroAvion = 0;
		for(Avion aviones : coleccionAviones) {
			if(aviones.getIdAvion() == datosAvionViejo.getIdAvion()) {
				//banderaDeRegistroAvion = 1;
				aviones.setMatricula(datosAvionNuevo.getMatricula());
				aviones.setModelo(datosAvionNuevo.getModelo());
				aviones.setListaAsientos(datosAvionNuevo.getListaAsientos());
				
			}
		}
		
		
	}
	public LinkedList<Avion> getColeccionAviones() {
		
		return coleccionAviones;
	}
	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion avion1) {
		int duracion = 0;
		for(Vuelo vuelos : crearVuelos) {
				if(vuelos.getAvion().equals(avion1)) {
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
		return duracion/60;
	}
	
	

	
}
