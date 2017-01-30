<%@ page import="com.sirosh.mvc.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Illya
  Date: 30.01.17
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <h1>
        Hello,
        <% User u = (User)request.getAttribute("user");
            out.print(u.getLogin());
        %>
      </h1>
  </body>
</html>
