package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="convocatoria")
public class ConvocatoriaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8894949121275718910L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idConvocatoria;
	private String nombreConvocatoria;
	private String descrConvocatoria;
	private String horarioConvocatoria;
	private Date fechaConvocatoria;
	private String estadoConvocatoria;
	private int cantPersonasConvocatoria;

}
