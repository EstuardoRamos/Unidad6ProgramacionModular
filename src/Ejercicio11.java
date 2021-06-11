package src;

import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {
        Ejercicio11 je = new Ejercicio11();
    }
    String[] nombres = new String[6];
    String[] notasLetras = new String[6];
    int[] notas = new int[6];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio11() {
        ingresarInfo();
    }

    public void ingresarInfo() {
        for (int i = 0; i < 6; i++) {

            System.out.print((i + 1) + ". Ingrese el numbre del alumno: ");
            nombres[i] = scanner.next();
            do {
                System.out.print("   Ingrese la nota del alumno: ");
                notas[i] = (int) scanner.nextFloat();
            } while (notas[i] > 10);
        }
        darNotaEscrita();
    }

    public void darNotaEscrita() {
        for (int i = 0; i < 6; i++) {
            if ((float) notas[i] < 5) {
                notasLetras[i] = "Suspenso";
            } else if ((float) notas[i] >= 5 && (float) notas[i] < 7) {
                notasLetras[i] = "Bien";
            } else if ((float) notas[i] >= 7 && (float) notas[i] < 9) {
                notasLetras[i] = "Notable";
            } else if ((float) notas[i] >= 9 && (float) notas[i] < 11) {
                notasLetras[i] = "Sobresaliente";
            }

            imprimirDatos(i);
        }

    }

    public void imprimirDatos(int i) {
        System.out.println("\n " + nombres[i] + " " + (float) notas[i] + " " + notasLetras[i]);
    }
}
