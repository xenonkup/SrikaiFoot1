<%-- 
    Document   : addnewMemberToFirebase
    Created on : Aug 21, 2021, 8:19:11 PM
    Author     : xenonkup
--%>

<%@page import="Mystore2.Mystore1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Mystore1 mystore = (Mystore1) session.getAttribute("mystore");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>แสดงข้อมูล</title>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-database.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-analytics.js"></script>

    </head>
    <body>
    <center>
        <h1>ข้อมูล</h1>
        FirstName : <%= mystore.getFname()%><br/><br/>
        LastName : <%= mystore.getLname()%><br/><br/>
        Shirt : <%= mystore.getShirt()%><br/><br/>
        Trousers : <%= mystore.getTrousers()%><br/><br/>
        Hat : <%= mystore.getHat()%><br/><br/>
        Price : <%= mystore.getPrice()%><br/><br/>
        Delivery : <%= mystore.getAddress()%><br/><br/>
        <a href='UpdateMystore.jsp'><input type="submit" value="แก้ไข" ></a>
        <input type="button" value="Save" onclick="save_buy();"/>
    </center>
    <script>
        // Your web app's Firebase configuration
        // For Firebase JS SDK v7.20.0 and later, measurementId is optional
        var firebaseConfig = {
            apiKey: "AIzaSyDQaoXEOKpyEJGkfarzTFGsSnhRFMindJQ",
            authDomain: "srikaifood-75cbf.firebaseapp.com",
            databaseURL: "https://srikaifood-75cbf-default-rtdb.asia-southeast1.firebasedatabase.app",
            projectId: "srikaifood-75cbf",
            storageBucket: "srikaifood-75cbf.appspot.com",
            messagingSenderId: "294153159528",
            appId: "1:294153159528:web:9215dc0a283b0cb6e38cdd",
            measurementId: "G-YKPZTVS71X"
        };
        // Initialize Firebase
        firebase.initializeApp(firebaseConfig);
        firebase.analytics();

    </script>

    <script>
        var databaseRef = firebase.database().ref('mystore/');

        function save_buy() {
            var uid = firebase.database().ref().child('mystore').push().key;

            var data = {
                user_id: uid,
                FirstName: '<%= mystore.getFname()%>',
                LastName: '<%= mystore.getLname()%>',
                Shirt: '<%= mystore.getShirt()%>',
                Trousers: '<%= mystore.getTrousers()%>',
                Hat: '<%= mystore.getHat()%>',
                Price: '<%= mystore.getPrice()%>',
                Delivery: '<%= mystore.getAddress()%>'
            }

            var updates = {};
            updates['/mystore/' + uid] = data;
            firebase.database().ref().update(updates);

            alert('created successfully!');
            reload_page();
        }
    </script>
</body>
</html>