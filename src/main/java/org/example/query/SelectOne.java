package org.example.query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.App.*;
public class SelectOne {

    public String selectQuery = "SELECT * FROM employee WHERE id = ? ";

    public void SelectOneById(int findId) {

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQuery);
            preparedStatement.setInt(1, findId);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String salary = rs.getString("salary");

                System.out.println(id + " - " + firstName + " - " + lastName + " - " + salary);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
