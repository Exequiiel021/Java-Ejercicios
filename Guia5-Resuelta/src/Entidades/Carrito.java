package Entidades;

import java.time.LocalDate;
import java.util.List;

public class Carrito {

	private LocalDate fecha;
	private List<ItemCarrito> itemCarrito;
	
	public Carrito() {
		
	}

	public Carrito(LocalDate fecha, List<ItemCarrito> itemCarrito) {
		this.fecha = fecha;
		this.itemCarrito = itemCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<ItemCarrito> getItemCarrito() {
		return itemCarrito;
	}

	public void setItemCarrito(List<ItemCarrito> itemCarrito) {
		this.itemCarrito = itemCarrito;
	}

	@Override
	public String toString() {
		return "Carrito [fecha=" + fecha + ", itemCarrito=" + itemCarrito + "]";
	}
	
	
}
