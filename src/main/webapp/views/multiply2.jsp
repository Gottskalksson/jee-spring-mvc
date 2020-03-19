<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 15.03.2020
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Multiply2</title>
    <style>
        table, th, td {
            border: 1px solid black;
            align-content: center;
        }
    </style>

</head>
<body>
<table>
    <tr>
        <th>X</th>
        <c:forEach begin="1" end="${cols}"  var="i">
            <th>${i}</th>
        </c:forEach>
    </tr>
    <c:forEach begin="1" end="${rows}"  var="i">
        <tr>
            <th> ${i}</th>
            <c:forEach begin="1" end="${cols}"  var="j">
                <td>${i * j}</td>
            </c:forEach>
        </tr>
    </c:forEach>

</table>

</body>
</html>
