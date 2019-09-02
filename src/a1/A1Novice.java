package a1;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalNumber = scan.nextInt();
		
		for (int i = 0; i < totalNumber; i++) {
			  System.out.println(i);
			  String fName = scan.nextLine();
			  String lName = scan.nextLine();
			  int itemNo = scan.nextInt();
			  double totalmoney = 0;
			  for (int j = 0; j < itemNo; i++) {
				  System.out.println(i);
				  int numberBought = scan.nextInt();
				  String itemName = scan.nextLine();
				  double price = scan.nextDouble();
				  totalmoney = totalmoney + numberBought * price;
			  System.out.println(fName);
			  System.out.println(lName);
			  System.out.println(totalmoney);
						  
				}
			}
	}
}
