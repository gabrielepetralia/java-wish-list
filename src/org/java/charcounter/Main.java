package org.java.charcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Senza lambda function");
		System.out.println("-------------------------");
		
		System.out.print("Inserisci una parola: ");
		String word1 = sc.nextLine();
		
		Map<Character, Integer> charCounter1 = new HashMap<>();
		
		for (int i=0; i<word1.length(); i++) {
			
			char c = word1.toLowerCase().charAt(i);
			
			if (charCounter1.containsKey(c)) {
				charCounter1.put(c, charCounter1.get(c) + 1);
			} else {
				charCounter1.put(c, 1);
			}
		}
		
		for (Character c : charCounter1.keySet()) {
			
			Integer v = charCounter1.get(c);
			
			System.out.println(c + " : " + v);
		}
		
		System.out.println("\n=======================\n");
		
		System.out.println("Con lambda function");
		System.out.println("-------------------------");
		
		System.out.print("Inserisci un'altra parola: ");
		String word2 = sc.nextLine();
		
		sc.close();
		
		Map<Character, Integer> charCounter2 = new HashMap<>();
		
		word2.chars().forEach(c -> charCounter2.compute((char) c, (key, value) -> (value == null) ? 1 : value + 1));
		
		charCounter2.forEach((c, v) -> System.out.println(c + " : " + v));
	}
}
