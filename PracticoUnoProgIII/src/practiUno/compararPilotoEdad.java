package practiUno;

import java.util.Comparator;

public class compararPilotoEdad implements Comparator<Piloto>{

	@Override
	public int compare(Piloto o1, Piloto o2) {
		// TODO Auto-generated method stub
		return o1.getFechaNacimiento().getYear() - o2.getFechaNacimiento().getYear();
	}

}
