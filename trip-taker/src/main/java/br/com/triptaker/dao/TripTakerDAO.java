package br.com.triptaker.dao;

import br.com.triptaker.model.Trip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TripTakerDAO {
    public void createTrip(Trip Trip) {

        String SQL = "INSERT INTO CRIAR_EDITAR_ROTAS  (LOCAL, QTD_PESSOA, GUIA_RESPONSAVEL, VALOR_UNITARIO, DATA_INICIO, DATA_FINAL, DESCRICAO) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, Trip.getLocal());
            preparedStatement.setInt(2, Trip.getQtdPessoas());
            preparedStatement.setString(3, Trip.getGuiaResponsavel());
            preparedStatement.setDouble(4, Trip.getValorUnitario());
            preparedStatement.setString(5, Trip.getDataInicio());
            preparedStatement.setString(6, Trip.getDataFinal());
            preparedStatement.setString(7, Trip.getDescricao());

            preparedStatement.execute();

            connection.close();

            System.out.println("success in connection");

        } catch (Exception e) {

            System.out.println("fail in connection");

        }
    }


    public List<Trip> findAllTrips() {
        String SQL = "SELECT * FROM CRIAR_EDITAR_ROTAS";

        try
        {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Success in database connection");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Trip> trips = new ArrayList<>();

            while(resultSet.next())
            {
                String id = resultSet.getString("ID");
                String local = resultSet.getString("LOCAL");
                int qtdPessoa = resultSet.getInt("QTD_PESSOA");
                String guiaResponsavel = resultSet.getString("GUIA_RESPONSAVEL");
                double vlrUnitario = resultSet.getDouble("VALOR_UNITARIO");
                String dtInicio = resultSet.getString("DATA_INICIO");
                String dtFinal = resultSet.getString("DATA_FINAL");
                String descricao = resultSet.getString("DESCRICAO");

                Trip trip = new Trip(id, local, qtdPessoa, guiaResponsavel, vlrUnitario, dtInicio, dtFinal, descricao);

                trips.add(trip);
            }

            System.out.println("Success in select * CRIAR_EDITAR_ROTAS");

            connection.close();

            return trips;

        } catch (Exception e)
        {
            System.out.println("Fail in database connection!");
            return Collections.emptyList();
        }


    }

    public void deleteTripById (String id){
        String SQL = "DELETE CRIAR_EDITAR_ROTAS WHERE ID = ?";


        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, id);
            preparedStatement.execute();

            System.out.println("success on delete trip   with id: " + id);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection Delete");

        }
    }

}