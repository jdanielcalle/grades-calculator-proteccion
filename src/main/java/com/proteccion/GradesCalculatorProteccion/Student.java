package com.proteccion.GradesCalculatorProteccion;

import java.util.List;

public class Student {
    private List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double promCalculate() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String rankStudent() {
        double prom = promCalculate();
        if (prom >= 4.5) {
            return "Sobresaliente";
        } else if (prom >= 3.5) {
            return "Bueno";
        } else if (prom >= 3.0) {
            return "Regular";
        } else {
            return "Deficiente";
        }
    }
}
