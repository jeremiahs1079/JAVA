
public class IntNodeAdvancedTest 
{
	public static void main(String args[])
	{
		//testing constructors
		IntNode intNode1 = new IntNode(5, null);
		IntNode intNode2 = new IntNode(6, intNode1);
		IntNode intNode3 = new IntNode();
		IntNode intNode4 = new IntNode();
		
		//testing get and set methods
		System.out.println("The current value stored in intNode4 data variable is: " + intNode4.getNodeValue());
		intNode4.setNodeValue(10);
		System.out.println("The current value stored in intNode4 data variable after changing it to 10 is: " + intNode4.getNodeValue());
		System.out.println();
		
		System.out.println("The current value in intNode4 link variable is: " + intNode4.getNodeLink());
		System.out.println("Setting intNode4 to link to intNode2");
		System.out.println("intNode4's toString method before setting intNode4 to link to intNode2: " + intNode4.toString());
		intNode4.setNodeLink(intNode2);
		System.out.println("intNode4's toString method after setting intNode4 to link to intNode2: " + intNode4.toString());
		System.out.println();
		
		//testing IntNode.listLength
		System.out.println("The current number of nodes in intNode1: " + IntNode.listLength(intNode1));
		System.out.println("The current number of nodes in intNode2: " + IntNode.listLength(intNode2));
		System.out.println("The current number of nodes in intNode3: " + IntNode.listLength(intNode3));
		System.out.println();
		
		//testing toString method
		System.out.println("The current contents of intNode1 is: " + intNode1.toString());
		System.out.println("The current contents of intNode2 is: " + intNode2.toString());
		System.out.println("The current contents of intNode3 is: " + intNode3.toString());
		System.out.println();
		
		//testing addNodeAfterThis method
		System.out.println("The contents of intNode2 beofre the addNodeAfterThis method is: " + intNode2.toString());
		System.out.println("The current number of links in intNode2 before adding 10 is: " + IntNode.listLength(intNode2));
		intNode2.addNodeAfterThis(10);
		System.out.println("The contents of intNode2 after the addNodeAfterThis method to add 10 is: " + intNode2.toString());
		System.out.println("The current number of links in intNode2 after adding 10 is: " + IntNode.listLength(intNode2));
		System.out.println();
		
		
		intNode1.addNodeAfterThis(20);
		System.out.println(Integer.toString(IntNode.listLength(intNode1)));
		System.out.println(intNode1.toString());
		System.out.println(Integer.toString(IntNode.listLength(intNode2)));
		System.out.println(intNode2.toString());
		
		intNode2.removeNodeAfterThis();
		
		System.out.println(intNode2);
		System.out.println();
		
		//Testing method addToEnd
		System.out.println("Testing method addToEnd for intNode2 to add 50 to the end.");
		System.out.println("List before addToEnd method is: " + intNode2);
		intNode2.addToEnd(50);
		System.out.println("List after addToEnd method is: " + intNode2);
		System.out.println();
		
		//testing IntNode.listEvenNumbers
		System.out.println("Testing IntNode.listEvennumbers");
		System.out.println("The number of even integers stored in intNode2 is: " + IntNode.listEvenNumbers(intNode2));
		System.out.println();
		
		//testing IntNode.reverse
		System.out.println("Testing Intnode.reverse with intNode2");
		System.out.println("Before Reversing intNode2 are: " + intNode2);
		intNode2 = IntNode.reverse(intNode2);
		System.out.println(intNode2);
		System.out.println("After reversing intNode2: " + intNode2);
		System.out.println();
		
		//testing IntNode.removeAll
		System.out.println("intNode2 before removing all 6: " + intNode2);
		intNode2 = IntNode.removeAll(intNode2, 6);
		System.out.println("intNode2 after removing all 6: " + intNode2);
		System.out.println();
		IntNode intNode5 = new IntNode(2,null);
		intNode5.addNodeAfterThis(30);
		intNode5.addToEnd(2);
		intNode5.addNodeAfterThis(50);
		System.out.println("Created intNode5 with the following data: " + intNode5);
		System.out.println("Calling IntNode.removeAll on intNode5 to remove all instances of 2 from the list.");
		intNode5 = IntNode.removeAll(intNode5, 2);
		System.out.println("Data stored in intNode5 after call to IntNode.removeAll to remove all instance of 2 is: " + intNode5);
		System.out.println();
		
		//Testing IntNode.sumlast()
		System.out.println("Testing IntNode.sumLast");
		int total = IntNode.sumLast(intNode2, 2);
		System.out.println("Total: " + total );
		total = IntNode.sumLast(intNode2, 3);
		System.out.println("Total: " + total );
		total = IntNode.sumLast(intNode2, 5);
		System.out.println("Total: " + total );
		
		//testing IntNode.coppyOdd
		System.out.println("The current values stored in intNode2 are: " + intNode2);
		IntNode intNode6 = IntNode.copyOdd(intNode2);
		System.out.println("After copping the odd values in intNode2 to intNode6 the values in intNode6 are: " + intNode6);
		System.out.println();
		
		//testing IntNode.hasCycle
		System.out.println("Testing IntNode.hasCycle on intNode2");
		if(IntNode.hasCycle(intNode2))
			System.out.println("intNode2 has a cycle");
		else
			System.out.println("intNode2 does not have a cycle");
		
		System.out.println();
		
		
		//creating a new list that has a cycle to test IntNode.hasCycle
		System.out.println("Creating intNode10 and setting it to have a cycle for testing");
		IntNode intNode10 = new IntNode(2, null);
		intNode10.addToEnd(10);
		intNode10.addToEnd(20);
		
		intNode10.getNodeLink().getNodeLink().setNodeLink(intNode10);
		
		System.out.println("Testing IntNode.hasCycle on intNode10 which has a cycle");
		if(IntNode.hasCycle(intNode10))
			System.out.println("intNode10 has a cycle");
		else
			System.out.println("intNode10 does not have a cycle");
		
		System.out.println("As suspected intNode10 does have a cycle");
		System.out.println();
		
		System.out.println("Creating intNode11 and setting it to have a cycle for testing");
		IntNode intNode11 = new IntNode(2, null);
		intNode11.addToEnd(10);
		intNode11.addToEnd(20);
		intNode11.addToEnd(30);
		intNode11.addToEnd(10);
		
		//creating a cycle in intNode11
		intNode11.getNodeLink().getNodeLink().getNodeLink().getNodeLink().setNodeLink(intNode11.getNodeLink().getNodeLink());
		
		System.out.println("Testing IntNode.hasCycle on intNode11 which has a cycle");
		if(IntNode.hasCycle(intNode11))
			System.out.println("intNode11 has a cycle");
		else
			System.out.println("intNode11 does not have a cycle");
		
		System.out.println("As suspected intNode11 does have a cycle");
		System.out.println();
		
		//testing IntNode.search static method
		if(IntNode.search(intNode2, 5))
			System.out.println("The Value 5 was found in intNode2");
		else
			System.out.println("The Value 5 was not found in intNode2");
		
		if(IntNode.search(intNode2, 30))
			System.out.println("The Value 30 was found in intNode2");
		else
			System.out.println("The Value 30 was not found in intNode2");
	}
}
