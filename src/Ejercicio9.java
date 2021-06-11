package src;

import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        Ejercicio9 je = new Ejercicio9();
    }

    int[][] matriz = new int[10][10];
    int[][] matriz2 = new int[10][10];
    int[][] matrizSuma = new int[10][10];

    Scanner scanner = new Scanner(System.in);

    public Ejercicio9() {
        datosMatriz();
    }

    public void datosMatriz() {
        int numfilas, numColumnas;
        System.out.print("Ingrese el numero de filas de la matriz: ");
        numfilas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        numColumnas = scanner.nextInt();
        crearMatrices(numfilas, numColumnas);
    }

    public void crearMatrices(int numFilas, int numColumnas) {
        System.out.println("\nMatriz No.1");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz[i][j] = (int) (Math.random() * 555);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz No.2");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz2[i][j] = (int) (Math.random() * 355);
                System.out.print(matriz2[i][j] + "  ");
            }
            System.out.println("");
        }
        sumarMatrices(numFilas, numColumnas);
    }

    public void sumarMatrices(int numFilas, int numColumnas) {
        System.out.println("\nLa suma de las matrices es:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matrizSuma[i][j] = matriz2[i][j] + matriz[i][j];
                System.out.print(matrizSuma[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
