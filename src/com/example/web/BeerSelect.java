package com.example.web;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @autor semih
 */
public class BeerSelect extends HttpServlet{

    public BeerSelect() {
        System.out.println("constructor");
    }

    String str;

    @Override
    public void init() throws ServletException {
        str = "str";
        System.out.println("init method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String c = req.getParameter("color");
//        BeerExpert beer = new BeerExpert();
//        List list = beer.getBrands(c);

        // System.out.println(str);
        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.print("Beer Select Advice<br>");
//
//        resp.addHeader("foo","bar");
//        System.out.println(getServletConfig().getServletName());
//        out.print("<br>Got beer color " + c);
//
////        Iterator iterator = list.iterator();
////        while (iterator.hasNext()) {
////            out.println("<br>"+ iterator.next().toString()+"<br>");
////        }
//        System.out.println(this.getServletInfo());
//        req.setAttribute("style",list);
//        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
//        view.forward(req,resp);
//
//        out.print("Status code is:"+resp.getStatus());
        String mail = getServletConfig().getInitParameter("mail");
        System.out.println(mail +" and Servlet name: "+getServletConfig().getServletName());


        //context input attr
        String attr = req.getParameter("attr");
        //sending new request to server and new url
        //resp.sendRedirect("/Other");
        System.out.println("Context param: "+ getServletContext().getInitParameter("name"));
        //req.getRequestDispatcher("/Other").forward(req,resp);
        System.out.println(getServletContext().getServerInfo());
        getServletContext().log("Successful connection ");

        getServletContext().setAttribute("foo","22");
        getServletContext().setAttribute("bar","42");
        getServletContext().setAttribute("attr",attr);


        PrintWriter out = resp.getWriter();
        out.print(getServletContext().getAttribute("foo"));
        out.print(getServletContext().getAttribute("bar"));
        out.print(getServletContext().getAttribute("attr"));

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("in doGet() method");
//        super.doGet(req, resp);
//    }

    @Override
    public String getServletInfo() {
        return "Semih";
    }

}
