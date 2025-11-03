package io.github.unlp_oo.Ejercicio21;

import java.time.LocalDate;

public class Local extends Envio {

	private  boolean entregaRapida;
	public Local(String direccionOrigen, String direccionDestino, double peso, LocalDate fechaDespacho,boolean entregaRapida) {
		super(direccionOrigen, direccionDestino, peso, fechaDespacho);
		this.entregaRapida = entregaRapida;
	}

	@Override
	public double costoEnvio() {
		return (this.entregaRapida)?  1000+500: 1000 ;
	}
	
	
}
