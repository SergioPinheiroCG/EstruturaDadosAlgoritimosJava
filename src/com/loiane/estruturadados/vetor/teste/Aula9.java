package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		
		
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		//para remover pela posição
		vetor.remove(1);
		System.out.println(vetor);
		
		// agora para remover pelo elemento
		System.out.println("Remover o elemento A");
		int pos=vetor.busca("A");
		if (pos>-1) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe");
		}
		
		System.out.println(vetor);
		
		
		
		
	}

}
