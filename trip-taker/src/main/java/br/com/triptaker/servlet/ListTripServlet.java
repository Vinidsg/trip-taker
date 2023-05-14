package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.model.Trip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-trips")
public class ListTripServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Trip> trips = new TripTakerDAO().findAllTrips();

        req.setAttribute("trips", trips);

        req.getRequestDispatcher("RotasViagensDatas.jsp").forward(req, resp);
    }
}