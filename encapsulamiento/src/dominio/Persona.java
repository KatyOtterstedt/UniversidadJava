package dominio;

public class Persona {
    private String nombre;
    private double saldo;
    private boolean eliminado;

    public Persona(String nombre, double saldo, boolean eliminado) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", saldo=" + saldo + ", eliminado=" + eliminado + '}';
    }
    
    
    
    
}
