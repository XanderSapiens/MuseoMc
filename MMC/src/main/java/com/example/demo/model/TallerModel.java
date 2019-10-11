package com.example.demo.model;

import java.io.Serializable;

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
	private int idTaller;
	private String nombreTaller;
	private String descrTaller;
	private String encargadoTaller;
	private int cantAlumnosTaller;
	private String horarioTaller;
	
	//Material hacer relacion

}
