package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
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
	@Column(name = "id_obra")
	private int idObra;
	
	@Column(name = "nombre_obra")
	private String nombreObra;
	
	@Column(name = "tipo_obra")
	private String tipoObra;
	
	@Column(name = "descr_obra")
	private String descrObra;
	
	@Column(name = "ano_obra")
	private int anoObra;

	public ObraModel() {
		
	}

	public ObraModel(int idObra, String nombreObra, String tipoObra, String descrObra, int anoObra) {
		super();
		this.idObra = idObra;
		this.nombreObra = nombreObra;
		this.tipoObra = tipoObra;
		this.descrObra = descrObra;
		this.anoObra = anoObra;
	}

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public String getNombreObra() {
		return nombreObra;
	}

	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}

	public String getTipoObra() {
		return tipoObra;
	}

	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public String getDescrObra() {
		return descrObra;
	}

	public void setDescrObra(String descrObra) {
		this.descrObra = descrObra;
	}

	public int getAnoObra() {
		return anoObra;
	}

	public void setAnoObra(int anoObra) {
		this.anoObra = anoObra;
	}

	
	
	
}
