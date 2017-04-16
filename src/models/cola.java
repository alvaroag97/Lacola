package models;

import java.util.Scanner;

public class cola<T> {

	
	// ATRIBUTOS
	private T[] elementos;

	//Constructor
	public cola() {

		this.elementos =(T[]) new Object[0];
	}

	// METODOS

	
	public void push(T elemento) {
		Scanner aux = new Scanner(System.in);

		T[] elementos = (T[]) new Object[this.elementos.length + 1];
		for(int i = 0; i< elementos.length; i++){
			
			elementos[i] =elementos[i];
			
		}
	
			elementos[elementos.length-1]= (T) elemento;
			this.elementos = elementos;
	}

	 public void remove(T elemento){
	  
		  for(int i=0;i<this.elementos.length;i++){
		   if(this.elementos[i]==elemento){
		    this.elementos[i]=null;
		    T[] elementos = (T[]) new Object[this.elementos.length - 1];
		   }
		  
		  }
	 }

	public T pop() { 

		T x= elementos[0];
		remove(x);
		return x;
		
	}

	public void clear() { //Esta bien

		this.elementos =(T[]) new Object[0];

	}

	public boolean contains(T elemento) {
		boolean contiene = false;
		for (int i = 0; i < this.elementos.length; i++) {
			if (elementos[i] == elemento) {
				contiene = true;
			}
		}
		return contiene;
	}

	public boolean isEmpty() { 
		boolean vacio = false;
		if (this.elementos.length == 0) {
			vacio = true;
		}
		return vacio;

	}

	public int size() { 
		
		return this.elementos.length;
	}
}
