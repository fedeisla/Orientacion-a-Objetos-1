package io.github.unlp_oo.Praacial2025;

import java.time.LocalDate;
import java.util.*;

public class Guia {
	private List<LocalDate> agenda;
	private double honorarios;
	public Guia (double honorarios) 
	{
		this.agenda = new LinkedList<>();
		this.honorarios= honorarios;
	}
	public boolean estaLibre (LocalDate fecha) 
	{
		return !this.agenda.contains(fecha);
	}
	public void registraFecha(LocalDate fecha) 
	{
		this.agenda.add(fecha);
	}
	public double getHonorarios() { return this.honorarios;}

}
