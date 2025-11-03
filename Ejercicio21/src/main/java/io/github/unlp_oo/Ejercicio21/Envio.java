package io.github.unlp_oo.Ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
	private String direccionOrigen;
	private String direccionDestino;
	private double peso;
	private LocalDate fechaDespacho;
	
	public Envio(String direccionOrigen,String direccionDestino,double peso,LocalDate fechaDespacho) 
	{
		this.direccionDestino= direccionDestino;
		this.direccionOrigen = direccionOrigen;
		this.peso = peso;
		this.fechaDespacho = fechaDespacho;
	}
	
	public double getPeso() 
	{
		return this.peso;
	}
	public LocalDate getFechaDespacho() 
	{
		return this.fechaDespacho;
	}
	public abstract double costoEnvio();
}
