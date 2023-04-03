package test;

public class TestArreglos {
    
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //AGREGAR VALORES AL ARREGLO
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades elemento " + i + ": " + edades[i]);
        }
        
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
