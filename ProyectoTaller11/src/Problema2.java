/*
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1. Area del Cuadrado");
        System.out.println("2. Area del Triangulo");
        System.out.println("3. Area del Rectangulo");
        System.out.print("Opcion: ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1: 
                calcularAreaCuadrado();
                break;

            case 2: 
                calcularAreaTriangulo();
                break;

            case 3: 
                calcularAreaRectangulo();
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }


    public static void calcularAreaCuadrado() {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        int lado = tcl.nextInt();
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }

  
    public static void calcularAreaTriangulo() {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la base del triangulo: ");
        int base = tcl.nextInt();
        System.out.print("Ingresa la altura del triangulo: ");
        int altura = tcl.nextInt();
        double areaTri = (base * altura) / 2.0; 
        System.out.println("El área del triangulo es: " + areaTri);
    }

  
    public static void calcularAreaRectangulo() {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la base del rectangulo: ");
        int base = tcl.nextInt();
        System.out.print("Ingresa la altura del rectangulo: ");
        int altura = tcl.nextInt();
        double areaRect = base * altura;
        System.out.println("El area del rectángulo es: " + areaRect);
    }
}
/**
 * run:
 * Ingrese la opcion que desea: 
 * 1. Area del Cuadrado
 * 2. Area del Triangulo
 * 3. Area del Rectangulo
 * Opcion: 2
 * Ingresa la base del triangulo: 10
 * Ingresa la altura del triangulo: 5
 * El area del triangulo es: 25.0
 */

