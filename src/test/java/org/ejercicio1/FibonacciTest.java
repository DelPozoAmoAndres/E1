package org.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();
    /**
     * Metodo para comprobar que al calcular el numero fibonacci
     * de un numero menor que 0
     * este nos lanza una excepcion
     */
    @Test
    public void ExcepcionPorNumeroInvalido(){
        assertThrowsExactly(RuntimeException.class,()->fibonacci.compute(-1));
    }
    /**
     * Metodo para comprobar que al calcular el numero fibonacci
     * de 0
     * nos devuelve 0
     */
    @Test
    public void Fibonacci_Valor0(){
        assertEquals(fibonacci.compute(0),0);
    }
    /**
     * Metodo para comprobar que al calcular el numero fibonacci
     * de 1
     * nos devuelve 1
     */
    @Test
    public void Fibonacci_Valor1(){
        assertEquals(1,fibonacci.compute(1));
    }
    /**
     * Metodo para comprobar que al calcular el numero fibonacci
     * de un numero menor que el limite
     * nos devuelve el resultado correcto
     */
    @Test
    public void Fibonacci_ValorInferiorLimite(){
        assertEquals(55,fibonacci.compute(10));
    }
    /**
     * Metodo para comprobar que al calcular el numero fibonacci
     * de un numero mayor que el limite (1476)
     * devuelve infinito y no lanza ninguna excepcion
     */
    @Test
    public void Fibonacci_ValorSuperiorLimite(){
        assertDoesNotThrow(()->fibonacci.compute(1477));
        assertTrue(fibonacci.compute(1477)==Double.POSITIVE_INFINITY);
    }
}
