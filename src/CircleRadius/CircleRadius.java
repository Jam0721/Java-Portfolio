package CircleRadius;

import java.util.Scanner;

public class CircleRadius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle");
		double Pie = 3.14;
		double Radius = input.nextDouble();
		double Area = Pie*(Radius*Radius);
		System.out.println(" This is the area of your circle " +Area);

	}

}
