//CS 172
//lab 10 Inheritance Box.java
//Written by: Jeremiah Smith
//Dec 2, 2014

public class Box
{
   //instance variables
   private float length;
   private float width;
   private float height;
   
   //default constructor
   public Box()
   {
      this.setLength(1.0f);
      this.setWidth(1.0f);
      this.setHeight(1.0f);
   }//end default constructor
   
   //constructor
   public Box(float l, float w, float h)
   {
      this.setLength(l);
      this.setWidth(w);
      this.setHeight(h);
   }//end constructor
   
   //accessor methods
   public float getLength()
   {
      return length;
   }//end getLength
   
   public float getWidth()
   {
      return width;
   }//end getWidth
   
   public float getHeight()
   {
      return height;
   }//end getHeight
   
   //mutator methods
   public void setLength(float l)
   {
      if(l > 0)
         length = l;
   }//end setlength
   
   public void setWidth(float w)
   {
      if(w > 0)
         width = w;
   }//end setWidth
   
   public void setHeight(float h)
   {
      if(h > 0)
         height = h;
   }//end setHeight
   
   public float volume()
   {
      return this.getLength() * this.getWidth() * this.getHeight();
   }//end volume 
}//end class