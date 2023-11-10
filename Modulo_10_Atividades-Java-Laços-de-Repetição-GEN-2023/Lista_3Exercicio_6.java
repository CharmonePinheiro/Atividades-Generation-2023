package Projetos_While;

import java.util.Scanner;

public class Lista_3Exercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		 * até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, 
		 * que sejam múltiplos de 3. Veja o exemplo abaixo:

		 */
		
		
		Scanner sc = new Scanner(System.in);

        int numero;
        int somaMultiplosDeTres = 0;
        int quantidadeMultiplosDeTres = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 3 == 0) {
                somaMultiplosDeTres += numero;
                quantidadeMultiplosDeTres++;
            }

        } while (numero != 0);

        double mediaMultiplosDeTres = quantidadeMultiplosDeTres > 0 ?
                (double) somaMultiplosDeTres / quantidadeMultiplosDeTres : 0;

        System.out.println("\nA média de todos os números múltiplos de 3 é: " + mediaMultiplosDeTres);
	}

}
