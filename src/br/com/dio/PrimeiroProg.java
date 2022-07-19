package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProg {

	public static void main(String[] args) {
	Gato gato = new Gato();
	Livros livros = new Livros();
	System.out.println(gato);
	System.out.println(livros);
		
		/*int a = 2;
		int b = 5;
		System.out.println("Hello N00b!!");
		System.out.println("A= "+a + " B= "+b);
		System.out.println("Somando... "+ a + " + " + b + " = " + (a+b));
		System.out.println("Bye N00b!!");*/
	}

}

class Livros{
	private String nome;
	private String npag;
}