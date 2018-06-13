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
		boolean existeIDavion = false, existeMatriculaAvion = false;
		if(contadorParaAvion == 0) {
			coleccionAviones.add(nuevoAvion);			
			contadorParaAvion++;
			return true;
		}
		existeIDavion = yaExisteAvionPorID(nuevoAvion);
		existeMatriculaAvion = yaExisteAvionPorMatricula(nuevoAvion);
		if(existeIDavion) 
			return false;		
		if(existeMatriculaAvion)		
			return false;
		else {
			coleccionAviones.add(nuevoAvion);
			return true;					
				}			
		}
	public static boolean yaExisteAvionPorID(Avion avionAcomparar) {
		boolean existeIDavion = false;
		for(Avion avionesRegistrados : coleccionAviones) 
			if(avionesRegistrados.getIdAvion() == avionAcomparar.getIdAvion()) 				
				existeIDavion = true;									
		return existeIDavion;
	}		
	
	public static boolean yaExisteAvionPorMatricula(Avion avionAcomparar) {
		boolean existeMATRICULAavion = false;
		for(Avion avionesRegistrados : coleccionAviones) 
			if(avionesRegistrados.getMatricula() == avionAcomparar.getMatricula()) 				
				existeMATRICULAavion = true;					
		return existeMATRICULAavion;
	}	
	
	public static void modificarAvion(Avion datosAvionViejo, Avion datosAvionNuevo) {		
		for(Avion aviones : coleccionAviones) {
			if(aviones.getIdAvion() == datosAvionViejo.getIdAvion()) {				
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
		int horasVoladasPorAvion = 0;
		for(Vuelo vuelos : crearVuelos) 
				if(vuelos.getAvion().equals(avion1)) 
					horasVoladasPorAvion+=calcularHoras(vuelos);
		return horasVoladasPorAvion/60;
	}
	
	public int calcularHoras(Vuelo esteVuelo) {
		int horas=0;
		if(esteVuelo.getFechaHoraArribo().getHour() > esteVuelo.getFechaHoraSalida().getHour()) 
			horas = ((esteVuelo.getFechaHoraArribo().getHour() - esteVuelo.getFechaHoraSalida().getHour())*60) + 
					(esteVuelo.getFechaHoraArribo().getMinute() - esteVuelo.getFechaHoraSalida().getMinute());	
		else 
			horas = ((esteVuelo.getFechaHoraArribo().getHour() - esteVuelo.getFechaHoraSalida().getHour())*60) - 
					(esteVuelo.getFechaHoraSalida().getMinute() - esteVuelo.getFechaHoraSalida().getMinute());
			
		return horas;	
	}
		
	}
	
	

	

