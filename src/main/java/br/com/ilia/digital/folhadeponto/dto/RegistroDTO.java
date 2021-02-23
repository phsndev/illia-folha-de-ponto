package br.com.ilia.digital.folhadeponto.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class RegistroDTO {
	public LocalDate dia;
	public List<LocalTime> horarios;
	public RegistroDTO(LocalDate dia, List<LocalTime> horarios) {
		super();
		this.dia = dia;
		this.horarios = horarios;
	}
	public LocalDate getDia() {
		return dia;
	}
	public List<LocalTime> getHorarios() {
		return horarios;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	public void setHorarios(List<LocalTime> horarios) {
		this.horarios = horarios;
	}
}
