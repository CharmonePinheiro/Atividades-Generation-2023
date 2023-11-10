package Projetos_While;

import java.util.Scanner;

public class Lista_1Exercicio_2 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos 
		 * número são ímpares. Veja o exemplo abaixo:

		 */
		
		Scanner sc=new Scanner(System.in);
		int[] n;
		
		 int num, nPar = 0, nImpar = 0;
		
		 for(int i = 1; i <= 5; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = sc.nextInt();
	            
	            if(num % 2 == 0){
	                nPar++;
	            }

	            // para informar números impares
	            /*
	            if(num % 2 == 1){
	                contImpar++;
	            }
	            */
	        }
		 
		  System.out.println("Foram digitados " + nPar + " números pares \n");

	}

}
