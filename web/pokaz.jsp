<%@page import="rsi.JDG"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usługa JDG</title>
        <link href="css/StyleSheet1.css" rel="stylesheet" type="text/css">
        <link href="css/admin.css" rel="stylesheet" type="text/css">
        <!--<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>-->
        <script src="http://code.jquery.com/jquery-latest.min.js"
        type="text/javascript"></script>
        <script type="text/javascript">
            $(function() {
                $(".single-toggle").click(
                        function() {
                            $("div.invisible-when-folded", this).toggle();
                        });
            });

//            $(function() {
//                $("div a.single-toggle").click(
//                        function() {
//                            alert('kliklem');
//                            $("td div div.invisible-when-folded", this).toogle();
//                        });
//            });
//    $(document).ready(function()
//            {
//                $("td a").click(function() {
//                    $("span").find("." + this.id).toggle();
//                    alert('kliklem');
//
////        $("#personInfo").show();
////                    $("#attach_box").hide();
//                    return false;
//
//                });
//            });
        </script>
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
                    <h1 class="h2_decoration underline">Lista wszystkich JDG</h1><br />
                    <br />
                    <%
                        //PrintWriter out = response.getWriter();
                        JDG[] list = (JDG[]) request.getAttribute("jdg");
                        for (int i = 0; i < list.length; i++) {
                    %>
                    <h1 class="h2_decoration underline" ><% out.println(list[i].nazwa);%></h1><br />
                    <table >
                        <!--id="table-6">-->
                        <tbody>        
                            <tr><td>NIP:</td><td><% out.println(list[i].nip);%></td></tr>
                            <tr><td>Właściciel:</td>
                                <td>
                                    <div class="single-toggle"><a href="#"  >Pokaż dane</a><div>
                                            <div class="invisible-when-folded"><% out.println(list[i].wlasciciel);%></div>
                                            </td></tr>
                                            <tr><td>Data założenia: </td><td><% out.println(list[i].dataZalozenia);%></td></tr>
                                            <tr><td>KRS:</td><td><% out.println(list[i].krs);%></td></tr>
                                            <tr><td>Adres siedziby:</td><td><% out.println(list[i].adresSiedziby);%></td></tr>
                                            <tr><td>Rodzaj działalności:</td><td><% out.println(list[i].rodzajDzialalnosci);%></td></tr>
                                            <tr><td>Pierwsza działalność: </td><td><% out.println((list[i].czyPierwsza == true) ? "Tak" : "Nie");%></td></tr>
                                            </tbody>
                                            </table>
                                            <br />
                                            <% }%>
                                            <br />
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

