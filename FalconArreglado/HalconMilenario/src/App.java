import java.util.Scanner;

public class App {
    static int i = 0;

    public static void calentando() {
        System.out.println("Iniciando calentado");
        int valor = 0;
        while (valor < 400 || valor > 430) {
            valor = (int) (Math.random() * 500);
            if (valor > 430) {
                System.out.println("Intento fallido, reiniciando sistema");
                i = 0;
            } else if (valor < 400) {
                i++;
                System.out.println("Este es el intento " + i + " se obtuvo el número " + valor + " intentando de nuevo");
            }
        };
        System.out.println("Motor calentando, iniciando el modo de arranque");
        arranque();
    }

    private static void arranque() {
        System.out.println("Iniciando el arranque");
        int valor = 0;
        while (valor < 615 || valor > 600) {
            valor = (int) (Math.random() * 650);
            if (valor > 615) {
                System.out.println("Intento fallido, reiniciando sistema " + valor);
                calentando();
                i = 0;
            } else if (valor < 600) {
                i++;
                System.out.println("Este es el intento " + i + " se obtuvo el número " + valor + " intentando de nuevo");
            }
        };
        System.out.println("Motor arrancado exitosamente, iniciando el modo de aceleración");
        aceleracion();
    }

    private static void aceleracion() {
        System.out.println("Iniciando la aceleración");
        int valor = 0;
        while (valor < 213 || valor > 200) {
            valor = (int) (Math.random() * 300);
            if (valor > 213) {
                System.out.println("Intento fallido, reiniciando sistema");
                calentando();
                i = 0;
            } else if (valor < 200) {
                i++;
                System.out.println("Este es el intento " + i + " se obtuvo el número " + valor + " intentando de nuevo");
            }
        };
        System.out.println("Motor acelerado exitosamente, iniciando el hiperespacio");
        hiperespacio();
    }

    private static void hiperespacio() {
        System.out.println("Preparando hiperespacio");
        int valor = 0;
        while (valor < 117 || valor > 113) {
            valor = (int) (Math.random() * 200);
            if (valor > 117) {
                System.out.println("Intento fallido, reiniciando sistema");
                calentando();
                i = 0;
            } else if (valor < 113) {
                i++;
                System.out.println("Este es el intento " + i + " se obtuvo el número " + valor + " intentando de nuevo");
            }
        };
        System.out.println("El hiperespacio esta listo");
        System.out.println("El numero de intentos totales fueron " + i);
        System.out.println("Entrando en hiperespacio en...3...2...1");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calentando();
    }
}
