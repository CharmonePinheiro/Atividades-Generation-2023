package Matrizes_e_Vetores;

import java.util.Scanner;

public class Lista_1_Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numeroProcurado;
		
		int vetor[]= {2,5,1,3,4,9,7,8,10,6}; 
		
		System.out.print("Digite o Numero Procurado");
		
		numeroProcurado=sc.nextInt();
		
		 for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numeroProcurado) {
	                System.out.println("O número " + numeroProcurado + " está no índice: " + i);
	                 return;
	            }
	        }
		 
		 
		System.out.println("O numero Não foi encontrado!");
		
		
	
	

	}

}
