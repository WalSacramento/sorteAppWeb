<%@page import="model.Sorteio"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SorteApp Admin</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
  </head>
  <body>

    <%
      ArrayList<Sorteio> lista = (ArrayList<Sorteio>) request.getAttribute("sorteios");
    	System.out.println(lista);
    %>

    <div class="container">
      <jsp:include page="header.jsp" />
      <jsp:include page="sidebar.jsp" />
      <div class="content">
        <table class="tabelaSorteios">
          <thead>
            <tr class="cabecalhoTabela">
              <th>Nome</th>
              <th>Descrição</th>
              <th>Data Inicial</th>
              <th>Data Final</th>
              <th>Prêmio</th>
              <th>Qtd Cotas</th>
              <th>Ganhador</th>
            </tr>
          </thead>
          <tbody>
            <%
            for (int i = 0; i < lista.size(); i++)
             {
            %>
            <tr>
              <td class="celulasTabela"><%=lista.get(i).getNomeSorteio()%></td>
              <td class="celulasTabela"><%=lista.get(i).getDataInicio()%></td>
              <td class="celulasTabela"><%=lista.get(i).getDescricao()%></td>
              <td class="celulasTabela"><%=lista.get(i).getDataFim()%></td>
              <td class="celulasTabela"><%=lista.get(i).getPremio()%></td>
              <td class="celulasTabela"><%=lista.get(i).getQtdCotas()%></td>
              <td class="celulasTabela"><%
                if (lista.get(i).getGanhador() == null) {
              %>
                <a href="select?idSorteio=<%=lista.get(i).getIdSorteio()%>" class="Botao">Informar ganhador!</a>
              <%
                } else {
                  out.print(lista.get(i).getGanhador());
                }
              %></td>
              <td class="celulasTabela"><a href="delete?idSorteio=<%=lista.get(i).getIdSorteio()%>" class="Botao"><span class="material-symbols-outlined">delete</span></a></td>
            <%
            }
            %>
            </tr>
          </tbody>
        </table>

      </div>
    </div>
  </body>
</html>
