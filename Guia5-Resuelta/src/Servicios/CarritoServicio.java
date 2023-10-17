package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Carrito;
import Entidades.Descuento;
import Entidades.DescuentoFijo;
import Entidades.DescuentoPorcentaje;
import Entidades.DescuentoPorcentajeConTope;
import Entidades.ItemCarrito;
import Entidades.Producto;

public class CarritoServicio {

	Scanner leer = new Scanner(System.in);
	Descuento descuento; // El atributo de tipo Descuento

	public CarritoServicio() {
		// Asignar un valor por defecto al atributo descuento
		this.descuento = new DescuentoFijo();
	}

	public CarritoServicio(Descuento descuento) {
		// Asignar el valor pasado por parámetro al atributo descuento
		this.descuento = descuento;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}

	public List<ItemCarrito> cargarProducto() {

		List<ItemCarrito> listaProducto = new ArrayList<>();
		boolean aux = true;

		do {
			Producto producto = new Producto();
			ItemCarrito itemCarrito = new ItemCarrito();

			System.out.println("Ingrese el nombre del producto");
			producto.setNombre(leer.next());
			System.out.println("Ingrese el precio del producto");
			producto.setPrecio(leer.nextInt());
			
			System.out.println("Ingrese la cantidad de productos de: " + producto.getNombre());
			itemCarrito.setCantidad(leer.nextInt());
			itemCarrito.setProducto(producto);
			
			listaProducto.add(itemCarrito);
			
			System.out.println("Desea agregar otro producto?S/N");
			
			if (leer.next().equalsIgnoreCase("N")) {
				aux=false;
			}
				
		} while (aux);

		return listaProducto;
		
	}

	public void mostrarLista(List<ItemCarrito> lista) {
		
		for (ItemCarrito itemCarrito : lista) {
			System.out.println(itemCarrito.toString());
		}
	}
	

	public double precio(List<ItemCarrito> lista) {

		double precio = 0;

		for (ItemCarrito itemCarrito : lista) {
			precio += itemCarrito.getProducto().getPrecio() * itemCarrito.getCantidad();
		}

        // Aplicar el descuento al precio total
        precio = descuento.descuento(precio);

		return precio;

	}

    public void elegirDescuento(int tipo) {
        // Usar un switch-case para asignar el descuento según el tipo
        switch (tipo) {
            case 1: // Si el tipo es 1, asignar un descuento fijo
                this.descuento = new DescuentoFijo();
                break;
            case 2: // Si el tipo es 2, asignar un descuento porcentual
                this.descuento = new DescuentoPorcentaje();
                break;
            case 3: // Si el tipo es 3, asignar un descuento porcentual con tope
                this.descuento = new DescuentoPorcentajeConTope();
                break;
            default: // Si el tipo no es válido, mostrar un mensaje de error
                System.out.println("Tipo de descuento no válido");
        }
    }
}

