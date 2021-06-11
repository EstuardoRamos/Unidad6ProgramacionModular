package src;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 t = new Ejercicio2();
    }
    int numMayor = 0, n;
    int[] numeros = new int[10];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio2() {
        for (int i = 0; i < 10; i++) {
            numAleatorio(i);
        }
        for (int i = 0; i < 5; i++) {
            mostrarDato(i);
            numeroMayor(i);
        }
        System.out.println("El numero mayor es " + numMayor + " y se repite " + n + " veces ");
    }

    public void numAleatorio(int num) {
        numeros[num] = (int) (Math.random() * 99);
    }

    public void mostrarDato(int numero) {
        System.out.println("No. " + numero + " el valor es: " + numeros[numero]);
    }

    public void numeroMayor(int numer) {

        if (numeros[numer] > numMayor) {
            numMayor = numeros[numer];
        }
        if (numMayor == numeros[numer]) {
            n += 1;
        }

    }

}
