package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
	 VetorObjetos vetor=new VetorObjetos(3);
	
	 //vetor.adiciona(3);
	 //vetor.adiciona(4);
	 //vetor.adiciona(5);
	 
	 Contato c1 = new Contato("Contato 1","1234-4567","contato@email.com.br");
	 Contato c2 = new Contato("Contato 2","2345-6789","contato2@email.com.br");
	 Contato c3 = new Contato("Contato 3","6789-1234","contato3@email.com.br");
	 Contato c4 = new Contato("Contato 1","1234-4567","contato@email.com.br");
	 
	 vetor.adiciona(c1);
	 vetor.adiciona(c2);
	 vetor.adiciona(c3);
	 
	 System.out.println("Tamanho = "+ vetor.tamanho());
	 
	 int pos = vetor.busca(c4);
	 if (pos > -1) {
		 System.out.println("Elemento exitse no vetor");
		 
	 } else {
		 System.out.println("Elemento nao existe no vetor");
	 }
	 
	 System.out.println(vetor);
	 
	 
	}

}
