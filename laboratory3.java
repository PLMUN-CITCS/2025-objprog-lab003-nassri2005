import java.util.Scanner; 

public class laboratory3 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your integer: ");
        int userInt = input.nextInt();
        System.out.print ("Enter decimal: ");
        double userDouble = input.nextDouble ();
        input.nextLine();
        System.out.print ("Enter a word: ");
        String userString = input.nextLine();
        System.out.printf("Your integer:  %d%n", userInt);
        System.out.printf("Your decimal:  %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);
        input.close();

    }
}