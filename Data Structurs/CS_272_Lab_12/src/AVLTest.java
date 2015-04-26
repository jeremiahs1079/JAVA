
public class AVLTest 
{
	public static void main(String args[])
	{
		AVL testAVL1 = new AVL();
		//inserting 20 to new tree
		System.out.println("Inserting 20");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(20);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		//testing countOccurrences with 25 which is not in the tree.
		System.out.println();
		System.out.println("testAVL1 has " + testAVL1.countOccurrences(25) + " occurrences of 25.");
		System.out.println();
		//testing countOccurrences with 20 which is in the tree.
		System.out.println();
		System.out.println("testAVL1 has " + testAVL1.countOccurrences(20) + " occurrences of 20.");
		System.out.println();
		
		
		System.out.println("Inserting 10");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(10);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 15");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(15);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 15");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(15);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 25");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(25);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.print("Printing testAVL1 preOrder without recursion: ");
		testAVL1.preOrderPrtNonRecursive();
		System.out.println();
		
		System.out.println("Inserting 25");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(25);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 25");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(25);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println();
		System.out.println("testAVL1 has " + testAVL1.countOccurrences(25) + " occurrences of 25.");
		System.out.println();
		
		System.out.println("Inserting 30");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(30);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 35");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(35);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 35");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(35);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 40");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(40);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.println("Inserting 45");
		System.out.println("In order Traversal before:");
		testAVL1.inOrderTraversal();
		testAVL1.insert(45);
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		System.out.println("In order Traversal after:");
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		System.out.print("Printing testAVL1 preOrder without recursion: ");
		testAVL1.preOrderPrtNonRecursive();
		System.out.println();
		
		if(testAVL1.remove(25))
			System.out.println("25 was removed");
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		if(testAVL1.remove(25))
			System.out.println("25 was removed");
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		testAVL1.inOrderTraversal();
		System.out.println();
		System.out.println();
		
		if(testAVL1.remove(25))
			System.out.println("25 was removed");
		System.out.println("testAVL1 height is: " + testAVL1.getRoot().getHeight());
		System.out.println();
		testAVL1.inOrderTraversal();
		System.out.println();
		
		System.out.println("" + testAVL1.countOccurrences(15));
		System.out.println();
		System.out.print("Printing testAVL1 preOrder without recursion: ");
		testAVL1.preOrderPrtNonRecursive();
		System.out.println();
		
	}

}
