package br.com.ilia.digital.folhadeponto.repository;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registro")

public class RegistroModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 5)
    private LocalDate dia;

    @Column(length = 10)
    private LocalTime registro1;

    @Column(length = 10)
    private LocalTime registro2;

    @Column(length = 10)
    private LocalTime registro3;

    @Column(length = 10)
    private LocalTime registro4;
    
    @MapsId
    @JoinColumn(name = "id_momento")
    @OneToOne(cascade = CascadeType.ALL)
    private MomentoModel momentoModel;

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

	public LocalTime getRegistro1() {
		return registro1;
	}

	public void setRegistro1(LocalTime registro1) {
		this.registro1 = registro1;
	}

	public LocalTime getRegistro2() {
		return registro2;
	}

	public void setRegistro2(LocalTime registro2) {
		this.registro2 = registro2;
	}

	public LocalTime getRegistro3() {
		return registro3;
	}

	public void setRegistro3(LocalTime registro3) {
		this.registro3 = registro3;
	}

	public LocalTime getRegistro4() {
		return registro4;
	}

	public void setRegistro4(LocalTime registro4) {
		this.registro4 = registro4;
	}

	public MomentoModel getMomentoModel() {
		return momentoModel;
	}

	public void setMomentoModel(MomentoModel momentoModel) {
		this.momentoModel = momentoModel;
	}
	
	protected RegistroModel() {
		
	}

	public RegistroModel(Long id, LocalDate dia, LocalTime registro1, LocalTime registro2, LocalTime registro3,
			LocalTime registro4, MomentoModel momentoModel) {
		super();
		this.id = id;
		this.dia = dia;
		this.registro1 = registro1;
		this.registro2 = registro2;
		this.registro3 = registro3;
		this.registro4 = registro4;
		this.momentoModel = momentoModel;
	}
    
    

}
