public class Loops {
    public static void main(String[] args) {
        int evenInt[] = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                evenInt[i] = i;
                System.out.println(i);

                sum += i;
            }
        }

        double mean = sum / 10;
        double mean2 = mean * mean;

        double sd = (Math.pow(mean, 2) / sum) - mean2;

        System.out.println("the Standard Deviation is: " + sd);


    }    
}


public class SimpleStandardDeviation {

    public static double standardDeviation(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Data array cannot be empty!");
        }

        double sum = 0;
        for (int value : data) {
            sum += value;
        }

        double mean = sum / data.length;

        double variance = 0;
        for (int value : data) {
            variance += Math.pow(value - mean, 2);
        }

        return Math.sqrt(variance / data.length);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        double stdDev = standardDeviation(numbers);
        System.out.println("Standard deviation: " + stdDev);
    }
}
