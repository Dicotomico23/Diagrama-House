package Casas.tipos;

public class CasaChica {
    private String color = "red";
    private int ancho = 23;
    private int largo = 34;

    public static int contador;
    private final int constante = 10;
    public static final int ConstanteGlobal = 90;
    public CasaChica(){
        color = "blue";
        ancho = 56;
        largo = 87;
    }
    public CasaChica(String color)
    {
        this.color = color;
        ancho = 45;
        largo = 67;
    }
    public void pintar(String nuevoColor){
        color = nuevoColor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor(){//GETTER
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //GARBAGE COLLECTOR
    //system.gc();
}
