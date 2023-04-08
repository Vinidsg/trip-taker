package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.model.createEditTrip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/create-trip")
public class CreateTripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String local = request.getParameter("local");
        int qtdPessoa = Integer.parseInt(request.getParameter("qtdPessoa"));
        String guiaResponsavel = request.getParameter("guiaResponsavel");
        Double vlrUnitario = Double.parseDouble(request.getParameter("vlrUnitario"));
        String dtInicio = request.getParameter("dtInicio");
        String dtFinal = request.getParameter("dtFinal");
        String descricao = request.getParameter("descricao");


        createEditTrip createEditTrip = new createEditTrip();
        createEditTrip.setLocal(local);
        createEditTrip.setQtdPessoas(qtdPessoa);
        createEditTrip.setGuiaResponsavel(guiaResponsavel);
        createEditTrip.setValorUnitario(vlrUnitario);
        createEditTrip.setDataInicio(dtInicio);
        createEditTrip.setDataFinal(dtFinal);
        createEditTrip.setDescricao(descricao);


        new TripTakerDAO().createTrip(createEditTrip);
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
