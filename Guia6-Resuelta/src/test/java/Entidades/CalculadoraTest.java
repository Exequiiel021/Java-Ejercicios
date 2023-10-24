package Entidades;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void sumaDeNumerosResultadoEsperado() {

        double num1 = 4;
        double num2 = 6;

        double resultadoEsperado = 10;

        Assertions.assertEquals(resultadoEsperado, Calculadora.sumar(num1,num2));

    }

    @Test
    public void dadosDosNumeros_probarMultiplicacion() {
        assertEquals(240, Calculadora.multiplicar(80, 3));
    }

    @Test
    public void resultadoDeSumar(){
       // El resultado de sumar 150 y 180, dividido por 3, da 110

        assertEquals(110,Calculadora.sumar(150,180)/3);
    }

    @Test
    public void resultadodeResta(){
       // El resultado de restar 90 y 50, multiplicado por 15, no da 605.

        assertEquals(605, Calculadora.restar(90,50)*15);

    }

    @Test
    public void resuladoDeSumar7040(){
        //4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700

        assertEquals(2700, Calculadora.sumar(70,40)*25);
    }

}