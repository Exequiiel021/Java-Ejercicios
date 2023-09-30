package guia_4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] vector = new int[3];
		int num;
		String letra;

		do {
			System.out.println("Ingrese letra del orden que desea A=Ascendente, D=Decreciente o por Azar=R");
			letra = leer.next();

			if (!letra.equalsIgnoreCase("d") && !letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("r")) {
				System.out.println("Introdujo una opcion incorrecta...vuelva a ingresar la letra");
			};

		} while (!letra.equalsIgnoreCase("d") && !letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("r"));

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("d")) {
			for (int i = 0; i < vector.length; i++) {
				System.out.println("Ingres el numero para la posicion " + i);
				vector[i] = num = leer.nextInt();
			};
			ordenamiento(vector, letra);
		} else {
			int[] vectorDefecto = {1, 2, 3};
			ordenamiento(vectorDefecto, letra);
		};
	};

	public static void ordenamiento(int a[], String letra) {
		int aux;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				};
			};
		};
		if (letra.equalsIgnoreCase("a")) {

			System.out.println("De forma ascendente");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			};
		} else if (letra.equalsIgnoreCase("d")) {
			System.out.println("Ordenado de forma decreciente");
			for (int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i] + " ");
			};
		};
		//si el valor viene por defecto sin que el usuario coloque por consola los parametros
		if (letra.equalsIgnoreCase("r")) {
			System.out.println("De forma ascendente");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			};
			System.out.println("");
			System.out.println("Ordenado de forma decreciente");
			for (int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i] + " ");
			};
		};
	};
};
