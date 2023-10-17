package Entidades;

public class DescuentoPorcentaje extends Descuento {

    private double porcentaje = 0.21; 

    public DescuentoPorcentaje() {
    }

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double descuento(double precio) {
        
        return precio * (1 - porcentaje);
    }
}
