package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if(connection != null)
            return connection;

        DriverManager.registerDriver (new com.mysql.cj.jdbc.Driver());

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root", "Guhan@2001");
        return connection;
    }
}
