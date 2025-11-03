package io.github.unlp_oo.Ejercicio21;

import java.time.LocalDate;

public class Interurbano extends Envio {
 
 private double distancia;
 
 public Interurbano(String direccionOrigen, String direccionDestino, double peso, LocalDate fechaDespacho, double distancia) {
	 super(direccionOrigen, direccionDestino, peso, fechaDespacho);
	this.distancia = distancia;
	}

@Override
 public double costoEnvio() {

	 if(this.distancia > 500) 
	 {
		 return super.getPeso() * 30;
	 }
	 if(this.distancia >=  100 &&this.distancia <=500) 
	 {
		 return super.getPeso() * 25;
	 } 
	return super.getPeso() * 20;
 }
 
}
