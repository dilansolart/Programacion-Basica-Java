package javaConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection connect() {
        String url = "jdbc:sqlite:E:/WS_D2ST/WS_UniNorte/Programacion-Basica-Java/Sesion_16/db/Almacen.db";
        Connection var1 = null;
        try {
            var1 = DriverManager.getConnection(url);
            System.out.println("Conectado a la base de datos!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return var1;
    }
}
