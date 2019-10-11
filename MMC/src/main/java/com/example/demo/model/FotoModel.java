package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foto")
public class FotoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6888937644301410995L;

	/**
	 * 
	 */
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFoto;
	private String nombreFoto;
	private String descrFoto;
	private int anoFoto;
}
