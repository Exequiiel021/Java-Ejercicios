package Entidades;

import java.time.LocalDate;

public abstract class Descuento {

	private LocalDate comienzo;
	private LocalDate fin;
	
	public double descuento(double precio) {
		
		return 0;
	}
}
