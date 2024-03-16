<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SorteApp Admin</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
  </head>
  <body>
    <%
      String username = request.getParameter("username"); 
    %>
    <div class="sidebar">
      <img src="./img/logo-vermelho.png" alt="Logo" class="logoSidebar" />
      <ul class="sidebarMenu">
        <li class="btnSidebar">
          <a class="btnSidebarLink" href="criarSorteio.jsp">Criar Sorteio</a>
        </li>
        <li class="btnSidebar"><a class="btnSidebarLink" href="read">Listar Sorteios</a></li>
        <li class="btnSidebar">
          <a class="btnSidebarLink" href="#">Cadastrar</a>
        </li>
        <li class="btnSidebar">
          <a class="btnSidebarLink" href="#">Contact</a>
        </li>
      </ul>
    </div>
  </body>
</html>
