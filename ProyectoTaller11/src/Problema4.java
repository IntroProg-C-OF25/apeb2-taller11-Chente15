
/*
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. 
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * 
 */
/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String nombreCliente, cedulaCliente;
        System.out.println("Ingrese el nombre del cliente: ");
        nombreCliente = tcl.nextLine();
        System.out.println("Ingrese la cédula del cliente: ");
        cedulaCliente = tcl.nextLine();
        System.out.println("Ingrese una opción: ");
        System.out.println("1. valor de la luz");
        System.out.println("2. valor del predio");
        System.out.print("Opción: ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente);
                break;

            case 2:
                calcularPredio(nombreCliente, cedulaCliente);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el valor del kilovatio: ");
        double kilovatio = tcl.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes: ");
        double numeroKilovatios = tcl.nextDouble();
        double totalPagar = kilovatio * numeroKilovatios;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f%n", nombreCliente, cedulaCliente, totalPagar);
    }
    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el valor del inmueble: ");
        double valorInmueble = tcl.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", nombreCliente, cedulaCliente, valorInmueble, valorPredio);
    }
}
/**
 * run:
 * Ingrese el nombre del cliente: 
 * Viche
 * Ingrese la c�dula del cliente: 
 * 1104859607
 * Ingrese una opci�n: 
 * 1. valor de la luz
 * 2. valor del predio
 * Opci�n: 1
 * Ingrese el valor del kilovatio: 
 * 2,50
 * Ingrese el n�mero de kilovatios consumidos en el mes: 
 * 10
 * Cliente Viche con c�dula 1104859607 debe cancelar el valor de $25,00
 */

