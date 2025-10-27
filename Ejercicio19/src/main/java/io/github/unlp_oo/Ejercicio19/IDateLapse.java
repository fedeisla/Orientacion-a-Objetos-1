package io.github.unlp_oo.Ejercicio19;

import java.time.LocalDate;


public interface IDateLapse {
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays() ;
	public boolean includesDate(LocalDate other);
	public boolean overlaps (DateLapse anotherDateLapse); 
}
