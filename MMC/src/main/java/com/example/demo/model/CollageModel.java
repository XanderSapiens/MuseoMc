package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collage")
public class CollageModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4219253513180673116L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_collage")
	private int idCollage;
	
	@Column(name = "nombre_collage")
	private String nombreCollage;
	
	@Column(name = "img_collage")
	private String imgCollage;
	
	@Column(name = "descr_collage")
	private String descrCollage;
	
	@Column(name = "ano_collage")
	private int anoCollage;

	public CollageModel() {
		
	}

	public CollageModel(int idCollage, String nombreCollage, String imgCollage, String descrCollage, int anoCollage) {
		this.idCollage = idCollage;
		this.nombreCollage = nombreCollage;
		this.imgCollage = imgCollage;
		this.descrCollage = descrCollage;
		this.anoCollage = anoCollage;
	}

	public int getIdCollage() {
		return idCollage;
	}

	public void setIdCollage(int idCollage) {
		this.idCollage = idCollage;
	}

	public String getNombreCollage() {
		return nombreCollage;
	}

	public void setNombreCollage(String nombreCollage) {
		this.nombreCollage = nombreCollage;
	}

	public String getImgCollage() {
		return imgCollage;
	}

	public void setImgCollage(String imgCollage) {
		this.imgCollage = imgCollage;
	}

	public String getDescrCollage() {
		return descrCollage;
	}

	public void setDescrCollage(String descrCollage) {
		this.descrCollage = descrCollage;
	}

	public int getAnoCollage() {
		return anoCollage;
	}

	public void setAnoCollage(int anoCollage) {
		this.anoCollage = anoCollage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
}
