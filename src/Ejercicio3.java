package src;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3 t = new Ejercicio3();
    }

    int[] numeros = new int[8];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio3() {
        for (int i = 0; i < 8; i++) {
            ingresarDatos(i);

        }
        buscarDato();
    }

    public void ingresarDatos(int numero) {
        System.out.print(numero + ". Ingrese un numero: ");
        numeros[numero] = scanner.nextInt();
    }

    public void buscarDato() {
        int buscar = 0;
        System.out.println("Ingrese numero que desea buscar: ");
        buscar = scanner.nextInt();

        int contador = 0;
        while (contador < 8 && numeros[contador] != buscar) {
            contador++;
        }
        if (contador != 8) {
            System.out.println("Numero encontrado en el espacio numero " + contador);

        } else {
            System.out.println("Numero no encontrado");
        }
    }

}