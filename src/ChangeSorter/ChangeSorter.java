package ChangeSorter;

import java.util.Scanner;

public class ChangeSorter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How much change do you have?");
		int change = input.nextInt();
		int quarters = change / 25;
		int leftover = change % 25;
		int dimes = leftover / 10;
		leftover = leftover % 10;
		int nickles = leftover / 5;
		leftover = leftover % 5;
		int pennies = leftover;
		System.out.println("You have a total of");
		System.out.println(quarters +" quarters " +dimes +" dimes " +nickles+ " nickles " +pennies+ " pennies ");
		
		

	}

}
