package guia_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ejercicio3 {

	public class Main {
		public static void codificar(File fichero, int desplazamiento) {
		    FileInputStream fis = null;
		    StringBuilder guardar = new StringBuilder();

		    try {
		        System.out.println("... Leer el archivo ...");
		        fis = new FileInputStream(fichero);
		        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

		        // Leemos el archivo byte a byte
		        int byteLeido;
		        while ((byteLeido = isr.read()) != -1) {
		            // Realiza tu lógica de codificación aquí
		            // Por ejemplo, puedes convertir cada byte a su representación hexadecimal
		            String byteCodificado = String.format("%02X", byteLeido + desplazamiento); // Desplazamiento
		            System.out.print(byteCodificado + " ");
		            guardar.append(byteCodificado); // Agrega el resultado al guardado
		        }
		        System.out.println("");
		        System.out.println("Guardado correctamente");
		    } catch (IOException ex) {
		        System.out.println("Mensaje: " + ex.getMessage());
		    } finally {
		        if (fis != null) {
		            try {
		                fis.close();
		            } catch (IOException ex) {
		                System.out.println("Mensaje: " + ex.getMessage());
		            }
		        }
		    }
		    // Guardar el resultado en otro archivo
		    File salida = new File("C:\\Users\\Exequ\\OneDrive\\Documentos//salida.txt");
		    try (PrintWriter writer = new PrintWriter(new FileOutputStream(salida))) {
		        writer.print(guardar.toString()); // Guardar el archivo
		    } catch (IOException ex) {
		        System.out.println("Mensaje: " + ex.getMessage());
		    }
		}

	    
	    public static void decodificar(File fichero, int desplazamiento) {
	        StringBuilder guardar = new StringBuilder();
	        Scanner s = null;

	        try {
	            System.out.println("... Leer el archivo ...");
	            s = new Scanner(fichero);

	            // Leemos línea a línea el fichero
	            while (s.hasNextLine()) {
	                String linea = s.nextLine(); // Guardamos la línea en un String
	                System.out.println(linea); // Imprimimos la línea cuyo texto original es 123

	                StringBuilder shiftedLine = new StringBuilder();
	                for (int i = 0; i < linea.length(); i++) {
	                    char character = linea.charAt(i);
	                    char shiftedCharacter = (char) (character + desplazamiento); // Desplazamiento
	                    shiftedLine.append(shiftedCharacter);
	                }

	                guardar.append(shiftedLine).append("\n"); // Agregamos la línea al StringBuilder
	            }
	            System.out.println("Guardado correctamente");
	        } catch (Exception ex) {
	            System.out.println("Mensaje: " + ex.getMessage());
	        } finally {
	            if (s != null) {
	                s.close();
	            }
	        }

	        // Guardar el resultado en otro archivo
	        File outputFile = new File("C:\\Users\\Exequ\\OneDrive\\Documentos//salida.txt");
	        try (PrintWriter writer = new PrintWriter(new FileOutputStream(outputFile))) {
	            writer.print(guardar.toString()); // Guardar el archivo
	        } catch (IOException ex) {
	            System.out.println("Mensaje: " + ex.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner leer = new Scanner(System.in);
	    	
	        File file = new File("C:\\Users\\Exequ\\OneDrive\\Documentos//entrada.txt");
	        
	        System.out.println("Ingrese si desea codificar \"C\" o decoficar \"D\" ");
	        String opc = leer.next();
	        System.out.println("Quiere desplamiento 1 o 2?");
	        int desplazamiento=leer.nextInt();
	        
	        if (opc.equalsIgnoreCase("C")) {
				codificar(file,desplazamiento);
			} else {
				decodificar(file,desplazamiento);
			}    
	    }
	}
}
