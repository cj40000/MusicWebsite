<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>
</div>

<table class="table">

    <c:choose>
        <c:when test = "${users.isEmpty()}">
            <th>No users found</th>
        </c:when>
        <c:otherwise>
            <tr><th scope="col">ID</th><th scope="col">FirstName</th><th scope="col">LastName</th><th scope="col">Age</th></tr>
        </c:otherwise>
    </c:choose>

    <c:forEach var="user" items="${users}">
        <tbody><tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.calculateAge}</td>
        </tr></tbody>
    </c:forEach>


</table>

</body>
</html>