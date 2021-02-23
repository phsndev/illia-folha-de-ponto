package br.com.ilia.digital.folhadeponto.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "relatorio")

public class RelatorioModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, length = 15)
    private String mes;

    @Column(nullable = true, length = 15)
    private String horasTrabalhadas;

    @Column(nullable = true, length = 15)
    private String horasExcedentes;

    @Column(nullable = true, length = 15)
    private String horasDevidas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getHorasExcedentes() {
		return horasExcedentes;
	}

	public void setHorasExcedentes(String horasExcedentes) {
		this.horasExcedentes = horasExcedentes;
	}

	public String getHorasDevidas() {
		return horasDevidas;
	}

	public void setHorasDevidas(String horasDevidas) {
		this.horasDevidas = horasDevidas;
	}
	
	protected RelatorioModel() {
		
	}

	public RelatorioModel(Long id, String mes, String horasTrabalhadas, String horasExcedentes, String horasDevidas) {
		super();
		this.id = id;
		this.mes = mes;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasExcedentes = horasExcedentes;
		this.horasDevidas = horasDevidas;
	}

}
