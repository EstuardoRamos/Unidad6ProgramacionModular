package src;

public class Ejercicio4 {

    public static void main(String[] args) {
        Ejercicio4 t = new Ejercicio4();
    }
    int[] numeros = new int[10];
    int numMayor = 0, n, distanciaNum;

    public Ejercicio4() {
        for (int i = 0; i < 10; i++) {
            numAleatorio(i);
        }
        for (int i = 0; i < 5; i++) {
            mostrarDato(i);
            numeroMayor(i);

        }
        System.out.println("El numero mayor es " + numMayor + " y se repite " + n + " veces ");
        distanciaNumero();
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

    public void distanciaNumero() {
        for (int i = 0; i < 10; i++) {
            distanciaNum = numMayor - numeros[i];
            System.out.println("La distancia del numero " + numeros[i] + " mayor es " + distanciaNum);

        }
    }
}