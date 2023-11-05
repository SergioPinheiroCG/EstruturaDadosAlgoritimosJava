package com.loiane.estruturadados.vetor;

public class VetorObjetos {

	
	private Object[] elementos; // Criar Vetor ou Lista de Elementos
	private int tamanho;// Novo atributo para controlar o tamanho do vetor

	// criar um construtor
	
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	// Aula 02
	/*
	 * // Novo metodo 1-opção public void adiciona (Object elemento) { for ( int
	 * i=0; i<this.elementos.length; i++ ) { if (this.elementos [i]==null) {
	 * this.elementos[i]= elemento; break; } } }
	 * 
	 * // 2 opção fazendo pelo tamanho do vetor public void adiciona (Object
	 * elemento) throws Exception { if (tamanho < elementos.length) {
	 * elementos[tamanho] = elemento; tamanho++; } else { throw new
	 * Exception(" Vetor já esta cheio, não é possível adicionar mais"); } }
	 */

	// 3 opção fazendo pelo tamanho do vetor com bollean

	// Aula 04
	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	// 0 1 2 3 4 5 6 = tamanho
	// B C E F G + +
	// Aula 07
	public boolean adiciona(int posicao, Object elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}

		this.aumentaCapacidade();
		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// Aula 08
	// O metodo vai ser utilizado apenas internamente por isso vai ser privado
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;

		}
	}

	// Aula 04
	public int tamanho() {
		return this.tamanho;
	}

	// Aula 05 Loiane
	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return this.elementos[posicao];
	}

	// Aula 06

	public int busca(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				// equalsIgnoreCase - é para ignorar se a letra e maisucla ou miniscula
				return i;
			}
		}
		return -1;
	}

	// Aula09
	// B G D E F POSICAO A SER REMOVIDA É 1
	// 0 1 2 3 4 TAMANHO É 5
	//VETOR[1]=VETOR[2]
	//VETOR[2]=VETOR[3]
	//VETOR[3]=VETOR[4]
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];

		}
		this.tamanho--;
		
	}

	// Aula 04
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("|");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(elementos[i]);
			s.append(",");
		}

		if (this.tamanho > 0) {
			s.append(elementos[this.tamanho - 1]);
		}
		s.append("|");
		return s.toString();
	}

}
