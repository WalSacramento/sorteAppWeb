package model;

public class Sorteio {
	private String idSorteio;
	private String nomeSorteio;
	private String descricao;
	private String dataInicio;
	private String dataFim;
	private String premio;
	private int qtdCotas;
	private String ganhador;
	
	public Sorteio(String idSorteio, String nomeSorteio, String descricao, String dataInicio, String dataFim, String premio, int qtdCotas, String ganhador) {
		this.idSorteio = idSorteio;
		this.nomeSorteio = nomeSorteio;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.premio = premio;
		this.qtdCotas = qtdCotas;
		this.ganhador = ganhador;
	}
	
	public Sorteio() {
		this.idSorteio = "";
		this.nomeSorteio = "";
		this.descricao = "";
		this.dataInicio = "";
		this.dataFim = "";
		this.premio = "";
		this.qtdCotas = 0;
		this.ganhador = "";
	}
	
	public String getIdSorteio() {
		return idSorteio;
	}

	public void setIdSorteio(String idSorteio) {
		this.idSorteio = idSorteio;
	}

	public String getNomeSorteio() {
		return nomeSorteio;
	}

	public void setNomeSorteio(String nomeSorteio) {
		this.nomeSorteio = nomeSorteio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}

	public int getQtdCotas() {
		return qtdCotas;
	}

	public void setQtdCotas(int qtdCotas) {
		this.qtdCotas = qtdCotas;
	}

	public String getGanhador() {
		return ganhador;
	}

	public void setGanhador(String ganhador) {
		this.ganhador = ganhador;
	}

}
