package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    
    
    public static void main(String[] args) {
        
        /*
        En un list se conseva el orden y tambien se puede duplicar los valores
        */
        List<String> miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
        
        imprimir(miLista);
        
        /*
        En un Set no se conserva el orden y no se puede duplicar los valores
        */
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Fredy");
        miMapa.put("valor2", "Diana");
        miMapa.put("valor3", "Lorena");
        
        String elementoMapa = miMapa.get("valor1");
        System.out.println("elementoMapa = " + elementoMapa);
        imprimir(miMapa.keySet()); //imprime los indices
        imprimir(miMapa.values()); //imprime todos los valores
    }
    
    
    public static void imprimir(Collection<String> coleccion){
//        coleccion.forEach(elemento -> {
//            System.out.println("elemeto = "+ elemento);
//        });
        
        for(String elemento: coleccion){
            System.out.println("elemeto = "+ elemento);
        }
    }
}
