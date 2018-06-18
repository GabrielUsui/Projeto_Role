package modelo;

import java.util.ArrayList;

public class Localidade {
	private int idLocalidade;
	private ArrayList<String> cardapio;
	private String telefone;
	
	public Localidade() {}

	public Localidade(int idLocalidade, ArrayList<String> cardapio, String telefone) {
		super();
		this.idLocalidade = idLocalidade;
		this.cardapio = cardapio;
		this.telefone = telefone;
	}

	public int getIdLocalidade() {
		return idLocalidade;
	}

	public void setIdLocalidade(int idLocalidade) {
		this.idLocalidade = idLocalidade;
	}

	public ArrayList<String> getCardapio() {
		return cardapio;
	}

	public void setCardapio(ArrayList<String> cardapio) {
		this.cardapio = cardapio;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
}