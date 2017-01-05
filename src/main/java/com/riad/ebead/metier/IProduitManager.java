package com.riad.ebead.metier;

import com.riad.ebead.entities.Produit;

public interface IProduitManager  extends IUserCatalogue{

	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit (Long idP);
	public void modifierProduit(Produit p);
}
