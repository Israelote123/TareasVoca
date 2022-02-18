public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] arreglo = new int [10][5];
        final int personas = 5000; 
        final int productos = 10;
        int y = 0;
        for(int x = 0; x < productos; x++){
            for(int i = 0; i < personas; i++){
                y = y + ((int) (Math.random() * 5 + 1));
            }
            y = y/personas;
        }
    }

}
