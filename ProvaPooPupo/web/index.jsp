<%@page import="br.fatec.avaliacao.poo.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%int num = 0;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Index - Sávio</title>
    </head>
    <body>
        <div id="container">
            <table allign="center" border="0">
                <tr>
                    <th><b>Nome: </b></th>
                    <th>Sávio Gabriel Santos Gois</th>
                </tr>
                <tr>
                    <th><b>RA: </b></th>
                    <th>1290481912032</th>
                </tr>
                <%for(int i = 0; i <= Disciplina.getList().size(); i++){
                    num = i;
                }%>
                <tr>
                    <th><b>Disciplinas: </b></th>
                    <th><%= num %></th>
                </tr>
            </table>
        </div>
                <br>
                <%@include file="WEB-INF/jspf/rodape.jspf"%>
    </body>
</html>