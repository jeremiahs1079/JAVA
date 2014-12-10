//CS 172
//lab 10 Inheritance PackedBox.java
//Written by: Jeremiah Smith
//Dec 2, 2014

public class PackedBox extends Box
{
   //instance variables
   private String contents;
   private float density;
   
   //default constructor
   public PackedBox()
   {
      super();
      setContents("Paper");
      setDensity(20.0f);
   }
   
   //constructor
   public PackedBox(String c, float d, float l, float w, float h)
   {
      super(l,w,h);
      setContents(c);
      setDensity(d);
   }
   
   //accessor methods
   public String getContents()
   {
      return contents;
   }//end getContents
   
   public float getDensity()
   {
      return density;
   }//end getDensity
   
   //mutator methods
   public void setContents(String c)
   {
      if( c != "")
         contents = c;
   }//end setContents
   
   public void setDensity(float d)
   {
      if(d > 0)
         density = d;
   }//end setDensity
   
   public float weight()
   {
      return this.getLength() * this. getWidth() * this.getHeight() * this.getDensity();
   }//end weight
}