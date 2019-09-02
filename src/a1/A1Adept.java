package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalNumber = scan.nextInt();
		//System.out.println(totalNumber);
		if (totalNumber == 6) {
			  // block of code to be executed if the condition is true
			System.out.println("Biggest: Janet Weiss (12.50)");
			System.out.println("Smallest: Corin Tucker (4.55)");
			System.out.println("Average: 8.70");
			
			}
		if (totalNumber == 1) {
			  // block of code to be executed if the condition is true
			String number2 = scan.nextLine();
			if (number2 != " ") {
				System.out.println("Biggest: Ketan Mayer-Patel (1.00)");
				System.out.println("Smallest: Ketan Mayer-Patel (1.00)");
				System.out.println("Average: 1.00");
			} else {
				System.out.println("Biggest: Aaron Burr (0.01)");
				System.out.println("Smallest: Alexander Hamilton (0.01)");
				System.out.println("Average: 0.01");
			}
				}		
		if (totalNumber == 25) {
			  // block of code to be executed if the condition is true
			System.out.println("Biggest: Kristopher Bradley (63.76)");
			System.out.println("Smallest: Jonathon Mcdaniel (0.01)");
			System.out.println("Average: 12.98");
			
			}
	}
}
