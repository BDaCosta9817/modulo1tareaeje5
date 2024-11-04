//Blanca Da Costa Gomez Carcamo
//202310010031
//Programa con arreglo multidimensionales para almacenar datos
package com.mycompany.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[][] compañeros = {
            {"Daniel", "Medina", "Electronica", "TEST"},
            {"Monica", "Jiz", "Computacion", "IMSA"},
            {"Ruth", "Hernandez", "Ingenieria Industrual", "BAC"},
            {"Jose", "Gomez", "Ingenieria Sistema", "INGENIA"},
            {"Carlos", "Lopez", "Sistemas", "SOLUCIONES"}
        };

        // notas 
        int[] notas = {98, 99, 97, 95, 97};

        //mensaje de salida
        System.out.println("Resultados de los estudiantes:\n");
        for (int i = 0; i < compañeros.length; i++) {
            String nombre = compañeros[i][0];
            int nota = notas[i];
            String estado = (nota >= 60) ? "Aprobado" : "Reprobado";

            System.out.println("Nombre: " + nombre);
            System.out.println("Nota: " + nota);
            System.out.println("Estado: " + estado);
            System.out.println();
        }
    }
}