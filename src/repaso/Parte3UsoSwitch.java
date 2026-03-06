package repaso;
import java.util.Scanner;

public class Parte3UsoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- PARTE 3 ---");
            System.out.println("1. Numero romano");
            System.out.println("2. Calculadora con switch");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio9(); break;
                case 2: ejercicio10(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static void ejercicio9() {
        int numero;
        System.out.print("Ingrese un numero del 1 al 5: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            default: System.out.println("Numero invalido");
        }
    }

    public static void ejercicio10() {
        int opcion;
        double a, b;

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.print("Ingrese opcion: ");
        opcion = sc.nextInt();

        System.out.print("Ingrese primer numero: ");
        a = sc.nextDouble();

        System.out.print("Ingrese segundo numero: ");
        b = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado: " + (a * b));
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}