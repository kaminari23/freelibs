package freelib.Filters;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(filterName = "admin_filter", urlPatterns = "/login")
public class AdminFilter extends BaseHttpFilter {
    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.getRequestDispatcher("/pages/admin/admin_login.jsp").forward(servletRequest, servletResponse);
    }
}
