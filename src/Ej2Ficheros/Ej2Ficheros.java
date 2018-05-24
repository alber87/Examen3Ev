
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
                           precio = precio*95/100;
                        else if(partes > 3 && partes <= 10)
                            precio = precio*110/100;
                        dos.writeUTF(poliza);
                        dos.writeInt(partes);
                        dos.writeDouble(precio);
                    }
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            dos.close();
            fos.close();
            dis.close();
            fis.close();
            
            f.delete();
            f1.renameTo(f);
            
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);
            
            try{
                while(true){
                    poliza = dis.readUTF();
                    partes = dis.readInt();
                    precio = dis.readDouble();
                    System.out.println("Poliza: " + poliza + "\nPartes: " + partes 
                                        + "\nPrecio: " + precio);
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            dis.close();
            fis.close();
            System.out.println("SE HAN DADO DE BAJA " + cont);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
