package com.riad.ebead.metier;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Role;
import com.riad.ebead.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitMetiter {

	public Long ajouterCategorie(Categorie c);
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser (User u);
	public void attribuerRole(Role e, Long userID);
}
