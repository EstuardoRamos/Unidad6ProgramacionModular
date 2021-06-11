package src;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Ejercicio5 t = new Ejercicio5();
    }
    int[] notas = new int[100];

    Scanner scanner = new Scanner(System.in);

    public Ejercicio5() {
        for (int i = 0; i < 3; i++) {
            iniciarArreglo();
        }
    }

    public void iniciarArreglo() {
        int contador = 0;
        int tNotas = 0;
        while (contador < 100 && notas[contador] != -50) {

            contador++;
            System.out.print("Ingrese nota: ");
            notas[contador] = scanner.nextInt();
            tNotas += notas[contador];

        }
        promedioNotas(tNotas, contador);

    }

    public void promedioNotas(int totalNotas, int numeroDeNotas) {
        float promedio = (float) (totalNotas + 50) / (numeroDeNotas - 1);
        System.out.println("El promedio es " + promedio);
        System.out.println(" ");        
    }

}
