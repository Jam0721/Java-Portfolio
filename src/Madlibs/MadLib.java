package Madlibs;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a noun");
		String noun1 = input.next();
		System.out.println("Enter a plural noun");
		String pnoun = input.next();
		System.out.println("Enter a noun");
		String noun2 = input.next();
		System.out.println("Enter a place");
		String place = input.next();
		System.out.println("Enter a adjective");
		String adjective = input.next();
		System.out.println("Enter a noun");
		String noun3 = input.next();
	System.out.println("Be kind to your " +noun1+ " -footed " +pnoun+ " For a duck may be somebody's " +
		noun2+ " Be kind to your " +pnoun+ " in " +place+ " Where the weather is always " +adjective+ " You may think that this is the " +noun3+ ", Well it is ");
	
	
	
	}

}
