package Projetos_While;

import java.util.Scanner;

public class Lista_1Exercicio_1 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		 
		
		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o 
		 * segundo número. 
		 * Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
  			Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo:

		 */
		 
		int n1,n2;
		
		 System.out.printf("Digite o primeiro numero");
		 
		 n1=sc.nextInt();
		 
		 System.out.printf("Digite o primeiro numero");
		 
		 n2=sc.nextInt();
		 
		 
		 if(n1 >= n2) {
			 
			 System.out.printf("\n   Intervalo inválido!\n   O valor fornecido esta incorreto Numero 2  deve ser maior que Numero 2");
		 };
		 
		 System.out.println("\nNo Intervalo entre " + n1 + " e " + n2 + ":\n");
		 
		 for (int i = n1; i <= n2; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println(i + " é múltiplo de 3 e 5");
	            }
	        }
		 
		 

	}

}
