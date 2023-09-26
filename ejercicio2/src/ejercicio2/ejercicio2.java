package ejercicio2;
/* Autor Exequiel Dominguez */
import java.util.Scanner;

/* ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
● Tener 3 o más vehículos con una antigüedad menor a 5 años.
● Tener 3 o más inmuebles.
● Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.”
Tomado de https://www.argentina.gob.ar/subsidios el 07/12/2022
a. Lea atentamente el texto, primero que nada piense cuáles son las variables de
entrada.
b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo
en clase, también puede consultar este link
c. Piense en un arbol de decision, tambien como se vio en clase si puede resolver
el problema, dadas las entradas
1
Clase 1 - “Desarrollador Java inicial”
d. Finalmente, vea si puede resolver el problema utilizando código Java. Por
ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
tendríamos el código que se muestra más abajo, y cambiando las variables */


public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int ingresosTotales = 489083;
		String anio = "";
		String lujo = "";
		
		System.out.println("Ingrese los ingresos mensuales del hogar...");
		int ingresoHogar = leer.nextInt();
		
		System.out.println("Ingrese la cantidad de autos o cero(0) si no posee");
		int auto = leer.nextInt();
		
		if(auto>0) {
			do {
			System.out.println("Algun auto tiene menos de 5 años de antiguedad? S/N");
			anio = leer.next();
			anio = anio.toUpperCase();
			
			if(!anio.equals("S") && !anio.equals("N")) {
		        System.out.println("Introdujo una letra equivocada... Vuelva a ingresar la letra por favor");        
		    }
			
		} while(!anio.equals("S") && !anio.equals("N"));
		};
		
		System.out.println("Cuantos inmuebles posee?");
		int inmuebles=leer.nextInt();
		
		do {
			System.out.println("Tiene alguna embarcacion, aeronave de lujo o ser titular de activos"
					+ " societarios que demuestren capacidad económica plena? S/N");
			lujo = leer.next();
			lujo = lujo.toUpperCase();
			
			if(!lujo.equals("S") && !lujo.equals("N")) {
		        System.out.println("Introdujo una letra equivocada... Vuelva a ingresar la letra por favor");        
		    }
			
		} while(!lujo.equals("S") && !lujo.equals("N"));
		
		if(ingresoHogar >= ingresosTotales || auto>=3 || anio.equalsIgnoreCase("S") || inmuebles>=3 || lujo.equalsIgnoreCase("S")) {
			System.out.println("Esta dentro del sector de altos ingresos");
		} else {
			System.out.println("NO Esta dentro del sector de altos ingresos");
		};
						
	};

};
