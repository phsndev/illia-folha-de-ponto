package br.com.ilia.digital.folhadeponto.dto;

import java.util.List;

public class RelatorioDTO {
	public String mes;
	public String horasTrabalhadas;
	public String horasExcedentes;
	public String horasDevidas;
	public List<RegistroDTO> registros;
	public List<AlocacaoDTO> alocacoes;
	public RelatorioDTO(String mes, String horasTrabalhadas, String horasExcedentes, String horasDevidas,
			List<RegistroDTO> registros, List<AlocacaoDTO> alocacoes) {
		super();
		this.mes = mes;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasExcedentes = horasExcedentes;
		this.horasDevidas = horasDevidas;
		this.registros = registros;
		this.alocacoes = alocacoes;
	}
	public String getMes() {
		return mes;
	}
	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public String getHorasExcedentes() {
		return horasExcedentes;
	}
	public String getHorasDevidas() {
		return horasDevidas;
	}
	public List<RegistroDTO> getRegistros() {
		return registros;
	}
	public List<AlocacaoDTO> getAlocacoes() {
		return alocacoes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public void setHorasExcedentes(String horasExcedentes) {
		this.horasExcedentes = horasExcedentes;
	}
	public void setHorasDevidas(String horasDevidas) {
		this.horasDevidas = horasDevidas;
	}
	public void setRegistros(List<RegistroDTO> registros) {
		this.registros = registros;
	}
	public void setAlocacoes(List<AlocacaoDTO> alocacoes) {
		this.alocacoes = alocacoes;
	}
}
