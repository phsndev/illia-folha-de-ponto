package br.com.ilia.digital.folhadeponto.Service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ilia.digital.folhadeponto.repository.RegistroRepository;
import br.com.ilia.digital.folhadeponto.model.RegistroModel;
import br.com.ilia.digital.folhadeponto.dto.RegistroDTO;

import static java.time.temporal.ChronoUnit.HOURS;

import java.time.DayOfWeek;

@Service
public class RegistroService {
	
	@Autowired
	private RegistroRepository registroRepository;
	
	public RegistroModel registrar(RegistroDTO RegistroDTO) {
		RegistroModel registro = checkRegistro(RegistroDTO);
		return registro;
	}
	
	private RegistroModel checkRegistro(RegistroDTO RegistroDTO) {
		RegistroModel registro = new RegistroModel();
		for (int j = 0; j < 3; j++) {
			if(RegistroDTO.getHorarios().get(0) != null) {
				registro.setRegistro1(RegistroDTO.getHorarios().get(0));
			}
			else if(RegistroDTO.getHorarios().get(1) != null) {
				registro.setRegistro2(RegistroDTO.getHorarios().get(1));
			}
			else if(RegistroDTO.getHorarios().get(2) != null) {
				registro.setRegistro3(RegistroDTO.getHorarios().get(2));
				LocalTime l1 = RegistroDTO.getHorarios().get(1);
				LocalTime l2 = RegistroDTO.getHorarios().get(2);
				if (l1.until(l2, HOURS) < 1) {
					throw new RuntimeException("Deve haver no mínimo 1 hora de almoço");
				}
			}
			else if(RegistroDTO.getHorarios().get(3) != null) {
				registro.setRegistro4(RegistroDTO.getHorarios().get(3));
			}
			else
				throw new RuntimeException("Apenas 4 horários podem ser registrados por dia");
		}
		DayOfWeek FimSemana = RegistroDTO.getDia().getDayOfWeek();
		if ((FimSemana == DayOfWeek.SATURDAY) || (FimSemana == DayOfWeek.SUNDAY)) {
			throw new RuntimeException("Sábado e domingo não são permitidos como dia de trabalho");
		}
		else
		registro.setDia(RegistroDTO.getDia());
		return registro;
	}
	
	public void repositorySave(RegistroModel registro) {
		registroRepository.save(registro);
	}

}
