import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int examScore;
        int assesmentScore;
        int totalScore;
        boolean paidFees;
        int checkPaidFees;
        int fee;

        // Take input for exam score
        System.out.print("Enter your exam score: ");
        examScore = input.nextInt();

        // Take input for assessment score
        System.out.print("Enter your assesment score: ");
        assesmentScore = input.nextInt();

        // Take input for fee status
        System.out.print("Have you paid your fees (1/0)");
        checkPaidFees = input.nextInt();

        // Total score
        totalScore = examScore + assesmentScore;

        if (examScore >= 25) { // Req. 1
            System.out.println("You have passed the exam");

            if (assesmentScore >= 15) { // Req. 2
                System.out.println("You have passed the assesment");
            }
        }

        // Check if student is condoned.
        if (totalScore >= 39) {
            System.out.println("You are condoned");
        }

        // Check if fees have been paid.
        if (checkPaidFees == 1) {
            System.out.print("How much fees have you paid: ");
            fee = input.nextInt();

            // Check if full fees have been paid.
            if (fee < 100) {
                int newFee = 100 - fee;
                System.out.println("You have not paid enough fees, you are owing" + newFee);
            }
        } else {
            System.out.print("You have paid your fees and passed the exam \n, You have earned a Certificate.");
        }

    }
}