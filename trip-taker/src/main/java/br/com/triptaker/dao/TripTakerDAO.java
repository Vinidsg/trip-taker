package br.com.triptaker.dao;

import br.com.triptaker.model.createEditTrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TripTakerDAO {
    public void createTrip(createEditTrip createEditTrip) {

        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, createEditTrip.getLocal());
            preparedStatement.execute();

            connection.close();

            System.out.println("success in connection");

        } catch (Exception e) {

            System.out.println("fail in connection");

        }

    }

}
