package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Calculadora {

    public static Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Que operacion desea realizar");
        System.out.println("1-Suma");
        System.out.println("2-Resta");

        int eleccion = escaner.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("La suma es: " + suma());
                break;
            case 2:
                System.out.println("La resta es: " + resta());
                break;
            case 3:
                System.out.println("La multiplicacion es: " + multiplicacion());
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

    }

    public static int suma() {
        System.out.println("Ingrese el primer número:");
        int num1 = escaner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = escaner.nextInt();
        return num1 + num2;
    }

    public static int resta() {
        System.out.println("Ingrese el primer número:");
        int num1 = escaner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = escaner.nextInt();
        return num1 - num2;
    }

    public static int multiplicacion() {
        System.out.println("Ingrese el primer número:");
        int num1 = escaner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = escaner.nextInt();
        return num1 * num2;
    }
}
