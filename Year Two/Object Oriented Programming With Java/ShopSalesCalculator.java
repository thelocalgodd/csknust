import java.util.Scanner;
public class ShopSalesCalculator{
    
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    double[][] shopSales = new double[2][12];
    System.out.println("Enter the last year sales for high strret branch:");
    for(int month=0; month < 12;month++ ){
        System.out.println("Month" + (month + 1) + ":");
        shopSales[0][month] = scanner.nextDouble();
    }
    System.out.println("Entr the last year sales for mall street branch");
    for(int month=0; month < 12;month++){
        System.out.println("Month" + (month + 1) + ":");
        shopSales[1][month] = scanner.nextDouble();
    }
    double[] monthlyCombinedSales = new double[12];
    for(int month=0; month < 12;month++){
        monthlyCombinedSales[month] = shopSales[0][month] + shopSales[1][month]; }
        double[] quarterlyCombinedSales = new double[4];
        for(int quarter=0; quarter < 4;quarter++){
            for(int month = quarter * 3; month < (quarter + 1) * 3; month++){
                quarterlyCombinedSales[quarter] = monthlyCombinedSales[month];}
            }
            double[] annualSales = new double[2];
            for(int shop=0; shop < 2;shop++){
                for( int month=0; month < 12;month++){
                    annualSales[shop] += shopSales[shop][month];}

                }
                double grandTotalAnnualCombinedSales = annualSales[0] + annualSales[1];
                System.out.println("Monthly combined sales:");
                for(int month = 0; month < 12; month++){
                    System.out.println((month + 1) + ":" + monthlyCombinedSales[month]);
                }
                System.out.println("Quarterly combned sales:");
                for(int quarter = 0 ; quarter < 4; quarter++){
                    System.out.println("Quarter" + (quarter + 1) + ":" + quarterlyCombinedSales[quarter]);
                }
                System.out.println("Annual sales for each shop:");
                System.out.println("hIgh street branch:" + annualSales[0]);
                System.out.println("mall branch:" + annualSales[1]);
                System.out.println("Grand total annual combined sales:" + grandTotalAnnualCombinedSales);    
        }
    }  























    