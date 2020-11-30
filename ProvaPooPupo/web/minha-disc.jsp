<%@page import="br.fatec.avaliacao.poo.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(request.getParameter("nome")!= null){
        String nome = request.getParameter("nome");
        String ementa = request.getParameter("ementa");
        Integer ciclo = Integer.parseInt(request.getParameter("ciclo"));
        Double nota = Double.parseDouble(request.getParameter("nota")); 
        
        Disciplina.insert(nome, ementa, ciclo, nota);
    }
    
    if(request.getParameter("id")!= null){
        Disciplina.delete(Integer.parseInt(request.getParameter("id")));
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@include file="WEB-INF/jspf/menu.jspf"%>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="style-disc.css">
        <title>Minhas Disciplinas - Sávio</title>
    </head>
    <body>
        <div id="container2">
            <table border="0" class="table">
                <tr>
                    <th>Nome</th>
                    <th>Ementa</th>
                    <th>Ciclo</th>
                    <th>Nota</th>
                    <th>Alterar Nota</th>
                </tr>
                <%for(Disciplina dis: Disciplina.getList()){%>
                <tr>
                    <td><%= dis.getNome()%></td>
                    <td><%= dis.getEmenta()%></td>
                    <td><%= dis.getCiclo()%></td>
                    <td><%= dis.getNota()%></td>
                    <th>
                        <form>
                            <input type="number" step="0.01" max="10" min="0.00" name="nota">
                            <input type="submit" name="botao" value="Alterar">
                            <input type="hidden" value="<%= dis.getRowId()%>" name="y">
                        </form>
                    </th>
                </tr>
                <%}%>
            </table>
        </div>
         
            <br>
            <%@include file="WEB-INF/jspf/rodape.jspf"%>
    </body>
</html>