<%-- 
    Document   : UpdateMystone
    Created on : Aug 10, 2021, 1:21:03 PM
    Author     : xenonkup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Mystore2.Mystore1" %>

<% Mystore1 mystore = (Mystore1) session.getAttribute("mystore");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Store</title>
    </head>
    <body>
        <h1>แก้ไข</h1>
        <p></p>
        <form  action="MyStore">
            <label>ID :</label><br>
            <label for="fname">First name :</label><br>
            <input type="text" id="fname" name="fname" value="<%= mystore.getFname()%>"><br>
            <label for="lname">Last name :</label><br>
            <input type="text" id="lname" name="lname" value="<%= mystore.getLname()%>" ><br><br>
            
            <label>Shirt :</label><br>
            <input type="radio" id="Shirt1" name="shirt" value="Nike">
            <label for="Shirt1">Nike</label>
            <input type="radio" id="Shirt2" name="shirt" value="Adidas">
            <label for="Shirt2">Adidas</label><br>
            <label>Trouser :</label><br>
            <input type="radio" id="Trousers1" name="trousers" value="Nike">
            <label for="Trousers1">Nike</label>
            <input type="radio" id="Trousers2" name="trousers" value="Adidas">
            <label for="Thousers2">Adidas</label><br>
            <label>Hat :</label><br>
             <input type="radio" id="Hat1" name="hat" value="Nike">
            <label for="Hat1">Nike</label>
            <input type="radio" id="Hat2" name="hat" value="Adidas">
            <label for="Hat2">Adidas</label><br><br>
                                 
            <label>Price :</label><br>
            <input type="radio" id="Price1" name="price" value="700 บาท">
            <label for="Price1">Normal = 700 บ.</label><br>
            <input type="radio" id="Price2" name="price" value="1,200 บาท">
            <label for="Price2">Limited = 1,200 บ.</label><br><br>
             

            <label>Delivery :</label>
            <input type="text" id="address" name="address" value="<%= mystore.getAddress()%>"><br><br>
            <input type="submit" value="Submit">
           
        </form> 
    </body>
</html>
