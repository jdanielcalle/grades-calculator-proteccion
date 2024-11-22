package com.proteccion.GradesCalculatorProteccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GradesCalculatorProteccionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradesCalculatorProteccionApplication.class, args);

		List<Double> grades = Utils.readGrades();

		String result = StudentService.getRankStudent(grades);

		System.out.println(result);
	}
}

