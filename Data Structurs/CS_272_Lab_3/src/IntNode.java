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
	 * Recursive Static Method to return the number of Items in the linked list
	 * @param head
	 * Where to start counting from
	 * @return integer
	 * Returns an integer count of the number of elements
	 */
	public static int listLength(IntNode head)
	{
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
		
		this.setNodeLink(newNode);
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