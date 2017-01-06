package com.riad.ebead;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.riad.ebead.entities.Categorie;
import com.riad.ebead.metier.IAdminCategoriesMetier;;
public class TestDAO {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	try {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		assertTrue(true);
	} catch (Exception e) {
		assertTrue(e.getMessage(), false);
	}
	}

}
