package com.example.demo.Entidades;
/*Imports*/


import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.List;


/*Declaramos la clase como entidad para crear la base de datos*/
@Entity
public class Eventos {

	/*Generamos el Id de cada evento*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private long id;
	private String nameEvent ;
	private String date;
	private String photo;
	private String wiki;
	
	/*bidireccionalidad*/
	@ManyToMany
	private List<Categorias>categorie;



	
	/*Constructor*/

	public Eventos(String nameEvent, String date, String photo, String wiki) {
		this.nameEvent = nameEvent;
		this.date = date;
		this.photo = photo;
		this.wiki = wiki;
		//this.categorie = categorie;
	}

	/*Getters and setters*/
	public long getIdEventos() {
		return id;
	}

	public void setIdEventos(long idEventos) {
		this.id = idEventos;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getWiki() {
		return wiki;
	}

	public void setWiki(String wiki) {
		this.wiki = wiki;
	}

	public List<Categorias> getCategorie() {
		return categorie;
	}

	public void setCategorie(List<Categorias> categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Eventos [idEventos=" + id + ", nameEvent=" + nameEvent + ", date=" + date + ", photo=" + photo
				+ ", wiki=" + wiki + "]";
	}
	
	
}