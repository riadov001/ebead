package com.riad.ebead.metier;

import java.util.List;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Client;
import com.riad.ebead.entities.Commande;
import com.riad.ebead.entities.Panier;
import com.riad.ebead.entities.Produit;

public interface InternauteBoutiqueMetier {
	
	public List<Categorie> listeCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitParMotClef(String mc);
	public List<Produit> produitParCategorie(Long idCat);
	public List<Produit> produitSelectionnes();
	public Produit getProduit(Long idP);
	public Commande enregistrerCommande(Panier p,Client c);

}
