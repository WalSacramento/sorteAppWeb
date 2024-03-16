<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SorteApp Admin</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0"
    />
  </head>
  <body>
  <%
  	String username = request.getParameter("username");
  
  	if (username == null) {
  		username = "Waldsson";
  	}
  %>
    <div class="header">
      <div class="welcome-message">Seja bem-vindo <%=username %>!</div>
      <a class="logout-button" href="index.html">
        <span class="material-symbols-outlined"> logout </span>
      </a>
    </div>
  </body>
</html>
