package io.github.unlp_oo.Ejercicio19;

import java.time.LocalDate;
import java.util.*;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Reserva> reservas;	
	private List<Propiedad> propiedades;	
	
	public Usuario (String nombre, String direccion, int DNI) 
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.reservas = new LinkedList<Reserva>();
		this.propiedades = new LinkedList<Propiedad>();
	}
	
	
	public boolean crearReserva(Propiedad prop, DateLapse rangoFecha) 
	{
		if(prop.consultarDiponibilidad(prop, rangoFecha)) 
		{
			prop.setEstado(true);
			reservas.add(new Reserva(rangoFecha,prop));
			return true;
		}
		return false;
	}
	public boolean cancelarReserva(Reserva reservaCancelar) 
	{
		if(!periodoEncurso(reservaCancelar)) 
		{
			this.reservas.remove(reservaCancelar);
			return true;
		}
		return false;
		
	}
	
	public double calcularIngreso(DateLapse rangoFecha) 
	{
		double montoIngresos= this.propiedades.stream().mapToDouble(p-> p.obtenerPrecioPropietario(rangoFecha)).sum();
		return montoIngresos * 0.75;
	}
	public void agregarPropiedad(Propiedad prop) 
	{
		if(this.propiedades.stream().anyMatch(p-> !(p.esIgualNombreYDireccion(prop.getNombre(), prop.getDireccion())))) 
		{
			this.propiedades.add(prop);
		}
		
	}
	public boolean periodoEncurso(Reserva reservaCancelar) 
	{
		DateLapse hoy = new DateLapse(LocalDate.now(),LocalDate.now());
		return reservaCancelar.obtenerfechaAlquila().overlaps(hoy);
	}

	
}
