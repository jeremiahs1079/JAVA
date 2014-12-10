//CS 172
//lab 3
//Written by: Jeremiah Smith
//Sept 10, 2014
import java.util.Scanner;

public class Username
{
   public static void main(String args[])
   {
      //declare variables
      Scanner scan =  new Scanner(System.in);
      String fName, lName, userName;
      int numberPart, min = 10, max = 99;
      
      //Ask user for input
      System.out.println("Please enter your first name: ");
      fName = scan.nextLine();
      System.out.println("Please enter your last name: ");
      lName = scan.nextLine();

      fName = fName.toLowerCase();
      lName = lName.toLowerCase();
      
      //generate username
      
      if (lName.length() < 6)
      {
         userName = fName.substring(0,1) + lName.substring(0);
      }
      else
      {
         userName = fName.substring(0,1) + lName.substring(0,5);
      }
      
      //generate random number for the end of username and add to end username
      numberPart = (int)(Math.random() * ((max - min + 1) + min));
      userName += numberPart;

      //outut the username
      System.out.println(userName);
      
    
   }
}