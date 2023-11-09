package LacoDecisaoSwitch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*1) Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a
		soma de A + B é maior, menor ou igual a C.*/
		
		
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o numero correspondente a letra A");
		a=sc.nextInt();
		System.out.println("Digite o numero correspondente a letra B");
		b=sc.nextInt();
		System.out.println("Digite o numero correspondente a letra C");
		c=sc.nextInt();
		
		
		if(a+b>c) {
			
			
			
			System.out.printf("A soma de A + B Maior Que C");
			
			
		}else {
			if(a+b<c) {
				
				System.out.printf("A soma de A + B Menor Que C");
				
			}else {
				System.out.printf("A soma de A + B e igual a  C");
			}
		};
		
		
		/*
		 *
		 *2) Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
			uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou
			negativo. Veja os exemplos abaixo

*/
		
		int numero;
		
		numero=sc.nextInt();
		
		if(numero % 2 ==0 & numero > 0) {
			
			System.out.print("O numero e par");
			
		}else {
			
			if(numero %2 != 0 & numero < 0) {
				
				System.out.print("O numero e impar e negativo");
				
			}else {
				if(numero % 2 == 0 & numero <0) {
					
					System.out.print("O numero e par e negativo");
					
				}else{
					if(numero % 2 != 0 & numero > 0) {
						
						System.out.print("O numero e impar e positivo ");
						
						
					}
				};
			}
		}

		

	}

}
