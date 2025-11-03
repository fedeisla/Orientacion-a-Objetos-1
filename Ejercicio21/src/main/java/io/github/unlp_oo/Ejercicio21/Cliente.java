package io.github.unlp_oo.Ejercicio21;
import java.util.*;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public Cliente (String nombre, String direccion) 
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new LinkedList<Envio>();
	}
	
	public  double calcularMonto(DateLapse rango) 
	{
		return this.envios.stream().filter(f->rango.includesDate(f.getFechaDespacho())).mapToDouble(env->env.costoEnvio()).sum();
	};
	
	public  void agregaEnvio(Envio envio) 
	{
		this.envios.add(envio);
	}
	
}
