package Entidades;

public class DescuentoFijo extends Descuento {
	
	private double fijo = 200; 

	public DescuentoFijo() {
	}

	public DescuentoFijo(double fijo) {
		this.fijo = fijo;
	}

	public double getFijo() {
		return fijo;
	}

	public void setFijo(double fijo) {
		this.fijo = fijo;
	}
	
	@Override
	public double descuento(double precio) {
		
		return precio - fijo;
	}
}

