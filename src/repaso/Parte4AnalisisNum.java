package repaso;
import java.util.Scanner;

public class Parte4AnalisisNum{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println(" PARTE 4 ");
            System.out.println("1. Mayor, menor y diferencia");
            System.out.println("2. Tabla de division");
            System.out.println("3. Cantidad de digitos pares");
            System.out.println("4. Numero triangular");
            System.out.println("5. Promedio de negativos");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio11(); break;
                case 2: ejercicio12(); break;
                case 3: ejercicio13(); break;
                case 4: ejercicio14(); break;
                case 5: ejercicio15(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static void ejercicio11() {
        int a, b, mayor, menor, diferencia;

        System.out.print("Ingrese a: ");
        a = sc.nextInt();
        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }

        diferencia = Math.abs(a - b);

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Diferencia absoluta: " + diferencia);
    }

    public static void ejercicio12() {
        double n;
        System.out.print("Ingrese n: ");
        n = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " / " + i + " = " + (n / i));
        }
    }

    public static void ejercicio13() {
        int n, contador = 0;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        n = Math.abs(n);

        if (n == 0) {
            contador = 1;
        } else {
            while (n > 0) {
                int digito = n % 10;
                if (digito % 2 == 0) {
                    contador++;
                }
                n = n / 10;
            }
        }

        System.out.println("Cantidad de digitos pares: " + contador);
    }

    public static void ejercicio14() {
        int n, suma = 0;
        boolean esTriangular = false;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; suma < n; i++) {
            suma += i;
            if (suma == n) {
                esTriangular = true;
            }
        }

        if (esTriangular) {
            System.out.println("Es triangular");
        } else {
            System.out.println("No es triangular");
        }
    }

    public static void ejercicio15() {
        int n, numero, sumaNegativos = 0, contadorNegativos = 0;
        double promedio;

        System.out.print("Cuantos numeros ingresara: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            numero = sc.nextInt();

            if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            }
        }

        if (contadorNegativos > 0) {
            promedio = (double) sumaNegativos / contadorNegativos;
            System.out.println("Promedio de negativos: " + promedio);
        } else {
            System.out.println("No hay negativos");
        }
    }
}