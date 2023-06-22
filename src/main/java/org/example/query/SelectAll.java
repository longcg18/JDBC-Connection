package org.example.query;

import java.sql.ResultSet;
import java.sql.Statement;

import static org.example.App.*;
public class SelectAll {
    public final String selectAllQuery = "SELECT * FROM employee";

    public void selectAllQuery() {

        Statement stm = null;
        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(selectAllQuery);

            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String salary = rs.getString("salary");

                System.out.println(id + " - " + firstName + " - " + lastName + " - " + salary);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
