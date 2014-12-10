//CS 172
//lab 9 Recursion lab9.java
//Written by: Jeremiah Smith
//Dec 1, 2014

public class lab9
{
   
   
   public static void main(String args[])
   {
      //test printLettersForeward to lowercase z
      System.out.println("Test printLettersForeward to lowercase z:");
      printLettersForeward('z');
      System.out.println();
      
      //test printLettersForeward to uppercase Z
      System.out.println();
      System.out.println("Test printLettersForeward to uppercase Z:");
      printLettersForeward('Z');
      System.out.println();
      
      //test printLettersForeward to lowercase g
      System.out.println();
      System.out.println("Test printLettersForeward to lowercase g:");
      printLettersForeward('g');
      System.out.println();
      
      //test printLettersForeward to uppercase Y
      System.out.println();
      System.out.println("Test printLettersForeward to uppercase Y:");
      printLettersForeward('y');
      System.out.println();
      
      //test printLettersBackwards to upercase Z
      System.out.println();
      System.out.println("Test printLettersBackward to uppercase Z:");
      printLettersBackward('Z');
      System.out.println();
      
      //test printLettersBackwards to lowercase z
      System.out.println();
      System.out.println("Test printLettersBackward to lowercase z:");
      printLettersBackward('z');
      System.out.println();
      
      //test printLettersBackwards to upercase H
      System.out.println();
      System.out.println("Test printLettersBackward to uppercase H:");
      printLettersBackward('H');
      System.out.println();
      
      //test printLettersBackwards to lowercase i
      System.out.println();
      System.out.println("Test printLettersBackward to lowercase i:");
      printLettersBackward('i');
      System.out.println();
      
      System.out.println();
      System.out.println("Test triangle with parameter 5:");
      triangle(5);
      
      System.out.println();
      System.out.println("Test triangle with parameter 10:");
      triangle(10);
      
      System.out.println();
      System.out.println("Test triangle with parameter 3:");
      triangle(3);
      
      System.out.println();
      System.out.println("Test upsideDownTriangle with parameter 5:");
      upsideDownTriangle(5);
      
      System.out.println();
      System.out.println("Test upsideDownTriangle with parameter 10:");
      upsideDownTriangle(10);
      
      System.out.println();
      System.out.println("Test upsideDownTriangle with parameter 11:");
      upsideDownTriangle(11);
      
      System.out.println();
      System.out.println("Test upsideDownTriangle with parameter 3:");
      upsideDownTriangle(3);
      
      System.out.println();
      System.out.println("Test powerOfTen with parameter 2");
      System.out.println(powerOfTen(2));
      
      System.out.println();
      System.out.println("Test powerOfTen with parameter 5");
      System.out.println(powerOfTen(5));
      
      System.out.println();
      System.out.println("Test powerOfTen with parameter -2");
      System.out.println(powerOfTen(-2));
      
      System.out.println();
      System.out.println("Test powerOfTen with parameter -5");
      System.out.println(powerOfTen(-5));
   }

   public static void printLettersForeward(char c)
   {
      
      //error case
      if(((int)c < (int)'a' || (int)c > 'z') && ((int)c < (int)'A' || (int)c > 'Z'))
      {
         return;
      }
      
      //base case
      if(c == 'a' || c == 'A')
      {
         System.out.print(c);
         return;
      }
      
      //recursion case
      printLettersForeward((char)((int)c - 1));
      System.out.print(c);
   }
   
   public static void printLettersBackward(char c)
   {
      
      //error case
      if(((int)c < (int)'a' || (int)c > 'z') && ((int)c < (int)'A' || (int)c > 'Z'))
      {
         return;
      }
      
      //base case
      if(c == 'a' || c == 'A')
      {
         System.out.print(c);
         return;
      }
      
      //recursion case
      System.out.print(c);
      printLettersBackward((char)((int)c - 1));
      
   }
   
   public static void triangle(int n)
   {
      //error case
      if(n < 1)
         return;
      //base case
      if(n == 0)
      {
         return;
      }   
      
      //recursion case
      triangle(n - 1);
      for(int i = 0; i < n; i++)
         System.out.print('*');
      System.out.println();
   }

   public static void upsideDownTriangle(int n)
   {
      //error case
      if(n < 1)
         return;
      //base case
      if(n == 0)
      {
         return;
      }   
      
      //recursion case
      for(int i = 0; i < n; i++)
         System.out.print('*');
      System.out.println();
      upsideDownTriangle(n - 1);
   }
   
   public static double powerOfTen(int n)
   {
      //base case 0
      if(n == 0)
         return 1.0;
      
      //recursion for negative exponents    
      if(n < 0)
         return powerOfTen(n + 1) / 10;
      
      //recursion for positive exponents   
      return 10.0 * powerOfTen(n - 1);
         

   }
   
}