package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "cantAlumnos_taller")
	private int cantAlumnosTaller;
	
	@Column(name = "horario_taller")
	private String horarioTaller;
	
	

	//Material hacer relacion

}
