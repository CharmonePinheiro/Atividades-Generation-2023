package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista1_Exercicio_1_CollectionList {

	public static void main(String[] args) {
	
		  ArrayList<String> cores = new ArrayList<>();
		  
		  Scanner input = new Scanner(System.in);
		  
		  for (int i = 0; i < 5; i++) {
	            System.out.print("Digite uma cor: ");
	            String cor = input.nextLine();
	            cores.add(cor);
	        }
		  
		  System.out.println("Listar todas as cores:"+cores);
		  
		  
		  
		  	Collections.sort(cores);
	        
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }


	}

}

