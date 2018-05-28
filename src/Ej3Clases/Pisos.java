
package Ej3Clases;


public class Pisos extends Inmuebles{
    private int altura;

    public Pisos(int altura, String direccion, int metros, int precio, int anio, boolean segundaMano) {
        super(direccion, metros, precio, anio, segundaMano);
        this.altura = altura;
    }

    public Pisos() {
        super();
    }
    
    public void nuevoPrecio(){
        super.nuevoPrecio();
        if(altura >= 3)
            setPrecio(getPrecio()*103/100);
    }

    @Override
    public String toString() {
        return super.toString() + "Pisos{" + "altura=" + altura + '}';
    }
    
    
    
}
