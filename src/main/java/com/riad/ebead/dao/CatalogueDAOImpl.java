package com.riad.ebead.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Long ajouterCategorie(Categorie c) {
		em.persist(c);
		return c.getIdCategorie();
		
	}

	@Override
	public List<Categorie> listCategories() {
		Query req = em.createQuery("select c from Categorie c");
		return req.getResultList();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return em.find(Categorie.class,idCat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		em.merge(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		Categorie c = em.find(Categorie.class, idCat);
		em.remove(c);
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		Categorie c =getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		return p.getIdProduit();
	}

	@Override
	public List<Produit> listProduits() {
		Query req = em.createQuery("select p from produit p");
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
	
		Query req = em.createQuery("select p from produit p where p.desigantion like :x or p.description like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsParCategories(Long idCat) {
		Query req = em.createQuery("select p from produit p where p.categorie.idcategorie=:x");
		req.setParameter("x", idCat);
		return req.getResultList();
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		Query req = em.createQuery("select p from produit p where p.selecionne=true");
		return req.getResultList();
	}

	@Override
	public Produit getProduit(Long idP) {
	Produit p = em.find(Produit.class, idP);
	return p;
	}

	@Override
	public void modiferProduit(Produit p) {
		em.merge(p);
	}

	@Override
	public void supprimerProduit(Long idProduit) {
		Produit p = getProduit(idProduit);
		em.remove(p);
	}
}
