package practiUno;

import java.time.LocalDate;
import java.time.Period;

public class Piloto {
		
		private int hsVuelo=0;
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
		
		public int getHsVuelo() {
			return hsVuelo/60;
		}
		public void setHsVuelo(int hsVuelo) {
			this.hsVuelo = hsVuelo;
		}
		void acumulaHoras(int x) {
			this.hsVuelo+=x;
		}
		@Override
		public String toString() {
			return "Piloto [idPiloto=" + idPiloto + ", apellido=" + apellido + ", nombres=" + nombres + ", documento="
					+ documento + ", fechaNacimiento=" + fechaNacimiento + "]";
		}
		public String getSurnameAndName() {
			return (apellido+", "+ nombres);
		}
		public int getAge(LocalDate of) {
			Period a�os;
			a�os = Period.between(fechaNacimiento,of );
			return a�os.getYears();
		}
		
		
		
}
