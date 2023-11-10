package Projetos_While;
import java.util.*;
public class Lista_2Exercicio_4 {
	
	
	public static void main(String[] args) {
		
		
/*
 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e 
 * precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes 
 * nformações de cada colaborador:

 */
		
		
		
		Scanner sc = new Scanner(System.in);

        int devBackend = 0;
        int devMulheresFrontend = 0;
        int devHomensMobileAcima40 = 0;
        int devNaoBinariosFullStackAbaixo30 = 0;
        int  totalDePessoas = 0;
        int somaIdades = 0;

        char continuar = 'S';
        
        while (continuar == 'S') {
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Identidade de Gênero (1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros): ");
            int genero = sc.nextInt();

            System.out.print("Pessoa Desenvolvedora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            int desenvolvedor = sc.nextInt();

            // Contabilizando informações
            
            if (desenvolvedor == 1) {
                devBackend++;
            }

            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
                devMulheresFrontend++;
            }

            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
                devHomensMobileAcima40++;
            }

            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
                devNaoBinariosFullStackAbaixo30++;
            }

            // Calculando a média de idade
            
            somaIdades += idade;
            totalDePessoas++;

            // Perguntando se deseja continuar
            System.out.print("Deseja continuar (S/N): ");
            continuar = sc.next().charAt(0);
        }

		
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + devBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + devMulheresFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + devHomensMobileAcima40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + devNaoBinariosFullStackAbaixo30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalDePessoas);
        
        double mediaIdade = totalDePessoas > 0 ? (double) somaIdades / totalDePessoas : 0;
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
		
		
		
	}

}
