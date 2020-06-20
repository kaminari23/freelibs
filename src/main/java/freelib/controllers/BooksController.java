package freelib.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import freelib.DTO.FreelibDTO;
import freelib.services.impl.InventoryServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="books_controller", urlPatterns = "/books")
public class BooksController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<FreelibDTO> itemByRequest = null;
        try {
            itemByRequest = InventoryServiceImpl.getInstance().getEver();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        List<FreelibDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);

        request.setAttribute("item", item );
        getServletContext().getRequestDispatcher("/pages/common/books.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        int gid = Integer.parseInt(request.getParameter("gid"));

        List<FreelibDTO> itemByRequest = null;
        try {
            itemByRequest = InventoryServiceImpl.getInstance().getbyGenre(gid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        List<FreelibDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        if(item.isEmpty()) {
            request.getRequestDispatcher("/pages/common/searchnull.jsp").forward(request, response);
        } else {
        request.setAttribute("item", item);

        getServletContext().getRequestDispatcher("/pages/common/books.jsp").forward(request, response);}
    }
}

