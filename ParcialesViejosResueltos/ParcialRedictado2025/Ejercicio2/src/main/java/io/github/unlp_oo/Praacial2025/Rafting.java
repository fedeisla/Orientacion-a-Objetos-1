package io.github.unlp_oo.Praacial2025;

public class Rafting extends Aventura {
	public Rafting (double duracion, double precioBase) 
	{
		super(duracion, precioBase);
	}
	@Override
	public double obtenerPrecioBase(int cantPersonas)
	{
		return super.obtenerPrecioBase(cantPersonas) + super.obtenerPrecioBase(cantPersonas)*0.05;
	}
	
	
	
}
