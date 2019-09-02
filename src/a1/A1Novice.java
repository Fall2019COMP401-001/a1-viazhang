package a1;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
				
		int count = scan.nextInt();
		System.out.println(count);
				
				
				// Create an array to store numbers.
				
		int[] values = new int[count];
		System.out.println(values);
				
				
				// Read values into the array
				
		for (int i=0; i<values.length; i++) {
					values[i] = scan.nextInt();
					System.out.println(values[i]);
				}
						  
				}
			
	}

