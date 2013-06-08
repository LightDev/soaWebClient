<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usługa JDG</title>
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
                    <h1 class="h2_decoration underline">Modyfikujesz JDG o numerze ${nip}</h1><br />
                    <form action="modyfikujSummary" method="POST">
                        <!--onsubmit="return false"-->
                        <table id="table-6">
                            <tbody>        
                                <tr><td>Nazwa:</td><td><input type="text" name="nazwa" value="${nazwa}"/></td></tr>
                                <tr><td>NIP:</td><td><input type="text" name="nip" value="${nip}"/></td></tr>
                                <tr><td>Właściciel:</td><td><input type="text" name="wlasciciel" value="${wlasciciel}" /></td></tr>
                                <tr><td>Data założenia: </td><td><input type="text" name="data_zal" value="${dataZalozenia}" /></td></tr>
                                <tr><td>KRS:</td><td><input type="text" name="indeks" value="${krs}" /></td></tr>
                                <tr><td>Adres siedziby:</td><td><input type="text" name="indeks" value="${adresSiedziby}" /></td></tr>
                                <tr><td>Rodzaj działalności:</td><td><input type="text" name="rodzaj" value="${rodzajDzialalnosci}" /></td></tr>
                                <tr><td>Pierwsza działalność: </td><td><select  name="czyPierwsza" >
                                            <option ${czyPierwsza == 'T' ? 'selected' : ''}>Tak</option>
                                            <option ${czyPierwsza == 'N' ? 'selected' : ''}>Nie</option>
                                        </select> </td></tr>
                                <tr><td></td><td><input type="submit" value="Modyfikuj" class="button" /></td></tr>
                            </tbody>
                        </table>
                    </form>
                    <br />
                    <br />
                </div>
            </div>
            <div id="footer">Autor: Paweł Parafiniuk</div>
        </div>
    </body>
</html>

