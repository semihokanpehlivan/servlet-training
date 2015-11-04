<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: semih
  Date: 12.09.2015
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <%
      out.print(getServletConfig().getServletContext().getAttribute("attr"));
  %>

  </body>
</html>
