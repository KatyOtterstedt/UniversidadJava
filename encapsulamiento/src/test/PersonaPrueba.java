package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fredy", 5000.0, false);
        persona1.setNombre("Arley");
        
        System.out.println("Persona1 nombre = " + persona1.getNombre());
        System.out.println("Persona 1 " + persona1.toString());
    }
}
