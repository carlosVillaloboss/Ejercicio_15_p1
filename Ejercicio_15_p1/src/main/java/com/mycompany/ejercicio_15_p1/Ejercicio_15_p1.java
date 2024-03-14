package com.mycompany.ejercicio_15_p1;
import java.util.Scanner;

public class Ejercicio_15_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoa, pesob, pesoc, pesod;

        System.out.print("Ingrese peso esfera A: ");
        pesoa = scanner.nextDouble();
        System.out.print("Ingrese peso esfera B: ");
        pesob = scanner.nextDouble();
        System.out.print("Ingrese peso esfera C: ");
        pesoc = scanner.nextDouble();
        System.out.print("Ingrese peso esfera D: ");
        pesod = scanner.nextDouble();

        if (pesoa != pesob && pesoa != pesoc && pesoa != pesod &&
            pesob != pesoc && pesob != pesod && pesoc != pesod) {
            System.out.println("Todas las esferas tienen pesos diferentes.");
        } else if (pesoa == pesob && pesob == pesoc && pesoc == pesod) {
            System.out.println("Todas las esferas tienen pesos iguales");
        } else {
            if (pesoa == pesob && pesoa == pesoc) {
                System.out.println("La esfera con peso diferente es D con: " + pesod);
                if (pesod < pesoa) {
                    System.out.println("La esfera D es menor que A, B y C: ");
                } else if (pesod > pesoa) {
                    System.out.println("La esfera D es mayor que A, B y C: ");
                }
            } 

            if (pesoa == pesob && pesoa == pesod) {
                System.out.println("La esfera con peso diferente es C con: " + pesoc);
                if (pesoc < pesoa) {
                    System.out.println("La esfera C es menor que A, B y D: ");
                } else if (pesoc > pesoa) {
                    System.out.println("La esfera C es mayor que A, B y D: ");
                }
            }

            if (pesoa == pesoc && pesoa == pesod) {
                System.out.println("La esfera con peso diferente es B con: " + pesob);
                if (pesob < pesoa) {
                    System.out.println("La esfera B es menor que A, C y D: ");
                } else if (pesob > pesoa) {
                    System.out.println("La esfera B es mayor que A, C y D: ");
                }
            }

            if (pesob == pesoc && pesob == pesod) {
                System.out.println("La esfera con peso diferente es A con: " + pesoa);
                if (pesoa < pesob) {
                    System.out.println("La esfera A es menor que B, C y D: ");
                } else if (pesoa > pesob) {
                    System.out.println("La esfera A es mayor que B, C y D: ");
                }
            }
        }

        scanner.close();
    }
}
