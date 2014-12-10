//CS 172
//Lab 8 Lab8.java
//Written by: Jeremiah Smith
//Nov 4, 2014


public class Lab8
{

   
   public static void main(String args[])
   {
      //declare variables
      int [] array = new int[200];
      int [] array2 = new int[200];
      int [] array3 = new int[200];
      int indexFoundAt;
      
      //inilize the array
      for(int i = 0; i < array.length; i++)
         array[i] = (int)(Math.random() * (1001));
         
      //inilize the array2
      for(int i = 0; i < array2.length; i++)
         array2[i] = (int)(Math.random() * (1001));
      
      //inilize the array3
      for(int i = 0; i < array3.length; i++)
         array3[i] = (int)(Math.random() * (1001));
      
      //print array
      System.out.println("Printing Array");
      printIntArray(array);
      
      System.out.println();
      
      //use linerSearch to search 30
      System.out.println("Searching Array for value 30 with linerSearch");
      if(linearSearch(array, 30))
         System.out.println("The value 30 was found in the array");
      else
         System.out.println("The value 30 was not found in the array");
         
      //use linerSearch to search 86
      System.out.println("Searching Array for value 86 with linerSearch");  
      if(linearSearch(array, 86))
         System.out.println("The value 86 was found in the array");
      else
         System.out.println("The value 86 was not found in the array");
         
      //use linerSearch to search 87 
      System.out.println("Searching Array for value 87 with linerSearch"); 
      if(linearSearch(array, 87))
         System.out.println("The value 87 was found in the array");
      else
         System.out.println("The value 87 was not found in the array");
         
      System.out.println();
      
      //use linerSearch2 to search 25
      System.out.println("Searching Array for value 25 with linerSearch2");
      indexFoundAt = linearSearch2(array, 25);
      if(indexFoundAt > -1)
         System.out.println("The value 25 was found in the array at index: " + indexFoundAt);
      else
         System.out.println("The value 25 was not found in the array");
         
      //use linerSearch2 to search 80 
      System.out.println("Searching Array for value 80 with linerSearch2"); 
      indexFoundAt = linearSearch2(array, 80);
      if(indexFoundAt > -1)
         System.out.println("The value 80 was found in the array at index: " + indexFoundAt);
      else
         System.out.println("The value 80 was not found in the array");
         
      //use linerSearch2 to search 91  
      System.out.println("Searching Array for value 91 with linerSearch2");
      indexFoundAt = linearSearch2(array, 91);
      if(indexFoundAt > -1)
         System.out.println("The value 91 was found in the array at index: " + indexFoundAt);
      else
         System.out.println("The value 91 was not found in the array");
         
      System.out.println();
      
      //sort array using bubbleSort and reprint
      System.out.println("Sorting with bubbleSort and printing array");
      bubbleSort(array);
      printIntArray(array);
      
      System.out.println();
      
      //using binary search to find values 11, 28, 74 and 99
      
      //use binarySearch to search 11
      System.out.println("Searching Array for value 11 with binarySearch");
      if(binarySearch(array, 11))
         System.out.println("The value 11 was found in the array");
      else
         System.out.println("The value 11 was not found in the array");
         
      System.out.println();
         
      //use binarySearch to search 28
      System.out.println("Searching Array for value 28 with binarySearch");  
      if(binarySearch(array, 28))
         System.out.println("The value 28 was found in the array");
      else
         System.out.println("The value 28 was not found in the array");
         
      System.out.println();
         
      //use binarySearch to search 74 
      System.out.println("Searching Array for value 74 with binarySearch"); 
      if(binarySearch(array, 74))
         System.out.println("The value 74 was found in the array");
      else
         System.out.println("The value 74 was not found in the array");
         
      System.out.println();
         
      //use binarySearch to search 99 
      System.out.println("Searching Array for value 99 with binarySearch"); 
      if(binarySearch(array, 99))
         System.out.println("The value 99 was found in the array");
      else
         System.out.println("The value 99 was not found in the array");
         
      System.out.println();
      
      //priting array2
      printIntArray(array2);
      System.out.println();
      
      //sort array2 with selectionSort and reprint
      selectionSort(array2);
      printIntArray(array2);
      
      System.out.println();
      
      //priting array3
      printIntArray(array3);
      System.out.println();
      
      //sort array3 with insertionSort and reprint
      insertionSort(array3);
      printIntArray(array3);
      
      System.out.println();
      
      
      
         
   }//end main
   
   public static boolean linearSearch(int[] array, int key)
   {
      for(int i = 0; i < array.length; i++)
         if(array[i] == key)
            return true;
            
      return false;
   }//end linearSearch
   
   public static int linearSearch2(int[] array, int key)
   {
      for(int i = 0; i < array.length; i++)
         if(array[i] == key)
            return i;
            
      return -1;
   }//end linearSearch2
   
   public static boolean binarySearch(int[] array, int key)
   {
      int mid, start = 0, end = array.length - 1;
      
      while(start <= end)
      {
         mid = (start + end)/2;
         
         if(array[mid] == key)
            return true;
         else if(key < array[mid])
            end = mid - 1;
         else if(key > array[mid])
            start = mid + 1;
      }
      
      return false;
   }//end binarySearch
   
   public static void bubbleSort(int[] array)
   {
      int temp;
      
      for(int i = array.length - 2; i >= 0; i--)
         for( int j = 0; j <= i; j++)
            {
               if(array[j] > array[j + 1])
               {
                  temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
               }
               
            }
   }//end bubbleSort
   
   public static void selectionSort(int[] array)
   {
      int smallestPosition = 0, temp = 0;
      
      for(int i = 0; i <= array.length -2; i++)
      {
         smallestPosition = i;
         
         for( int j = i + 1; j <= array.length - 1; j++)
            if(array[j] < array[smallestPosition])
               smallestPosition = j;
         
         temp = array[i];
         array[i] = array[smallestPosition];
         array[smallestPosition] = temp;
      }
   }//end selection sort
   
   public static void insertionSort(int[] array)
   {
      int pos, temp;
      
      for(int i = 2; i <= array.length; i++)
      {
         pos = i - 1;
         while(pos > 0 && array[pos - 1] > array[pos])
         {
            temp = array[pos];
            array[pos] = array[pos -1];
            array[pos - 1] = temp;
            pos--;
         }
      }
   
   }//end insertionSort
   
   public static void printIntArray(int[] array)
   {
      for(int i = 0; i < array.length; i += 10)
      {
         if(array.length - i > 10)
            for(int j = 0; j < 10; j++)
               System.out.print(array[i + j] + " ");
         else
            for(int j = i; j < array.length; j++)
               System.out.print(array[j] + " ");
            
         System.out.println();
      }
   
   }//end printArray
}