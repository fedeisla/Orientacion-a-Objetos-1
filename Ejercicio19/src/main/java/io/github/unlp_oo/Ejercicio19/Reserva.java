package io.github.unlp_oo.Ejercicio19;

public class Reserva {

	private DateLapse fechaAlquila;
	private Propiedad prop;
	public Reserva(DateLapse fechaAlquila, Propiedad prop) 
	{
		this.fechaAlquila= fechaAlquila;
		this.prop = prop;
	}
	
	public DateLapse obtenerfechaAlquila() 
	{
		return this.fechaAlquila;
	}
	public double calcularPrecio()
	{
		return fechaAlquila.sizeInDays()* this.prop.getPrecio();
	}
	
	public boolean fechaSuperpuesta(Propiedad propEvaluar, DateLapse rangoFecha) 
	{
		return this.prop.equals(propEvaluar) && this.fechaAlquila.overlaps(rangoFecha);
	}
	public boolean fechaSuperpuesta(DateLapse rangoFecha) 
	{
		return this.fechaAlquila.overlaps(rangoFecha);
	}
}
