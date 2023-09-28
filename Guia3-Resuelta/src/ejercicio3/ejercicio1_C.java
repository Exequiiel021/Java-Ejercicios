package ejercicio3;

/*c. dado un vector de number, y un número X, que sume todos los números > X y
return el resultado*/

import java.util.Scanner;

public class ejercicio1_C {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese el valor \"X\"");
		int X = leer.nextInt();

		System.out.println("Ingrese el tamaño del vector");
		int tamanio = leer.nextInt();

		int[] vector = new int[tamanio];

		System.out.println("Ingrese los numeros al vector");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = leer.nextInt();
		}

		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > X) {
				suma = suma + vector[i];
			}
		}	
		System.out.println("El resultado de la suma de los numeros mayores a X es de: " + suma);
	}
}
