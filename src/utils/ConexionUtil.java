package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/reservas_club";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "root";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
