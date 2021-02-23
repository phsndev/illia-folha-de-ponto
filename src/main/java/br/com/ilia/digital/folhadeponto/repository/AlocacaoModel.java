package br.com.ilia.digital.folhadeponto.repository;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alocacao")

public class AlocacaoModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false, length = 5)
	private LocalDate dia;

	@Column(nullable = false, length = 10)
	private LocalTime tempo;

	@Column(length = 45)
	private String nomeProjeto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	protected AlocacaoModel() {
		
	}

	public AlocacaoModel(Long id, LocalDate dia, LocalTime tempo, String nomeProjeto) {
		super();
		this.id = id;
		this.dia = dia;
		this.tempo = tempo;
		this.nomeProjeto = nomeProjeto;
	}
	

}
