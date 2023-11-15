package Atividades_Fila_e_Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_Pilha_Exercicio_2 {

	public static void main(String[] args) {

		int op;
		Scanner input = new Scanner (System.in);
		
		Stack<String> livros = new Stack <String>();
		
		
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("\n\t1 - Adicionar Livro na Pilha");
			System.out.println("\t2 - Listar todos os Livros");
			System.out.println("\t3 - Retirar Livro da pilha");
			System.out.println("\t0 - Sair");
			System.out.println("\n***********************************************");
			System.out.println("\nEntre com a opção desejada: ");
			System.out.println();	
			op = input.nextInt();
		
			switch(op) {
			
			case 1:
				input.nextLine();
				System.out.println("Digite o nome: ");
				String nome = input.nextLine();
				livros.add(nome);
				System.out.println("Livro Adicionado");
				break;
			
			case 2:
				input.nextLine();
				System.out.println("\nLista de Livros na Pilha: "+livros);
				break;
			
			case 3:
				input.nextLine();
				System.out.println("\n\tLivro "+livros.pop()+" foi retirado!");
				System.out.println("\nLista de Livros na Pilha:"+livros);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
					
			}
		} while (op != 0);
		
	}
}