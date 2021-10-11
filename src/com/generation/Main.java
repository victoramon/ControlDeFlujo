package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Estructura de control if
        /*
        if(condition) {
        } else if () {
        } else {
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad > 18) {
            System.out.println("Felicidades " + nombre + ", puedes votar");
        } else {
            System.out.println("Hola " + nombre + ", Aun no puedes votar");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el angulo de un triangulo");
        int angulo1 = sc.nextInt();
        System.out.println("Ingresa otro angulo");
        int angulo2 = sc.nextInt();
        System.out.println("Ingresa otro angulo");
        int angulo3 = sc.nextInt();

        int suma = (angulo1 + angulo2 + angulo3);

        if (suma == 180) {
            System.out.println("Felicidades, tu triangulo es valido");
        } else {
            System.out.println("Lo siento tus angulos no son de un triangulo");
        }

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu fecha de nacimiento");
        int fecha = sc.nextInt();

        if ((fecha % 4 == 0) && ((fecha % 100 != 0) || (fecha % 400 == 0))) {
            System.out.println("Tu año si es bisiesto");
        } else {
            System.out.println("Tu año no es bisiesto");
        }/*





         // Flujo de control switch

        /* switch (condicion) {
            case 1:
                codigo
            break;
            case 2:
                codigo
            break;
            default:
            break;
         */
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa un número: ");
//        int numero1 = scan.nextInt();
//
//        System.out.println("Ingresa otro número: ");
//        int numero2 = scan.nextInt();
//
//        System.out.println("Ingresa la operación deseada:\n1) Suma\n2) Resta" +
//                "\n3) Multiplicación \n4) División");
//        int operacion = scan.nextInt();
//
//        scan.nextLine();
//        float resultado = 0;
//
//        switch (operacion) {
//            case 1:
//                resultado = numero1 + numero2;
//                break;
//            case 2:
//                resultado = numero1 - numero2;
//            case 3:
//                resultado = numero1 * numero2;
//                break;
//            case 4:
//                resultado = numero1 / numero2;
//                break;
//            default:
//                System.out.println("Opción inválida");
//        }
//        scan.close();
//        System.out.println(resultado);

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un número de la semana (Del 1 a 7): ");
        byte numDia = scan.nextByte();
        scan.nextLine();

        switch (numDia) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("Fuera de rango.");
        }
        scan.close();
        System.out.println(dia);
    }
}
