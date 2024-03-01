package primeiro_projeto;

import java.util.Scanner;

public class Atividade_2 {

	
		public static void main(String[] args) {
			// Variáveis
			Double horatrab,valorhora,salbruto,sallíquido,inss;
			//Instaciar classe Scanner
			Scanner ler = new Scanner(System.in);

			//Entrada de dados 
			System.out.println("Quantas horas você trabalha?: ");
			horatrab = ler.nextDouble();

			System.out.println("Quanto você recebe por hora?: ");
			valorhora = ler.nextDouble();
			
			//Processamento
			salbruto = horatrab*valorhora;
			inss = salbruto*0.12;
			sallíquido = salbruto-inss;
			
		
			//Saída
			System.out.println("O seu salário bruto é: " + salbruto);
			System.out.println("O valor do salário líquido é: " + sallíquido);

	}

}
