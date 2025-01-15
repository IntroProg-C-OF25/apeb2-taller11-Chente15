
/*
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * 
 */
/**
 *
 * @author Chente15
 */
public class Problema5 {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int matriz[][] = new int[3][3];
        System.out.println("MATRIZ: ");
        llenarPresentarMatriz(matriz);
        sumaMatriz(matriz);
        restaMatriz(matriz);
        multiplicacionMatriz(matriz);

    }

    public static void llenarPresentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void sumaMatriz(int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de matriz es: " + suma);
    }

    public static void restaMatriz(int matriz[][]) {
        int resta = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(i == 0 && j == 0)) {
                    resta -= matriz[i][j];
                }
            }
        }
        System.out.println("La resta de la matriz es: " + resta);
    }

    public static void multiplicacionMatriz(int matriz[][]) {
        int multi = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                multi *= matriz[i][j];
            }
        }
        System.out.println("La multiplicación de la matriz es: " + multi);
    }

}
/**
 * run:
 * MATRIZ: 
 * 9 3 2 
 * 4 0 2 
 * 3 0 2 
 * La suma de matriz es: 25
 * La resta de la matriz es: -7
 * La multiplicacion de la matriz es: 0
 */
