import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String... args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to print multiplication table: ");
        int numbers = input.nextInt();

        System.out.println("Multiplication Table of " + numbers );

        for (int i = 1; i <= 12; i++) {
            int result = numbers * i;
        
            System.out.println(numbers + " x " + i + " = " + result);
        }

      
     
    }
}

