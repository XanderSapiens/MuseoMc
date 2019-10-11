package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obra")
public class ObraModel implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -442349191724878415L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idObra;
	private String nombreObra;
	private String tipoObra;
	private String descrObra;
	private int anoObra;

}
