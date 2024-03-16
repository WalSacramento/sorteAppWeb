package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.DAO;
import model.Sorteio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/insert", "/read", "/select", "/update", "/delete"})
public class controlador extends HttpServlet {
	
	DAO dao = new DAO();
	Sorteio sorteio = new Sorteio();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		
		if (action.equals("/insert")) {
			novoSorteio(request, response);
		} else if (action.equals("/read")) {
			listarSorteios(request, response);
		} else if (action.equals("/select")) {
			selecionarSorteio(request, response);
		} else if (action.equals("/update")){
			editarSorteio(request, response);
		} else if (action.equals("/delete")) {
			deletarSorteio(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void novoSorteio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sorteio.setNomeSorteio(request.getParameter("nomeSorteio"));
		sorteio.setDescricao(request.getParameter("descricao"));
		sorteio.setDataInicio(request.getParameter("dataInicio"));
		sorteio.setDataFim(request.getParameter("dataFim"));
		sorteio.setPremio(request.getParameter("premio"));
		sorteio.setQtdCotas(Integer.parseInt(request.getParameter("qtdCotas")));

		dao.inserirSorteio(sorteio);
		
		response.sendRedirect("paginaDeSucesso.jsp");
	}

	protected void listarSorteios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//criando um objeto que receberá a lista de sorteios
		ArrayList<Sorteio> lista = dao.listarSorteios();

		System.out.println(lista);

		//passando a lista para o jsp
		request.setAttribute("sorteios", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarSorteios.jsp");
		rd.forward(request, response);
	}

	protected void selecionarSorteio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//receber o id do contato que vai ser editado
		String idSorteio = request.getParameter("idSorteio");

		//setar a variavel auxiliar para salvar o id
		sorteio.setIdSorteio(idSorteio);

		//executando o método de selecionar sorteio do DAO
		dao.selecionarSorteio(sorteio);

		//Setar os atributos para serem enviador para o formulário
		request.setAttribute("idSorteio", sorteio.getIdSorteio());
		request.setAttribute("nomeSorteio", sorteio.getNomeSorteio());
		request.setAttribute("descricao", sorteio.getDescricao());
		request.setAttribute("dataInicio", sorteio.getDataInicio());
		request.setAttribute("dataFim", sorteio.getDataFim());
		request.setAttribute("premio", sorteio.getPremio());
		request.setAttribute("qtdCotas", sorteio.getQtdCotas());
		request.setAttribute("ganhador", sorteio.getGanhador());

		//encaminhar ao documento editarSorteio.jsp
		RequestDispatcher rd = request.getRequestDispatcher("editarSorteio.jsp");
		rd.forward(request, response);
	}

	protected void editarSorteio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// criando um objeto para enviar pra o banco
		sorteio.setIdSorteio(request.getParameter("idSorteio"));
		sorteio.setNomeSorteio(request.getParameter("nomeSorteio"));
		sorteio.setDescricao(request.getParameter("descricao"));
		sorteio.setDataInicio(request.getParameter("dataInicio"));
		sorteio.setDataFim(request.getParameter("dataFim"));
		sorteio.setPremio(request.getParameter("premio"));
		sorteio.setQtdCotas(Integer.parseInt(request.getParameter("qtdCotas")));
		sorteio.setGanhador(request.getParameter("ganhador"));
		
		//executar o método de alterar contato
		dao.alterarSorteio(sorteio);
		
		//redirecionar a página de listar
		response.sendRedirect("read");
	}
	
	protected void deletarSorteio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//criando um objeto para enviar para o banco
		sorteio.setIdSorteio(request.getParameter("idSorteio"));
		
		//executar o método de alterar contato
		dao.deletarSorteio(sorteio);
		
		//redirecionar a pagina de listar
		response.sendRedirect("read");
	}
}
