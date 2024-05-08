/*
 * Name: Vincent Kwaku Kpemlie
 * Index Number: 3396122
 * Computer Science 2 - Group 2
 */

 import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        double sum = 0, variance = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println( "Please enter an even number between 2 and 20 (inclusive):");
            int userInput = input.nextInt();

            while (userInput % 2 != 0 || userInput < 2 || userInput > 20) {
                System.out.println("Please enter an even number between 2 and 20 (inclusive):");
                userInput = input.nextInt();
            }
            evenNumbers[i] = userInput;
            sum += evenNumbers[i];
        }

        double mean = sum / 10;

        for (int i = 0; i < 10; i++) {
            variance += Math.pow(evenNumbers[i] - mean, 2);
            System.out.println("Array element " + (i + 1) + ": " + evenNumbers[i]);
        }

        double sd = Math.sqrt(variance / 10);

        System.out.println("Standard Deviation: " + sd);
    }
}
