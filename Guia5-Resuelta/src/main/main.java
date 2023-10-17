package main;

import java.util.List;
import java.util.Scanner;

import Entidades.ItemCarrito;
import Entidades.Producto;
import Servicios.CarritoServicio;

public class main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		CarritoServicio cs = new CarritoServicio();
		
		List<ItemCarrito> lista = cs.cargarProducto();
		
		cs.mostrarLista(lista);
		
		System.out.println("Que tipo de descuento desea FIJO(1) , PORCENTAJE sin IVA(2) O DescuentoTope(3- solo afiliados)");
		int opc = leer.nextInt();
		
		cs.elegirDescuento(opc);
		
		System.out.println("Precio a pagar con el descuento : $" + cs.precio(lista));
		

	}

}
