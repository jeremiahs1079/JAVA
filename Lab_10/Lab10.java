//CS 172
//lab 10 Inheritance Lab10.java
//Written by: Jeremiah Smith
//Dec 2, 2014

public class Lab10
{
   public static void main(String args[])
   {
      printSeperator(40);
      
      //testing class Box and methods
      //declare variables
      Box myBox1 = new Box();
      Box myBox2 = new Box(10,5,2);
      
      //testing myBox1 accessors
      System.out.println("Testing accessor methods myBox1 with default values");
      System.out.println("The current length of myBox1 is: " + myBox1.getLength());
      System.out.println("The current width of myBox1 is: " + myBox1.getWidth());
      System.out.println("The current height of myBox1 is: " + myBox1.getHeight());
      
      //testing myBox1 volume
      System.out.println("With the default values the volume of myBox1 is: " + myBox1.volume());
      
      printSeperator(40);
      
      //testing myBox2 accessors
      System.out.println("Testing accessor methods myBox2 with default values");
      System.out.println("The current length of myBox2 is: " + myBox2.getLength());
      System.out.println("The current width of myBox2 is: " + myBox2.getWidth());
      System.out.println("The current height of myBox2 is: " + myBox2.getHeight());
      
      //testing myBox2 volume
      System.out.println("With the default values the volume of myBox2 is: " + myBox2.volume());
      
      printSeperator(40);
      
      //testing myBox1 mutators
      myBox1.setLength(20.0f);
      myBox1.setWidth(10.0f);
      myBox1.setHeight(6.0f);
      
      //testing myBox2 mutators
      myBox2.setLength(50.0f);
      myBox2.setWidth(15.0f);
      myBox2.setHeight(7.0f);
      
      //testing myBox1 accessors with new values
      System.out.println("Testing accessor methods myBox1 with new values");
      System.out.println("The current length of myBox1 is: " + myBox1.getLength());
      System.out.println("The current width of myBox1 is: " + myBox1.getWidth());
      System.out.println("The current height of myBox1 is: " + myBox1.getHeight());
      
      //testing myBox1 volume with new values
      System.out.println("With the new values the volume of myBox1 is: " + myBox1.volume());
      
      printSeperator(40);
      
      //testing myBox2 accessors with new values
      System.out.println("Testing accessor methods myBox2 with new values");
      System.out.println("The current length of myBox2 is: " + myBox2.getLength());
      System.out.println("The current width of myBox2 is: " + myBox2.getWidth());
      System.out.println("The current height of myBox2 is: " + myBox2.getHeight());
      
      //testing myBox2 volume with new values
      System.out.println("With the new values the volume of myBox2 is: " + myBox2.volume());
      
      printSeperator(40);
      
      //test PackedBox
      //declare variables
      PackedBox myPackedBox1 = new PackedBox();
      PackedBox myPackedBox2 = new PackedBox("Pens", 0.1f, 1.0f, 2.0f, 1.0f);
      
      //testing mypackedBox1 accessors
      System.out.println("Testing accessor methods myPackedBox1 with default values");
      System.out.println("The current contents of myPackedBox1 is: " + myPackedBox1.getContents());
      System.out.println("The current density of myPackedBox1 is: " + myPackedBox1.getDensity());
      System.out.println("The current length of myPackedBox1 is: " + myPackedBox1.getLength());
      System.out.println("The current width of myPackedBox1 is: " + myPackedBox1.getWidth());
      System.out.println("The current height of myPackedBox1 is: " + myPackedBox1.getHeight());
      
      //testing myPackedBox1 volume
      System.out.println("With the default values the volume of myPackedBox1 is: " + myPackedBox1.volume());
      
      //testing myPackedBox1 weight
      System.out.println("With the default values the weight of mypackedBox1 is: " + myPackedBox1.weight());
      
      printSeperator(40);
      
      //testing myPackedBox2 accessors
      System.out.println("Testing accessor methods myPackedBox2 with default values");
      System.out.println("The current contents of myPackedBox2 is: " + myPackedBox2.getContents());
      System.out.println("The current density of myPackedBox2 is: " + myPackedBox2.getDensity());
      System.out.println("The current length of myPackedBox2 is: " + myPackedBox2.getLength());
      System.out.println("The current width of myPackedBox2 is: " + myPackedBox2.getWidth());
      System.out.println("The current height of myPackedBox2 is: " + myPackedBox2.getHeight());
      
      //testing myPackedBox2 volume
      System.out.println("With the default values the volume of myPackedBox2 is: " + myPackedBox2.volume());
      
      //testing myPackedBox2 weight
      System.out.println("With the default vlaues the weight of myPackedBox2 is: " + myPackedBox2.weight());
      
      printSeperator(40);
      
      //testing myPackedBox1 mutators
      myPackedBox1.setContents("Stuffing");
      myPackedBox1.setDensity(5.0f);
      myPackedBox1.setLength(20.0f);
      myPackedBox1.setWidth(10.0f);
      myPackedBox1.setHeight(6.0f);
      
      //testing myPackedBox2 mutators
      myPackedBox2.setContents("Black Friday Returns");
      myPackedBox2.setDensity(10.0f);
      myPackedBox2.setLength(50.0f);
      myPackedBox2.setWidth(15.0f);
      myPackedBox2.setHeight(7.0f);
      
      //testing myPackedBox1 accessors with new values
      System.out.println("Testing accessor methods myPackedBox1 with new values");
      System.out.println("The current contents of myPackedBox1 is: " + myPackedBox1.getContents());
      System.out.println("The current density of myPackedBox1 is: " + myPackedBox1.getDensity());
      System.out.println("The current length of myBox1 is: " + myPackedBox1.getLength());
      System.out.println("The current width of myBox1 is: " + myPackedBox1.getWidth());
      System.out.println("The current height of myBox1 is: " + myPackedBox1.getHeight());
      
      //testing myPackedBox1 volume with new values
      System.out.println("With the new values the volume of myPackedBox1 is: " + myPackedBox1.volume());
      
      //testing myPackedBox1 weight with new values
      System.out.println("With the new values the weight of myPackedBox1 is: " + myPackedBox1.weight());
      
      printSeperator(40);
      
      //testing myPackedBox2 accessors with new values
      System.out.println("Testing accessor methods myPackedBox2 with new values");
      System.out.println("The current contents of myPackedBox2 is: " + myPackedBox2.getContents());
      System.out.println("The current density of myPackedBox2 is: " + myPackedBox2.getDensity());
      System.out.println("The current length of myPackedBox2 is: " + myPackedBox2.getLength());
      System.out.println("The current width of myPackedBox2 is: " + myPackedBox2.getWidth());
      System.out.println("The current height of myPackedBox2 is: " + myPackedBox2.getHeight());
      
      //testing myPackedBox2 volume with new values
      System.out.println("With the new values the volume of myPackedBox2 is: " + myPackedBox2.volume());
      
      //testing myPackedBox weight with new values
      System.out.println("With the new values the weight of myPackedBox2 is: " + myPackedBox2.weight());
      
      printSeperator(40);
      
      
     
   }
   
   public static void printSeperator(int dash)
   {
      System.out.println();
      
      for(int i = 0; i < dash; i++)
         System.out.print('-');
      
      System.out.println();
      System.out.println();
      
   }
}