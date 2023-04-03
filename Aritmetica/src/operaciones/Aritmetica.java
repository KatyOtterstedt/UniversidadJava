package operaciones;

public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //Construcor
    public Aritmetica(){
        System.out.println("Ejecutando contructor..."); //escribir sout
    }
    
    //Consutructor con parametros
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo
    public void sumar(){
        int resultado  = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
