package ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year you were born");
		int year = input.nextInt();
		switch (year % 12){
		case 0:
			System.out.println("You are a monkey");
			break;
		case 1:
			System.out.println("You are a Rooster");
			break;
		case 2:
			System.out.println("You are a Dog");
			break;
		case 3:
			System.out.println("You are a Pig");
			break;
		case 4:
			System.out.println("You are a Rat");
			break;
		case 5:
			System.out.println("You are a Ox");
			break;
		case 6:
			System.out.println("You are a Tiger");
			break;
		case 7:
			System.out.println("You are a Rabbit");
			break;
		case 8:
			System.out.println("You are a Dragon");
			break;
		case 9:
			System.out.println("You are a Snake");
			break;
		case 10:
			System.out.println("You are a Horse");
			break;
		case 11:
			System.out.println("You are a Sheep");
			break;
		}

	}

}
