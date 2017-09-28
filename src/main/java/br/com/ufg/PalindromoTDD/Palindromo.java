package br.com.ufg.PalindromoTDD;

import java.util.Scanner;

/**
 * Um palíndromo é uma palavra ou uma frase que é igual quando se lê da esquerda para a direita
 * quanto da direita para a esquerda.
 */

public class Palindromo {
	
    public static void main( String[] args )
    {
    	System.out.println("Digite:");
    	Scanner sc = new Scanner(System.in);
    	String Entrada = sc.nextLine();
    	
    	if (ehPalindromo(Entrada) == true) {
    		System.out.println("A entrada é um Palíndromo");
    	}
    	else {
    		System.out.println("A entrada não é um Palíndromo");
    	}
    }

    public static boolean ehPalindromo(String frase) {
        String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "").replace(",", "");
        for (int i = 0; i < fraseFiltrada.length() - 1; i++) {
            if (fraseFiltrada.charAt(i) != fraseFiltrada.charAt(fraseFiltrada.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}