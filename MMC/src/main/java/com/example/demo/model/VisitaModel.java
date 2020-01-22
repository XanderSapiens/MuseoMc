package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="visita")
public class VisitaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2367350865555408326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_visita")
	private int idVisita;
	
	@Column(name = "nombre_visita")
	private String nombreVisita;
	
	@Column(name = "descr_visita")
	private String descrVisita;
	
	@Column(name = "horario_visita")
	private String horarioVisita;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_visita")
	private Date fechaVisita;
	
	@Column(name = "estado_visita")
	private String estadoVisita;
	
	@Column(name = "cantpersonas_visita")
	private int cantPersonasVisita;

	public VisitaModel() {
		
	}

	public VisitaModel(int idVisita, String nombreVisita, String descrVisita, String horarioVisita, Date fechaVisita,
			String estadoVisita, int cantPersonasVisita) {
		super();
		this.idVisita = idVisita;
		this.nombreVisita = nombreVisita;
		this.descrVisita = descrVisita;
		this.horarioVisita = horarioVisita;
		this.fechaVisita = fechaVisita;
		this.estadoVisita = estadoVisita;
		this.cantPersonasVisita = cantPersonasVisita;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getNombreVisita() {
		return nombreVisita;
	}

	public void setNombreVisita(String nombreVisita) {
		this.nombreVisita = nombreVisita;
	}

	public String getDescrVisita() {
		return descrVisita;
	}

	public void setDescrVisita(String descrVisita) {
		this.descrVisita = descrVisita;
	}

	public String getHorarioVisita() {
		return horarioVisita;
	}

	public void setHorarioVisita(String horarioVisita) {
		this.horarioVisita = horarioVisita;
	}

	public Date getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(Date fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public String getEstadoVisita() {
		return estadoVisita;
	}

	public void setEstadoVisita(String estadoVisita) {
		this.estadoVisita = estadoVisita;
	}

	public int getCantPersonasVisita() {
		return cantPersonasVisita;
	}

	public void setCantPersonasVisita(int cantPersonasVisita) {
		this.cantPersonasVisita = cantPersonasVisita;
	}
	
	
	

}
