<%--
  Created by IntelliJ IDEA.
  User: vinicius
  Date: 11/05/2023
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:forEach var="trip" items="${trips}">
        <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${trip.image}">
            <img src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${trip.image}" alt="...">
        </a>
    </c:forEach>
</div>

</body>
</html>
