package br.com.triptaker.dao;


import br.com.triptaker.model.User;
import org.apache.log4j.Logger;

import java.sql.*;

public class UserDAO {

    private static final Logger logger = Logger.getLogger(UserDAO.class);

    public boolean verifyCredentials(User user) {

        String driver = "com.mysql.jdbc.Driver";

        String SQL = "SELECT * FROM USR WHERE USERNAME = ?";

        try {

            Class.forName(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://triptaker-db.cqpzu4xulkxe.us-east-1.rds.amazonaws.com/triptaker", "admin", "X8ZxQ8kV6ifUV8fqU6r%3A5K(W-O");

            logger.info("Successfully connected to the database - user");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();

            logger.info("Successfully executed the username query");

            while (resultSet.next()) {

                String password = resultSet.getString("password");

                if (password.equals(user.getPassword())) {

                    return true;

                }

            }

            connection.close();

            return false;

        } catch (Exception e) {

            logger.error("Error executing the query: " + e.getMessage());

            return false;
        }
    }
}