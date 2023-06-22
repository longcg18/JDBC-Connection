package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    private final String hostname = "localhost:3306";
    private final String dbName = "YourDatabaseName";
    private final String username = "YourUsername";
    private final String password = "YourPassword";

    private final String connectionURL = "jdbc:mysql://" + hostname + "/" + dbName;

    public Connection connect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Connected to " + connectionURL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
