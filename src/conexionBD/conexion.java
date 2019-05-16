package conexionBD;
import java.sql.*;
/**
 *
 * @author JUAN YAIME
 */
public class conexion {
    public Connection conex;
    public Connection conectar(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conex = DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");
           System.out.println("Conectado");
        }catch (Exception e){
           System.out.println("No se pudo conectar la BD" + e.getMessage());
        }
       return conex;
   }
}




