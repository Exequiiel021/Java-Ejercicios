package guia_2;

import java.util.Scanner;

public class ejercicio1_B {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int vector[];
		int nElementos;
		int aux;
		int num;
		
		System.out.println("Ingrese la cantidad de elementos del arreglo");
		nElementos = leer.nextInt();
		
		vector = new int[nElementos];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingres el numero para la posicion " + i);
			vector[i] = num=leer.nextInt();
		}
		
		for (int i = 0; i < nElementos-1; i++) {
			for (int j = 0; j < nElementos-1; j++) {
				if(vector[j]> vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}
		
		System.out.println("De forma ascendente");
		for (int i = 0; i < nElementos; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Ordenado de forma decreciente");
		for (int i = nElementos-1; i >=0; i--) {
			System.out.print(vector[i] + " ");
		}
		
	}
}
