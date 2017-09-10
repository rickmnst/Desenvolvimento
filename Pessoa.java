package pacote;

public class Pessoa {
	public String nome;
	public String genero;
	public double peso;
	public double altura;
	public int idade;
	void inf(){
		System.out.println("Nome:"+this.nome);
		System.out.println("Genero"+this.genero);
		System.out.println("Peso:"+this.peso);
		System.out.println("Altura:"+this.altura);
		System.out.println("Idade:"+this.idade);
	}

}
