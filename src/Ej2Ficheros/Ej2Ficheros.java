
package Ej2Ficheros;

import java.io.*;

public class Ej2Ficheros {
    public static void main(String[] args) {
        File f = new File("asegurados.dat");
        File f1 = new File("auxiliar.dat");
        
        try{
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            FileOutputStream fos = new FileOutputStream(f1);
            DataOutputStream dos = new DataOutputStream(fos);
            
            String poliza;
            int partes, cont=0;
            double precio;
            
            try{
                while(true){
                    poliza = dis.readUTF();
                    partes = dis.readInt();
                    precio = dis.readDouble();
                    System.out.println("Poliza: " + poliza + "\nPartes: " + partes 
                                        + "\nPrecio: " + precio);
                    
                    if(partes > 10)
                        cont++;
                    else{
                        if(partes==0)
                            precio=precio*
                    }
                }
            }catch(EOFException e){
                System.out.println(e);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
