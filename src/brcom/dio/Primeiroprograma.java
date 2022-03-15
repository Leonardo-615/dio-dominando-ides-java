package brcom.dio;

import brcom.dio.model.Exemplo;

public class Primeiroprograma {
	public static void main(String[] args) {
		
		Exemplo exemplo = new Exemplo();
		Livros livros = new Livros();
		
		System.out.println(exemplo);
		System.out.println(livros);
		
		/*System.out.println("Hello World");*/
	}

}

class Livros {
	private String nome;
	private String npag;
}
