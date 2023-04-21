package s1.lab1p1_eduardochinchilla;

import java.util.Scanner;

public class Lab1P1_EduardoChinchilla {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Menu");
            System.out.println("1. Division modificada ");
            System.out.println("2. Secuencia");
            System.out.println("3. Suma alternante");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");

            opcion = read.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el dividendo: ");
                int dividendo = 0;
                dividendo = read.nextInt();
                System.out.println("Ingrese el divisor: ");
                int divisor = 0;
                divisor = read.nextInt();

                int acum = 0;
                int cont = 0;

                while (acum < dividendo) {
                    acum = acum + divisor;
                    cont++;
                }
                if (acum > dividendo) {
                    cont--;
                }
                if (dividendo % divisor != 0) {
                    System.out.println("El resultado de la division es: " + cont + " ,con un residuo de: " + dividendo % divisor);
                } else {
                    System.out.println("El resultado de la division es: " + cont);
                }
            } else if (opcion == 2) {
                System.out.println("Ingrese cantidad de numeros: ");
                int num = read.nextInt();
                System.out.print(" 0 1 ");

                int acum = 2;
                int cont = 0;
                int resp = 0;
                int resp1 = 2;

                while (cont < num) {
                    resp = acum;   //memoria para guardar el numero
                    System.out.print(acum+ "");
                    acum = resp1 + acum;
                    resp1 = resp + 1; // patron
                    cont++;
                }
            } else if (opcion == 3) {
                System.out.println("Ingrese un numero: ");
                int num = read.nextInt();
                int cont = 1;
                int acum = 0;
                while (cont < num) {
                    if (cont % 2 == 0) {
                        acum = acum + cont;
                        cont++;
                    } else if (cont % 1 == 0) {
                        acum = acum - cont;
                        cont++;
                    }
                }

                System.out.println("el resultado de la suma es: " + acum);
            } else if (opcion == 4) {
                System.out.println("Ha salido del menu");
            } else {
                System.out.println("Opcion ingresada no es valida");
            }

        }//fin while menu
    }//fin main
}//fin class
