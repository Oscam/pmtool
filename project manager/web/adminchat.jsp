<%-- 
    Document   : adminchat
    Created on : Jul 17, 2015, 8:47:32 PM
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

            <h1>Admin Comments Page</h1>
            <h2>Just write a message on the above comment box</h2>
            <c:forEach var="item" items="${requestScope.zangu}">
                <c:if test="${item.projectId eq projectId}">
                    <h3 class="h3 center-block">Project name  <t/>  ${item.projectName} </h3>
                </c:if>
            </c:forEach><!-- foreach to output project name -->


            <form action="myAccount?action=adminsend" method="post" >
                <textarea name="adminmeso" class="form-control"></textarea> <br />
                <input type="submit" value="Submit Message" class="btn btn-success" />
                <input type="hidden" value="1" name="mesoid" />
            </form><br />


            <c:forEach var="citem" items="${chat}">

                <c:if test="${citem.staffId !=adminid}" ><div class="pull-right " ></c:if>
                    <c:if test="${citem.staffId==adminid}"><div class="pull-left"></c:if>
                        ${citem.meso} <span class="text-right"><i>by ${citem.fname} at ${citem.messageTime}</i></span>
                    </div> <br />

                </c:forEach><!-- for Each to output chats -->
                <p class="text-warning">  ${errormessage}</p>
            </div>

    </body>
</html>
