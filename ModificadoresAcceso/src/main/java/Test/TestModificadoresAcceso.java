package Test;

import Paquete1.Clase1;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        
        Clase1 clase1 = new Clase1();
        System.out.println("Calse 1 " + clase1);
         System.out.println("Atributo de Calse 1 Publico" + clase1.atributoPublico);
         clase1.metodoPublico();
    }
}
