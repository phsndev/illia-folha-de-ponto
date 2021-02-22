package br.com.ilia.digital.folhadeponto.dto;

import java.util.List;

public class RegistroDTO {
	public String dia;
	public List<String> horarios;
	public RegistroDTO(String dia, List<String> horarios) {
		super();
		this.dia = dia;
		this.horarios = horarios;
	}
	public String getDia() {
		return dia;
	}
	public List<String> getHorarios() {
		return horarios;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHorarios(List<String> horarios) {
		this.horarios = horarios;
	}
}
