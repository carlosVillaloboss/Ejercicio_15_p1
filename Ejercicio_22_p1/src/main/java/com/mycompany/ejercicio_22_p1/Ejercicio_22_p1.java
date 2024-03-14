package com.mycompany.ejercicio_22_p1;
import java.util.Scanner;

//Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
//número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
//de $450.000, de lo contrario escriba sólo el nombre.
public class Ejercicio_22_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        String nombre= scanner.nextLine();
        System.out.print("Ingrese el salario basico por hora: ");
        double sh= scanner.nextDouble();
        System.out.print("Ingrese horas trabajadas al mes: ");
        double hm= scanner.nextDouble();
        double pago = 0;
        pago= sh*hm;
        if (pago>450000){
             System.out.println("Salario mensual del empleado: "+pago);
        }
            
        System.out.println("Nombre empleado: "+nombre);
        scanner.close();
    }
}
