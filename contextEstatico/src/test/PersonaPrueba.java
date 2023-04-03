package test;

import domina.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fredy");
        
        Persona persona2 = new Persona("Diana");
        
        imprimir(persona1);
        imprimir(persona2);

    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
