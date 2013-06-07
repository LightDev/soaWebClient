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
                    <h1 class="h2_decoration underline">Dodaj</h1><br />
                    <form action="dodaj" method="POST">
                        <table id="table-6">
                            <!--                            <thead>
                                                        <th>Atrybut</th><th>Wartość</th>
                                                        </thead>-->
                            <tbody>        
                                <tr><td>Nazwa:</td><td><input type="text" name="nazwa" /></td></tr>
                                <tr><td>NIP:</td><td><input type="text" name="nip" /></td></tr>
                                <tr><td>Właściciel:</td><td><input type="text" name="wlasciciel"  /></td></tr>
                                <tr><td>Adres siedziby</td><td><input type="text" name="adresSiedziby"  /></td></tr>
                                <tr><td>Rodzaj działalności:</td><td><input type="text" name="rodzajDzialalnosci"  /></td></tr>
                                <tr><td>Indeks krajowego:</td><td><input type="text" name="krs"  /></td></tr>
                                <tr><td>Data założenia: </td><td><input type="text" name="dataZalozenia"  /></td></tr>
                                <tr><td>Pierwsza działalność: </td><td><select  name="czyPierwsza" >
                                            <option>Tak</option>
                                            <option>Nie</option>
                                        </select> </td></tr>
                                <tr><td></td><td><input type="submit" value="Dodaj JDG" class="button" /></td></tr>
                            </tbody>
                        </table>

                    </form>

                    <h1 class="h2_decoration underline">Modyfikuj</h1><br />
                    <form action="modyfikuj" method="POST">
                        NIP:<input type="text" name="nip" />
                        <input type="submit" value="Modyfikuj" class="button" />
                    </form>

                    <h1 class="h2_decoration underline">Usuń</h1><br />
                    <form action="usun" method="GET">
                        NIP:<input type="text" name="nip" />

                        <input type="submit" value="Usuń" class="button" />
                    </form>
                    <h1 class="h2_decoration underline">Wyświetl</h1><br />
                    <a href="pokaz"  class="button">Pokaż JDG</a><br /><br />
                </div>
            </div>
            <div id="footer">Autor: Paweł Parafiniuk</div>
        </div>
    </body>
</html>

