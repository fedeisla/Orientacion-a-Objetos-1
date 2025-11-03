package io.github.unlp_oo.Ejercicio21;

public class PersonaFisica extends Cliente {

	private int DNI;
	public PersonaFisica(String nombre, String direccion, int DNI) {
		super(nombre, direccion);
		this.DNI = DNI;
	}
	
	public double calcularMonto(DateLapse rango) {
		
		double monto = super.calcularMonto(rango);
		return monto-(monto * 0.10);
	}

}
