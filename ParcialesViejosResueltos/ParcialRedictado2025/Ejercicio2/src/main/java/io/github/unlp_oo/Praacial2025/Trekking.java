package io.github.unlp_oo.Praacial2025;

public class Trekking extends Aventura{

	public Trekking(double duracion, double precioBase) {
		super(duracion, precioBase);
		
	}
	@Override
	public double obtenerPrecioBase(int cantPersonas) 
	{
		
		return (cantPersonas>4)?super.obtenerPrecioBase(cantPersonas)-obtenerDescuento(cantPersonas):super.obtenerPrecioBase(cantPersonas);
	}	
	
	private  double obtenerDescuento(int cantPersonas)
	{
		return super.obtenerPrecioBase(cantPersonas)*0.10;
	}

}
