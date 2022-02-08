/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconmilenario;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class HalconMilenario {
static int intentos = 0;
    public static void calentando(){
        System.out.println("Iniciando calentado");
        int valor = (int)(Math.random()*(450-350 + 1)+350);
        if(valor>430){
            System.out.println("Intento fallido, reiniciando sistema");
            calentado();
            intentos = 0;
        }else if(valor<400){
            intentos++;
            System.out.println("Este es el intento "+intentos+" se obtuvo el número "+valor+" intentando de nuevo");
            calentando();
        }else if(valor>400 && valor<430){
            System.out.println("Motor calentando, iniciando el modo de arranque");
            arranque();
        }
    }
    private static void arranque(){
        System.out.println("Iniciando el arranque");
        int valor = (int)(Math.random()*(650-550 + 1)+550);
        if(valor>615){
           System.out.println("Intento fallido, reiniciando sistema"); 
           calentando();
           intentos = 0;
        }else if(valor<600){
            intentos++;
            System.out.println("Este es el intento "+intentos+" se obtuvo el número "+valor+" intentando de nuevo");
            arranque();
        }else if(valor<615 && valor>600){
            System.out.println("Motor arrancado exitosamente, iniciando el modo de aceleración");
            aceleracion();
        }
        
    }
    private static void aceleracion(){
        System.out.println("Iniciando la aceleración");
        int valor = (int)(Math.random()*(300-150 +1)+150);
        if(valor>213){
           System.out.println("Intento fallido, reiniciando sistema"); 
           calentando();
           intentos = 0;
        }else if(valor<200){
            intentos++;
            System.out.println("Este es el intento "+intentos+" se obtuvo el número "+valor+" intentando de nuevo");
            aceleracion();
        }else if(valor<213 && valor>200){
            System.out.println("Motor acelerado exitosamente, iniciando el hiperespacio");
            hiperespacio();
        }
    }
    private static void hiperespacio(){
        System.out.println("Preparando hiperespacio");
        int valor = (int)(Math.random()*(200-100)+100);
        if(valor>117){
           System.out.println("Intento fallido, reiniciando sistema"); 
           calentando();
           intentos = 0;
        }else if(valor<113){
            intentos++;
            System.out.println("Este es el intento "+intentos+" se obtuvo el número "+valor+" intentando de nuevo");
            hiperespacio();
        }else if(valor<117 && valor>113){
            System.out.println("El hiperespacio esta listo");
            System.out.println("El numero de intentos totales fueron "+intentos);
            System.out.println("Entrando en hiperespacio en...3...2...1");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calentando();
        // TODO code application logic here
    }
    
}
