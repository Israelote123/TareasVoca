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
public class Tostitones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        System.out.println("A continuación se presentan los resultados de la encuesta de los artículos"
                + "\nPara representar los números enteros se usara un ■\n");
        encuesta();
        }
    private static void encuesta() throws Exception {
        final int personas = 5000; 
        final int productos = 10;
        int y = 0;
        for(int x = 0; x < productos; x++){
            for(int i = 0; i < personas; i++){
                y = y + ((int) (Math.random() * (5)+1));
            }
            int promedio = y/personas;
            grafico(x, promedio);
            y=0;
            }
    }
    private static void grafico (int articulo, int promedio){
        String valor = "";
        articulo=articulo+1;
        for(int z = 0; z < 1; z++){
            switch(promedio){
                case 1:
                    valor = "■";
                    System.out.println(articulo+" "+valor+"\n");
                    break;
                case 2:
                    valor = "■■";
                    System.out.println(articulo+" "+valor+"\n");
                    break;
                case 3:
                    valor = "■■■";
                    System.out.println(articulo+" "+valor+"\n");
                    break;
                case 4:
                    valor = "■■■■";
                    System.out.println(articulo+" "+valor+"\n");
                    break;
                case 5:
            }
        }
    }
}

    

