package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.model.createEditTrip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateTripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tripName = request.getParameter("car-name");

        System.out.println(tripName);

        createEditTrip createEditTrip = new createEditTrip();
        createEditTrip.setLocal(tripName);
        new TripTakerDAO().createTrip(createEditTrip);
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
