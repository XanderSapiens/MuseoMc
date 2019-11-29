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
@Table(name="convocatoria")
public class ConvocatoriaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8894949121275718910L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_convocatoria")
	private int idConvocatoria;
	
	@Column(name = "nombre_convocatoria")
	private String nombreConvocatoria;
	
	@Column(name = "descr_convocatoria")
	private String descrConvocatoria;
	
	@Column(name = "horario_convocatoria")
	private String horarioConvocatoria;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_convocatoria")
	private Date fechaConvocatoria;
	
	@Column(name = "estado_convocatoria")
	private String estadoConvocatoria;
	
	
	@Column(name = "cantpersonas_convocatoria")
	private int cantPersonasConvocatoria;


	public ConvocatoriaModel() {
		
	}


	public ConvocatoriaModel(int idConvocatoria, String nombreConvocatoria, String descrConvocatoria,
			String horarioConvocatoria, Date fechaConvocatoria, String estadoConvocatoria,
			int cantPersonasConvocatoria) {
		
		this.idConvocatoria = idConvocatoria;
		this.nombreConvocatoria = nombreConvocatoria;
		this.descrConvocatoria = descrConvocatoria;
		this.horarioConvocatoria = horarioConvocatoria;
		this.fechaConvocatoria = fechaConvocatoria;
		this.estadoConvocatoria = estadoConvocatoria;
		this.cantPersonasConvocatoria = cantPersonasConvocatoria;
	}


	public int getIdConvocatoria() {
		return idConvocatoria;
	}


	public void setIdConvocatoria(int idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}


	public String getNombreConvocatoria() {
		return nombreConvocatoria;
	}


	public void setNombreConvocatoria(String nombreConvocatoria) {
		this.nombreConvocatoria = nombreConvocatoria;
	}


	public String getDescrConvocatoria() {
		return descrConvocatoria;
	}


	public void setDescrConvocatoria(String descrConvocatoria) {
		this.descrConvocatoria = descrConvocatoria;
	}


	public String getHorarioConvocatoria() {
		return horarioConvocatoria;
	}


	public void setHorarioConvocatoria(String horarioConvocatoria) {
		this.horarioConvocatoria = horarioConvocatoria;
	}


	public Date getFechaConvocatoria() {
		return fechaConvocatoria;
	}


	public void setFechaConvocatoria(Date fechaConvocatoria) {
		this.fechaConvocatoria = fechaConvocatoria;
	}


	public String getEstadoConvocatoria() {
		return estadoConvocatoria;
	}


	public void setEstadoConvocatoria(String estadoConvocatoria) {
		this.estadoConvocatoria = estadoConvocatoria;
	}


	public int getCantPersonasConvocatoria() {
		return cantPersonasConvocatoria;
	}


	public void setCantPersonasConvocatoria(int cantPersonasConvocatoria) {
		this.cantPersonasConvocatoria = cantPersonasConvocatoria;
	}
	
	
	
	
	

}
