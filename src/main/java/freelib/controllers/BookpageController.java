package freelib.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import freelib.DTO.FreelibDTO;
import freelib.services.impl.InventoryServiceImpl;

import java.util.ArrayList;
import java.util.List;

@WebServlet(name="bookpage_controller", urlPatterns = "/bookpage")
public class BookpageController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("windows-1251");
        String name = request.getParameter("name");

        List<FreelibDTO> itemByRequest = InventoryServiceImpl.getInstance().getByName(name);
        List<FreelibDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        request.setAttribute("item", item);
        getServletContext().getRequestDispatcher("/pages/common/bookpage.jsp").forward(request, response);
    }
}

