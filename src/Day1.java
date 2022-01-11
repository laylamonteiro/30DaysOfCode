import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int anotherInt ;
        double anotherDouble;
        String anotherString = null;
        /* Read and save an integer, double, and String to your variables.*/
        anotherInt = scan.nextInt();
        anotherDouble = scan.nextDouble();
        scan.nextLine();
        anotherString = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + anotherInt);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + anotherDouble);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String concat = s.concat(anotherString);
        System.out.println(concat);
        scan.close();
    }
}