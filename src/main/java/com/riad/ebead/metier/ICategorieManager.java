package com.riad.ebead.metier;

import com.riad.ebead.entities.Categorie;


public interface ICategorieManager extends IUserCatalogue {

	public Long ajouterCategorie(Categorie c);
	public void supprimerCategorie (Long idCat);
	public void modifierCategorie(Categorie c);
}
