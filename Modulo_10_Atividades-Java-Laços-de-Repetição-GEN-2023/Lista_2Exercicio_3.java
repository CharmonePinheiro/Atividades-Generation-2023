package Projetos_While;
import java.util.*;
public class Lista_2Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*
			 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
			 	via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o 
			 	total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao 
			 	digitar uma idade negativa. Veja o exemplo abaixo:

			 */

	
	Scanner sc=new Scanner(System.in);
	
	int maiorIdade50=0,menorIdade21=0,idadeEntre21e50=0,idade;
	
	 System.out.print("Digite uma idade: ");
     idade = sc.nextInt();
     
     while (idade >= 0) {
         if (idade < 21) {
             menorIdade21++;
         } else if (idade > 50) {
             maiorIdade50++;
         }else if(idade>21 & idade < 51) {
        	 
        	 idadeEntre21e50++;
         }

         System.out.print("Digite uma idade (ou -1 para encerrar): ");
         idade = sc.nextInt();
     }
     
     System.out.println("\nTotal de pessoas menores de 21 anos: " +  menorIdade21);
     System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade50);
     System.out.println("Total de pessoas Com idades entre 21 e entre  50 anos: " + idadeEntre21e50);


			
	
	
	}

}
