package practiUno;

import java.util.LinkedList;

public class GestorAviones {
	private static int contadorParaAvion=0;
	public static LinkedList<Avion> coleccionAviones = new LinkedList<Avion>();
	
	public GestorAviones() {
		
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
				//datosAvionViejo.setMatricula(datosAvionNuevo.getMatricula());			
				//datosAvionViejo.setModelo(datosAvionNuevo.getModelo());
				//datosAvionViejo.setListaAsientos(datosAvionNuevo.getListaAsientos());
			}
		}
		
		
	}

	
}
