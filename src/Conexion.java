import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase Conexion
 * Clase para conectar con la base de datos PostgreSQL
 */

public class Conexion {
    static Connection conectar = null;
    static String driver = "jdbc:postgresql:";
    static String host = "//localhost:";
    static String porto = "5432";
    static String sid = "postgres";
    static String usuario = "postgres";
    static String password = "postgres";
    static String url = driver + host+ porto + "/" + sid;

    /**
     * Metodo para conectar con la base de datos PostgreSQL
     * @return conectar de tipo Connection
     */
    public static Connection conexion(){

        try{
            conectar = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conectado a la base de datos");

        }catch(SQLException ex){
            System.out.println("Error al conectar a la base de datos"+ ex.getMessage());
        }
        return conectar;
    }
}
