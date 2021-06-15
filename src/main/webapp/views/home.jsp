<%--
  Created by IntelliJ IDEA.
  User: Latitude 5590
  Date: 15/06/2021
  Time: 2:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/login" modelAttribute="login" method="post">
   <table>
       <tr>
           <label>Account</label>
           <td> <form:input path="account"></form:input></td>
       </tr>
       <tr>
           <label>Password</label>
           <td><form:input path="password"></form:input></td>
       </tr>

   </table>
    <button type="submit">Login</button>
</form:form>
</body>
</html>
