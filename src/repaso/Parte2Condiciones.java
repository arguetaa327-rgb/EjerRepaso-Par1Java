package repaso;

import java.util.Scanner;

public class Parte2Condiciones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio6();
        ejercicio7();
        ejercicio8();

    }

    // Ejercicio 6
    public static void ejercicio6() {

        int n;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        if (n % 7 == 0 || n % 11 == 0) {
            System.out.println("Es multiplo de 7 o de 11");
        } else {
            System.out.println("No es multiplo de 7 ni de 11");
        }
    }

    // Ejercicio 7
    public static void ejercicio7() {

        int n;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        System.out.println("Numeros divisibles entre 3 pero no entre 2:");

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    // Ejercicio 8
    public static void ejercicio8() {

        int hora;

        System.out.print("Ingrese una hora (0-23): ");
        hora = sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Mañana");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Tarde");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Noche");
        } else {
            System.out.println("Hora no valida");
        }
    }
}