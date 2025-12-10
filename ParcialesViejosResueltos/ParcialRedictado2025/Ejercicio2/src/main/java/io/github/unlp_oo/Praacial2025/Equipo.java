package io.github.unlp_oo.Praacial2025;

public class Equipo {
	private double costo;
	private int stock; 
	public Equipo (double costo, int stock) 
	{
		this.costo = costo;
		this.stock= stock; 
	}
	
	public double obtenerCosto(int cantPersonas) 
	{
		return cantPersonas* this.costo;
	}
	
	public boolean hayStock(int cant) 
	{
		return (this.stock-cant >= 0)? true : false;
	}
}
