
public class DoublyLinkedListDummy 
{
	//instance variables
	DIntNode head, tail;
	
	//constructor
	/**
	 * No argument constructor that creates the head and tail nodes and links them together
	 */
	public DoublyLinkedListDummy()
	{
		head = new DIntNode();
		tail = new DIntNode();
		
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	//accessory methods
	public DIntNode getHead(){return this.head;}
	public DIntNode getTail(){return this.tail;}
	
	//modification methods
	public void setHead(DIntNode newHead)
	{
		newHead.setNext(head.getNext());
		head = newHead;
		
	}
	
	public void setTail(DIntNode newTail)
	{
		newTail.setPrev(tail.getPrev());
		tail = newTail;
	}
	

	//class methods
	/**
	 * Method to print the data stored in the Doubly Linked List
	 */
	public String toString()
	{
		String returnString = "";
		
		DIntNode cursor = this.head.getNext();
		
		while(cursor.getNext() != null)
		{
			if(cursor.getNext().getNext() == null)
			{
				returnString += cursor.getData();
			}
			else
			{
				returnString += cursor.getData() + "<->";
			}
			cursor = cursor.getNext();
		}
		
		returnString += "\n";
		
		cursor = this.tail.getPrev();
		
		while(cursor.getPrev() != null)
		{
			if(cursor.getPrev().getPrev() == null)
				returnString += cursor.getData();
			else
				returnString += cursor.getData() + "<->";
			
			cursor = cursor.getPrev();
		}
		
		
		return returnString;
	}
	/**
	 * method to add a new node to the list
	 * @param element
	 * integer to add to the list
	 */
	public void addEnd(int element)
	{
		DIntNode nodeToAdd = new DIntNode(element);
		
		//setting nodeToAdd's next and previous
		nodeToAdd.setNext(tail);
		nodeToAdd.setPrev(tail.getPrev());
		
		//set tails previous node's next node to nodeToAdd
		tail.getPrev().setNext(nodeToAdd);
		
		//set tails prev to nodeToAdd
		tail.setPrev(nodeToAdd);
		
	}
	
	/**
	 * method to remove the first actual node from the list
	 * this method has 9 operations so the Big O is O(9) or a constant complexity
	 * @precondition
	 * list can not be empty
	 * 
	 */
	public void removeFromHead()
	{
		//test to see if this is an empty list
		if(head.getNext() == tail)
			return;
		//set heads node after next prev to head
		head.getNext().getNext().setPrev(head);
		
		//set heads next to node after next
		head.setNext(head.getNext().getNext());
	}
	
	/**
	 * Method to count the occurrences of the parameter that exist in the list
	 * The BigO of this method is O(n)
	 * @param e
	 * integer to search for
	 * @return
	 * count of the number of times the parameter exists in the list
	 */
	public int coutOccurrences(int e)
	{
		int count = 0;
		
		DIntNode cursor = head.getNext();
		
		while(cursor.getNext() != null)
		{
			if(cursor.getData() == e)
				count++;
			
			cursor = cursor.getNext();
		}
		
		return count;
	}
	
	/**
	 * Method to remove all the instances of the integer parameter.
	 * The BigO of this method is O(n)
	 * @param e
	 * Integer parameter to be removed
	 * @precondition 
	 * List can not be an empty list
	 */
	public void removeAll(int e)
	{
		if(this.head.getNext() == tail)
			return;
		
		DIntNode cursor = head.getNext();
		
		while(cursor.getNext() != null)
		{
			if(cursor.getData() == e)
			{
				cursor.getNext().setPrev(cursor.getPrev());
				cursor.getPrev().setNext(cursor.getNext());
			}
			cursor = cursor.getNext();
		}
	}
	
	/**
	 * Method to return a sublist of a doubly liked list.
	 * The BigO of this method is O(n)
	 * @param beginIdx
	 * index to start with
	 * @param endIdx
	 * index to end with
	 * @return
	 * doubly linked list that is a sublist
	 */
	public DoublyLinkedListDummy subList(int beginIdx, int endIdx)
	{
		if(beginIdx < 0)
			return null;
		
		if(beginIdx > endIdx)
			return null;
		
		if(this.size() < beginIdx)
			return null;
		
		DIntNode newHead = new DIntNode(), newTail = new DIntNode();
		int count = 0;
		
		DIntNode cursor = this.head.getNext();
		DoublyLinkedListDummy returnDLL = new DoublyLinkedListDummy();
		
		while(cursor.getNext() != null)
		{
			if(count == beginIdx)
			{
				newHead = cursor;
				break;
			}
				
			
			count++;
			cursor = cursor.getNext();
		}
		
		if(endIdx > this.size())
			newTail = tail;
		else
		{
			cursor = head.getNext();
			count = 0;
			while(cursor.getNext() != null)
			{
				if(count == endIdx)
				{
					newTail = cursor;
					break;
				}
					
				count++;
				cursor = cursor.getNext();
			}		
		}
		
		cursor = newHead;
		
		while(cursor != newTail)
		{
			returnDLL.addEnd(cursor.getData());
			cursor = cursor.getNext();
		}
		
		return returnDLL;
		
	}
	
	/**
	 * Method to get the size of the list 
	 * @return
	 * The number of actual nodes in the list
	 */
	public int size()
	{
		if(this.head.getNext() == tail)
			return 0;
		
		int size = 0;
		
		DIntNode cursor = head.getNext();
		
		while(cursor.getNext() != null)
		{
			size++;
			cursor = cursor.getNext();
		}
		return size;
	}
}
