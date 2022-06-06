import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Vetores{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        
        System.out.println("Digite 5 números inteiros:");
        for(int i = 0; i < 5 ; i++){
            vetor.add(input.nextInt());
        };   

        System.out.println("\nEstes foram o resultado: " + vetor);
    }
    
}