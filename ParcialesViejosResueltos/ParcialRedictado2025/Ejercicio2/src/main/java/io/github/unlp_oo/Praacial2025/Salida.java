package io.github.unlp_oo.Praacial2025;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Salida {
	
	private LocalDate fecha;
	private int cupo;
	
	
	private Aventura aventura;
	private Equipo equipoAsignado;
	private Grupo titular;
	private Guia guiaACargo;
	private List<Grupo>gruposInscriptos;
	
	public Salida(Aventura av, Guia guia, LocalDate fecha,int cupo) 
	{
		this.fecha= fecha;
		this.cupo= cupo;
		
		
		this.gruposInscriptos = new LinkedList<>();

	}
	public double obtenerPrecioSalida() 
	{
		
		return this.aventura.obtenerPrecioBase(titular.getCantPersona())
				+this.guiaACargo.getHonorarios()
				+this.equipoAsignado.obtenerCosto(titular.getCantPersona());
	}
	
	public boolean inscribirGrupo(Grupo grupo) 
	{
		if(!asignarGuia(this.guiaACargo)) 
		{
			System.out.println("Aun no se asigno guia");
			return false;
		}
		int cantEquiposUsadosPorDia = (this.gruposInscriptos.stream().mapToInt(g->g.getCantPersona()).sum())+grupo.getCantPersona();
		if(!(this.cupo-grupo.getCantPersona() < 0) && this.equipoAsignado.hayStock(cantEquiposUsadosPorDia)) { 
			
			this.cupo-= grupo.getCantPersona();
			this.gruposInscriptos.add(grupo);
			this.titular= grupo;
			grupo.recibirMonto(obtenerPrecioSalida());
			return true;
		}
		
		return false;
	}


	public List<String> obtenerCiudadesOrigen() {

		List<String> ciudadesDeEstaSalida = this.gruposInscriptos.stream()
											.map(gi-> gi.getCiudadOri())
											.collect(Collectors.toList());		
		return ciudadesDeEstaSalida;
	}
	public int obtenerCantPersona() 
	{
		return this.gruposInscriptos.stream()
				.mapToInt(g->g.getCantPersona())
				.sum();
	}
	
	private boolean asignarGuia(Guia guia) 
	{
		if(guia.estaLibre(fecha)) 
		{
			guia.registraFecha(fecha);
			this.guiaACargo= guia;
			System.out.println("Guia ocupado en la fecha");
			return true;
		}
		
		return false;
		
	
	}
}
