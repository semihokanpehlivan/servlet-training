package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @author Semih Okan Pehlivan.
 */
public class HomeServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(HomeServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("HOME SERVLET");
        logger.info("Servlet Response info:" + resp);
    }
}
