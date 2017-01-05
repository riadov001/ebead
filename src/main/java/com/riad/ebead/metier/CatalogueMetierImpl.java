package com.riad.ebead.metier;

import java.util.List;

import com.riad.ebead.dao.ICatalogueDAO;
import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Produit;

public class CatalogueMetierImpl implements IProduitManager, ICategorieManager {

	private ICatalogueDAO dao;
	
	public void setDao(ICatalogueDAO dao){
		this.dao=dao;
	}
	@Override
	public List<Categorie> listeCategories() {
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
	return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listproduits() {
		return dao.listProduits();
	}

	@Override
	public List<Produit> produitParMotClef(String mc) {
		return dao.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> produitParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.produitsParCategories(idCat);
	}

	@Override
	public List<Produit> produitSelectionnes() {
		// TODO Auto-generated method stub
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return dao.getProduit(idP);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		// TODO Auto-generated method stub
		dao.supprimerCategorie(idCat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		dao.modifierCategorie(c);
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		dao.supprimerProduit(idP);
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.modiferProduit(p);
	}

}
