package com.riad.ebead.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.riad.ebead.dao.IBoutiqueDAO;
import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Client;
import com.riad.ebead.entities.Commande;
import com.riad.ebead.entities.Panier;
import com.riad.ebead.entities.Produit;
import com.riad.ebead.entities.Role;
import com.riad.ebead.entities.User;

@Transactional
public class BoutiqueMetierImpl implements IAdminCategoriesMetier {

	private IBoutiqueDAO dao;
	public void setDao(IBoutiqueDAO dao) {
		this.dao = dao;
	}
	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduit(Long idP) {
		dao.supprimerProduit(idP);
	}

	@Override
	public void modifierProduit(Produit p) {
		dao.modiferProduit(p);
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
		return dao.produitsParCategories(idCat);
	}

	@Override
	public List<Produit> produitSelectionnes() {
		return dao.produitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		return dao.enregistrerCommande(p, c);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
	dao.supprimerCategorie(idCat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
	dao.modifierCategorie(c);
	}

	@Override
	public void ajouterUser(User u) {
	dao.ajouterUser(u);

	}

	@Override
	public void attribuerRole(Role e, Long userID) {
	dao.attribuerRole(e, userID);
	}

}
