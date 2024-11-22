package com.proteccion.GradesCalculatorProteccion;

import java.util.List;

public class StudentService {
    public static Student createStudentWithGrades(List<Double> grades) throws InvalideGradeException {
        if (grades == null || grades.size() != 3) {
            throw new InvalideGradeException("Por favor, debe ingresar las 3 notas.");
        }
        for (Double grade : grades) {
            if (grade < 0 || grade > 5) {
                throw new InvalideGradeException("Por favor, digite una nota entre 0 y 5.");
            }
        }
        return new Student(grades);
    }

    public static String getRankStudent(List<Double> grades) {
        try {
            Student student = createStudentWithGrades(grades);
            double prom = student.promCalculate();
            String gradesString = grades.toString().replace("[", ""). replace("]", "");
            return String.format("Notas: %s\nPromedio: %.2f\nClasificación: %s", gradesString, prom, student.rankStudent());
        } catch (InvalideGradeException e) {
            return "Error: " + e.getMessage();
        }
    }
}
