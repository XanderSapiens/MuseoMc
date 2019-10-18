package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "contacto")
public class ContactoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2196534882664280548L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_contacto")
	private int idContacto;
	
	@Column(name = "nombre_contacto")
	private String nombreContacto;
	
	@Email
	@Column(name = "email_contacto")
	private String emailContacto;
	
	@Column(name = "asunto_contacto")
	private String asuntoContacto;
	
	@Column(name = "mensaje_contacto")
	private String mensajeContacto;

	public ContactoModel() {
		
	}

	public ContactoModel(int idContacto, String nombreContacto, String emailContacto, String asuntoContacto,
			String mensajeContacto) {
		this.idContacto = idContacto;
		this.nombreContacto = nombreContacto;
		this.emailContacto = emailContacto;
		this.asuntoContacto = asuntoContacto;
		this.mensajeContacto = mensajeContacto;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public String getAsuntoContacto() {
		return asuntoContacto;
	}

	public void setAsuntoContacto(String asuntoContacto) {
		this.asuntoContacto = asuntoContacto;
	}

	public String getMensajeContacto() {
		return mensajeContacto;
	}

	public void setMensajeContacto(String mensajeContacto) {
		this.mensajeContacto = mensajeContacto;
	}
	
	

}
