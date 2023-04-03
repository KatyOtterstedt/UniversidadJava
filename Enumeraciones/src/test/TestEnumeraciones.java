package test;

import enumeracion.Dias;
import static enumeracion.Dias.LUNES;
import static enumeracion.Dias.MARTES;
import enumeracion.Continentes;

public class TestEnumeraciones {
    
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiasSemana(LUNES);

            System.out.println("Continente no. 4: " + Continentes.AMERICA);
            System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiasSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sesto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
