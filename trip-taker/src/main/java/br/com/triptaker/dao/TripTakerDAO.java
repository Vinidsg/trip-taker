package br.com.triptaker.dao;

import br.com.triptaker.model.createEditTrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TripTakerDAO {
    public void createTrip(createEditTrip createEditTrip) {

        String SQL = "INSERT INTO CRIAR_EDITAR_ROTAS  (LOCAL, QTD_PESSOA, GUIA_RESPONSAVEL, VALOR_UNITARIO, DATA_INICIO, DATA_FINAL, DESCRICAO) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, createEditTrip.getLocal());
            preparedStatement.setInt(2, createEditTrip.getQtdPessoas());
            preparedStatement.setString(3, createEditTrip.getGuiaResponsavel());
            preparedStatement.setDouble(4, createEditTrip.getValorUnitario());
            preparedStatement.setString(5, createEditTrip.getDataInicio());
            preparedStatement.setString(6, createEditTrip.getDataFinal());
            preparedStatement.setString(7, createEditTrip.getDescricao());

            preparedStatement.execute();

            connection.close();

            System.out.println("success in connection");

        } catch (Exception e) {

            System.out.println("fail in connection");

        }

    }

}
