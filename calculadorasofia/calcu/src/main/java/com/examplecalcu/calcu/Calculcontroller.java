package com.examplecalcu.calcu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Calculcontroller {


    @RestController
    public class CalculadoraController {

        @RequestMapping("/calculadora")
        public String calculadora() {
            float num1 = 10;
            float num2 = 5;

            operaciones op = new operaciones(num1, num2);
            String resultado = "";
            resultado += "La suma es: " + op.sumar() + "\n";
            resultado += "La resta es: " + op.restar() + "\n";
            resultado += "La multiplicacion es: " + op.multiplicar() + "\n";

            try {
                resultado += "La division es: " + op.dividir() + "\n";
            } catch (ArithmeticException e) {
                resultado += e.getMessage() + "\n";
            }

            return resultado;
        }
    }



    


}
