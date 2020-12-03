package com.midasconsultores.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "noticias")
public class Noticia implements Serializable {

	@Id
	@Column(length = 30)
	private String id;

	@Column( length = 40, nullable = false )
	@NotEmpty
	private String categoria;

	@Column( length = 200, nullable = false )
	@NotEmpty
	private String titulo;

	@Column( length = 200, name = "url_noticia", nullable = false )
	private String urlNoticia;

	private String Urlimagen;
	
	@Column(name = "fecha_publicacion", nullable = false, columnDefinition ="TIMESTAMP" )
	private LocalDateTime fechaPublicacion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fuente_id", nullable = false)
	Fuente fuente;

	
	@Column(name = "fecha_creacion", nullable = false, columnDefinition ="TIMESTAMP")
	private LocalDateTime fechaCreacion;

	public Noticia() {
		this.id = "";
		this.fechaCreacion = LocalDateTime.now();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrlNoticia() {
		return urlNoticia;
	}

	public void setUrlNoticia(String urlNoticia) {
		this.urlNoticia = urlNoticia;
	}
	
	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Fuente getFuente() {
		return fuente;
	}

	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}

	public String getUrlimagen() {
		return Urlimagen;
	}

	public void setUrlimagen(String urlimagen) {
		Urlimagen = urlimagen;
	}

	

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", categoria=" + categoria + ", titulo=" + titulo + ", urlNoticia=" + urlNoticia
				+ ", Urlimagen=" + Urlimagen + ", fechaPublicacion=" + fechaPublicacion + ", fuente=" + fuente
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}

	private static final long serialVersionUID = 1L;

}
