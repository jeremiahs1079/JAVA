//CS 172
//lab 3 Sphere.java
//Written by: Jeremiah Smith
//Sept 10, 2014

import java.util.Scanner;

public class Sphere
{
	public static void main(String args[])
	{
		//declare variables
		Scanner scan = new Scanner(System.in);
		double radius, volume, surfaceArea;

		//get user input
		System.out.println("please enter the radius of the sphere");
		radius = scan.nextFloat();

		if (radius > 0)
		{
			volume = (4/3 * Math.PI) * Math.pow(radius,3);
			surfaceArea = 4 * Math.PI * Math.pow(radius,2);

			System.out.printf("The volume of a sphere with a radius of %.4f is %.4f%n", radius, volume);
			System.out.printf("The surface area of a sphere with a radius of %.4f is %.4f%n", radius, surfaceArea);

		}
		else
		{
			System.out.println("I am sorry this is not a valid radius");
		}
	}
}