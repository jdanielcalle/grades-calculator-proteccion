package com.proteccion.GradesCalculatorProteccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static List<Double> readGrades() {
        Scanner scanner = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();
        int count = 1;

        while (grades.size() < 3) {
            System.out.printf("Ingrese la nota de la asignatura # %d: ", count);
            try {
                String input = scanner.nextLine();
                double grade = Double.parseDouble(input);

                if (grade < 0 || grade > 5) {
                    System.out.println("La nota es inválida, ya que debe ser entre 0 y 5.");
                } else {
                    grades.add(grade);
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Debe ingresar un número decimal.");
            }
        }
        return grades;
    }
}
