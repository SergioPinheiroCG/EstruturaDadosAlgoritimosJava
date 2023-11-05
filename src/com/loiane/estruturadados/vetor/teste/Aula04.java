package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;


public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona("Loaine Gromer");
		
		System.out.println("Tamanho do Vetor");
		System.out.println(vetor.tamanho());
		System.out.println();
		
		System.out.println("Elementos do Vetor");
		System.out.println(vetor);
		
		
	}

}
