package src;

public class Ejercicio7 {

    public static void main(String[] args) {
        Ejercicio7 r = new Ejercicio7();
    }

    int[][] matriz = new int[4][3];

    public Ejercicio7() {
        llenarMatriz();
    }

    public void llenarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 555);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        sumaFila();
    }

    public void sumaFila() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i+1) % 2 == 0) {
                    total += matriz[i][j];
                }
            }
        }

        System.out.println("El total de la suma de los elementos de las filas pares es: " + total);
    }

}