//CS 172
//Lab 2
//Written By: Jeremiah Smith
//Sept 2, 2014
import java.util.Scanner;

public class Errors 
{
   public static void main (String[] args) 
   {
      String Name; // Name of the user
      int number;
      int numSq;
      Scanner scan = new Scanner(System.in);
      System.out.print ("Enter your name, please: ");
      Name = scan.nextLine();
      System.out.print ("What is your favorite number?");
      number = scan.nextInt();
      numSq = number * number;
      System.out.println (Name + ", the square of your number is "
       + numSq);
    }
       
}
