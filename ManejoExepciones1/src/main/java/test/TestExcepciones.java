package test;

import static aritmetica.Aritmetica.divicion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = divicion(10,0);
        } catch(Exception e){
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        
        System.out.println("resultado = " + resultado);

    }
}
