package io.github.unlp_oo.Ejercicio21;

import java.time.LocalDate;

public class Internacional extends Envio {
	
	private  boolean entregaRapida;
	public Internacional(String direccionOrigen, String direccionDestino, double peso, LocalDate fechaDespacho, boolean entregaRapida) {
		super(direccionOrigen, direccionDestino, peso, fechaDespacho);
		this.entregaRapida = entregaRapida;
	}

	@Override
	public double costoEnvio() {
		
		double monto  = 5000;
		if(super.getPeso() > 1) 
		{
			monto += super.getPeso() * 12;
		}
		else 
		{
			monto += super.getPeso() * 10;
		}
		
		return (this.entregaRapida)?monto+800:monto ;
	}

}
