package com.riad.ebead.entities;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommande;
	@NotEmpty
	private Date dateCommande;

	@OneToMany
	@JoinColumn(name="idCommande")
	private Collection<LigneCommande> ligneCommandes;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;

	public Commande(Long idCommande, Date dateCommande, Collection<LigneCommande> ligneCommandes, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.ligneCommandes = ligneCommandes;
		this.client = client;
	}
	
	
	public Commande() {

	}


	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
