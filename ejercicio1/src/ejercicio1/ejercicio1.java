package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese el primero numero");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo numero");
		int num2 = leer.nextInt();

		int auxB = num1;
		int auxC = num1;
		int auxD = num1;

		// A
		System.out.println("Ejercicio A");
		while (num1 <= num2) {

			System.out.print(num1 + ", ");
			num1++;
		};
		
		System.out.println("");

		// B
		System.out.println("Ejercicio B");
		while (auxB <= num2) {
			if (auxB % 2 == 0) {
				System.out.println("El numero " + auxB + " es par");
			};
			auxB++;
		};
		System.out.println("");
		
		// C
		System.out.println("Ejercicio C");
		System.out.println("Ingrese que opcion desea.... 1(IMPAR) o 2(PAR)");
		int opc = leer.nextInt();

		if (opc == 1) {
			while(auxC<=num2) {
				if (auxC % 2 != 0) {
				System.out.println("El numero " + auxC + " es impar");
				
			};
			auxC++;
			};
				
		}else {
			while(auxC<=num2) {
				if (auxC % 2 == 0) {
				System.out.println("El numero " + auxC + " es par");
				
			};
			auxC++;
			};
		};
		System.out.println("");
		
		//D
		System.out.println("Ejercicio D");
		for(int i = num2; i>=auxD; i-- ) {
				if (i % 2 == 0) {
				System.out.println("El numero " + i + " es par");
			};		
		};
	};

};
