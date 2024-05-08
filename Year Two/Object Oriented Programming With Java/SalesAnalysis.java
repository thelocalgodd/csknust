public class SalesAnalysis {
    public static void main(String[] args) {
        // Initialize the matrix with given sales data
        double[][] matrix = {
            {42000, 48000, 50000},
            {52000, 58000, 56000},
            {46000, 49000, 56000}
        };

        // Calculate monthly combined sales
        double monthlyCombinedSales = 0;
        for (double[] row : matrix) {
            for (double sale : row) {
                monthlyCombinedSales += sale;
            }
        }

        // Calculate quarterly combined sales
        double[] quarterlyCombinedSales = new double[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                quarterlyCombinedSales[i] += matrix[j][i];
            }
        }

        // Calculate annual sales for each branch
        double annualHighStreetSales = 0;
        double annualMallSales = 0;
        for (double[] row : matrix) {
            for (double sale : row) {
                annualHighStreetSales += sale;
            }
        }
        for (int i = 0; i < 3; i++) {
            annualMallSales += quarterlyCombinedSales[i];
        }

        // Calculate grand total annual combined sales
        double grandTotalSales = annualHighStreetSales + annualMallSales;

        // Update matrix values
        // (You can add this part based on your requirements)

        // Print the updated matrix
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        // Print other results (monthly, quarterly, annual, grand total)
        System.out.println("\nMonthly Combined Sales: " + monthlyCombinedSales);
        // System.out.println("Quarterly Combined Sales: " + Arrays.toString(quarterlyCombinedSales));
        System.out.println("Annual High Street Sales: " + annualHighStreetSales);
        System.out.println("Annual Mall Sales: " + annualMallSales);
        System.out.println("Grand Total Annual Combined Sales: " + grandTotalSales);
    }
}
