<%--
  Created by IntelliJ IDEA.
  User: mahin
  Date: 3/23/24
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../../index.jsp"%>
<html>
<head>
    <title>welcome to LocalFood</title>
</head>
<body>
    <div class="container">
        <h2>Welcome, <%= request.getAttribute("userName") %>!</h2>
    </div>

</body>
</html>
