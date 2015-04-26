
public class LinkedQueue <E> implements QueueInterface<E> 
{
	private SNode<E> head;
	private SNode<E> tail;
	private int size;
	
	public LinkedQueue()
	{
		head = new SNode<E>();
		tail = new SNode<E>();
		size = 0;
		head.setLink(tail);
		tail.setLink(head);
		
	}
	
	@Override
	public void enqueue(E _element) {
		SNode<E> nodeToAdd = new SNode<E>(_element);
		
		tail.getLink().setLink(nodeToAdd);
		nodeToAdd.setLink(tail);
		tail.setLink(nodeToAdd);
		size++;
	}
	
	@Override
	public E dequeue() throws Exception{
		if(head.getLink() == tail)
			throw new Exception("Queue is empty!");
		
		E returnItem = head.getLink().getData();
		
		
			
		head.setLink(head.getLink().getLink());
		if(head.getLink() == tail)
			tail.setLink(head);
		
		size--;
		return returnItem;
	}
	
	@Override
	public E peek() throws Exception {
		if(head.getLink() == tail)
			throw new Exception("Queue is empty!");
		
		return head.getLink().getData();
	}
	@Override
	public int size() {

		return size;
	}
	
	@Override
	public boolean isEmpty() {
		
		return (head.getLink() == tail);
	}
	
	
	
}
