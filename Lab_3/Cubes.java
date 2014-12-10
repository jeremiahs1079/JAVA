//CS 172
//lab 3 Cubes.java
//Written by: Jeremiah Smith
//Sept 10, 2014

public class Cubes
{
	public static void main(String args[])
	{
		//declare variables
		int firstNumber, secondNumber, sumOfCubes, min = 2, max = 10;

		//print table headers
		System.out.printf("%15s %15s %15s%n", "First Number", "Second Number", "Sum of Cubes");
		System.out.printf("%15s %15s %15s%n", "-------------", "-------------", "-------------");

		for(int i = 0; i < 6; i++)
		{
			firstNumber = (int)(Math.random() * ((max - min + 1) + min));
			secondNumber = (int)(Math.random() *((max - min +1) + min));
			sumOfCubes = (int)(Math.pow((double)firstNumber,3) + Math.pow((double)secondNumber,3));
			System.out.printf("%15d %15d %15d%n", firstNumber, secondNumber, sumOfCubes);

		}

	}
}