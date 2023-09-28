package ejercicio3;

import java.util.Scanner;

public class ejercicio1_B {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 3 numeros, por cada numero de enter");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		int num3 = leer.nextInt();
		System.out.println("Ordenados de forma ascendente");
		
		int[] vector = new int[3];
		
		for (int i = 0; i < vector.length; i++) {
			if (num1<num2 && num1<num3 && num2<num3) {
				vector[0]=num1;
				vector[1]=num2;
				vector[2]=num3;	
			} else if (num1<num2 && num1>num3) {
				vector[0]=num3;
				vector[1]=num1;
				vector[2]=num2;
			} else if(num1<num2 && num1<num3 && num2>num3) {
				vector[0]=num1;
				vector[1]=num3;
				vector[2]=num2;
			}else if(num1>num2 && num1>num3 && num2<num3){
				vector[0]=num2;
				vector[1]=num3;
				vector[2]=num1;
			}else if(num1>num2 && num1>num3 && num2<num1) {
				vector[0]=num3;
				vector[1]=num2;
				vector[2]=num1;
			}else {
				vector[0]=num2;
				vector[1]=num1;
				vector[2]=num3;
			}
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
	}

}
