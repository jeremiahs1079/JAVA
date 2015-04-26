
public interface StackInterface<E> 
{
	public boolean isEmpty();
	public E top() throws Exception;
	public E pop() throws Exception;
	public void push(E item);
	public int size();
	
}
