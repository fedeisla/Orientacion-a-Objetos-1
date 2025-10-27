package io.github.unlp_oo.Ejercicio19;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class Tester {
	private Usuario usuario;
	private Propiedad casa;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		usuario = new Usuario("Fede", "La plata", 111);
		casa = new Propiedad("1 y 50", "casa", 1000);
		usuario.agregarPropiedad(casa);
		
	}
	@Test
	public void testDesponibilidad() 
	{
	
		DateLapse fecha = new DateLapse(LocalDate.of(1972, 9, 15),LocalDate.of(1972, 9, 15));
		assertEquals(casa.consultarDiponibilidad(casa, fecha), true); 
	}
	@Test
	public void testReservar() 
	{
	
	 
	}
	@Test
	public void testCancelar() 
	{
	
	 
	}
	

}
