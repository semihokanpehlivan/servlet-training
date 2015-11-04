package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @autor semih
 */
public class MyServletContextListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(sce.getServletContext().getInitParameter("param"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
