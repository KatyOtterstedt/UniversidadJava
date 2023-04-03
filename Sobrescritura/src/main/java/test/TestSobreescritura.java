package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Arlay", 5000);
        //System.out.println("empleado = "+empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Fredy", 23, "Sistemas");
        //System.out.println("gerente "+ gerente1.obtenerDetalles());
        imprimir(empleado);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = "+ empleado.obtenerDetalles());
    }
}
