package enumeracion;

public enum Continentes {
    AFRICA(53),
    EUROPA(43),
    ASIA(44),
    AMERICA(34),
    OCEANICA(14);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
