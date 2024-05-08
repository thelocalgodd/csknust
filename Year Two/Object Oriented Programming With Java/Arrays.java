import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] highStreet = new int[4][3];
		int[][] mall= new int[4][3];
				
		int sum1 =0;
		int monthly=0;
		int annual1=0;
		int annual2=0;
		int grandTotal=0;

		for(int i =0; i<4; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.println("enter");
				highStreet[i][j] = input.nextInt();
				annual1+=highStreet[i][j];
				
				System.out.println("press");
				
				mall[i][j] = input.nextInt();
				
				sum1 = highStreet[i][j] + mall[i][j];
				System.out.println(sum1);
				annual2+=mall[i][j];
				
				monthly+=sum1;
					
			}
			
			System.out.println(monthly);
				
		}

		System.out.println("annuals are here ");
		
		System.out.println(annual1);
		System.out.println(annual2);
		
		grandTotal = annual1 + annual2;
		System.out.println(grandTotal);
		
	}

}
