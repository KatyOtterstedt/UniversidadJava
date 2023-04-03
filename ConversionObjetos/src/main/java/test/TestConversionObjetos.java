package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Fredy", 27, TipoEscritura.CLASICO);
        //System.out.println("empleado = "+ empleado);
        
        //downcasting //Convierte un tipo padre a un tipo hija
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Updasting //Convierte un tipo de clase hija asia un tipo de clase padre
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
}
