package models;

import java.util.Scanner;

public class cola<T> {

	
	// ATRIBUTOS
	private T[] elementos;

	public cola() {

		this.elementos =(T[]) new Object[0];
	}

	// METODOS

	
	public void push(T element) {
		Scanner aux = new Scanner(System.in);

		T[] elementos = (T[]) new Object[this.elementos.length + 1];
		for(int i = 0; i< elementos.length; i++){
			
			elementos[i] =elementos[i];
			
		}
	
			elementos[elementos.length-1]= (T) element;
			this.elementos = elementos;
	}

	public void remove(T element) {
		Scanner aux = new Scanner(System.in);
		int cont = elementos.length;
		String x = aux.nextLine();
		for(int i = 0; i< elementos.length; i++){
			if(elementos[i] == x){
				
				elementos[] T = new elementos[cont--];
				
			}
		}
	}

	public T pop() {

		return;
	}

	public void clear() {

		elementos[] T = new elementos[0];

	}

	public boolean contains() {
		Scanner aux = new Scanner(System.in);
		String x = aux.nextLine();
		boolean contiene = false;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == x) {
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
		int cont = 0;
		for (int i = 0; i < elementos.length; i++) {
			cont++;
		}
		return cont;
	}
}
