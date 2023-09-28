package ejercicio3;

/*Exe*/

import java.util.Scanner;

public class ejercicio1_A {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		String palabra = leer.next();
		System.out.println("Ingrese la letra para ver cuantas veces se repeti en la palabra");
		String letra = leer.next();
		
		int count = 0;
		String[] vector = palabra.split("");
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].equalsIgnoreCase(letra)) {
				count++;
			}
		}
		System.out.println("La letra " + letra + " se repite: " + count + " veces");
	}
}
