package com.mycompany.pagodesueldo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el número de hijos: ");
        int numeroHijos = scanner.nextInt();
        System.out.print("¿Qué tipo de pensión posee? (AFP/ONP): ");
        String tipoPension = scanner.next();
        double pagoPorHora = 6.0;
        double sueldoBase = horasTrabajadas * pagoPorHora;
        if (numeroHijos > 0) {
            sueldoBase *= 1.10;
        }
        double descuentoPension = 0.0;
        if (tipoPension.equalsIgnoreCase("AFP")) {
            descuentoPension = sueldoBase * 0.12;
        } else if (tipoPension.equalsIgnoreCase("ONP")) {
            descuentoPension = sueldoBase * 0.15;
        }
        double sueldoNeto = sueldoBase - descuentoPension;
        System.out.printf("El sueldo neto del trabajador es: %.2f\n", sueldoNeto);

        scanner.close();
    }
}
