package org.java.intcycle;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Costruttore con parametro\n");
		
        int[] array = {1, 2, 3, 4, 5};
        ElencoInteri elenco1 = new ElencoInteri(array);

        while (elenco1.hasAncoraElementi()) {
            int elemento = elenco1.getElementoSuccessivo();
            System.out.println(elemento);
        }
        
        System.out.println("\n---------------------------\n");
        
        System.out.println("Costruttore senza parametro\n");
        
        ElencoInteri elenco2 = new ElencoInteri();

        for(int i=6; i<11; i++) {
        	elenco2.addElemento(i);
        }

        while (elenco2.hasAncoraElementi()) {
            int elemento = elenco2.getElementoSuccessivo();
            System.out.println(elemento);
        }
    }
}
