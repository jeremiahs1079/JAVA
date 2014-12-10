//CS 172
//Lab 6B JeremiahSmith.java
//Written by: Jeremiah Smith
//Oct 22, 2014

import java.util.Scanner;
import java.io.*;


public class JeremiahSmith
{
   public static void main(String args[]) throws IOException
   {
      //declare variables
      String fileName, output, lineContent;
      Scanner inputFile, userInput;
      int words = 0;
      
      userInput = new Scanner(System.in);
      //ask for user to input a file.
      System.out.println("Please enter the name of a file");
      fileName = userInput.nextLine();
      
      inputFile = new Scanner(new File(fileName));
      
      while (inputFile.hasNext())
      {
         lineContent = inputFile.nextLine();
         words += wordCount(lineContent); 
         
      }
      
      System.out.println("The word count of the file " + fileName + " is: " + words);
      
   }
   
   //method to count words in each line of a file
   public static int wordCount(String s)
   {
      //declare variables
      int count = 0;
      Scanner line = new Scanner(s);
      while (line.hasNext())
      {
         count++;
         line.next();
      }
      
      return count;
   }
}