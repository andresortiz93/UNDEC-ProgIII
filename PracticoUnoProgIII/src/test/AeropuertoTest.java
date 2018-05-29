package test;
import practiUno.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import practiUno.Aeropuerto;
import practiUno.Ciudad;

class AeropuertoTest {

	@Test
	void ShowDetails_ReturnsFormatted() {

		Ciudad theCity = new Ciudad(1, "La Rioja", "5300");

		Aeropuerto theAirport = new Aeropuerto(1, "AeropuertoEntity Capitán Vicente Almandos Almonacid", theCity,
				"IRJ");

		String returned = theAirport.showDenomination();

		assertEquals("AeropuertoEntity Capitán Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}
