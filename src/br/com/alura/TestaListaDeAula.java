package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
//		AULA 02
		Aula a1 = new Aula("Revisitando as ArraysLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);

		aulas.forEach(aula -> System.out.println(aula.getTitulo()));

		System.out.println("---------------");
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula.getTitulo()));

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println("---------------");
		aulas.forEach(aula -> System.out.println(aula.getTitulo() + ", tempo: " + aula.getTempo()));

		aulas.sort(Comparator.comparing(Aula::getTempo));
	}

}
