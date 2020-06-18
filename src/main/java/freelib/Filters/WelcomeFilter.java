package freelib.Filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "welcome_filter", urlPatterns = "/*")
public class WelcomeFilter extends BaseHttpFilter {
    @Override
    public void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.getRequestDispatcher("/list");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
