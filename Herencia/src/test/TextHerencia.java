package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TextHerencia {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Frey", 1200.0);
//        System.out.println("empleado1 = " + empleado1);

        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Fredy", 'M', 28, "Jardin");
        System.out.println("cliente1 = " + cliente1);
    }
}
