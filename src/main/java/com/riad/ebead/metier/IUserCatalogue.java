package com.riad.ebead.metier;

import java.util.List;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Produit;

public interface IUserCatalogue {
	public List<Categorie> listeCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitParMotClef(String mc);
	public List<Produit> produitParCategorie(Long idCat);
	public List<Produit> produitSelectionnes();
	public Produit getProduit(Long idP);

}
