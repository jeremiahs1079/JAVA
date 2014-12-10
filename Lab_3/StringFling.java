//CS 172
//lab 3 Cubes.java
//Written by: Jeremiah Smith
//Sept 10, 2014

import java.util.Scanner;

public class StringFling
{
	public static void main(String args[])
	{
		//declare variables
		Scanner scan = new Scanner(System.in);
		String userInput, userInputUCase, userInputLCase;

		//gather input from user
		System.out.println("Please enter a string");
		userInput = scan.nextLine();

		//process input
		userInputUCase = userInput.toUpperCase();
		userInputLCase = userInput.toLowerCase();

		//print uppercase version
		System.out.println("Your String all Upper Case: " + userInputUCase);

		//print lowercase version
		System.out.println("Your String all Lowercase: " + userInputLCase);

		//print the length of the lower case version
		System.out.println("The lower case version of your sting is " + userInputLCase.length() + " characters long");

		//print the location of the first a 
		if (userInputLCase.indexOf('a') > 0)
		{
			System.out.println("The first appearence of the character: \'a\' is " + userInputLCase.indexOf('a'));
		}
		else
		{
			System.out.println("I am sorry there was no instance of the character: \'a\' in your string.");
		}

		//print the lowercase verison in reverse

		System.out.print("The lower case version of your string in reverse: ");

		for (int i = (userInputLCase.length() -1); i > -1; i--)
		{
			System.out.print(userInputLCase.charAt(i));
		}

		System.out.print("\n");

		

		//replace the characer a with e if a exists
		if (userInputLCase.indexOf('a') > 0)
		{
			userInputLCase = userInputLCase.replace('a', 'e');
			System.out.println("Your string with all the instnaces of \'a\' replaced wiht \'e\' " + userInputLCase);
		}
		else
		{
			System.out.println("I am sorry there was no instance of the character: \'a\' in your string. Could not replace with \'e\'");
		}

		//print last 3 characters of the uppercase version
		System.out.println("The last three characters of your string is: " + userInputUCase.substring(userInputUCase.length() - 3));

		//swap the first and last letters of the orignal and print
		userInput = userInput.charAt(userInput.length()-1) + userInput.substring(1, userInput.length()-1) + userInput.charAt(0);

		System.out.println("Your String with the first and last letter swapped is: " + userInput);

	}
}