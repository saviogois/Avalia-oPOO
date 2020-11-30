<%@page import="br.fatec.avaliacao.poo.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/menu.jspf" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" type="text/css" href="style-disc.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minha Disciplina</title>
    </head>
    <body>
        <h1>Minhas Disciplinas</h1>
        
        <%
            if(request.getParameter("nome")!=null){
                String nome = (String)request.getParameter("nome");
                String ementa = (String)request.getParameter("ementa");
                Integer ciclo = Integer.parseInt(request.getParameter("ciclo"));
                Double nota = Double.parseDouble(request.getParameter("nota"));

                Disciplina.insert(nome, ementa, ciclo, nota);
            }
            
            if(request.getParameter("id")!=null){
                Disciplina.delete(Integer.parseInt(request.getParameter("id")));
            }
        %>
        
        <form>
            <div id="container2">
            <table border="0" class="border">
            <tr>
                <th>Disciplinas</th>
                <th>Ementa</th>
                <th>Ciclo</th>
                <th>Nota</th>
                <th>Alterar</th>
            </tr>
            <%for(Disciplina d: Disciplina.getList()){ %>
            <tr>
                <td><%= d.getNome() %></td>
                <td><%= d.getEmenta() %></td>
                <td><%= d.getCiclo() %></td>
                <td><%= d.getNota() %></td>
                <td><form>
                        <input type="hidden" name="id" value="<%= d.getRowId() %>">
                        <input type="submit" value="Apagar">
                    </form></td>
            </tr>
            <%}%>

        </table>
            </div>
        </form>
        
        <h2>Adicionar Disciplina</h2>
        <form>
            <input type="text" name="nome" placeholder="Disciplina">
            <input type="text" name="ementa" placeholder="Ementa">
            <input type="text" name="ciclo" placeholder="Ciclo">
            <input type="text" name="nota" placeholder="Nota">
            <input type="submit" value="Enviar">
        </form>
        
        
        
    </body>
</html>