package br.com.ilia.digital.folhadeponto.dto;

public class AlocacaoDTO {

	public String dia;
	public String tempo;
	public String nomeProjeto;

	public AlocacaoDTO(String dia, String tempo, String nomeProjeto) {
		super();
		this.dia = dia;
		this.tempo = tempo;
		this.nomeProjeto = nomeProjeto;
	}
	public String getDia() {
		return dia;
	}
	public String getTempo() {
		return tempo;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
}
