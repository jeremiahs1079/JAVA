
public interface QueueInterface<E> 
{
	
	public void enqueue(E _element);
	public E dequeue() throws Exception;
	public E peek() throws Exception;
	public int size();
	public boolean isEmpty();

}
