
public class LinkedStack<E> implements StackInterface<E>
{
	//member variables
	private SNode<E> sNode;
	
	//constructor
	/**
	 * Constructor for LinkedStack
	 * @param _data
	 * data to initialize the list with
	 */
	public LinkedStack(E _data)
	{
		sNode = new SNode<E>(_data);
	}

	//interface functions
	@Override
	public boolean isEmpty() 
	{	
		return (sNode == null);
	}
	
	/**
	 * Method to view the data of the top element in the stack
	 * @precondition sNode can not be null
	 * @throws NullPointerException
	 * Will throw a NullPointerException if sNode is null
	 */
	@Override
	public E top() 
	{
		if(sNode == null)
			throw new NullPointerException("sNode is null");
		
		return sNode.getData();
	}
	
	/**
	 * Method to add a SNode to the stack
	 * @precondition sNode can not be null
	 * @throws NullPointerException
	 * Throws NullPointException if sNode is null
	 */
	@Override
	public E pop() {
		
		if(sNode == null)
			throw new NullPointerException("sNode is null");
		
		E returnData;
		returnData = sNode.getData();
		sNode = sNode.getLink();
		return returnData;
	}

	@Override
	public void push(E item) 
	{
		if(sNode == null)
			sNode = new SNode<E>(item);
		else
		{
			SNode<E> newNode = new SNode<E>(item);
			newNode.setLink(sNode);
			sNode = newNode;
		}
	}

	@Override
	public int size() 
	{
		SNode<E> cursor = sNode;
		int count = 0;
		while(cursor != null)
		{
			count++;
			cursor = cursor.getLink();
		}
		return count;
	}
}
