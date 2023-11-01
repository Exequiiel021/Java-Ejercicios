package org.example;

import Entidades.Persona;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Persona persona = new Persona();

        persona.setNombre("Exequiel");
        persona.setApellido("Godoy");

        System.out.println("Nombre: " + persona.getNombre()+ " Apellido: " + persona.getApellido());






    }
}