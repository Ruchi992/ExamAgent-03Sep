<%-- 
    Document   : Prodect
    Created on : 3 Sep 2020, 10:51:40
    Author     : Ruchi Devi
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Products</title>
    </head> 
   <body>
        <table style="width:100%">
            <tr>
            <th align="left">Code</th>
             <th align="left">Name</th>
             <th align="left">Product Line</th>
             <th align="left">Product Scale</th>
             <th align="left">Product Vendor</th>
             <th align="left">Product Description</th>
             <th align="left">Qty In Stock</th>
             <th align="left">Buy Price</th>
             <th align="left">MSRP</th>
             <th align="left">Image</th>
             <th align="left">Actions</th>
           
            </tr>
            <c:forEach items="${productsList}" var="Product"> 
                <tr>
                   <td>${Product.productCode}</td>
				    <td>${Product.Code}</td>
					 <td>${Product.Name}</td>
					  <td>${Product.ProductLine}</td>
					   <td>${Product.ProductScale}</td>
				   
                </tr>
            </c:forEach>
        </table>
 
    </body>
</html>
