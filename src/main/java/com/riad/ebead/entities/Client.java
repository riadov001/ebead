package com.riad.ebead.entities;



import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClient;
	
	@NotEmpty
	@Size(min=4,max=14)
	private String nomClient;
	private String adresse;
	private String email;
	private String tel;
	
	@OneToMany(mappedBy="client")

	private Collection<Commande> commandes;
}
