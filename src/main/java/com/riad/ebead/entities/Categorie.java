package com.riad.ebead.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCategorie;
	@NotEmpty
	@Size(min=4,max=20)
	private String nomCategorie;
	private String description;
	private String nomPhoto;
	
	@Lob
	private byte[] photo;
	
	
	@OneToMany(mappedBy="categorie")
	private Collection<Produit> produits = new ArrayList<Produit>();

	

	public Categorie(String nomCategorie, String description, String nomPhoto, byte[] photo) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.photo = photo;
	}


	public Categorie(Long idCategorie, String nomCategorie, String description, String nomPhoto, byte[] photo,
			Collection<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.photo = photo;
		this.produits = produits;
	}


	public Categorie() {
		
	}


	public Long getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getNomCategorie() {
		return nomCategorie;
	}


	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNomPhoto() {
		return nomPhoto;
	}


	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}


	public Collection<Produit> getProduits() {
		return produits;
	}


	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}	
	
	
	
	
}
