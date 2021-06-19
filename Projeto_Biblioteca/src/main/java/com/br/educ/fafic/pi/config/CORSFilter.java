package com.br.educ.fafic.pi.config;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CORSFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse servletResponse = (HttpServletResponse) response;

        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
        servletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
        servletResponse.setHeader("Access-Control-Max-Age", "3600");
        servletResponse.setHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        servletResponse.setHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Access-Control-Allow-Token");
        servletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        servletResponse.setContentType("application/json");
        servletResponse.setCharacterEncoding("UTF-8");


        chain.doFilter(request, servletResponse);
    }
}