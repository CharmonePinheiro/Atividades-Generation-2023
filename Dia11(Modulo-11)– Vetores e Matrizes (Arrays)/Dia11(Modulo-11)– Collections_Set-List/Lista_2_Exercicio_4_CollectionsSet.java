package Java_Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista_2_Exercicio_4_CollectionsSet{
    public static void main(String[] args) {
       
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(9);
        integerSet.add(7);
        integerSet.add(8);
        integerSet.add(10);
        integerSet.add(6);

      
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");

        
         
            int numeroDigitado = input.nextInt();

           
            if (integerSet.contains(numeroDigitado)) {
                System.out.println("Número " + numeroDigitado + " Encontrado!");
            } else {
                System.out.println("O número " + numeroDigitado + " não foi encontrado!");
            }

       
        
    }
}
