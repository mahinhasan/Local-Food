<%@ include file="index.jsp" %>
<html>
<head>
    <title>Login</title>
    <%@include file="resources/css/bootstrap.jsp"%>
</head>
<body>
<div class="container ">
    <div class="row mt-3">
        <div class="col-md-4 offset-md-4">
            <div class="card mt-4 mb-4">
                <div class="card-body">
                    <h2 class="card-title" style="text-align: center">Register Here</h2>
                    <hr>
                    <%-- Display success message if available --%>
                    <c:if test="${not empty succMessage}">
                        <p class="text-center text-success">${succMessage}</p>
                    </c:if>
                    <%-- Display failure message if available --%>
                    <c:if test="${not empty failMessage}">
                        <p class="text-center text-danger">${failMessage}</p>
                    </c:if>
                    <form action="register" method="post">
                        <div class="mb-3">
                            <label for="exampleInputName" class="form-label">Enter Full Name</label>
                            <input type="text" class="form-control" name="username" id="exampleInputName" aria-describedby="emailHelp">
                            <div id="nameHelp" class="form-text"></div>
                        </div>

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Enter Email address</label>
                            <input type="text" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text">Email must be lowercase.</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Enter Password</label>
                            <input type="password" class="form-control" name="password" id="exampleInputPassword1">
                        </div>
                        <div class="mb-3">
                            <label for="genderSelect" class="form-label">Select Your Gender</label>
                            <select class="form-select" name="gender" id="genderSelect">
                                <option selected>Select Gender</option>
                                <option>Male</option>
                                <option>Female</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label for="citySelect" class="form-label">Select Your City</label>
                            <select class="form-select" name="city" id="citySelect">
                                <option selected>Select City</option>
                                <option>Dhaka</option>
                                <option>Jamalpur</option>
                                <option>Rangpur</option>
                            </select>
                        </div>
                        <div class="form-check">
                            <input type="checkbox" name="check" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Check me out!</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
