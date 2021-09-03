package JavaConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection connect() {
        String url = "jdbc:sqlite:D:/WS_D2ST/WS_UniNorte/Programacion-Basica-Java/Retos/Reto4/db/School.db";
        Connection var1 = null;
        try {
            var1 = DriverManager.getConnection(url);
            System.out.println("Conectado a la base de Datos!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return var1;
    }
}
