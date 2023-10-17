package Entidades;

public class DescuentoPorcentajeConTope extends Descuento {
	
	private double porcentaje = 0.21; // El valor del porcentaje de descuento
    private double tope = 500; // El valor del tope fijo

    public DescuentoPorcentajeConTope() {
    }

    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }

    @Override
    public double descuento(double precio) {
        // Calcular el valor del descuento porcentual
        double descuento = precio * porcentaje;

        // Si el descuento supera el tope, usar el tope como descuento
        if (descuento > tope) {
            descuento = tope;
        }

        // Restar el descuento al precio original
        return precio - descuento;
    }
}



