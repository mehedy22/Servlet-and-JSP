<%--
  Created by IntelliJ IDEA.
  User: mehedy
  Date: 2/4/26
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-color: #00ffff;
        }
    </style>
</head>
<body>
<%

    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));
    int sum = i + j;
    out.println("Sum = " + sum);
%>

</body>
</html>
