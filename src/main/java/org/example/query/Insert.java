package org.example.query;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import org.example.JDBCConnection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Scanner;

import static org.example.App.*;
public class Insert {

    public final String insertQuery = "INSERT INTO employee VALUES (null, ?, ?, ?) ";
    public void insertQuery() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What to insert: \n First Name: \n");
        String first_name = sc.nextLine();
        System.out.println("Last Name: ");
        String last_name = sc.nextLine();
        System.out.println("Salary: ");
        String salary = sc.nextLine();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setString(3, salary);
            int row = preparedStatement.executeUpdate();
            if (row != 0) {
                System.out.println("Added row: " + row);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
