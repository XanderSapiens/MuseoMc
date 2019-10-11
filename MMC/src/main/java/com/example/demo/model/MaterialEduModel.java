package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materialEdu")
public class MaterialEduModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8613575642056327710L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMaterialEdu;
	private String nombreMaterialEdu;
	private String descrMaterialEdu;
	private String nivelMaterialEdu;
	private String tipoMaterialEdu;

}
