package practiUno;

import java.util.Comparator;

public class comparaPilotohoraVuelo implements Comparator<Piloto>{

	@Override
	public int compare(Piloto o1, Piloto o2) {
		// TODO Auto-generated method stub
		return o2.getHsVuelo() - o1.getHsVuelo();
	}

	

}
