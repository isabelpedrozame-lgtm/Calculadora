package com.examplecalcu.calcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcuApplication {


	public static void main(String[] args) {
		SpringApplication.run(CalcuApplication.class, args);

		float num1 = 0;
		float num2 = 0;

		operaciones op = new operaciones(num1, num2);
		System.out.println("La suma es: " + op.sumar());
		System.out.println("La resta es: " + op.restar());
		System.out.println("La multiplicacion es: " + op.multiplicar());

		try {
			System.out.println("La division es: " + op.dividir());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}


	}

}
