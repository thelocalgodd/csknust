import java.util.Scanner;

public class SurveyProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int occur1 = 0, occur2 = 0, occur3 = 0, occur4 = 0, occur5 = 0;

        int responses[] = new int[20];

        System.out.println("Enter a number [1 - 5]: ");

        for (int i = 0; i < responses.length; i++) {
            responses[i] = input.nextInt();

            if (responses[i] == 1) {
                occur1++;
            } else if (responses[i] == 2) {
                occur2++;
            } else if (responses[i] == 3) {
                occur3++;
            } else if (responses[i] == 4) {
                occur4++;
            } else if (responses[i] == 5) {
                occur5++;
            }
        }

        System.out.println("Rating\tFrequency\n");
        System.out.println("1\t" + occur1);
        System.out.println("2\t" + occur2);
        System.out.println("3\t" + occur3);
        System.out.println("4\t" + occur4);
        System.out.println("5\t" + occur5);

        input.close();
    }
}