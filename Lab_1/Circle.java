//******************************************************
//Circle.java
//
//Print the rea of a circle with two different radii
//******************************************************

public class Circle
{
   public static void main(String args[])
   {
      int radius = 10;
      double area = Math.PI * radius * radius;
      System.out.println("The area of a circle with radius " + radius + " is " + area);
      
      radius = 20;
      
      area = Math.PI * radius * radius;
      System.out.println("The area of a circle with radius " + radius + " is " + area);
   }
}