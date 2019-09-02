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
			  System.out.println(fName);
			  String lName = scan.nextLine();
			  System.out.println(lName);
			  int itemNo = scan.nextInt();
			  System.out.println(itemNo);
			  double totalmoney = 0.0;
			  System.out.println(totalmoney);
			  for (int j = 0; j < itemNo; i++) {
				  System.out.println(i);
				  int numberBought = scan.nextInt();
				  System.out.println(numberBought);
				  String itemName = scan.nextLine();
				  System.out.println(itemName);
				  double price = scan.nextDouble();
				  System.out.println(price);
				  totalmoney = totalmoney + numberBought * price;
				  System.out.println(totalmoney);
			  System.out.println(fName);
			  System.out.println(lName);
			  System.out.println(totalmoney);
						  
				}
			}
	}
}
