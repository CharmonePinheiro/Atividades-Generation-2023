package LacoDecisaoSwitch;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		
		System.out.print("Digite o codigo do produto de 1 a 6");
       
		int codigo = sc.nextInt();
		
		System.out.print("Informe a quantidade : ");
		
        int quantidade = sc.nextInt();
        
        double preco = 0.0;
        String produto = "";
		
        switch (codigo) {
        case 1:
            preco = 10.00;
            produto = "Cachorro Quente";
            break;
        case 2:
            preco = 15.00;
            produto = "X-Salada";
            break;
        case 3:
            preco = 18.00;
            produto = "X-Bacon";
            break;
        case 4:
            preco = 12.00;
            produto = "Bauru";
            break;
        case 5:
            preco = 8.00;
            produto = "Refrigerante";
            break;
        case 6:
            preco = 13.00;
            produto = "Suco de laranja";
            break;
        default:
            System.out.println("Código de produto inválido.");
            return;
    }
        double total1 = quantidade * preco;
        
        System.out.println("Produto: " + produto);
        System.out.println("Valor Total: R$" + total1);
       
       
        
        
        /*
         * 7) Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma
        Calculadora simples. O programa deverá ler dois números float: numero1 e numero2,
        e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A
        seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação
        seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
        */

        float numero1,numero2,total;
        int codigo;

        System.out.println("Digite o primeiro numero.");
        
        numero1=sc.nextFloat();
        
        System.out.println("Digite o segundo numero.");
        
        numero2=sc.nextFloat();
        
        System.out.println("Digite o codigo da operação a ser realizada.");
        
        codigo=sc.nextInt();
        
        switch(codigo) {
        case 1:
        total=numero1+numero2;
        
        System.out.println("O resultado da operação e"+total);
        
        break;
        
        case 2:
            total=numero1-numero2;
            
            System.out.println("O resultado da operação e"+total);
            
            break;
            
        case 3:
            total=numero1*numero2;
            
            System.out.println("O resultado da operação e"+total);
            
            break;
            
        case 4:
            total=numero1/numero2;
            
            System.out.println("O resultado da operação e"+total);
            
            break;
            
        default:
            System.out.println("Código de Operação inválido.");
            return;
        
        
        }
        

	}

}












