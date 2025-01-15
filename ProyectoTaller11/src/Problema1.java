/*
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 * El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas);
 * además el método debe recibir como parámetro un arreglo bidimensional.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;
public class Problema1 {
        
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFilas = 0, limColumnas = 0;
        System.out.print("DaME EL LIMITE DE FILAS Y COLUMNAS DE LA MATRIZ: ");
        limFilas = tcl.nextInt();
        limColumnas = tcl.nextInt();
        int matriz[][] = new int [limFilas][limColumnas];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA");
        presentarMatriz(matriz);
        presentarParI(matriz);
        presentarPromMatriz(matriz);        
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }   
    }
    public static void presentarParI(int matriz[][]){
        System.out.println("ELEMENTO PARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" "): " ");
                /*if((matriz[i][j] % 2) == 0)
                System.out.print(matriz[i][j] + " "); */
            }
            System.out.println("");
        }
        System.out.println("ELEMENTO IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + (" "): " ");
                /*if((matriz[i][j] % 2) == 0)
                System.out.print(matriz[i][j] + " "); */
            }
            System.out.println("");
        }   
    }
    public static void presentarPromMatriz(int matriz[][]){
        int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j] ;
            }
        }
        promedioMatriz = sumaMatriz / (matriz.length) * (matriz[0].length);
        System.out.println("PROMEDIO DE LA MATRIZ: " + promedioMatriz);        
    }
}
/**
 * DEME EL LIMITE DE FILAS Y COLUMNAS DE LA MATRIZ: 3 3
 * MATRIZ GENERADA
 * 8 0 0 
 * 7 4 6 
 * 9 4 0 
 * ELEMENTO PARES DE LA MATRIZ
 * 8 0 0 
 *   4 6 
 *   4 0 
 * ELEMENTO IMPARES DE LA MATRIZ
 * 7   
 * 9   
PROMEDIO DE LA MATRIZ: 36
 */