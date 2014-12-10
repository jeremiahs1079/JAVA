//CS 172
//Lab t Lab7.java
//Written by: Jeremiah Smith
//Oct 22, 2014

import java.util.Scanner;


public class Lab7
{
   public static void main(String args[])
   {
      //declare variables
      String countingNumbers[] = {"one", "two", "three", "four", "five", "six", "seven", "eight",
                                  "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                                  "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
      
      int ascii;
      float numbers[], total = 0, min, max;
      numbers = new float [10];
      String userInput = "";
      Scanner scan = new Scanner(System.in);
      boolean validInput = false, containsChar = false;
      
      //start problem 1
      System.out.println("Problem 1");
      
      //loop for user input
      while (!validInput)
      {
         System.out.println("Please enter a character A-Z or a-z");
         userInput = scan.next();
         ascii = (int)userInput.charAt(0);
         
         if ((ascii > 64 && ascii < 91) || (ascii > 96) && (ascii < 123))
         {
            if (ascii > 64 && ascii < 91)
            {
               userInput = userInput.toLowerCase();
            }
         
            validInput = true;
         }
         else
         {
            System.out.println("That is not valid input!");
         }
         
      }//end while user input
      
      //for loop to loop between elements of the array
      for(int i = 0; i < countingNumbers.length; i++)
      {
         if (countingNumbers[i].indexOf(userInput.charAt(0)) != -1)
         {
            System.out.println(countingNumbers[i]);
            containsChar = true;
         }
      }//end for to print
      
      if (!containsChar)
      {
         System.out.println("No elements contain that letter");
      }
      
      //start problem 2
      System.out.println();
      System.out.println("Problem 2");
      
      //for loop to gen random float values between 1.0f and 50.0f
      for(int i = 0; i < numbers.length; i++)
      {
         numbers[i] = (float)(Math.random() * ((50.0f - 1.0f + 1) + 1.0f));
      }//end for gen random
      
      //print each element of numbers on one line with two spaces between
      for(int i = 0; i < numbers.length; i++)
      {
         if (i == 0)
         {
            System.out.print(numbers[i]);
         }
         else
         {
            System.out.print("  " + numbers[i]);
         }
      }//end for to print each element
      
      System.out.println();
      
      //for loop to add elements
      for (int i = 0; i < numbers.length; i++)
      {
         total += numbers[i];
      } 
      
      //print the average
      System.out.println("The average is: " + total/numbers.length);
      
      //for loop to find the min and max of numbers
      min = numbers[0];
      max = numbers[0];
      for(int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] < min)
         {
            min = numbers[i];
         }
         
         if (numbers[i] > max)
         {
            max = numbers[i];
         }
      }//end for loop to find min/max
      
      //print min max
      System.out.println("The minimum value in the array numbers is: " + min);
      System.out.println("The maximum value in the array numbers is: " + max);
      
      
   }//end main
}//end class