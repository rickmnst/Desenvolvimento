import java.util.Scanner;

public class ExecutaCalculo {

	public static void main(String[] args) {
		calcular soma;
		soma = new calcular();
		Scanner teclado = new Scanner(System.in);
		int opcao=0;


		System.out.println("Digite um valor:");
		soma.a = teclado.nextDouble();
		System.out.println("Digite outro valor;");
		soma.b = teclado.nextDouble();

		System.out.println("O que você deseja fazer?");
		System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
				+"\n"+"(4)- Subtrair"+"\n"+"(0) - Sair");
		opcao = teclado.nextInt();
		do{	switch (opcao){
		case 1:
			System.out.println("Divisão ficou:");
			System.out.println(
					soma.dividir(soma.a, soma.b)
					);
			System.out.println("O que você deseja fazer?");
			System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
					+"\n"+"(4)- Subtrair"+"\n"+"(5) - Escolher outro valor"+"\n"+"(0) - Sair");
			opcao = teclado.nextInt();
			break;
		case 2:
			System.out.println("Soma ficou:");
			System.out.println(
					soma.somar(soma.a, soma.b)
					);
			System.out.println("O que você deseja fazer?");
			System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
					+"\n"+"(4)- Subtrair"+"\n"+"(5) - Escolher outro valor"+"\n"+"(0) - Sair");
			opcao = teclado.nextInt();
			break;
		case 3:
			System.out.println("Multiplicação ficou:");
			System.out.println(
					soma.multiplicar(soma.a, soma.b)
					);
			System.out.println("O que você deseja fazer?");
			System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
					+"\n"+"(4)- Subtrair"+"\n"+"(5) - Escolher outro valor"+"\n"+"(0) - Sair");
			opcao = teclado.nextInt();
			break;
		case 4:
			System.out.println("Subtração ficou:");
			System.out.println(
					soma.subtrair(soma.a, soma.b)
					);
			System.out.println("O que você deseja fazer?");
			System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
					+"\n"+"(4)- Subtrair"+"\n"+"(5) - Escolher outro valor"+"\n"+"(0) - Sair");
			opcao = teclado.nextInt();
			break;
		case 5:
			System.out.println("Digite um valor:");
			soma.a = teclado.nextDouble();
			System.out.println("Digite outro valor;");
			soma.b = teclado.nextDouble();

			System.out.println("O que você deseja fazer?");
			System.out.print("(1)- Dividir"+"\n"+"(2)- Somar"+"\n"+"(3)- Multiplicar"
					+"\n"+"(4)- Subtrair"+"\n"+"(0) - Sair");
			opcao = teclado.nextInt();
			break;
		case 0:
			System.out.println("Fim do programa!");
			opcao=0;
		default: System.out.println("Opção inválida!");

		}
		}
		while (opcao!=0);
		System.out.println("Fim do programa!");
	}
}