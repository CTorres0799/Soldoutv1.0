package Metodos;

import soldoutV1.guiSplashscreen;
import java.sql.*;
import soldoutV1.pnlUsuarios;
import soldoutV1.cajero;

public class Conexion {
    private String nombreBd = "soldoutv1";
    private String usuario = "root";
    private String password = "@runaway1415";
    private String url = "jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=true&use"
    + "JBDCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
            +"serverTimezone=UTC";
    
    //String query = "INSERT INTO usuarios (idUsuario,nombreUsuario,contraseña,idRol) VALUES()";    
Connection conn = null;


//String stmt = conn.prepareStatement("INSERT INTO usuarios VALUES (?,?,?,?,?)");

public Conexion() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //OBTENEMOS LA CONEXION
        conn = DriverManager.getConnection(url,usuario,password);
        if (conn!=null) {
            System.out.println(" BD: " + nombreBd + " Inicio Correctamente ");
        }
    } catch (ClassNotFoundException e) {
        System.out.println("ERROR: ClassNotFoundException = "
        +e.getMessage());
        
    }catch (SQLException e) {
        System.out.println("ERROR: SQLException = "
        +e.getMessage());
        
    } 
}
 public Connection getConnection() {
        return conn;
    }

 public void desconectar() {
    conn = null;
 }
 
}
