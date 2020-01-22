package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="taller")
public class TallerModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2889887727764466143L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_taller")
	private int idTaller;
	
	@Column(name = "nombre_taller")
	private String nombreTaller;
	
	@Column(name = "descr_taller")
	private String descrTaller;
	
	@Column(name = "encargado_taller")
	private String encargadoTaller;
	
	@Column(name = "cant_alumno_taller")
	private int cantAlumnosTaller;
	
	@Column(name = "horario_taller")
	private String horarioTaller;
	
	//Material hacer relacion
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "taller_materialedu", 
	joinColumns = {@JoinColumn(name="idTaller")},
	inverseJoinColumns = {@JoinColumn(name="idMaterialEdu")})
	private List<MaterialEduModel> materiales;
	
	

	public TallerModel() {
		
	}

	public TallerModel(int idTaller, String nombreTaller, String descrTaller, String encargadoTaller,
			int cantAlumnosTaller, String horarioTaller, List<MaterialEduModel> materiales) {
		super();
		this.idTaller = idTaller;
		this.nombreTaller = nombreTaller;
		this.descrTaller = descrTaller;
		this.encargadoTaller = encargadoTaller;
		this.cantAlumnosTaller = cantAlumnosTaller;
		this.horarioTaller = horarioTaller;
		this.materiales = materiales;
	}

	public int getIdTaller() {
		return idTaller;
	}

	public void setIdTaller(int idTaller) {
		this.idTaller = idTaller;
	}

	public String getNombreTaller() {
		return nombreTaller;
	}

	public void setNombreTaller(String nombreTaller) {
		this.nombreTaller = nombreTaller;
	}

	public String getDescrTaller() {
		return descrTaller;
	}

	public void setDescrTaller(String descrTaller) {
		this.descrTaller = descrTaller;
	}

	public String getEncargadoTaller() {
		return encargadoTaller;
	}

	public void setEncargadoTaller(String encargadoTaller) {
		this.encargadoTaller = encargadoTaller;
	}

	public int getCantAlumnosTaller() {
		return cantAlumnosTaller;
	}

	public void setCantAlumnosTaller(int cantAlumnosTaller) {
		this.cantAlumnosTaller = cantAlumnosTaller;
	}

	public String getHorarioTaller() {
		return horarioTaller;
	}

	public void setHorarioTaller(String horarioTaller) {
		this.horarioTaller = horarioTaller;
	}

	public List<MaterialEduModel> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<MaterialEduModel> materiales) {
		this.materiales = materiales;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	
	
	

	

}
