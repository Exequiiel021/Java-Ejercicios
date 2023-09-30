package guia_4;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String letra;
		File fichero = new File("C:\\Users\\Exequ\\OneDrive\\Documentos\\num.txt");
		
		do {
			System.out.println("Ingrese letra S=Suma o M=Multiplicacion");
			letra = leer.next();

		} while (!letra.equalsIgnoreCase("S") && !letra.equalsIgnoreCase("M"));

		leerFichero(fichero, letra);
	}

	public static void leerFichero(File fichero, String letra) {

		Scanner s = null;
		int sumatoria = 0;

		try {
			System.out.println("... Leer el archivo ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); // Guardamos la linea en un String
				System.out.println(linea); // Imprimimos la linea cuyo texto original es "123"

				if (letra.equalsIgnoreCase("S")) {
					for (int i = 0; i < linea.length(); i++) {
						int numero = Character.getNumericValue(linea.charAt(i)); // convierto el string a numeros para
																					// sumarlos
						sumatoria += numero;
					}
				} else {
					sumatoria = 1;
					for (int i = 0; i < linea.length(); i++) {
						int numero = Character.getNumericValue(linea.charAt(i)); // convierto el string a numeros para
																					// multiplicar
						sumatoria = numero * sumatoria;
					}
				}
			}
			System.out.println(sumatoria);

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
