//CS 172
//lab 4 WindTurbine.java
//Written by: Jeremiah Smith
//Sept 21, 2014

public class WindTurbine
{
   //instance variables
   private double powerOutput;
   private int bladeSpeed;
   private String orientation;
   
   //default constructor
   public WindTurbine()
   {
      powerOutput = 100;
      bladeSpeed = 0;
      orientation = "Horizontal";
   }   
   
   //constructor to instanticate WindTurbine with provided values
   //Paramaters: po = powerOutput, bs = bladeSpeed, o = orientation 
   public WindTurbine(double po, int bs, String o)
   {
      //checking value of po to determin if it is in acctable range
      if ((po < 1.0) || (po > 10000.0))
      {
         powerOutput = 100;
      }
      else
      {
         powerOutput = po;
      }
      
      //checking value of bs to determing if it is in acctable range
      if ((bs < 0) || (bs > 300))
      {
         bladeSpeed = 0;
      }
      else
      {
         bladeSpeed = bs;
      }
      //checking value of o to determine if it is an accetable value
      if ((o.equals("Horizontal")) || (o.equals("Vertical")))
      {
         orientation = "Horizontal";
      }
      else
      {
         orientation = o;
      }
   }
      
      //accessor methods
      public double getPowerOutput()
      {
         return powerOutput;
      }
      
      public int getBladeSpeed()
      {
         return bladeSpeed;
      }
      
      public String getOrientation()
      {
         return orientation;
      }
      
      //mutator methods
      public void setPowerOutput(double po)
      {
         if ((po < 1.0) || (po > 10000.0))
         {
            System.out.println("Not an acceptable value for Power Output: VALUE NOT CHANGED");
         }
         else
         {
            powerOutput = po;
         }
      }
      
      public void setBladeSpeed(int bs)
      {
         if ((bs < 0) || (bs > 300))
         {
            System.out.println("Not an acceptabel value for Blade Speed: VALUE NOT CHANGED");
         }
         else
         {
            bladeSpeed = bs;
         }
      }  
      
      public void setOrientation(String o)
      {
         if ((o.equals("Horizontal")) || (o.equals("Vertical")))
         {
            System.out.println("Not an acceptable value for Orientation: VALUE NOT CHANGED");
         }
         else
         {
            orientation = o;
         }
      
      }

      //toString method to print the informaion of the object
      public String toString()
      {
         String msg;

         msg = "Wind Turbine: Power Output = " + powerOutput + " Blade Speed = " + bladeSpeed + " Orientation = " + orientation;

         return msg;
      }  
}