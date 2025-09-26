package com.examplecalcu.calcu;

public class operaciones {

float num1;
float num2;

public operaciones() {
    this.num1 = 0;
    this.num2 = 0;

}
public operaciones(float num1, float num2) {
    this.num1 = num1;
    this.num2 = num2;
}

public float sumar() {
    return this.num1 + this.num2;
}

    public float restar() {
        return this.num1 - this.num2;
    }

        public float multiplicar() {
            return this.num1 * this.num2;
        }

            public float dividir() {
                if (this.num2 != 0) {
                    return this.num1 / this.num2;
                }
                 else {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
            }
        }
    




