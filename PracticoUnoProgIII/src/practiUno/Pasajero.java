package practiUno;

public class Pasajero {

		private int idPasajero;
		private String CUIL;
		private String apellido;
		private String nombre;
		private String telefono;
		public Pasajero(int idPasajero, String cUIL, String apellido, String nombre, String telefono) {
			super();
			this.idPasajero = idPasajero;
			CUIL = cUIL;
			this.apellido = apellido;
			this.nombre = nombre;
			this.telefono = telefono;
		}
		public int getIdPasajero() {
			return idPasajero;
		}
		public void setIdPasajero(int idPasajero) {
			this.idPasajero = idPasajero;
		}
		public String getCUIL() {
			return CUIL;
		}
		public void setCUIL(String cUIL) {
			CUIL = cUIL;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		@Override
		public String toString() {
			return "Pasajero [idPasajero=" + idPasajero + ", CUIL=" + CUIL + ", apellido=" + apellido + ", nombre="
					+ nombre + ", telefono=" + telefono + "]";
		}
		
		
		
}
