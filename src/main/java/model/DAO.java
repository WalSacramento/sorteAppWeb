package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	
	//Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/sorteAppWeb";
	private String user = "root";
	private String password = "1234";
	
	//Método de conexão
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("conexão feita!");
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//CRUD CREATE

	public void inserirSorteio(Sorteio sorteio) {
		String create = "INSERT INTO sorteios (nomeSorteio, descricao, dataInicio, dataFim, premio, qtdCotas) VALUES (?, ?, ?, ?, ?, ?)";

		try {
			//abrir conexão
			Connection con = conectar();

			//preparar a query para execucao no bd
			PreparedStatement pst = con.prepareStatement(create);

			//substituir os placeholders (?) pelos valores do objeto sorteio
			pst.setString(1, sorteio.getNomeSorteio());
			pst.setString(2, sorteio.getDescricao());
			pst.setString(3, sorteio.getDataInicio());
			pst.setString(4, sorteio.getDataFim());
			pst.setString(5, sorteio.getPremio());
			pst.setInt(6, sorteio.getQtdCotas());

			//executar a query
			pst.executeUpdate();

			//fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	//CRUD READ
	public ArrayList<Sorteio> listarSorteios() {
		//criando um arraylist para armazenar os sorteios
		ArrayList<Sorteio> sorteios = new ArrayList<>();

		//query de leitura
		String read = "select * from sorteios order by nomeSorteio";

		try {
			//abrir conexão
			Connection con = conectar();

			//preparar a query para execucao no bd
			PreparedStatement pst = con.prepareStatement(read);

			//executando a query
			ResultSet rs = pst.executeQuery();

			//percorrer o resultado da query e armazenar no arraylist
			while (rs.next()) {
				//pegando cada coluna do objeto
				String idSorteio = rs.getString(1);
				String nomeSorteio = rs.getString(2);
				String descricao = rs.getString(3);
				String dataInicio = rs.getString(4);
				String dataFim = rs.getString(5);
				String premio = rs.getString(6);
				int qtdCotas = rs.getInt(7);
				String ganhador = rs.getString(8);

				//populando o arrayList
				sorteios.add(new Sorteio(idSorteio, nomeSorteio, descricao, dataInicio, dataFim, premio, qtdCotas, ganhador));
			}

			//encerrando conexão
			con.close();
			
			System.out.println(sorteios);

			//retornando o arrayList
			return sorteios;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		} 
	}

	//SELECT

	public Sorteio selecionarSorteio(Sorteio sorteio) {
		//query de leitura
		String select = "select * from sorteios where idSorteio = ?";

		try {
			//abrir conexão
			Connection con = conectar();

			//preparar a query para execucao no bd
			PreparedStatement pst = con.prepareStatement(select);

			//substituir o placeholder (?) pelo valor do idSorteio
			pst.setString(1, sorteio.getIdSorteio());

			//executando a query
			ResultSet rs = pst.executeQuery();

			//percorrer o resultado da query e armazenar no arraylist
			while (rs.next()) {
				//pegando cada coluna do objeto
				sorteio.setIdSorteio(rs.getString(1));
				sorteio.setNomeSorteio(rs.getString(2));
				sorteio.setDescricao(rs.getString(3));
				sorteio.setDataInicio(rs.getString(4));
				sorteio.setDataFim(rs.getString(5));
				sorteio.setPremio(rs.getString(6));
				sorteio.setQtdCotas(rs.getInt(7));
				sorteio.setGanhador(rs.getString(8));

			}
			
				//encerrando conexão
				con.close();

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		return null;
	}

	//UPDATE
	public void alterarSorteio(Sorteio sorteio) {
			//definindo a query
			String update = "update sorteios set nomeSorteio=?, descricao=?, dataInicio=?, dataFim=?, premio=?, qtdCotas=?, ganhador=? where idSorteio=?";

			try {
				//abrindo a conexao
				System.out.println("DAO ALTERAR SORTEIO");
				Connection con = conectar();

				//preparar a query para execucao no bd
				PreparedStatement pst = con.prepareStatement(update);

				//substituir os placeholders (?) pelos valores do objeto sorteio
				pst.setString(1, sorteio.getNomeSorteio());
				pst.setString(2, sorteio.getDescricao());
				pst.setString(3, sorteio.getDataInicio());
				pst.setString(4, sorteio.getDataFim());
				pst.setString(5, sorteio.getPremio());
				pst.setInt(6, sorteio.getQtdCotas());
				pst.setString(7, sorteio.getGanhador());
				pst.setString(8, sorteio.getIdSorteio());

				//executar a query
				pst.executeUpdate();

				//fechar a conexão
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	
	//crud delete
	public void deletarSorteio(Sorteio sorteio) {
		//definindo a query
		String delete = "delete from sorteios where idSorteio=?";
		
		try {
			//abrindo a conexao
			Connection con = conectar();
		
			PreparedStatement pst = con.prepareStatement(delete);
			
			pst.setString(1, sorteio.getIdSorteio());
			
			pst.executeUpdate();
		
			con.close();
		}	catch (Exception e) {
			System.out.println(e);
		}
	}

}
