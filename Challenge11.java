
package challenge11;
import java.util.Scanner;

public class Challenge11 {

    
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner sc1 = new Scanner (System. in);
        String answer1 =sc1.nextLine ();
        int num1 = Integer.parseInt (answer1);
        System.out.println("Type another number: ");
        Scanner sc2 = new Scanner (System.in);
        String answer2 =sc2.nextLine ();
        int num2 = Integer.parseInt (answer2);
        for (int i = num1; i < num2; i++) {
            System.out.println(i);   
        }
        
    }
    
}
