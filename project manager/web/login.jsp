<%-- 
    Document   : login
    Created on : Jun 4, 2015, 1:52:08 PM
    Author     : Mugusca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="styles/css/mystyle.css" />

    </head>
    <body>
        <div class="container">
            <div class="row">

                <div class="col-sm-6 col-sm-offset-3">

                    <h2>Login</h2>

                    <h6>Input username as First Name and password as staff Id</h6>
                    <form action="LoginServlet?action=log" method="post" role="form" class="form-horizontal">
                        <div class="form-group">
                            <label for="username" class="control-label">User Name :</label>
                            <input type="text" name="username" class="form-control" id="username" placeholder="Enter first name"required/>
                        </div>
                        <div class="form-group">
                            <label for="pawd" class="control-label">Password :</label>
                            <input type="password" name="pawd" class="form-control" id="pawd" placeholder="Enter Password" required/>
                        </div>

                        <button type="submit" class="btn btn-success">Login <span class="glyphicon glyphicon-log-in"></span></button>

                        <%--<c:if test="${requestScope.message.errMessage}">
                                    <p>" "</p>
                                </c:if>--%>
                        <p> <%= (request.getAttribute("errMessage") == null) ? ""
                                : request.getAttribute("errMessage")%>

                        </p>
                        <a href="forgot.jsp" > Forgot your Password </a>
                </div>

                </form> 

                <div class="col-sm-3">

                </div>
            </div>


        </div>
    
    </body>

</body>
</html>
