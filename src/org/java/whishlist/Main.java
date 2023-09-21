package org.java.whishlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Gift> gifts = new ArrayList<>();
		
		while(true) {
			System.out.print("Inserisci un regalo: ");
			String name = sc.nextLine();
			
			System.out.print("Inserisci il destinatario di \"" + name +"\": ");
			String recipient = sc.nextLine();
			
			Gift g = new Gift(name, recipient);
			
			gifts.add(g);
			
			System.out.println("\nHai " + gifts.size() + " regali nella lista");
			System.out.println("Vuoi aggiungere un'altro regalo? [y]si / [n]no");
			String exit = sc.nextLine();
			if(!exit.equals("y")) {
				System.out.println("\nBuon Natale!!!");
				break;
			}
		}
		
		System.out.println("\nLista regali:");
		System.out.println(gifts);
	}
}
