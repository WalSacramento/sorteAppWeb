</html><%@ page language="java" contentType="text/html; charset=UTF-8"
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
        <h1 class="contentTitle">Editar sorteio</h1>
        <form method="get" action="update" class="contentForm">
          <input type="text" class="inputForm" name="nomeSorteio" placeholder="ID do sorteio" value="<%out.print(request.getAttribute("idSorteio"));%>"/>
          <input type="text" class="inputForm" name="nomeSorteio" placeholder="Nome do sorteio" value="<%out.print(request.getAttribute("nomeSorteio"));%>"/>
          <input type="text" class="inputForm" name="descricao" placeholder="Descrição" value="<%out.print(request.getAttribute("descricao"));%>"/>
          <input type="date" class="inputForm" name="dataInicio" placeholder="Data de início" value="<%out.print(request.getAttribute("dataInicio"));%>"/>
          <input type="date" class="inputForm" name="dataFim" placeholder="Data de fim" value="<%out.print(request.getAttribute("dataFim"));%>"/>
          <input type="text" class="inputForm" name="premio" placeholder="Prêmio" value="<%out.print(request.getAttribute("premio"));%>"/>
          <input type="text" class="inputForm" name="ganhador" value="<%out.print(request.getAttribute("ganhador"));%>"/>
          <select class="inputForm" name="qtdCotas">
            <option value="">Selecione a quantidade de cotas</option>
            <option value="100">100</option>
            <option value="1000">1000</option>
            <option value="10000">10000</option>
            <option value="100000">100000</option>
          </select>
          <input type="submit" class="btnForm" value="Salvar" />
        </form>
      </div>

    </div>
  </body>
</html>
