/* 
 * Name: Richeal Manu Pokuah
 * Index Number: 3398922
*/

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = 10;
        int[] evenArray = new int[arraySize];

        // Initialize the array with the first 10 even integers
        int num = 2; // Start with the first even number
        for (int i = 0; i < arraySize; i++) {
            evenArray[i] = num;
            num += 2; // Increment by 2 to get the next even number
        }

        // Display the contents of the array
        System.out.println("Even numbers in the array:");
        for (int j = 0; j < arraySize; j++) {
            System.out.print(evenArray[j] + " ");
        }
        System.out.println(); // Print a newline

        // Calculate the standard deviation
        double mean = calculateMean(evenArray);
        double sumOfSquaredDifferences = 0.0;
        for (int k = 0; k < arraySize; k++) {
            double difference = evenArray[k] - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        double variance = sumOfSquaredDifferences / arraySize;
        double standardDeviation = Math.sqrt(variance);

        // Display the standard deviation
        System.out.println("Standard deviation of the even numbers: " + standardDeviation);

        scan.close();
    }

    // Helper method to calculate the mean of an array
    private static double calculateMean(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }

}
