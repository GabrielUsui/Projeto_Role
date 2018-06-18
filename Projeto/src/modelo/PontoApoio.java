package modelo;

public class PontoApoio {
	private int idPontoApoio;
	private String horarioSemanal;
	private String horarioSabado;
	private String horarioDomingo;
	private String horarioFeriado;
	private String cep;
	private int numero;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	
	public PontoApoio() {}

	public PontoApoio(int idPontoApoio, String horarioSemanal, String horarioSabado, String horarioDomingo,
			String horarioFeriado, String cep, int numero, String logradouro, String bairro, String cidade,
			String estado) {
	
		this.idPontoApoio = idPontoApoio;
		this.horarioSemanal = horarioSemanal;
		this.horarioSabado = horarioSabado;
		this.horarioDomingo = horarioDomingo;
		this.horarioFeriado = horarioFeriado;
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getIdPontoApoio() {
		return idPontoApoio;
	}

	public void setIdPontoApoio(int idPontoApoio) {
		this.idPontoApoio = idPontoApoio;
	}

	public String getHorarioSemanal() {
		return horarioSemanal;
	}

	public void setHorarioSemanal(String horarioSemanal) {
		this.horarioSemanal = horarioSemanal;
	}

	public String getHorarioSabado() {
		return horarioSabado;
	}

	public void setHorarioSabado(String horarioSabado) {
		this.horarioSabado = horarioSabado;
	}

	public String getHorarioDomingo() {
		return horarioDomingo;
	}

	public void setHorarioDomingo(String horarioDomingo) {
		this.horarioDomingo = horarioDomingo;
	}

	public String getHorarioFeriado() {
		return horarioFeriado;
	}

	public void setHorarioFeriado(String horarioFeriado) {
		this.horarioFeriado = horarioFeriado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}