package br.com.ufg.PalindromoTDD;

import br.com.ufg.PalindromoTDD.Palindromo;

import junit.framework.Assert;
import junit.framework.Test;

public class PalindromoTest {

    private static final String PALINDROMO_1 = "Roma me tem amor";
    private static final String PALINDROMO_2 = "Anotaram a data da maratona";
    private static final String PALINDROMO_3 = "Me ve se a panela da moca e de aco Madalena Paes, e vem";
    private static final String PALINDROMO_4 = "Socorram-me, subi no onibus em Marrocos";
    private static final String PALINDROMO_5 = "Ame o poema";
    private static final String PALINDROMO_6 = "A sacada da casa";

    private static final String PALINDROMO_7 = "123321";
    private static final String PALINDROMO_8 = "123456";
    
    private static final String PALINDROMO_9 = "eu sei eu sei";
    private static final String PALINDROMO_10= "a b cdaba";
	
    public void testaEhPalidromo() {
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_1));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_2));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_3));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_4));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_5));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_6));
        
    }
    public void testaEhPalindromoComNumero() {
    	Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_7));
    }
    
    public void testaNaoPalidromo() {
        Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_9));
        Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_10));
    }
    
    public void testaNaoPalindromoComNumero() {
    	Assert.assertFalse(Palindromo.ehPalindromo(PALINDROMO_8));
    }
}
