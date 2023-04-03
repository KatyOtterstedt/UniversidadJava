package aritmetica;

import excepciones.OperacionException;

public class Aritmetica {
    public static int divicion(int numerador, int denominador) 
            throws OperacionException{
        
        if( denominador == 0){
            throw new OperacionException("Divicion entre cero");
        }
        
        return numerador / denominador;
    }
}
