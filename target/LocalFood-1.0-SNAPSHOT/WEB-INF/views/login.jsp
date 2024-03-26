<%--
  Created by IntelliJ IDEA.
  User: mahin
  Date: 3/23/24
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../../index.jsp" %>
<html>
<head>
    <title>Login</title>
    <%@include file="../../resources/css/bootstrap.jsp"%>
</head>
<body>
    <div class="container">
        <h1>Login Here</h1>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="Username" required><br/><br/>
            <input type="password" name="password" placeholder="Password" required><br/><br/>
            <input type="submit" value="Login">
        </form>
        <div class="options">
            <a href="register">Register</a>
            <a href="forgot-password">Forgot Password?</a>
        </div>
    </div>

</body>
</html>
