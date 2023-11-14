package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista1_Exercicio_2_CollectionList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int numeroProcurado;
		
		try (Scanner input = new Scanner(System.in)) {
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);
			
			System.out.println("\nDigite o numero que deseja encontrar");
			numeroProcurado=input.nextInt();
		}
		
		
		if (numeros.contains(numeroProcurado)) {
            int posicao = numeros.indexOf(numeroProcurado);
            System.out.println("\nO número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
        }
		
 
	}

}
