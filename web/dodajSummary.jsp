<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usługa osobowa</title>
        <link href="css/StyleSheet1.css" rel="stylesheet" type="text/css">
        <link href="css/admin.css" rel="stylesheet" type="text/css">
        <!--<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>-->
    </head>
    <body>
        <!--<div id="page" style="background: #fff;">-->
        <div id="page" >
            <a href="index.jsp" style="float: right; text-decoration: none;padding-bottom: 7px;">Moduł użytkownika</a>
            <div id="header">
                <h1 class="h2_decoration ">Jednoosobowa działalność gospodarcza</h1>
            </div>
            <div id="pageInside" >
                <div class="wrap">
                    <h1 class="h2_decoration underline">${info}</h1><br />
                    <br />
                    <a href="index.jsp">Powrót</a>
                    <br />
                    <br />

                </div>
            </div>
            <div id="footer">Autor: Paweł Parafiniuk</div>
        </div>
    </body>
</html>

