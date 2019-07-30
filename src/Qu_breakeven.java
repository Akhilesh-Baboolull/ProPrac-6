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

		Scanner myInput = new Scanner(System.in); //identifier for user input
		
		
		double totalcosts;
		double totalrevenue;
		
		
		
		do {
			
			
			System.out.print("Enter Total Costs: "); //input total costs
			totalcosts = myInput.nextDouble();
			
			if(totalcosts <= 0) { //validating total costs
				System.out.println("Invalid value for Total Costs entered! Please Re-Enter!");
			}
			
			
		}while(totalcosts <= 0);
		
		do {
			
			
			System.out.print("Enter Total Revenue: "); //input total revenue
			totalrevenue = myInput.nextDouble();
			
			if(totalrevenue <= 0) { //validating total revenue
				System.out.println("Invalid value for Total Revenue entered! Please Re-Enter!");
			}
			
			
		}while(totalrevenue <= 0);
		
		
		if(totalcosts == totalrevenue) { //checking for break even
			
			System.out.println("Break Even");	
		}
		else if(totalcosts < totalrevenue) { //checking for profit
			
			System.out.print("Profit");
			
		}
		else {
			System.out.print("Loss"); //output loss
		}
		
		
		
		
		myInput.close();
	}

}
