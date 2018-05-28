
package Ej3Clases;


public class Inmuebles {
    private String direccion;
    private int metros;
    private int precio;
    private int anio;
    private boolean segundaMano;

    public Inmuebles(String direccion, int metros, int precio, int anio, boolean segundaMano) {
        this.direccion = direccion;
        this.metros = metros;
        this.precio = precio;
        this.anio = anio;
        this.segundaMano = segundaMano;
    }

    public Inmuebles() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return segundaMano;
    }

    public void setEstado(boolean estado) {
        this.segundaMano = estado;
    }
    
    public void nuevoPrecio(){
        if(anio > 15)
            precio = precio * 98 / 100; //2% menos
    }

    @Override
    public String toString() {
        return "Inmuebles{" + "direccion=" + direccion + ", metros=" + metros + ", precio=" + precio + ", anio=" + anio + ", segundaMano=" + segundaMano + '}';
    }
    
    
}
