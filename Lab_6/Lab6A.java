//CS 172
//lab 6A Lab6A.java
//Written by: Jeremiah Smith
//Oct 19, 2014

import javax.swing.JApplet;
import java.awt.*;
import java.util.Scanner;

public class Lab6A extends JApplet
{

   
   public static void print5(String s)
   {
      //declare variables
      boolean endOfString = false;
      
      //while loop that repeates until endOfString = true
      while (!endOfString)
      {
         if (s.length() > 5)
         {  
            //prints string 5 characters at a time as long as length is greater then 5
            for ( int i = 0; i < 5; i++)
            {
               System.out.print(s.charAt(i));
            }
            s = s.substring(5);
            System.out.println();
         }
         else
         {
            //prints the string if length is less then 5 and sets endOfString to true;
            for ( int i = 0; i < s.length(); i++)
            {
               System.out.print(s.charAt(i));
            }
            
            endOfString = true;

         }
         
         
         
      }
   }
   
   //generate and return a random color object
   public static Color randomColor()
   {
      int min = 0, max = 255;
      int red = (int)(Math.random() * ((max - min +1) + min));
      int green = (int)(Math.random() * ((max - min +1) + min));
      int blue = (int)(Math.random() * ((max - min +1) + min));
      Color returnColor = new Color(red, green, blue);
   
      return returnColor;
   }
   
   public static void main(String args[])
   {
      //declare variables
      String userInput;
      Scanner scan = new Scanner(System.in);
      
      //ask user for input
      System.out.println("Please enter a string.");
      userInput = scan.nextLine();
      
      //call print5 function
      print5(userInput);
   }
   
   public void paint(Graphics g)
   {
      //declare variables
      int startingX = 0, startingY = 0;
      
      //loops for creating and drawing the squares for the applet
      for (int i = 0; i < 8; i++)
      {
         startingX = 0;
         for (int j = 0; j < 8; j++)
         {
            
            g.setColor(randomColor());
            g.fillRect(startingX, startingY, 50, 50);
            startingX += 50;
         }
         startingY += 50;
      }
   }
}