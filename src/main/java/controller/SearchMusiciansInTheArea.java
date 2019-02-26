package controller;

import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A serlet to get the users from the database
 * @author cjardine
 */

@WebServlet(
        urlPatterns = {"/searchMusiciansInTheArea"}
)

public class SearchMusiciansInTheArea extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userData = new UserDao();
        req.setAttribute("users", userData.getAllUsers());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/resultsForMusiciansInTheArea.jsp");
        dispatcher.forward(req, resp);
    }
}
