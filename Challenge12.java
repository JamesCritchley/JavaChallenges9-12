
package challenge12;
import java.util.Scanner;

public class Challenge12 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Type a letter: ");  
        Scanner sc1 = new Scanner (System. in);
        String answer1 = sc1.nextLine();
        System.out.println("Type a number: ");
        Scanner sc2 = new Scanner (System. in);
        int answer2 = sc2.nextInt();
        
        for (int i = 0; i < answer2; i++) {
            System.out.println(answer1);
            
        }
        
    }
    
}
