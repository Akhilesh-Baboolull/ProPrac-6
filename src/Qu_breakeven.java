/**
 * @author Akhilesh
 *
 * Version 1.0
 *
*/


import java.util.Scanner;

public class Qu_breakeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		
		double totalcosts;
		double totalrevenue;
		
		
		
		do {
			
			
			System.out.print("Enter Total Costs: ");
			totalcosts = myInput.nextDouble();
			
			if(totalcosts <= 0) {
				System.out.println("Invalid value for Total Costs entered! Please Re-Enter!");
			}
			
			
		}while(totalcosts <= 0);
		
		do {
			
			
			System.out.print("Enter Total Revenue: ");
			totalrevenue = myInput.nextDouble();
			
			if(totalrevenue <= 0) {
				System.out.println("Invalid value for Total Revenue entered! Please Re-Enter!");
			}
			
			
		}while(totalrevenue <= 0);
		
		
		if(totalcosts == totalrevenue) {
			
			System.out.println("Break Even");	
		}
		else if(totalcosts < totalrevenue) {
			
			System.out.print("Profit");
			
		}
		else {
			System.out.print("Loss");
		}
		
		
		
		
		myInput.close();
	}

}
