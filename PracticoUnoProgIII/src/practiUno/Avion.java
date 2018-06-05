package practiUno;

import java.util.LinkedList;

public class Avion {

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAvion;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		if (idAvion != other.idAvion)
			return false;
		return true;
	}
		private int idAvion;
		private String modelo;
		private String matricula;
		private LinkedList<Asiento> listaAsientos;
		private int hsVuelo=0;
		public Avion(int idAvion, String modelo, String matricula, LinkedList<Asiento> listaAsientos) {
			super();
			this.idAvion = idAvion;
			this.modelo = modelo;
			this.matricula = matricula;
			this.listaAsientos = listaAsientos;
		}
		public int getIdAvion() {
			return idAvion;
		}
		public void setIdAvion(int idAvion) {
			this.idAvion = idAvion;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public LinkedList<Asiento> getListaAsientos() {
			return listaAsientos;
		}
		public void setListaAsientos(LinkedList<Asiento> listaAsientos) {
			this.listaAsientos = listaAsientos;
		}
		public void acumuladorHoras(int x) {
			this.hsVuelo+=x;
			
		}
		public int getHsVuelo() {
			return hsVuelo/60;
		}
		public void setHsVuelo(int hsVuelo) {
			this.hsVuelo = hsVuelo;
		}
		@Override
		public String toString() {
			return "Avion [idAvion=" + idAvion + ", modelo=" + modelo + ", matricula=" + matricula + ", listaAsientos="
					+ listaAsientos + "]";
		}

			
		
		
}
