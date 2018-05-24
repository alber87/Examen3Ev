
package Ej1BBDD;

import java.sql.*;

public class Ej1BBDD {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Colegio", "root", "");
            Statement st  = conexion.createStatement();
            String cadena = "Update Alumnos set nota=nota+? where id=?";
            PreparedStatement ps = conexion.prepareStatement(cadena);
            cadena = "Delete from Alumnos where id=?";
            PreparedStatement ps1 = conexion.prepareStatement(cadena);
            
            ResultSet rs = st.executeQuery("Select * from Alumnos");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getInt(4));
            }
            
            System.out.println("-------------------------------------------------------------");
            
            rs = st.executeQuery("Select * from Cambios");
            while(rs.next()){
                if(rs.getString(2).equals("BJ")){
                    ps1.setInt(1, rs.getInt(3));
                    ps1.executeUpdate();
                    System.out.println("BAJA CORRECTA SOBRE EL ALUMNO " + rs.getInt(3));
                }else if(rs.getString(2).equals("MD")){
                    ps.setInt(1, rs.getInt(4));
                    ps.setInt(2, rs.getInt(3));
                    ps.executeUpdate();
                    System.out.println("MODIFICACION CORRECTA SOBRE EL ALUMNO " + rs.getInt(3));
                }else
                    System.out.println("ERROR NO EXISTE EL ALUMNO");
            }
            ps.close();
            ps1.close();
            
            rs = st.executeQuery("Select * from Alumnos");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getInt(4));
            }
            rs.close();
            st.close();
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
