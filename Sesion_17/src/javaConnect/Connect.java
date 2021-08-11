package javaConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection connect() {
        String url = "jdbc:sqlite:E:/Archivos de programas/SQLiteStudio/Almacen.db";
        Connection var1 = null;
        try {
            var1 = DriverManager.getConnection(url);
            System.out.println("Conectado!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return var1;
    }
}
