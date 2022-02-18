/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primer_Parcial;

/**
 *
 * @author Pc
 */
public class Encuesta {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ciclo();
           
    }
    static int repeticiones = 0;
    private static void numerosRandom() {
       int n= (int)(Math.random()*(21+1)-11);//Genera un numero aleatorio entre -10 a 10 
        System.out.println(n);//imprime el numero aleatorio 
        resultados(n, repeticiones);
    }
    
     private static void ciclo() {
        int numeros = 3000; 
           int numero = 10;
        for(int i=0;i<numeros;i++){
            for(int j = 0; j < numero; j++){
              numerosRandom(); 
              repeticiones++;
            }
        }
    }


    private static void resultados(int n, int repeticiones) {
        String r=" ";
        repeticiones= repeticiones;
        switch(repeticiones){
                case -10:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -9:
                     r= "*";
                    System.out.println(n+"\n");
                    break;
                case -8:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -7:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -6:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -5:
                     r= "*";
                    System.out.println(n+"\n");
                    break;
                case -4:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -3:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -2:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case -1:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 1:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 2:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 3:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 4:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 5:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 6:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 7:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 8:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 9:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
                case 10:
                    r = "*";
                    System.out.println(n+"\n");
                    break;
            }
        }
}


   
