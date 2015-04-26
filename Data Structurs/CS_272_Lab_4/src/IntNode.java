/**
 * This is the implementation of the singly linked list 
 * @author Jeremiah Smith
 *
 **/

public class IntNode
{
	//instance variables
	private int nodeValue;
	private IntNode nodeLink;
	
	//constructors
	/**
	 * Default Constructor that sets the value of the node to 0
	 * and pointer to the next node
	 */
	public IntNode()
	{
		this.nodeValue = 0;
		this.nodeLink = null;
	}
	
	/**
	 * Constructor that sets the value of data and the nextNode pointer 
	 * @param _data
	 * Number to be stored in the list
	 * @param _node
	 * Pointer to the next value in the list
	 */
	public IntNode(int _data, IntNode _node)
	{
		this.nodeValue = _data;
		this.nodeLink = _node;
	}
	
	//Accessory Methods
	/**
	 * Method to get the value stored in the linked list
	 * @return nodeValue
	 * 
	 */
	public int getNodeValue()
	{
		return this.nodeValue;
	}
	
	/**
	 * Method to get the value of the next node in the list
	 * @return nodeLink
	 */
	public IntNode getNodeLink()
	{
		return this.nodeLink;
	}
	
	//Modification Methods
	/**
	 * Method to set the value stored in the linked list
	 * @param _data
	 * value to be stored in the linked list
	 */
	public void setNodeValue(int _data)
	{
		this.nodeValue = _data;
	}
	/**
	 * Method to set the link of the current node to the next node in the list
	 * @param _node
	 * IntNode parameter to set the current object link variable to
	 */
	public void setNodeLink(IntNode _node)
	{
		this.nodeLink = _node;
	}
	
	//class static methods
	
	/**
	 * Static method to test weather a linked list is cyclic or acyclic
	 * @param head
	 * @return
	 */
	public static boolean hasCycle(IntNode head)
	{
		if(head == null)
			return false;
		
		IntNode fastNode = head, slowNode = head;
		
		while((fastNode != null) && (fastNode.nodeLink !=null))
		{
			slowNode = slowNode.nodeLink;
			fastNode = fastNode.nodeLink.nodeLink;
			
			if(slowNode == fastNode)
				return true;
		}
		
		return false;
	}
	
	/**
	 * Recursive Static Method to return the number of Items in the linked list
	 * @param head
	 * Where to start counting from
	 * @return integer
	 * Returns an integer count of the number of elements
	 */
	public static int listLength(IntNode head)
	{
		if(head == null)
			return 0;
		
		if(head.nodeLink == null)
			return 1;
		
		return 1 + listLength(head.getNodeLink());
	}
	
	/**
	 * Static method to search a linked list for the search value
	 * @precondition
	 * head parameter can not be null
	 * @param head
	 * The starting point of the linked list to search
	 * @param data
	 * The value to search the list for.
	 * @return boolean
	 */
	public static boolean search(IntNode head, int data)
	{
		if(head.nodeLink == null)
			return false;
		
		for(IntNode i = head.nodeLink; i != null; i = i.nodeLink)
			if(i.nodeValue == data)
				return true;
		
		return false;
	}
	
	/**
	 * Static method to return the count of nodes in the list that contain even data
	 * @param head
	 * Parameter for the starting point in the list
	 * @precondition head can not be null
	 * @return
	 * number of nodes that have an even integer stored in the node 
	 */
	public static int listEvenNumbers(IntNode head)
	{
		
		int numberOfEven = 0;
		if(head == null)
			return 0;
		
		for(IntNode i = head; i != null; i = i.nodeLink)
			if(i.nodeValue % 2 == 0)
				numberOfEven++;
		
		return numberOfEven;
		
	}
	
	/**
	 * Static method to return a new list of all the odd values in the parameter list
	 * @param head
	 * list to copy from
	 * @return
	 * List of the odd vale nodes in the parameter
	 */
	public static IntNode copyOdd(IntNode head)
	{
		IntNode returnList = null;
		boolean firstRun = true;
		for(IntNode i = head; i != null; i = i.nodeLink)
			if(i.nodeValue % 2 != 0)
			{
				if(firstRun)
				{
					returnList = new IntNode(i.nodeValue, null);
					firstRun = false;
				}
				else
					returnList.addToEnd(i.nodeValue);
			}
		
		return returnList;
	}
	
	/**
	 * Static Method to sum the last num of nodes in the list
	 * @param head
	 * list to sum
	 * @param num
	 * Parameter that represents the how many nodes from the end to sum.
	 * @precondition
	 * head can not be null
	 * @return
	 * sum of the nodes
	 */
	public static int sumLast(IntNode head, int num)
	{
		if(head == null)
			return 0;
		
		IntNode temp = head;
		int sum = 0;
		int length = IntNode.listLength(head);
		
		
		while(length > num)
		{
			temp = temp.nodeLink;
			length--;
		}
		
		
		for(IntNode j = temp; j!= null; j = j.nodeLink)
			sum = sum + j.nodeValue;
		
		return sum;
		
	}
	
	/**
	 * Static method to remove all instances of the parameter for the provided linked list
	 * @param head
	 * list to remove from
	 * @param dataToRemove
	 * data to be removed
	 * @return
	 * returns a list with the data removed
	 */
	public static IntNode removeAll(IntNode head, int dataToRemove)
	{
		IntNode dummy = head, nextNode = head;
		
		while(nextNode.nodeLink != null)
		{
			if(dummy.nodeValue == dataToRemove)
			{
				dummy = dummy.nodeLink;
				nextNode = nextNode.nodeLink;
			}
			else
			{
				nextNode = nextNode.nodeLink;
			}
			if(nextNode.nodeLink.nodeValue == dataToRemove)
				nextNode.removeNodeAfterThis();
		}
		
		return dummy;
	}
	
	/**
	 * Static Method to reverse the linked list
	 * @param head
	 * List to reverse
	 * @return
	 * IntNode that is the reversed version on the head parameter
	 */
	public static IntNode reverse(IntNode head)
	{
		IntNode currentNode, nextNode, prevNode;
		
		prevNode = null;
		nextNode = null;
		currentNode = head;
		
		while(currentNode != null)
		{
			nextNode = currentNode.nodeLink;
			currentNode.nodeLink = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
	
	//class methods
	/**
	 * Recursive Method to print the values in the linked list starting 
	 * from the calling object.
	 */
	public String toString()
	{
		if(this.getNodeLink() == null)
			return "" + this.nodeValue;
			
		
		return  this.nodeValue + "->" +  this.nodeLink.toString();
	}
	
	/**
	 * Method to add a node after the calling object in the linked list
	 * @param _data
	 * interger to add
	 */
	public void addNodeAfterThis(int _data)
	{
		IntNode newNode = new IntNode(_data, this.getNodeLink());
		
		this.nodeLink = newNode;
	}
	/**
	 * Method to add the parameter to the end of the list
	 * @param newData
	 * data to be added to the end of the list
	 */
	public void addToEnd(int newData)
	{
		for(IntNode i = this; i != null; i = i.nodeLink)
			if(i.nodeLink == null)
			{
				i.addNodeAfterThis(newData);
				return;
			}
	}
	
	/**
	 * Method to remove the node directly after the current node.
	 */
	public void removeNodeAfterThis()
	{
		if(this.nodeLink == null)
			return;
		
		this.nodeLink = this.nodeLink.nodeLink;
	}
}