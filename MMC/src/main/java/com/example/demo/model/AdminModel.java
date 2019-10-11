package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name= "admin")
public class AdminModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7215079416098121175L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_admin")
	private int idAdmin;
	
	@Column(name = "rut_admin")
	private String rutAdmin;
	
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name = "telefono_admin")
	private long telefonoAdmin;
	
	@Column(name = "fechaNac_admin")
	private Date fechaNac;
	
	@Column(name = "direccion_admin")
	private String direccionAdmin;
	
	
	@Email
	@Column(name = "email_admin")
	private String emailAdmin;
	
	public AdminModel() {
		
	}

	public AdminModel(int idAdmin, String rutAdmin, String apellidoMaterno, String apellidoPaterno, long telefonoAdmin,
			Date fechaNac, String direccionAdmin, String emailAdmin) {
		this.idAdmin = idAdmin;
		this.rutAdmin = rutAdmin;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.telefonoAdmin = telefonoAdmin;
		this.fechaNac = fechaNac;
		this.direccionAdmin = direccionAdmin;
		this.emailAdmin = emailAdmin;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getRutAdmin() {
		return rutAdmin;
	}

	public void setRutAdmin(String rutAdmin) {
		this.rutAdmin = rutAdmin;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public long getTelefonoAdmin() {
		return telefonoAdmin;
	}

	public void setTelefonoAdmin(long telefonoAdmin) {
		this.telefonoAdmin = telefonoAdmin;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccionAdmin() {
		return direccionAdmin;
	}

	public void setDireccionAdmin(String direccionAdmin) {
		this.direccionAdmin = direccionAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	
	
	
	
	

}
