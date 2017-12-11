package sn.objis.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {

	CalculMetier calcul;
	protected void setUp() throws Exception {
	
	
	calcul=new CalculMetier();
	super.setUp();
	
	}
	public void testSomme() {
	assertTrue(calcul.somme(4, 5)==9);
	}
	public void testProduit() {
	assertTrue(calcul.produit(4, 5)==20);
	}
	
}
