package Atividades_Fila_e_Pilha ;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;


public class Atividade_Fila_Exercicio_1 {

public static void main(String[] args) {
		
		int op;
		Scanner input = new Scanner (System.in);
		
		Queue<String> fila = new LinkedList <String>();
		
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("\n\t1 - Adicionar Cliente na fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da fila");
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
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			 
			case 2:
				input.nextLine();
				System.out.println("\nLista de clientes na Fila: ");
				System.out.println(fila);
				break;
			
			case 3:
			    input.nextLine();
			    if (fila.isEmpty()) {
			        System.out.println("A fila está vazia. Não há clientes para retirar.");
			    } else {
			        String clienteRemovido = fila.poll();
			        System.out.println("Cliente removido: " + clienteRemovido);
			    }
			    break;

				
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
			
			}
		} while(op !=0);	
		input.close();
	} 
} 