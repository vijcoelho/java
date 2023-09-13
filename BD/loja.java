package BD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class loja {
    public Connection getConnection() {
        try {

            return DriverManager.getConnection(
            "jdbc:sqlserver://DESKTOP-BCKMJI3\\SQLEXPRESS;databaseName=loja;user=vitor;password=teste123"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
