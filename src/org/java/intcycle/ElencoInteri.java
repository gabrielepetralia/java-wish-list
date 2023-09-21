package org.java.intcycle;

public class ElencoInteri {
    private int[] array;
    private int currIndex;
    
    // Costruttori
    public ElencoInteri(int[] array) {
        setArray(array);
        setCurrIndex(-1);
    }
    
    public ElencoInteri() {
        setArray(new int[0]);
        setCurrIndex(-1);
    }
    
    // Getter e Setter
    public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getCurrIndex() {
		return currIndex;
	}

	public void setCurrIndex(int currIndex) {
		this.currIndex = currIndex;
	}
	
	//Altri metodi
	public int getElementoSuccessivo() {
        currIndex ++;
        return array[currIndex];
    }
	
	public boolean hasAncoraElementi() {
        return currIndex < array.length - 1;
    }
	
	public void addElemento(int elemento) {
        int[] newArray = new int[array.length + 1];
        
        for (int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }
        
        newArray[newArray.length - 1] = elemento;
        array = newArray;
    }
}
