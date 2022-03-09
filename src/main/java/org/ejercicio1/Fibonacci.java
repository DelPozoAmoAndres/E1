package org.ejercicio1;

public class Fibonacci {
    /***
     * Metodo que calcula el numero fibonacci de un numero entero dado
     * @param number
     * @return El numero fibonacci calculado
     */
    public double compute(int number) {
        //Inicializamos la primera posicion con el fibonacci de 0 = 0
        double result=0;
        //En caso de que el numero sea invalido lanzamaos una excepcion
        if (number < 0) throw new RuntimeException("No se puede calcular el fibonacci de un numero negativo");
        //El fibonacci de 1 es 1
        if (number>=1) result=1;
        /// En caso de que el numero sea mayor que 1
        // calcularemos el fibonacci de forma iterativa
        // sumando el anterior par de fibonacci calculados
        if (number>1) {
            double elementoMenorDelPar = 0;
            double elementoMayorDelPar = 1;
            for (var i = 2; i <= number; i++) {
                result=elementoMenorDelPar+elementoMayorDelPar;
                elementoMenorDelPar=elementoMayorDelPar;
                elementoMayorDelPar=result;
            }
        }
        return result;
    }
}
