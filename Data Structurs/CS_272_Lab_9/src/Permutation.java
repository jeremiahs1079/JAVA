
public class Permutation 
{
	public static void main(String args[])
	{
		int[] testArray = {1,2,3};
		int[] testArray2 = {1,2,3,4,5};
		int[] testArray3 = {1,2};
		int[] testArray4 = {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println("Testing permutate with an int array of 3 value 1,2,3");
		permutate(testArray, 0);
		System.out.println();
		System.out.println("Testing permutate with an int array of 5 value 1,2,3,4,5");
		permutate(testArray2, 0);
		System.out.println();
		System.out.println("Testing permutate with an int array of 2 value 1,2");
		permutate(testArray3, 0);
		System.out.println();
		System.out.println("Testing permutae with an int array of 10 value 1,2,3,4,5,6,7,8,9,10");
		permutate(testArray4, 0);
		System.out.println();
		
	}

	public static void permutate(int[] array, int prefix)
	{
		if(prefix == array.length -1)
		{
			for( int i = 0; i < array.length; i++)
				System.out.print(array[i] + " ");
			
			System.out.println();
		}
		
		for(int i = prefix; i < array.length; i++)
		{
			swap(array, i, prefix);
			permutate(array, prefix + 1);
			swap(array, i, prefix);
			
		}
	}
	
	/**
	 * Method to handle the swapping of two elements of an array
	 * @param array
	 * the array containing the elements that need to be swapped
	 * @param swapTo
	 * Position to swap to
	 * @param swapFrom
	 * position to swap from
	 */
	public static void swap(int[] array, int swapTo, int swapFrom)
	{
		int temp = array[swapTo];
		array[swapTo] = array[swapFrom];
		array[swapFrom] = temp;
	}
}
