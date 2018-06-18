package model;

public class Atracao {
	private int idAtracao;
	private String nome;
	private String estilo;
	
	public Atracao() {}
	
	public Atracao(int idAtracao, String nome, String estilo) {
		this.idAtracao = idAtracao;
		this.nome = nome;
		this.estilo = estilo;
	}
	
	public int getIdAtracao() {
		return idAtracao;
	}
	
	public void setIdAtracao(int idAtracao) {
		this.idAtracao = idAtracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}