package com.riad.ebead.dao;

import java.util.List;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Produit;

public interface ICatalogueDAO {

	public Long ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	public void supprimerCategorie(Long idCat);
	 
	public Long ajouterProduit(Produit p , Long idCat );
	public List<Produit> listProduits();
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategories(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
	public void modiferProduit(Produit p);
	public void supprimerProduit(Long idProduit);
}
