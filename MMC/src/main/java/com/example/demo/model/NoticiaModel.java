package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;




@Entity
@Table(name="noticia")
public class NoticiaModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7468446408164527277L;
	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_noticia")
	private int idNoticia;
	
	
	@Lob
	@Column(name = "titulo_noticia")
	private String tituloNoticia;
	
	
	
	@Lob
	@Column(name = "subtitulo_noticia")
	private String subtituloNoticia;
	
	
	
	@Lob
	@Column(name = "contenido_noticia")
	private String contenidoNoticia;
	
	public NoticiaModel() {
	}

	public NoticiaModel(int idNoticia, String tituloNoticia, String subtituloNoticia, String contenidoNoticia) {
		this.idNoticia = idNoticia;
		this.tituloNoticia = tituloNoticia;
		this.subtituloNoticia = subtituloNoticia;
		this.contenidoNoticia = contenidoNoticia;
	}

	public int getIdNoticia() {
		return idNoticia;
	}
	
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public String getSubtituloNoticia() {
		return subtituloNoticia;
	}

	public void setSubtituloNoticia(String subtituloNoticia) {
		this.subtituloNoticia = subtituloNoticia;
	}

	public String getContenidoNoticia() {
		return contenidoNoticia;
	}

	public void setContenidoNoticia(String contenidoNoticia) {
		this.contenidoNoticia = contenidoNoticia;
	}

	
	
	
	
	
	
	


}
