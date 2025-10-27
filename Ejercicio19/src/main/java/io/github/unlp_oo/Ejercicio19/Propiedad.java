package io.github.unlp_oo.Ejercicio19;

import java.util.*;

public class Propiedad {
	private boolean estado;
	private String direccion;
	private String nombre;
	private double precio;
	private List<Reserva> historialReservas;
	/* lista de historial de reservas*/
	public Propiedad (String direccion, String nombre, double precio)
	{
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = false;
		this.historialReservas = new LinkedList<Reserva>();
	}
	
	

	public String getDireccion() {
		return this.direccion;
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getPrecio() 
	{
		return this.precio;
	}
	public void setEstado(boolean estado) 
	{
		this.estado = estado;
	}
	public boolean propiedadOcupada() 
	{
		return this.estado;
	}
	
	public boolean esIgualNombreYDireccion (String nombre, String direccion) 
	{
		return this.nombre.equals(nombre) &&this.direccion.equals(direccion) ;
	}
	
	public boolean consultarDiponibilidad(Propiedad prop, DateLapse rangoFecha) 
	{
		return !(this.historialReservas.stream().anyMatch(r-> r.fechaSuperpuesta(prop, rangoFecha)) && prop.propiedadOcupada());
	}
	
	public double obtenerPrecioPropietario(DateLapse rangoFecha) 
	{
		return this.historialReservas.stream().filter(p->p.fechaSuperpuesta(rangoFecha)).mapToDouble(pre->pre.calcularPrecio()).sum();
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Propiedad otro = (Propiedad) obj;

	    return estado == otro.estado &&
	           Double.compare(precio, otro.precio) == 0 &&
	           Objects.equals(direccion, otro.direccion) &&
	           Objects.equals(nombre, otro.nombre) &&
	           Objects.equals(historialReservas, otro.historialReservas);
	}






}
