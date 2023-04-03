package test;

import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        System.out.println("edades o-o = " + edades[0][0]);
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades " + i + " - " + j + " = " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa","Zarsamora","Mora"}};
        imprimir(frutas);
        
        
        Persona personas[][] = new Persona[3][2];
        personas[0][0] = new Persona("Fredy");
        personas[0][1] = new Persona("Arley");
        personas[1][0] = new Persona("Diana");
        personas[1][1] = new Persona("Lorena");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz "+ i + " - " + j + " = " + matriz[i][j]);
                
            }
            
        }
    }
}
