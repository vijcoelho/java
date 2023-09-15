package BD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Loja {
    public Connection getConnection() {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(
            "jdbc:sqlserver:\\SQLEXPRESS;databaseName=loja;integratedSecurity=true;"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } 
    }
}