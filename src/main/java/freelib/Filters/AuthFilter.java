package freelib.Filters;

import freelib.services.impl.InventoryServiceImpl;
import freelib.DTO.UserDTO;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebFilter(filterName = "auth_filter", urlPatterns = "/login/*")
public class AuthFilter extends BaseHttpFilter {
    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String uname = servletRequest.getParameter("uname");
        String upass = servletRequest.getParameter("upass");
        List<UserDTO> itemByRequest = InventoryServiceImpl.getInstance().findUser(uname, upass);
        List<UserDTO> item = new ArrayList<>();
        item.addAll(itemByRequest);
        Cookie[] cookies = servletRequest.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("jsessionid")) {
                    HttpSession session = servletRequest.getSession();
                    session.setAttribute("uname", uname);
                    session.setAttribute("item", item);
                    session.setAttribute("upass", upass);
//                  servletRequest.setAttribute("session", session);

                    filterChain.doFilter(servletRequest, servletResponse);
                } else {
                    if (item.isEmpty()) {
                        servletRequest.getRequestDispatcher("/pages/common/error.jsp").forward(servletRequest, servletResponse);

                    } else {
                        HttpSession session = servletRequest.getSession();
                        session.setAttribute("uname", uname);
//                        servletRequest.setAttribute("session", session);
                        session.setAttribute("item", item);
                        session.setAttribute("upass", upass);
                        Cookie jsessionid = new Cookie("jsessionid", session.getId());
                        jsessionid.setMaxAge(60 * 5);
                        servletResponse.addCookie(jsessionid);

//                        servletRequest.getRequestDispatcher("/pages/admin/control_panel.jsp").forward(servletRequest, servletResponse);
                    }
                }
            }
        }

    }


}