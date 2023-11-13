package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int maxCodice = Integer.MAX_VALUE;
		
		Prodotto p1 = new Prodotto(rnd.nextInt(0, maxCodice), "Sapone", "Sapone mani", 19.99, 22);
		
		System.out.println(p1);
		
		Prodotto p2 = new Prodotto(rnd.nextInt(0, maxCodice), "Rasoio", "Rasoio da barba elettrico", 33.50, 22);
		
		System.out.println(p2);

	}

}
