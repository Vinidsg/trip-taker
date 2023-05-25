package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-trip")
public class DeleteTripServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String tripId = req.getParameter("id");

        new TripTakerDAO().deleteTripById(tripId);

        resp.sendRedirect("getImage");

    }

}