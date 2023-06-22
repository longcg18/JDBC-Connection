package org.example.query;

import org.example.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static org.example.App.*;
public class Update {

    public String updateQuery = "UPDATE employee SET salary = ? where id = ?";

    public void updateQuery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update what \nId: ");
        int id = Integer.parseInt(sc.nextLine());
        SelectOne selectOne = new SelectOne();
        selectOne.SelectOneById(id);
        System.out.println("Salary: ");
        String salary = sc.nextLine();


        try {
            PreparedStatement preparedStatement = conn.prepareStatement(updateQuery);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, salary);

            int row = preparedStatement.executeUpdate();
            if (row != 0) {
                System.out.println("Updated successfully row: " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
