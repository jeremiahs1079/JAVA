//******************************************************
//Hypotenuse.java
//
//Print the Hypotenuse of a right trinagle
//******************************************************

public class Hypotenuse
{
   public static void main(String args[])
   {
      double leg_a, leg_b, hyp;
      
      leg_a = 5.0;
      leg_b = 5.0;
      
      hyp = Math.sqrt((Math.pow(leg_a,2) + Math.pow(leg_b, 2)));
      
      System.out.println("The hypotenuse of a right triangle with Oppsite side of: " + leg_a 
        + " and Adjacent side of: " + leg_b + " is equal to: " + hyp);
   }
}