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
        <h1 class="contentTitle">Criar sorteio</h1>
        <form action="insert" name="formSorteio" class="contentForm">
          <input type="text" class="inputForm" name="nomeSorteio" placeholder="Nome do sorteio" />
          <input type="text" class="inputForm" name="descricao" placeholder="Descrição" />
          <input type="date" class="inputForm" name="dataInicio" placeholder="Data de início" />
          <input type="date" class="inputForm" name="dataFim" placeholder="Data de fim" />
          <input type="text" class="inputForm" name="premio" placeholder="Prêmio" />
          <select class="inputForm" name="qtdCotas">
            <option value="">Selecione a quantidade de cotas</option>
            <option value="100">100</option>
            <option value="1000">1000</option>
            <option value="10000">10000</option>
            <option value="100000">100000</option>
          </select>
          <input type="submit" class="btnForm" value="Criar sorteio" />
        </form>
      </div>

    </div>
  </body>
</html>
