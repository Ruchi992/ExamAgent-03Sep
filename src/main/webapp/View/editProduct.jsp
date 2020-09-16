<%-- 
    Document   : editProduct
    Created on : 3 Sep 2020, 10:58:32
    Author     : Ruchi Devi
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <h3>Edit a Product</h3>
    
     <form:form method=" " action=" " modelAttribute=" ">

        <table>
            <tr>
                <td><form:label path="productCode">Product Code</form:label></td>
                <td><form:input path="productCode"  readonly="true"/></td>
                <td style="color:red"><form:errors path="productCode"/> </td>
            </tr>
          
           

            <tr>
             
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </body>
</form:form>
</html>
