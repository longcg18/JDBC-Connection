package org.example;

import java.sql.*;

import org.example.query.*;

public class App {
    public static JDBCConnection connectJDBC = new JDBCConnection();
    public static Connection conn = connectJDBC.connect();

    public static void main( String[] args ) {

        //SelectAll selectAll = new SelectAll();
        //selectAll.selectAllQuery();

        //Insert insert = new Insert();
        //insert.insertQuery();

        Update update = new Update();
        update.updateQuery();
    }
}
