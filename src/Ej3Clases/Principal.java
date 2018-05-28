
package Ej3Clases;

public class Principal {
    public static void main(String[] args) {
        Locales l1 = new Locales(1,"onu,81",55,10000,20,true);
        Locales l2 = new Locales(5,"onu,83",40,15000,10,false);
        Pisos p1 = new Pisos(6,"onu,50",100,30000,10,false);
        Pisos p2 = new Pisos(2,"onu,53",150,40000,20,true);
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
         
        System.out.println("--------------------------------------------");
        
        l1.nuevoPrecio();
        System.out.println(l1.toString());
        l2.nuevoPrecio();
        System.out.println(l2.toString());
        p1.nuevoPrecio();
        System.out.println(p1.toString());
        p2.nuevoPrecio();
        System.out.println(p2.toString());
        
    }
}
