package freelib.controllers;

import freelib.services.impl.InventoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegController", urlPatterns = "/register")
public class RegController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("windows-1251");
        request.getRequestDispatcher("/pages/admin/register.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("windows-1251");
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");

        InventoryServiceImpl.getInstance().addUser(uname, upass);

        request.getServletContext().getRequestDispatcher("/login/panel").forward(request, response);

    }
}
