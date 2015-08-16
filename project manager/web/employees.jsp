<%-- 
    Document   : employees
    Created on : May 28, 2015, 4:39:12 PM
    Author     : Mugusca
<c:forEach var="item" items="${employee.department}" begin="1">
                <td></td><td>${item}</td></tr>  
            </c:forEach>

<table>
            <tr><td>Name </td><td>${employee.fname} ${employee.surname}</td></tr>
            <tr><td>Departments </td><td>${employee.department}</td></tr><tr>
                
            
            <tr><td>Gender </td><td>${employee.gender}</td></tr>
            <tr><td>Age </td><td>${age} Years</td></tr>
        </table> 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Employees</title>
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
                        <li class="active"><a href="#" data-toggle="pill">DashBoard</a></li>
                        <li><a href="#" data-toggle="pill">MyAccount</a></li>
                    </ul>  
                </div>


                <div class="navbar-text navbar-right">

                    <h3>Welcome ${username} <span class="glyphicon glyphicon-user"></span></h3>  
                </div>
            </nav>
        </div> <!-- container fluid -->


         <div class="container">
            <div class="row">
                <div class="col-sm-2">
                    <ul class="nav navbar nav-stacked">
                        
                        <li><a href="addProject">Home <span class="glyphicon glyphicon-home"></span></a></li>
                       

                        <li><a href="LoginServlet?action=out">LogOut <span class="glyphicon glyphicon-log-out"></span></a></li>
                    </ul>
                </div>
                <div class="col-sm-10">
                    
        
        
        
        
        <div class="container">
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8">
        <h2>Masaba Services Employees</h2>
        <div class="row">
            <div class="col-sm-8"> Name</div>
            <div class="col-sm-4">StaffId</div>
        </div>
                <c:forEach var="item" items="${users}"  >
                    <div class="row">
                        <div class="col-sm-4">  ${item.fname}
                        </div>
                        <div class="col-sm-4">
                           ${item.surname} 
                        </div>
                        <div class="col-sm-4">
                            
                         ${item.staffId}
                        </div>
            
                    </div>
            </c:forEach>
        </table>
                </div>
                <div class="col-sm-2">
                    
                </div>
            </div>
        </div>
                </div>
         </body>
</html>
