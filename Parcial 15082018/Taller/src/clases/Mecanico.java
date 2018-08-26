package clases;

import java.time.LocalDate;

public class Mecanico {

		private int ID;
		private String Apellido;
		private String Nombres;
		private String Matricula;
		private LocalDate fechaNacimiento;
		private String Direccion;
		
		public Mecanico(int id2, String apellido2, String nombres2, String matricula2, LocalDate fechaNacimiento2,
				String direccion2) {
			this.ID = id2;
			this.Apellido = apellido2;
			this.Nombres = nombres2;
			this.Matricula = matricula2;
			this.fechaNacimiento = fechaNacimiento2;
			this.Direccion = direccion2;
			
		}

		public static Mecanico instancia(int id, String apellido, String nombres, String matricula,
				LocalDate fechaNacimiento,	String direccion) {
			Mecanico m = new Mecanico(id,apellido,nombres,matricula,fechaNacimiento,direccion);
			if(matricula == null)
				return null;
			else
				return m;
		}
		
		public String mostrarMecanico() {
			return this.Apellido+", "+this.Nombres+" ("+this.Matricula+")";
		}
		
		
		
}
