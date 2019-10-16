package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materialedu")
public class MaterialEduModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8613575642056327710L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_materialEdu")
	private int idMaterialEdu;
	
	@Column(name = "nombre_materialEdu")
	private String nombreMaterialEdu;
	
	@Column(name = "descr_materialEdu")
	private String descrMaterialEdu;
	
	@Column(name = "nivel_materialEdu")
	private String nivelMaterialEdu;
	
	@Column(name = "tipo_materialEdu")
	private String tipoMaterialEdu;


	public MaterialEduModel() {
		
	}


	public MaterialEduModel(int idMaterialEdu, String nombreMaterialEdu, String descrMaterialEdu,
			String nivelMaterialEdu, String tipoMaterialEdu) {
		super();
		this.idMaterialEdu = idMaterialEdu;
		this.nombreMaterialEdu = nombreMaterialEdu;
		this.descrMaterialEdu = descrMaterialEdu;
		this.nivelMaterialEdu = nivelMaterialEdu;
		this.tipoMaterialEdu = tipoMaterialEdu;
	}


	public int getIdMaterialEdu() {
		return idMaterialEdu;
	}


	public void setIdMaterialEdu(int idMaterialEdu) {
		this.idMaterialEdu = idMaterialEdu;
	}


	public String getNombreMaterialEdu() {
		return nombreMaterialEdu;
	}


	public void setNombreMaterialEdu(String nombreMaterialEdu) {
		this.nombreMaterialEdu = nombreMaterialEdu;
	}


	public String getDescrMaterialEdu() {
		return descrMaterialEdu;
	}


	public void setDescrMaterialEdu(String descrMaterialEdu) {
		this.descrMaterialEdu = descrMaterialEdu;
	}


	public String getNivelMaterialEdu() {
		return nivelMaterialEdu;
	}


	public void setNivelMaterialEdu(String nivelMaterialEdu) {
		this.nivelMaterialEdu = nivelMaterialEdu;
	}


	public String getTipoMaterialEdu() {
		return tipoMaterialEdu;
	}


	public void setTipoMaterialEdu(String tipoMaterialEdu) {
		this.tipoMaterialEdu = tipoMaterialEdu;
	}
	
	
	
	

}
