<%--
  Created by IntelliJ IDEA.
  User: 14216
  Date: 2020/2/1
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Test2</title>
</head>
<body>

    Test 6-2 !
    <c:forEach items="${Test2}" var="s">
    <table border="1" style="background-color: darkgray ">
        <tr>
            <td>${s.name}</td>
            <td>${s.id}</td>
            <td>${s.address}</td>
        </tr>
    </table>
    </c:forEach>

</body>
</html>
