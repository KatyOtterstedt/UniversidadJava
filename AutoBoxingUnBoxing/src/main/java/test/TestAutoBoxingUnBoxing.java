package test;

public class TestAutoBoxingUnBoxing {
    public static void main(String[] args) {
        //Clases envolmentes de tipo primitivo
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Char
        short - Short
        */
        
        Integer entero = 10; //AutoBoxing //si coloca int en vez de Integer no puede ivocar mas metodos. tal como se mira en la linea 20
        
        System.out.println("entero " + entero);
        System.out.println("entero double " + entero.doubleValue());
        
        int entero2 = entero; //UnBoxing
        System.out.println("entero2 = " + entero2);
    }
}
