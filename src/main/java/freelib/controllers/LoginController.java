package freelib.controllers;

import freelib.services.impl.InventoryServiceImpl;
import freelib.DTO.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="login_filter", urlPatterns = "/login/panel")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setCharacterEncoding("windows-1251");
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String uname = (String) session.getAttribute("uname");
        String upass = (String) session.getAttribute("upass");
        List<UserDTO> itemByRequest = InventoryServiceImpl.getInstance().findUser(uname, upass);
//        List<UserDTO> item = (List<UserDTO>) session.getAttribute("item");
       List<UserDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        request.setAttribute("user", item);
        request.getServletContext().getRequestDispatcher("/pages/common/list.jsp").forward(request,response);
    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        String admin_login = "admin";
//        String admin_password = "admin";
//        response.setCharacterEncoding("utf-8");
//        request.setCharacterEncoding("utf-8");
//        String name = request.getParameter("name");
//
//        List<FreelibDTO> itemByRequest = InventoryServiceImpl.getInstance().getByName(name);
//        List<FreelibDTO> item = new ArrayList<>();
//        item.addAll(itemByRequest);
//        request.setAttribute("item", item);
//        getServletContext().getRequestDispatcher("/pages/admin/control_panel.jsp").forward(request,response);
//    }
}
