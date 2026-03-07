package repaso;
import java.util.Scanner;

public class Parte5Patrones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("**PARTE 5** ");
            System.out.println("1. Primeros n multiplos de 6");
            System.out.println("2. Potencia de 2");
            System.out.println("3. Numero invertido");
            System.out.println("4. Suma de 1 a n par o impar");
            System.out.println("5. Celsius a Fahrenheit");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio16(); break;
                case 2: ejercicio17(); break;
                case 3: ejercicio18(); break;
                case 4: ejercicio19(); break;
                case 5: ejercicio20(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static void ejercicio16() {
        int n;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(6 * i);
        }
    }

    public static void ejercicio17() {
        int n;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No es potencia de 2");
            return;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            System.out.println("Es potencia de 2");
        } else {
            System.out.println("No es una potencia de 2");
        }
    }

    public static void ejercicio18() {
        int n, invertido = 0;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        int original = n;
        n = Math.abs(n);

        while (n > 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n = n / 10;
        }

        if (original < 0) {
            invertido *= -1;
        }

        System.out.println("Numero invertido: " + invertido);
    }

    public static void ejercicio19() {
        int n, suma = 0;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de 1 a " + n + " es: " + suma);

        if (suma % 2 == 0) {
            System.out.println("La suma es par");
        } else {
            System.out.println("La suma es impar");
        }
    }

    public static void ejercicio20() {
        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
