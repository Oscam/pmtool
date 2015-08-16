<%-- 
    Document   : conversation
    Created on : Jul 16, 2015, 4:01:12 PM
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
        <div class="container">
            <h1>Comments Page</h1>
            <div class="row">

                <div class="col-sm-10">
                    <h2>Just write a message on the above comment box</h2>
                </div>
                <div class="col-sm-2">
                    <ul class="nav navbar-right">
                        <li><a href="LoginServlet?action=out">LogOut <span class="glyphicon glyphicon-log-out"></span></a></li>
                    </ul>
                </div>

            </div>
            <form action="myAccount?action=chat" method="post"  class="form-group">
                <c:forEach var="item" items="${requestScope.zangu}">
                    <c:if test="${item.projectId eq pid}">
                        <h3 class="h3 center-block">Project name  <t/>  ${item.projectName} </h3>
                        <input type="hidden" name="ip" value="${item.projectId}"/>
                    </c:if>
                </c:forEach>

                <textarea class="form-control " name="meso"></textarea><br/>
                <input type="submit" class="btn btn-primary" value="Comment on Project">
            </form>

            ${start}
            <div class="row">

                <div class="col-sm-9">
                    <c:forEach var="item" items="${chat}">
                        <c:if test="${item.staffId !=staffid}" >    <div class="pull-right "></c:if>
                            <c:if test="${item.staffId==staffid}"><div class="pull-left"></c:if>
                                ${item.meso} <span class="text-right"><i>by</i> ${item.fname} at ${item.messageTime}</span>
                            </div><br /><br />

                        </c:forEach><!-- for Each to output chats -->
                    </div>
                    <div class="col-sm-3">

                    </div>
                </div>
            </div>



    </body>
</html>
