package practiUno;

import java.time.LocalDate;

public class Piloto {

		private int idPiloto;
		private String apellido;
		private String nombres;
		private String documento;
		private LocalDate fechaNacimiento;
		
		public Piloto(int idPiloto, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
			super();
			this.idPiloto = idPiloto;
			this.apellido = apellido;
			this.nombres = nombres;
			this.documento = documento;
			this.fechaNacimiento = fechaNacimiento;
		}
		public int getIdPiloto() {
			return idPiloto;
		}
		public void setIdPiloto(int idPiloto) {
			this.idPiloto = idPiloto;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
		
		
}
