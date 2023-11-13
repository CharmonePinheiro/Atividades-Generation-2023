package Matrizes_e_Vetores;
import java.util.*;

public class Lista_2_Exercicio_2 {

	public static void main(String[] args) {
		
		int linha, coluna;
		double soma = 0;
		double matriz [] [] = new double [10][4];
		double vetorMedia [] = new double[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(linha=0; linha<=9; linha++) {
			for(coluna=0; coluna<=3; coluna++) {
				
				System.out.println("Entre com a "+(coluna+1)+" nota: ");
				matriz[linha][coluna] = sc.nextDouble();	
				
				soma += matriz[linha][coluna];
				
			} vetorMedia [linha] = soma/4;
			soma=0;
		}
		
		for(double num: vetorMedia) {
			
			System.out.printf("\n %.1f",num);
		}
						
	}

}
