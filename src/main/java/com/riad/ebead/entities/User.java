package com.riad.ebead.entities;



import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	
	@NotEmpty
	@Size(min=4,max=14)
	private String userName;
	private String password;
	private boolean activated;

	@OneToMany
	@JoinColumn(name="idRole")
	private Set<Role> roles;
}
