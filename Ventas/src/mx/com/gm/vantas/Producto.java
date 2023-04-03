package mx.com.gm.vantas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this(); //constructor vacio de esta clase
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
