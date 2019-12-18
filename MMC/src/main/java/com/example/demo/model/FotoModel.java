package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
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
	@Column(name = "id_foto")
	private int idFoto;
	
	@Column(name = "nombre_foto")
	private String nombreFoto;
	
	@Column(name = "img_foto")
	private String imgFoto;
	
	@Column(name = "descr_foto")
	private String descrFoto;
	
	@Column(name = "ano_foto")
	private int anoFoto;
	
	
	
	public FotoModel() {
	}



	public FotoModel(int idFoto, String nombreFoto, String imgFoto, String descrFoto, int anoFoto) {
		super();
		this.idFoto = idFoto;
		this.nombreFoto = nombreFoto;
		this.imgFoto = imgFoto;
		this.descrFoto = descrFoto;
		this.anoFoto = anoFoto;
	}



	public int getIdFoto() {
		return idFoto;
	}



	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}



	public String getNombreFoto() {
		return nombreFoto;
	}



	public void setNombreFoto(String nombreFoto) {
		this.nombreFoto = nombreFoto;
	}



	public String getImgFoto() {
		return imgFoto;
	}



	public void setImgFoto(String imgFoto) {
		this.imgFoto = imgFoto;
	}



	public String getDescrFoto() {
		return descrFoto;
	}



	public void setDescrFoto(String descrFoto) {
		this.descrFoto = descrFoto;
	}



	public int getAnoFoto() {
		return anoFoto;
	}



	public void setAnoFoto(int anoFoto) {
		this.anoFoto = anoFoto;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
	
	


	