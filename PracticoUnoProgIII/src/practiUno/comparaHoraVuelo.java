package practiUno;

import java.util.Comparator;

public class comparaHoraVuelo implements Comparator<Avion>{

	@Override
	public int compare(Avion o1, Avion o2) {
		// TODO Auto-generated method stub
		return o2.getHsVuelo() - o1.getHsVuelo();
	}

}
