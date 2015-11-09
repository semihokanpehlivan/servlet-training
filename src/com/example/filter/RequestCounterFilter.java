package com.example.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @author Semih Okan Pehlivan.
 */
public class RequestCounterFilter implements Filter{

    private FilterConfig filterConfig;
    private static Logger logger = Logger.getLogger(RequestCounterFilter.class.getName());

    public void init(FilterConfig filterConfig) throws ServletException {
//        set-up when the container instantiate the this filter
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        TODO: Business logic of the filter
//        the parameters is not HTTPSevletRequest or Response, it need to be casted to HTTPServets
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(req);
        logger.info("Request info:"+ req.getQueryString());
        logger.info("Filter Response info:"+ response);
//        no problem using chain.doFilter(request,response);
        chain.doFilter(req,response);
        logger.info("under-line Response info:"+response);
        HttpServletResponse resp = (HttpServletResponse) response;
        PrintWriter out = resp.getWriter();
        out.print("Inside the filter");
    }

    public void destroy() {
//        set-up when the container kill the filter, most of the time, not implemented
    }
}
