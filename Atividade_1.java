package primeiro_projeto;

import java.util.Scanner;

public class Atividade_1 {



	public static void main(String[] args) {
		// Variáveis
		String idade,nome;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados 
		System.out.println("Qual seu nome?: ");
		nome = ler.next();

		System.out.println("Qual a sua idade?: ");
		idade = ler.next();
		//Saída
		System.out.println("Olá " + nome + ", você tem " + idade +  " anos");
	}

}
