package io.github.unlp_oo.Ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	
	private Cliente indi;
	private Envio local, internacional, interurbano;
	
	

	@BeforeEach
	void setUp() throws Exception {
		indi = new PersonaFisica("pablo", "La plata",2223);
	}
	@Test
	void testCostos() 
	{
		
		local = new Local("la plata", "la plata",10, LocalDate.of(2025, 1,1) , true);
		interurbano = new Interurbano("la plata", "la plata",10, LocalDate.of(2025, 1,6), 700); 
		internacional = new Internacional("la plata", "la plata",0.9, LocalDate.of(2025, 1,31) , false); 
		indi.agregaEnvio(local);
		indi.agregaEnvio(interurbano);
		indi.agregaEnvio(internacional);
		
		assertEquals(6128.1, indi.calcularMonto(new DateLapse(LocalDate.of(2025, 1,1), LocalDate.of(2025, 1,31))) );
		
		
	}

}
