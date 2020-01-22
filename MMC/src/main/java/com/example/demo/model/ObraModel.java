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
	
	@Column(name = "material_obra")
	private String materialObra;
	
	@Column(name = "descr_obra")
	private String descrObra;
	
	@Column(name = "img_obra")
	private String imgObra;
	
	
	@Column(name = "medidas_obra")
	private String medidasObra;
	
	@Column(name = "ano_obra")
	private int anoObra;

	public ObraModel() {
		
	}

	

	



	public ObraModel(int idObra, String nombreObra, String materialObra, String descrObra, String imgObra,
			 String medidasObra, int anoObra) {
		super();
		this.idObra = idObra;
		this.nombreObra = nombreObra;
		this.materialObra = materialObra;
		this.descrObra = descrObra;
		this.imgObra = imgObra;
		
		this.medidasObra = medidasObra;
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







	public String getMaterialObra() {
		return materialObra;
	}







	public void setMaterialObra(String materialObra) {
		this.materialObra = materialObra;
	}







	public String getDescrObra() {
		return descrObra;
	}







	public void setDescrObra(String descrObra) {
		this.descrObra = descrObra;
	}







	public String getImgObra() {
		return imgObra;
	}







	public void setImgObra(String imgObra) {
		this.imgObra = imgObra;
	}







	







	public String getMedidasObra() {
		return medidasObra;
	}







	public void setMedidasObra(String medidasObra) {
		this.medidasObra = medidasObra;
	}







	public int getAnoObra() {
		return anoObra;
	}







	public void setAnoObra(int anoObra) {
		this.anoObra = anoObra;
	}







	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	





	

	

	
	
	
}
