package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona("Loaine Gromer");
		
		System.out.println(vetor.busca("Curso"));
		System.out.println(vetor.busca("Curso2"));
		System.out.println(vetor.busca("curso"));
	}

}
