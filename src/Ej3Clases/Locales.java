
package Ej3Clases;


public class Locales extends Inmuebles{
    private int nVentanas;

    public Locales(int nVentanas, String direccion, int metros, int precio, int anio, boolean segundaMano) {
        super(direccion, metros, precio, anio, segundaMano);
        this.nVentanas = nVentanas;
    }

    public Locales() {
        super();
    }
    
    public void nuevoPrecio(){
        super.nuevoPrecio();
        if(getMetros() > 50)
            setPrecio(getPrecio()*101/100);
        if(nVentanas < 2)
            setPrecio(getPrecio()*98/100);
        else if(nVentanas > 4)
            setPrecio(getPrecio()*102/100);
    }

    @Override
    public String toString() {
        return super.toString() + "Locales{" + "nVentanas=" + nVentanas + '}';
    }
    
    
    
    
    
}
