package io.github.unlp_oo.Ejercicio21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements IDateLapse {
	private LocalDate from;
	private LocalDate to;
	public DateLapse (LocalDate from,LocalDate to) 
	{
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {return this.from;}
	//“Retorna la fecha de inicio del rango”

	public LocalDate getTo() {return this.to;}
	//“Retorna la fecha de fin del rango”

	public int sizeInDays() 
	{ 
		return (int) ChronoUnit.DAYS.between(this.from, this.to);
	}
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other) 
	{
		
		return !from.isAfter(other) && !to.isBefore(other);
	}
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.

	@Override
	public boolean overlaps(DateLapse anotherDateLapse) {
		return !(this.getTo().isBefore(anotherDateLapse.getFrom()) ||
		         this.getFrom().isAfter(anotherDateLapse.getTo()));
	}
	/** 
		Retorna true si el período de tiempo del receptor se superpone con el 
		recibido por parámetro 
	**/ 

}
