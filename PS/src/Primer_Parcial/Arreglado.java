package Primer_Parcial;

public class Arreglado {
    public static void main(String[] args) {
        ciclo();

    }

    private static void ciclo() {
        final int numeros = 3000;
        int [] numeroObtenido = new int [numeros];
        int[][] arreglo = new int [20][2];
        int n = 0;
        int contador = 0, lugar = 0;

        for (int i = 0; i < numeros; i++) {
            n = (int) (Math.random() * (21 + 1) - 11);
            numeroObtenido[i] = n;
        }

        for(int i = -10; i < 11; i++){
            lugar++;
            for (int x = 0; x < numeros; x++) {
                if(i == numeroObtenido[x]){
                    contador++;
                }
            }
            arreglo[lugar][1] = i;
            arreglo[lugar][2] = contador;
        }
    }
}
