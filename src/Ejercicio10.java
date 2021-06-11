package src;

public class Ejercicio10 {

    public static void main(String[] args) {
        Ejercicio10 je = new Ejercicio10();
    }

    int[][] matriz1 = new int[3][4];
    int[][] matrizTranspuesta = new int[4][3];
    //int[][] matrizSuma = new int[10][10];

    public Ejercicio10() {
        // datosMatriz();
        crearMatriz();
        cambioMatriz();
    }

    public void crearMatriz() {
        System.out.println("Matriz 3x4");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random() * 555);
                System.out.print(matriz1[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println(" ");

    }

    public void cambioMatriz() {
        System.out.println("\nLa matriz Transpusta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[i][j] = matriz1[j][i];
                System.out.print(matrizTranspuesta[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
