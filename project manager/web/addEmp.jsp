<%-- 
    Document   : addEmp
    Created on : May 28, 2015, 4:58:29 PM
    Author     : Mugusca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Employee</title>
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.min.css" />
    </head>
    <body>
       
       
        <form action="addEmp" method="post">
            <table>
                <tr><td>First Name</td><td> <input type="text" name="fname" /></td></tr>
                <tr><td>Surname</td><td>  <input type="text" name="surname" /></td></tr>
                
                <tr><td>d.o.B</td><td><input type="date" name="dob" /></td></tr>
                <tr><td>Staff Id</td><td> <input type="text" name="staffId" /></td></tr>
                
                <tr><td>Gender</td><td><input type="radio" name="gender" value="Male" /> Male</td></tr>
                <tr><td></td><td> <input type="radio" name="gender" value="Female" /> Female</td></tr>
               
                <tr><td>Department</td><td><input type="checkbox" name="department" value="Accounts"/>Accounts</td></tr>
                <tr><td></td><td><input type="checkbox" name="department" value="Engineering"/>Engineering/Technician</td></tr>
                <tr><td></td><td> <input type="checkbox" name="department" value="Management"/>Management</td></tr>
                <tr><td></td><td><input type="checkbox" name="department" value="Marketing"/>Marketing</td></tr>
                <tr><td></td><td><input type="checkbox" name="department" value="Procurement"/>Procurement</td></tr>
            </table> 
            Marital Status:
            <select name="status">
                <option>Single</option>
                <option>Married</option>
            </select><br />
            
            <input type="submit" value="ADD EMPLOYEE" />
            
            <!--<form action="addEmp" method="post" >
                <input type="submit" value="VIEW EMPLOYEES" />
            
        </form>-->
        
    </body>
</html>
