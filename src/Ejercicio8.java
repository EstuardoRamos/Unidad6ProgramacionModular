package src;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Ejercicio8 eje = new Ejercicio8();
    }
    String[] palabras = new String[5];
    String[] palabras1 = new String[5];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio8() {
        ingresarDatos();
        compararDatos();
    }

    public void ingresarDatos() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra: ");
            palabras[i] = scanner.next();

            //System.out.println(canLetr);
            System.out.print("Ingrese una palabra para el arreglo 2: ");
            palabras1[i] = scanner.next();

            //System.out.println(canLetr1);
        }
    }

    public void compararDatos() {
        int canLetr = palabras[0].length();
        int canLetr1 = palabras1[0].length();
        if (palabras[0].length() == palabras1[0].length()) {
            System.out.println("La palabra " + palabras[0] + " tiene " + canLetr + " letras y la palabra " + palabras1[0] + " tiene " + canLetr1 + " letras");
            System.out.println("son del mismo tamaño");

        } else {
            System.out.println("La palabra "+0+". " + palabras[0] + " tiene " + canLetr + " letras y la palabra " + palabras1[0] + " tiene " + canLetr1 + " letras");
            System.out.println("No son del mismo tamaño");
        }
    }
}