<%-- 
    Document   : myAccount
    Created on : Jul 12, 2015, 11:26:50 AM
    Author     : Mugusca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="styles/css/mystyle.css" />
        <script src="styles/js/jquery.js"></script>
        <script src="styles/js/bootstrap.min.js" ></script>

    </head>
    <body>

        <div class="container" >


            <nav class="navbar navbar-default" role="navigation">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapse" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Masaba Services Limited</a>
                </div>
                <div class="collapse navbar-collapse"  id="collapse" >
                    <ul class="nav nav-tabs">


                    </ul>  
                </div>


                <div class="navbar-text navbar-right">

                    <h3 class="text-capitalize">Welcome ${sessionScope.username} <span class="glyphicon glyphicon-user"></span></h3>  
                </div>
            </nav>
        </div>
        <!-- container fluid -->
        <div class="container" >
            <div class="row">
                <div class="col-sm-3" >
                    <c:forEach var="item" items="${person}">
                        <p>Name  ${item.fname} ${item.surname}</p> 
                        <p>Dob  ${item.dob}</p>
                        <p>Staff ID   ${item.staffId}</p>
                        <p>User ID   ${item.user_id}</p>
                    </c:forEach>
                        <ul class="nav nav-stacked">
                            <li><a href="LoginServlet?action=out">LogOut <span class="glyphicon glyphicon-log-out"></span></a></li></ul>
                </div>
                <div class="col-sm-9">
                    
                    <p>You have taken part in the following projects</p>
                    <table class="table">
                        <tr><th>Project Name</th><th>Project ID</th><th>End Date </th><th>Started On</th></tr>
                                <c:forEach var="item" items="${zangu}">
                                    <c:if test="item==null">
                            <P>SORRY YOU ARE NOT IN ANY PROJECT</P>
                                    </c:if>
                            <tr><td>${item.projectName}</td> <td> ${item.projectId}</td><td> ${item.endDate}</td><td> ${item.startDate}</td><td>
                                    <form action="myAccount?action=hidden" method="post">
                                        <input type="hidden" value="${item.projectId}" name="pid" />   
                                        <input type="submit" value="view" /> 
                                    </form>

                                    <!--a  href="conversation.jsp" class="btn btn-success" role="button">view</a-->
                                </td>
                            </tr>
                        </c:forEach>
                    </table>

                </div>
            </div>
        </div>








    </body>
</html>
