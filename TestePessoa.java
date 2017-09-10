package pacote;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual o nome da pessoa 1?");
		novaPessoa.nome = teclado.next();
		System.out.println("Qual o genero da pessoa 1?");
		novaPessoa.genero = teclado.next();
		System.out.println("Qual o peso da pessoa 1?");
		novaPessoa.peso = teclado.nextDouble();
		System.out.println("Qual a altura da pessoa 1?");
		novaPessoa.altura = teclado.nextDouble();
		System.out.println("Qual a idade da pessoa 1?");
		novaPessoa.idade = teclado.nextInt();


		Pessoa novaPessoa2 = new Pessoa();

		System.out.println("Qual o nome da pessoa 2?");
		novaPessoa2.nome = teclado.next();
		System.out.println("Qual o genero da pessoa 2?");
		novaPessoa2.genero = teclado.next();;;
		System.out.println("Qual o peso da pessoa 2?");
		novaPessoa2.peso = teclado.nextDouble();
		System.out.println("Qual a altura da pessoa 2?");
		novaPessoa2.altura = teclado.nextDouble();
		System.out.println("Qual a idade da pessoa 2?");
		novaPessoa2.idade = teclado.nextInt();


		System.out.println("Nome 1: "+novaPessoa.nome);
		System.out.println("Genero 1: "+novaPessoa.genero);
		System.out.println("Peso 1: "+novaPessoa.peso+" Kgs");
		System.out.println("Altura 1: "+novaPessoa.altura);
		System.out.println("Idade 1: "+novaPessoa.idade+" Anos");

		System.out.println("\n");

		System.out.println("Nome 2: "+novaPessoa2.nome);
		System.out.println("Genero 2: "+novaPessoa2.genero);
		System.out.println("Peso 2: "+novaPessoa2.peso+" Kgs");
		System.out.println("Altura 2: "+novaPessoa2.altura);
		System.out.println("Idade 2: "+novaPessoa2.idade+" Anos");


	}

}
