/*
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        double n1, n2, n3, n4;
        String promedioCualitativo;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = tcl.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        n2 = tcl.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        n3 = tcl.nextDouble();
        System.out.println("Ingrese el cuarto numero: ");
        n4 = tcl.nextDouble();
        promedioCualitativo = calcularPromedioCualitativo(n1, n2, n3, n4);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    public static String calcularPromedioCualitativo(double n1, double n2, double n3, double n4) {
        double promedio = (n1 + n2 + n3 + n4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango válido.";
        }
    }
}
/**
 * Ingrese el primer numero: 
 * 7
 * Ingrese el segundo numero: 
 * 8
 * Ingrese el tercer numero: 
 * 9
 * Ingrese el cuarto numero: 
 * 5
 * El promedio cualitativo es: Bueno
 */
