package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visita")
public class VisitaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2367350865555408326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVisita;
	private String nombreVisita;
	private String descrVisita;
	private String horarioVisita;
	private Date fechaVisita;
	private String estadoVisita;
	private int cantPersonasVisita;

}
