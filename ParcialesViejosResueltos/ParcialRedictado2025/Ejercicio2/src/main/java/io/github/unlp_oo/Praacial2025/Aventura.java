package io.github.unlp_oo.Praacial2025;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Aventura {
	private double duracion;
	private double precioBase;
	private List<Salida> salidas;
	public Aventura (double duracion,double precioBase) 
	{
		this.salidas= new LinkedList<>();
		this.duracion= duracion;
		this.precioBase = precioBase;
	}
	public double obtenerPrecioBase(int cantPersonas) 
	{
		return cantPersonas* this.precioBase;
	}
	public void listadoCiudadesOrigen() 
	{
		/* solucion sin usar set (fea)
		  List<String> ciudadesSinRepetir = new ArrayList<>(); 

     	  this.salidas.stream()
    	  .flatMap(s -> s.obtenerCiudadesOrigen().stream())
    	  .forEach(ciudad -> {
        
          if (!ciudadesSinRepetir.contains(ciudad)) {
            	ciudadesSinRepetir.add(ciudad);
        	}
    	 }); 
    */
		Set<String> ciudadesSinRepetir = this.salidas.stream()
	            .map(s -> s.obtenerCiudadesOrigen())
	            .flatMap(List::stream) 
	            .distinct()
	            .collect(Collectors.toSet());
		
		ciudadesSinRepetir.stream()
		.forEach(c->System.out.println(c));
	
	}
	public int cantidadPersonasPorAventura() 
	{
		return this.salidas.stream()
				.mapToInt(s->s.obtenerCantPersona())
				.sum();
	}
}
