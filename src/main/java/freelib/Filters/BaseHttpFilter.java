package freelib.Filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseHttpFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        doFilter((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse, filterChain);
    }

    @Override
    public void destroy() {
//
    }

    public abstract void doFilter(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain)throws IOException, ServletException;
}
