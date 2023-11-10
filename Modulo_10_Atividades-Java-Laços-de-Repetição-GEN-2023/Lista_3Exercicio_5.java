package Projetos_While;

import java.util.Scanner;

public class Lista_3Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado,
		 *  até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados,
		 *   que sejam positivos. Veja o exemplo abaixo:

		 */

		Scanner sc = new Scanner(System.in);
		
		int numero;
        int somaPositivos = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            }

        } while (numero != 0);

        System.out.println("\nA soma dos números positivos é: " + somaPositivos);
	
	
	}
	

}
