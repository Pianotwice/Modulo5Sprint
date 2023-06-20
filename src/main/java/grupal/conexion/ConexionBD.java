
package grupal.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Etzel M. Valderrama
 *
 */
public class ConexionBD {
	
	private static ConexionBD instancia;
    private static Connection conexion;

    private ConexionBD() {
        conexion = obtenerConexion();
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

    protected Connection obtenerConexion() {
    	if (conexion != null) {
            return conexion;
        }

        //Connection conexion = null;

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer los detalles de la conexión
            String url = "jdbc:mysql://localhost:3306/modulo5?useSSL=false";
            String usuario = "adminmodulo5";
            String contraseña = "1234567a.";

            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexion;
    }
}
