package CToF;

import java.util.Scanner;

public class CToF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("enter a tempature in farenheit");
		double farenheit;
		double celsius;
		farenheit = input.nextDouble();
		celsius = (farenheit -32)/1.8;
		System.out.println(celsius);
		
	}

}
