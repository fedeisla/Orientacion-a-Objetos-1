package io.github.unlp_oo.Ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnviosTest {

	private Cliente indi;
	private Envio local, internac,internac2,interurb2,interurb3,interurb4, interurb;
	
	

	@BeforeEach
	void setUp() throws Exception {
		indi = new PersonaFisica("pablo", "La plata",2223);
	}
	@Test
	void testCostos() 
	{
		local = new Local("la plata", "la plata",10, LocalDate.of(2025, 10,1) , true);
		interurb = new Interurbano("la plata", "la plata",10, LocalDate.of(2025, 10,1), 700); 
		interurb2 = new Interurbano("b", "b",10, LocalDate.of(2025, 10,1), 100);
		interurb3 = new Interurbano("b", "b",10, LocalDate.of(2025, 10,1), 500);
		interurb4 = new Interurbano("b", "b",10, LocalDate.of(2025, 10,1), 50);
		internac = new Internacional("la plata", "la plata",0.9, LocalDate.of(2025, 1,31) , false); 
		internac2 = new Internacional("la plata", "la plata",2, LocalDate.of(2025, 1,31) , true);
		
		
		assertEquals(1500,local.costoEnvio());
		// bordes
		assertEquals(300,interurb.costoEnvio());
		assertEquals(250,interurb2.costoEnvio());
		assertEquals(250,interurb3.costoEnvio());
		assertEquals(200,interurb4.costoEnvio());
		
		assertEquals(5009,internac.costoEnvio());
		assertEquals(5824,internac2.costoEnvio());
	}

}
