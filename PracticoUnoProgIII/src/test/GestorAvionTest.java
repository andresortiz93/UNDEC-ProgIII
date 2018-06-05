package test;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import practiUno.Avion;
import practiUno.GestorAviones;

class GestorAvionTest {

	@Test
	void crearAvion_creacionCorrecta() {

		// Arrange
		GestorAviones elGestor = new GestorAviones();
		int avionesEnColeccion = elGestor.coleccionAviones.size();
		Avion unAvion = new Avion(1, "Airbus A340-313X", "LV-FPV", null);

		// Act
		elGestor.crearAvion(unAvion);
		int avionesLuegoDeCrear = elGestor.coleccionAviones.size();

		// Assert
		assertTrue((avionesEnColeccion + 1) == avionesLuegoDeCrear);

	}

	@Test
	void crearAvion_yaExisteAvionPorID() {

		// Arrange
		GestorAviones elGestor = new GestorAviones();
		elGestor.coleccionAviones.add(new Avion(1, "Airbus A340-313X", "LV-FPV", null));
		int avionesEnColeccion = elGestor.coleccionAviones.size();
		Avion unAvion = new Avion(1, "Boeing 737-8MB", "LV-FYK", null);

		// Act
		boolean falsoCrearAvion = elGestor.crearAvion(unAvion);

		// Assert
		int avionesLuegoDeCrear = elGestor.coleccionAviones.size();
		assertFalse(falsoCrearAvion);
		assertTrue(avionesEnColeccion == avionesLuegoDeCrear);

	}

	@Test
	void crearAvion_yaExisteAvionPorMatricula() {

		// Arrange
		GestorAviones elGestor = new GestorAviones();
		elGestor.coleccionAviones.add(new Avion(1, "Airbus A340-313X", "LV-FPV", null));
		int avionesEnColeccion = elGestor.coleccionAviones.size();
		Avion unAvion = new Avion(2, "Boeing 737-8MB", "LV-FPV", null);

		// Act
		boolean falsoCrearAvion = elGestor.crearAvion(unAvion);
		int avionesLuegoDeCrear = elGestor.coleccionAviones.size();

		// Assert
		assertFalse(falsoCrearAvion);
		assertTrue(avionesEnColeccion == avionesLuegoDeCrear);

	}

}
