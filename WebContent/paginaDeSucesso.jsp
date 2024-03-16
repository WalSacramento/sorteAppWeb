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
    <div class="container">
      <jsp:include page="header.jsp" />
      <jsp:include page="sidebar.jsp" />
      
        <div class="content">
            <h1>Sorteio criado com sucesso!</h1>
            <p>O sorteio foi criado com sucesso. Agora você pode compartilhar o link
            com os participantes.</p>
            <p>Link do sorteio: <a href="http://localhost:8080/SorteApp/sorteio.jsp">http://localhost:8080/SorteApp/sorteio.jsp</a></p>
    </div>
  </body>
</html>
