package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {

		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona("Loaine Gromer");
		
		System.out.println(vetor.busca(2));
	}

}
