package modelo;

public class Evento {
	private int idEvento;
	private String nome;
	private double preco;
	private String tipo;
	private String data;
	private String horario;
	private String telefone;
	
	public Evento() {}
	
	public Evento(int idEvento, String nome, double preco, String tipo, String data, String horario, String telefone) {
		this.idEvento = idEvento;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.data = data;
		this.horario = horario;
		this.telefone = telefone;
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}