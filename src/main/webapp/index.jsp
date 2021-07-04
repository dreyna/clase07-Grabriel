<%-- 
    Document   : index
    Created on : 4 jul. 2021, 9:20:24
    Author     : dreyna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"><!-- comment -->
        <link rel="stylesheet" href="recursos/css/login.css">
    </head>
    <body>
        <div class="container d-flex flex-column small justify-content-center align-items-center">
            <img src="recursos/imagen/user.png" alt="" width="128" height="128">
            <div class="form-group">
                <label for="a">Correo:</label>
                <input type="text" class="form-control" id="correo">
            </div>
            <div class="form-group">
                <label for="a">Password:</label>
                <input type="password" class="form-control" id="password">
            </div>
            <button type="button" class="btn btn-primary" style="width: 87%;" id="login">Enviar</button>
        </div>
        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script src="recursos/js/login.js"></script>
    </body>
</html>
