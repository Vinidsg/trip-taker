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

@WebServlet("/getImage")
public class ListTripServlet_gerenciar extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String username = (String) req.getSession().getAttribute("username");
        if (username == null) {
            resp.sendRedirect("/login");
            return;
        }

        List<Trip> trips = new TripTakerDAO().findAllTrips();

        req.setAttribute("trips", trips);

        req.getRequestDispatcher("gerenciar.jsp").forward(req, resp);
    }
}
