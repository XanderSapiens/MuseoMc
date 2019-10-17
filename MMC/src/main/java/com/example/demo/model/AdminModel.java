package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

import org.springframework.format.annotation.DateTimeFormat;



/**
 * @author xande
 *
 */
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
	
	@Column(name = "nombre_admin")
	private String nombreAdmin;
	
	@Column(name = "rut_admin")
	private String rutAdmin;
	
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name = "telefono_admin")
	private long telefonoAdmin;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "nac_admin")
	private Date fechaNacAdmin;
	
	
	@Column(name = "direccion_admin")
	private String direccionAdmin;
	
	@Email
	@Column(name = "email_admin")
	private String emailAdmin;
	
	/**
	 * @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "admin_noticia", 
	joinColumns = {@JoinColumn(name="idAdmin")},
	inverseJoinColumns = {@JoinColumn(name="idNoticia")})
	private List<NoticiaModel> noticias;
	 */
	
	
	public AdminModel() {
		
	}

	public AdminModel(int idAdmin, String nombreAdmin, String rutAdmin, String apellidoMaterno, String apellidoPaterno,
			long telefonoAdmin, Date fechaNacAdmin, String direccionAdmin, @Email String emailAdmin) {
		this.idAdmin = idAdmin;
		this.nombreAdmin = nombreAdmin;
		this.rutAdmin = rutAdmin;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.telefonoAdmin = telefonoAdmin;
		this.fechaNacAdmin = fechaNacAdmin;
		this.direccionAdmin = direccionAdmin;
		this.emailAdmin = emailAdmin;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNombreAdmin() {
		return nombreAdmin;
	}

	public void setNombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
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

	public Date getFechaNacAdmin() {
		return fechaNacAdmin;
	}

	public void setFechaNacAdmin(Date fechaNacAdmin) {
		this.fechaNacAdmin = fechaNacAdmin;
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
	
	
	
	
	


