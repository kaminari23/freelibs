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

@WebServlet(name="getAll_controller", urlPatterns = "/list")
public class GetAllController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        List<FreelibDTO> itemByRequest = InventoryServiceImpl.getInstance().getScifi();
        List<FreelibDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        List<FreelibDTO> itemByR = InventoryServiceImpl.getInstance().getEver();
        List<FreelibDTO> itemR = new ArrayList<>();
        itemR.addAll(itemByR);


        request.setAttribute("item", item );
        request.setAttribute("itemR", itemR );
        getServletContext().getRequestDispatcher("/pages/common/list.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");

        List<FreelibDTO> itemByRequest = InventoryServiceImpl.getInstance().getByName(name);
        List<FreelibDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        request.setAttribute("item", item);
        getServletContext().getRequestDispatcher("/pages/common/searchresult.jsp").forward(request, response);
    }
}

