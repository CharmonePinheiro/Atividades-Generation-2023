package Java_Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista_2_Exercicio_3_CollectionsSet{
    public static void main(String[] args) {
        
        Set<Integer> integerSet = new HashSet<>();

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            
                
            	System.out.println("\nDigite o valor"+(i+1)+":");
                int valor = scanner.nextInt();

                
                if (integerSet.contains(valor)) {
                    System.out.println("Valor repetido. Digite novamente.");
                    i--; // Decrementa o índice para que o usuário insira novamente o valor atual
                } else {
                    // Adicionando o valor à HashSet
                    integerSet.add(valor);
                }
           
        }

       
        System.out.println("\nElementos da Collection Set:");

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
    }
}
