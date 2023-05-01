package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.model.Trip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-trip")
public class CreateTripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String local = request.getParameter("local");
        int qtdPessoa = Integer.parseInt(request.getParameter("qtdPessoa"));
        String guiaResponsavel = request.getParameter("guiaResponsavel");
        double vlrUnitario = Double.parseDouble(request.getParameter("vlrUnitario"));
        String dtInicio = request.getParameter("dtInicio");
        String dtFinal = request.getParameter("dtFinal");
        String descricao = request.getParameter("descricao");

        Trip trip = new Trip(local, qtdPessoa, guiaResponsavel, vlrUnitario, dtInicio, dtFinal, descricao);

        new TripTakerDAO().createTrip(trip);
        response.sendRedirect("/find-all-trips");
    }
}
