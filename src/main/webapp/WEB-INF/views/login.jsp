<%-- login.jsp --%>
<%@ include file="../../index.jsp" %>
<html>
<head>
    <title>Login</title>
    <%@include file="../../resources/css/bootstrap.jsp"%>
</head>
<body>
<div class="container ">
    <div class="row mt-3">
        <div class="col-md-4 offset-md-4">
            <div class="card mt-4">
                <div class="card-body">
                    <h2 class="card-title" style="text-align: center">Login Here</h2>
                    <hr>
                    <form action="login" method="post">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="text" class="form-control" name="username" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text">username must be lowercase.</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Password</label>
                            <input type="password" class="form-control" name="password" id="exampleInputPassword1">
                        </div>
                        <div class="mb-3 form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Remember me ?</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                    <div class="options">
                        <a href="register.jsp">Register</a>
                        <a href="forgot-password">Forgot Password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>
