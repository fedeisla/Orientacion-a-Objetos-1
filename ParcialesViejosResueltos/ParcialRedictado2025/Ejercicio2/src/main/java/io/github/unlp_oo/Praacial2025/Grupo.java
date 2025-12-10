package io.github.unlp_oo.Praacial2025;

public class Grupo {
	private String nombre;
 	private String DNI;
 	private String ciudadOri;
 	private int cantPersona;
 	
 	public Grupo (String nombre,String DNI,String ciudadOri,int cantPersona) 
 	{
 		this.nombre = nombre;
 		this.DNI = DNI;
 		this.ciudadOri = ciudadOri;
 		this.cantPersona= cantPersona;
 	}
 	public void  recibirMonto (double precio) 
 	{
 		System.out.println("debo pagar: "+ precio);
 	}
 	public int getCantPersona() 
 	{
 		return this.cantPersona;
 	}
 	public String getCiudadOri() 
 	{
 		return this.ciudadOri;
 	}
}
