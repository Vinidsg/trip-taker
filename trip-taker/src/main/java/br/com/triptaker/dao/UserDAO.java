package br.com.triptaker.dao;


import br.com.triptaker.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    private static String driver = "com.mysql.cj.jdbc.Driver";

    public boolean verifyCredentials(User user) {

        String SQL = "SELECT * FROM USR WHERE USERNAME = ?";

        try {
            Class.forName(driver);

            Connection connection = DriverManager.getConnection("jdbc:mysql://trip-taker.cqpzu4xulkxe.us-east-1.rds.amazonaws.com:3306/triptaker", "admin", "js0Y%<]bbFC1fmnO5ML(oNG>J9D9");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select username");

            while (resultSet.next()) {

                String password = resultSet.getString("password");

                if (password.equals(user.getPassword())) {

                    return true;

                }

            }

            connection.close();

            return false;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;
        }
    }
}