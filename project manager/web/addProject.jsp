<%-- 
    Document   : addProject
    Created on : Jun 7, 2015, 10:35:20 AM
    Author     : Mugusca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Hello World!</h1>

        <form action="addProject" method="post" >
            <table><tr><td> Project Name </td><td> <input type="text" name="pname" /> </td></tr>
                <tr><td>Start Date  </td><td> <input type="date" name="startdate" /></td></tr>
                <tr><td>Duration   </td><td> <input type="number" name="duration" /> days  </td></tr>
                <tr><td>Team Leader </td><td> <input type="text" name="teamleader" /> </td></tr>
                <tr><td></td><td><input type="submit" value="ADD PROJECT" /></td></tr>
            </table>
        </form>

    </body>
</html>
