package Primer_Parcial;

public class Arreglado {
    public static void main(String[] args) {
        ciclo();

    }

    private static void ciclo() {
        final int numeros = 100;
        int [] numeroObtenido = new int [numeros];
        int[][] arreglo = new int [20][2];
        int n = 0;
        int contador = 0, lugar = 0;

        for (int i = 0; i < numeros; i++) {
            n = (int) (Math.random() * (21 + 1) - 11);
            numeroObtenido[i] = n;
        }

        for(int i = -10; i < 11; i++){
            for (int x = 0; x < numeros; x++) {
                if(i == numeroObtenido[x]){
                    contador++;
                }
            }
            arreglo[lugar][0] = i;
            arreglo[lugar][1] = contador;
            if(lugar < 19){
                lugar++;
            }
        }

        for(int i = 0; i < numeros; i++){
            System.out.print(i + "  \t");
        }
            System.out.print("\n");
        for(int i = 0; i < 20; i++){
            System.out.print(arreglo[i][0] + "  \t");
            for(int x = 0; x < arreglo[i][1] - 1; x++){
                System.out.print("  \t");
            }
            System.out.print("X\n");
        }

    }
}
