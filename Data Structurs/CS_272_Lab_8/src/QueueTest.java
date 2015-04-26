
public class QueueTest 
{
	public static void main(String args[])
	{
		//testing Linked queue constructor
		LinkedQueue<Integer> i_lq1 = new LinkedQueue<Integer>();
		
		//testing isEmpty and size method on an empty linked queue
		System.out.println("The current size of the queue is: " + i_lq1.size());
		if(i_lq1.isEmpty())
			System.out.println("The queue is empty!");
		else
			System.out.println("The queueis not empty!");
		
		System.out.println();
		
		//testing the dequeue and peek methods on an empty linked queue
		System.out.println("Testing the dequeue and peek methods on an empty linked queue which will trow an Exception");
		try
		{
			System.out.println("The value in the front of the queue is: " + i_lq1.peek());
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		//testing enqueue, isEmpty and size on linked queue
		i_lq1.enqueue(7);
		System.out.println("The current size of the queue is: " + i_lq1.size());
		if(i_lq1.isEmpty())
			System.out.println("The queue is empty!");
		else
			System.out.println("The queueis not empty!");
		
		System.out.println();
		
		//testing the dequeue and peek methods on a linked queue with one element
		System.out.println("Testing the dequeue and peek methods on a linked queue with one element");
		try
		{
			System.out.println("The value in the front of the queue is: " + i_lq1.peek());
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
			System.out.println("The current size of the queue is: " + i_lq1.size());
			if(i_lq1.isEmpty())
				System.out.println("The queue is empty!");
			else
				System.out.println("The queue is not empty!");
			
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		//adding several items to the linked queue
		System.out.println("Adding 7 to the que");
		i_lq1.enqueue(7);
		System.out.println("The current size of the queue is: " + i_lq1.size());
		System.out.println("Adding 9 to the que");
		i_lq1.enqueue(9);
		System.out.println("The current size of the queue is: " + i_lq1.size());
		System.out.println("Adding 10 to the que");
		i_lq1.enqueue(10);
		System.out.println("The current size of the queue is: " + i_lq1.size());
		System.out.println("Adding 20 to the que");
		i_lq1.enqueue(20);
		System.out.println("The current size of the queue is: " + i_lq1.size());
		if(i_lq1.isEmpty())
			System.out.println("The queue is empty!");
		else
			System.out.println("The queueis not empty!");
		
		System.out.println();
		
		//testing dequeue method
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
			System.out.println("The current size of the queue is: " + i_lq1.size());
			if(i_lq1.isEmpty())
				System.out.println("The queue is empty!");
			else
				System.out.println("The queueis not empty!");
			
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
			System.out.println("The current size of the queue is: " + i_lq1.size());
			if(i_lq1.isEmpty())
				System.out.println("The queue is empty!");
			else
				System.out.println("The queueis not empty!");
			
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
			System.out.println("The current size of the queue is: " + i_lq1.size());
			if(i_lq1.isEmpty())
				System.out.println("The queue is empty!");
			else
				System.out.println("The queueis not empty!");
			
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		try
		{
			Integer i_itemFromQueue = i_lq1.dequeue();
			System.out.println("The item removed from the que was: " + i_itemFromQueue);
			System.out.println("The current size of the queue is: " + i_lq1.size());
			if(i_lq1.isEmpty())
				System.out.println("The queue is empty!");
			else
				System.out.println("The queueis not empty!");
			
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		System.out.println();
		
		
		//Start testing for ArrayQue
		ArrayQueue<Integer> i_aq1 = new ArrayQueue<Integer>();
		
		//testing isEmpty, size, peek and dequeue methods on an empty Array Queue
		System.out.println("Testing isEmpty, size, peek and dequeue methods on an empty Array Queue. peek and dequeue will throw an excpetion");
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
		try
		{
			System.out.println("The item at the front of the que is: " + i_aq1.peek());
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in peek(): " + e.getMessage());
		}
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the queue was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		System.out.println();
		
		i_aq1.enqueue(5);
		System.out.println("After adding 5 to the queue the size is: " + i_aq1.size());
		try
		{
			System.out.println("The value removed for them queue was: " + i_aq1.peek());
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: " + e.getMessage());
		}
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the que was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
		System.out.println();
		System.out.println("Adding 7 to the que");
		i_aq1.enqueue(7);
		System.out.println("The current size of the queue is: " + i_aq1.size());
		System.out.println("Adding 9 to the que");
		i_aq1.enqueue(9);
		System.out.println("The current size of the queue is: " + i_aq1.size());
		System.out.println("Adding 10 to the que");
		i_aq1.enqueue(10);
		System.out.println("The current size of the queue is: " + i_aq1.size());
		System.out.println("Adding 20 to the que");
		i_aq1.enqueue(20);
		System.out.println("The current size of the queue is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is empty!");
		else
			System.out.println("The queueis not empty!");
		
		System.out.println();
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the que was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the que was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the que was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
		
		try
		{
			Integer iaq_itemToRemove = i_aq1.dequeue();
			System.out.println("The item removed from the que was: " + iaq_itemToRemove);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown in dequeue(): " + e.getMessage());
		}
		
		System.out.println("The size of i_aq1 is: " + i_aq1.size());
		if(i_aq1.isEmpty())
			System.out.println("The queue is Empty!");
		else
			System.out.println("The queue is Not Empty!");
	}
}
