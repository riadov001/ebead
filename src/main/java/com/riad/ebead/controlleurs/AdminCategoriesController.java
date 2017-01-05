package com.riad.ebead.controlleurs;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.metier.IAdminCategoriesMetier;
import org.apache.commons.io.IOUtils;

@Controller
@RequestMapping("/adminCat")
@SessionAttributes("editedCat")
public class AdminCategoriesController {

	@Autowired
	private IAdminCategoriesMetier metier;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET) 
	public String displayCategories(Model model) { 
	    model.addAttribute("categorie", new Categorie()); 
	    model.addAttribute("categories",metier.listeCategories());
	    return "categories"; 
	}
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("categorie",new Categorie());
		model.addAttribute("categories",metier.listeCategories());
		return "categories";
	}
	
	@RequestMapping("/saveCat")
	public String saveCat(@Valid Categorie c, BindingResult bindingResult, Model model,MultipartFile file) throws Exception{
		if(bindingResult.hasErrors()){
		
			model.addAttribute("categorie",metier.listeCategories());
		return "categories";
		
	}
	if(!file.isEmpty()){c.setPhoto(file.getBytes());}
	else{
		if(c.getIdCategorie()!=null){
			Categorie cat = (Categorie) model.asMap().get("editedCat");
			c.setPhoto(cat.getPhoto());
	}}
		if(c.getIdCategorie()==null) metier.ajouterCategorie(c);
		else metier.modifierCategorie(c);
		model.addAttribute("categorie",new Categorie());
		model.addAttribute("categorie",metier.listeCategories());
		return "categories";
	}
	
	@RequestMapping(value="/photoCat",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] getPhoto(Long idCat) throws IOException{
		Categorie c = metier.getCategorie(idCat);
		if(c.getPhoto()==null) return new byte[0];
		else return IOUtils.toByteArray(new ByteArrayInputStream(c.getPhoto()));
	}

	
	@RequestMapping(value="/suppCat")
	public String suppCat(Long idCat, Model model){
		metier.supprimerCategorie(idCat);
		model.addAttribute("categorie",new Categorie());
		model.addAttribute("categories",metier.listeCategories());
		return "categories";
	}

	@RequestMapping(value="/editCat")
	public String editCat(Long idCat,Model model){
		Categorie c=metier.getCategorie(idCat);
		model.addAttribute("editedCat",c);
		model.addAttribute("categories", c);
		model.addAttribute("categories", metier.listeCategories());
		return "categories";
	}

}
	
