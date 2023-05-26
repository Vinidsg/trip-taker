package br.com.triptaker.dao;

import br.com.triptaker.model.Trip;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TripTakerDAO {

    private Connection conexao() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://triptaker-db.cqpzu4xulkxe.us-east-1.rds.amazonaws.com/triptaker", "admin", "X8ZxQ8kV6ifUV8fqU6r%3A5K(W-O");
        return connection;
    }

    private static String driver = "com.mysql.jdbc.Driver";

    public void createTrip(Trip Trip) {

        String SQL = "INSERT INTO CRIAR_EDITAR_ROTAS  (LOCAL, QTD_PESSOA, GUIA_RESPONSAVEL, VALOR_UNITARIO, DATA_INICIO, DATA_FINAL, DESCRICAO, IMAGE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Class.forName(driver);

            Connection connection = conexao();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, Trip.getLocal());
            preparedStatement.setInt(2, Trip.getQtdPessoas());
            preparedStatement.setString(3, Trip.getGuiaResponsavel());
            preparedStatement.setDouble(4, Trip.getValorUnitario());
            preparedStatement.setString(5, Trip.getDataInicio());
            preparedStatement.setString(6, Trip.getDataFinal());
            preparedStatement.setString(7, Trip.getDescricao());
            preparedStatement.setString(8, Trip.getImage());

            preparedStatement.execute();

            connection.close();

            System.out.println("success in insertion");

        } catch (Exception e) {

            System.out.println("fail in connection");

        }
    }


    public List<Trip> findAllTrips() {
        String SQL = "SELECT * FROM CRIAR_EDITAR_ROTAS";

        try
        {
            Class.forName(driver);
            Connection connection = conexao();
            System.out.println("Success in database connection");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Trip> trips = new ArrayList<>();

            while(resultSet.next())
            {
                Integer id = resultSet.getInt("ID");
                String local = resultSet.getString("LOCAL");
                int qtdPessoa = resultSet.getInt("QTD_PESSOA");
                String guiaResponsavel = resultSet.getString("GUIA_RESPONSAVEL");
                double vlrUnitario = resultSet.getDouble("VALOR_UNITARIO");
                String dtInicio = resultSet.getString("DATA_INICIO");
                String dtFinal = resultSet.getString("DATA_FINAL");
                String descricao = resultSet.getString("DESCRICAO");
                String image = resultSet.getString("IMAGE");

                Trip trip = new Trip(id, local, qtdPessoa, guiaResponsavel, vlrUnitario, dtInicio, dtFinal, descricao, image);

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

    public void deleteTripById (int id){
        String SQL = "DELETE CRIAR_EDITAR_ROTAS WHERE ID = ?";


        try {

            Class.forName(driver);
            Connection connection = conexao();
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            System.out.println("success on delete trip   with id: " + id);

            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("fail in database connection Delete");

        }
    }
    public void updateTrip(Trip Trip) {
        String SQL = "UPDATE CRIAR_EDITAR_ROTAS SET LOCAL = ?, QTD_PESSOA = ?, GUIA_RESPONSAVEL = ?, VALOR_UNITARIO = ?, DATA_INICIO = ?, DATA_FINAL = ?, DESCRICAO = ?, IMAGE = ? WHERE ID = ?";
        try {

            Class.forName(driver);
            Connection connection = conexao();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, Trip.getLocal());
            preparedStatement.setInt(2, Trip.getQtdPessoas());
            preparedStatement.setString(3, Trip.getGuiaResponsavel());
            preparedStatement.setDouble(4, Trip.getValorUnitario());
            preparedStatement.setString(5, Trip.getDataInicio());
            preparedStatement.setString(6, Trip.getDataFinal());
            preparedStatement.setString(7, Trip.getDescricao());
            preparedStatement.setString(8, Trip.getImage());
            preparedStatement.setInt(9, Trip.getId());

            preparedStatement.execute();

            connection.close();

            System.out.println("success in update");

        } catch (Exception e) {

            System.out.println("fail in connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

}