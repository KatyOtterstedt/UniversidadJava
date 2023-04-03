package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecucion bloque statico");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecucion de bloque no statico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
