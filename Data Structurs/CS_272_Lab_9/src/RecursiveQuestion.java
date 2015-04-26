
public class RecursiveQuestion 
{
	public static void main(String args[])
	{
		//testing FibBinaryRecursive
		//testing k > 1
		System.out.println("Testing the method FibBinaryRecrusive with 10");
		System.out.println("FibBinaryRecursive 10 result is: " + FibBinaryRecursive(10));
		System.out.println();
		//testing k == 20
		System.out.println("Testing the method FibBinaryRecrusive with 20");
		System.out.println("FibBinaryRecursive 20 result is: " + FibBinaryRecursive(20));
		System.out.println();
		//testing k == 1
		System.out.println("Testing the method FibBinaryRecrusive with base case 1");
		System.out.println("FibBinaryRecursive 1 result is: " + FibBinaryRecursive(1));
		System.out.println();
		//testing k == 0
		System.out.println("Testing the method FibBinaryRecrusive with base case 0");
		System.out.println("FibBinaryRecursive 0 result is: " + FibBinaryRecursive(0));
		System.out.println();
		//testing with error case K < 0
		System.out.println("Testing the method FibBinaryRecrusive with error case -10");
		System.out.println("FibBinaryRecursive -10 result is: " + FibBinaryRecursive(-10));
		System.out.println();
		
		//testing towers of hanoi method
		System.out.println("Testing towers of hanoi method moving 4 disks from peg 1 to peg 3");
		System.out.println(hanoi(4, 1, 3));
		System.out.println();
		
		//testing showCallLevel
		System.out.println("Testing showCallLevel with 4,1 as parameters");
		System.out.println();
		System.out.println(showCallLevel(4,1));
		System.out.println();
		
		System.out.println("Testing showCallLevel with 8,1 as parameters");
		System.out.println();
		System.out.println(showCallLevel(8,1));
		System.out.println();
		
		System.out.println("Testing showCallLevel with 4,1 as parameters");
		System.out.println();
		System.out.println(showCallLevel(4,1));
		System.out.println();
		
		System.out.print("The number 4 in binary is: ");
		binaryPrint(4);
		System.out.println();
		
		System.out.print("The number 27 in binary is: ");
		binaryPrint(27);
		System.out.println();
		
		System.out.print("The number 46 in binary is: ");
		binaryPrint(46);
		System.out.println();
		
		System.out.print("The number 11 in binary is: ");
		binaryPrint(11);
		System.out.println();
		
		System.out.println();
		System.out.println("Testing pattern method with 8");
		System.out.println();
		pattern(8,0);
		System.out.println();
		
		System.out.println("Testing pattern method with 10");
		System.out.println();
		pattern(10,0);
		System.out.println();
		
		System.out.println("Testing pattern method with 6");
		System.out.println();
		pattern(6,0);
		System.out.println();
		
		System.out.println("Testing pattern method with 2");
		System.out.println();
		pattern(2,0);
		System.out.println();
		
	}
	
	public static int FibBinaryRecursive(int k)
	{
		//error case
		if( k < 0)
			return 0;
		
		//base case n == 1
		if (k == 1)
			return 1;
		//base case n == 0
		if (k == 0)
			return 0;
		
		return FibBinaryRecursive(k - 1) + FibBinaryRecursive(k - 2);
	}
	
	public static String hanoi(int nDisks, int fromPeg, int toPeg)
	{
		int helpPeg;
		
		//base case if n == 1 then move disk fromPeg to toPeg
		if(nDisks == 1)
			return "Move disk from " + fromPeg + " to " + toPeg + "\n";
		helpPeg = 6 - fromPeg - toPeg;
		
		return hanoi(nDisks - 1, fromPeg, helpPeg) + "Move disk from " + fromPeg + " to " + toPeg + "\n" + hanoi(nDisks - 1, helpPeg, toPeg);
	}
	
	public static String showCallLevel(int l, int curl)
	{
		String rS = "", spaces = "";
		
		for(int i = 0; i < curl; i++)
			spaces += " ";
		
		if(l == 1)
		{
			rS += spaces + "This was written by call number " + curl + "x\n" + spaces + "This was written by call number " + curl + "y\n";
			return rS;
		}
		
		
		rS += spaces + "This was written by call number " + curl + "x\n" + showCallLevel(l - 1, curl + 1) + spaces + "This was written by call number " + curl + "y\n";
		
		return rS;
	}
	
	public static void binaryPrint(int n)
	{
		if(n > 0)
		{
			binaryPrint(n/2);
			System.out.print(n%2 + "");
		}
	}
	
	public static void pattern(int stars, int col)
	{
		if(stars == 1)
		{
			for(int i = 0; i < col; i++)
				System.out.print(" ");
			
			System.out.print("*");
		}
		else
		{
			pattern(stars/2, col);
			
			System.out.println();
			
			for(int j = 0; j < col; j++)
				System.out.print(" ");
			
			for(int k = 0; k< stars; k++)
				System.out.print("*");
			
			System.out.println();
			
			pattern(stars/2, stars/2 + col);
		}
				
		
	}
}
