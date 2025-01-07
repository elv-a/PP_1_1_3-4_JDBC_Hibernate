package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
   private static final String url = "jdbc:mysql://localhost:3306/myschema";
   private static final String user = "root";
   private static final String password = "root";
    
    public static Connection getConnection() {
        Connection connection = null;
        {
            try {
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            } catch (SQLException e) {
                System.out.println("NOT CONNECTION");
            }
        }
        return connection;
    }
}
