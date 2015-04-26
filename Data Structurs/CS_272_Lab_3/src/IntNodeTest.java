
public class IntNodeTest 
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
		
		System.out.println(intNode2.toString());
		
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
