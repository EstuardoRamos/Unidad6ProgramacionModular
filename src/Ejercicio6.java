package src;

public class Ejercicio6 {

    public static void main(String[] args) {
        Ejercicio6 t = new Ejercicio6();
    }
    int matriz[][] = {{5, 16, 13}, {14, 2, 4}, {21, 7, 6}};

    public Ejercicio6() {
        System.out.println("la matriz dada es: ");
        imprimirMatriz();
    }

    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("La matriz multiplicada por 2 es: ");
        multiplicarMatriz();
    }

    public void multiplicarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(2 * matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
