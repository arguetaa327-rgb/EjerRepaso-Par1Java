package repaso;
import java.util.Scanner;

public class Parte1Ciclos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- PARTE 1 ---");
            System.out.println("1. Suma divisibles entre 4");
            System.out.println("2. Factorial");
            System.out.println("3. Positivos, negativos y ceros");
            System.out.println("4. Promedio de pares");
            System.out.println("5. Suma de digitos");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static void ejercicio1() {
        int n, suma = 0;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma: " + suma);
    }

    public static void ejercicio2() {
        int n;
        long factorial = 1;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }

    public static void ejercicio3() {
        int n, numero;
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.print("Cuantos numeros ingresara: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static void ejercicio4() {
        int n, suma = 0, contador = 0;
        double promedio;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
        }

        if (contador > 0) {
            promedio = (double) suma / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No hay pares");
        }
    }

    public static void ejercicio5() {
        int n, suma = 0;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        n = Math.abs(n);

        while (n > 0) {
            int digito = n % 10;
            suma += digito;
            n = n / 10;
        }

        System.out.println("Suma de digitos: " + suma);
    }
}
