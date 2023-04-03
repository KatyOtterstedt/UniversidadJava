package test;

import domain.Empleado;
import domain.Gerente;

public class TestIntanceOf {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Arlay", 5000);
        determinarTipo(empleado);
       
        empleado = new Gerente("Fredy", 23, "Sistemas");
        determinarTipo(empleado);
       
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Este tipo es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if(empleado instanceof Empleado){
            System.out.println("Este tipo es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        } else if(empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
