package practiUno;

import java.util.LinkedList;

public class GestorAviones {
	private static int contadorParaAvion=0;
	private static LinkedList<Avion> listaDeAviones = new LinkedList<Avion>();
	public static void crearAvion(Avion nuevoAvion) {
		int banderaDeIDAvion =0;
		if(contadorParaAvion == 0) {
			listaDeAviones.add(nuevoAvion);
			System.out.println("Avion Creado");
			contadorParaAvion++;
		}
		for(Avion avionesRegistrados : listaDeAviones) 
			if(avionesRegistrados.getIdAvion() == nuevoAvion.getIdAvion()) 
					banderaDeIDAvion = 1;
		
		
			if(banderaDeIDAvion == 1) 
				System.out.println("Error al crear avion, el ID del avion ya existe.");
			
			else {
				if(nuevoAvion.getListaAsientos().isEmpty()) {
				System.out.println("Error al crear avion, el avion no contiene asientos.");
				}
				else {
					listaDeAviones.add(nuevoAvion);
					System.out.println("Avion Creado");
					}
					
			}
		}
	
	public static void modificarAvion(Avion datosAvionViejo, Avion datosAvionNuevo) {
		int banderaDeRegistroAvion = 0;
		for(Avion aviones : listaDeAviones) {
			if(aviones.getIdAvion() == datosAvionViejo.getIdAvion()) {
				banderaDeRegistroAvion = 1;
				aviones.setMatricula(datosAvionNuevo.getMatricula());
				aviones.setModelo(datosAvionNuevo.getModelo());
				aviones.setListaAsientos(datosAvionNuevo.getListaAsientos());
				datosAvionViejo.setMatricula(datosAvionNuevo.getMatricula());			
				datosAvionViejo.setModelo(datosAvionNuevo.getModelo());
				datosAvionViejo.setListaAsientos(datosAvionNuevo.getListaAsientos());
			}
		}
		if(banderaDeRegistroAvion == 1)
			System.out.println("Avion Modificado");
		else
			System.out.println("Avion No modificado");
			
		
		
	}

	
}
