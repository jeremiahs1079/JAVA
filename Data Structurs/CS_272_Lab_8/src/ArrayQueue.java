import java.util.Arrays;

public class ArrayQueue<E> implements QueueInterface<E> 
{
	private int front;
	private int rear;
	private int size;
	private Object[] obj;

	public ArrayQueue()
	{
		size = 0;
		front = 0;
		rear = 0;
		obj = new Object[5];
	}
	
	private void ensureCapacity(int minimumCapacity)
	{
		if(minimumCapacity <= 0)
			throw new IllegalArgumentException("minimumCapacity is less then or equal to 0");
		
		if(obj.length < minimumCapacity)
		{
			Object[] temp = Arrays.copyOf(obj, minimumCapacity * 2);
			
			
			this.obj = temp;
		}
	}
	
	@Override
	public void enqueue(E _element) {
		this.ensureCapacity(size + 1);
		
		obj[rear] = _element;
		rear++;
		size++;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() throws Exception {
		if(front == rear)
			throw new Exception("Queue is empty");
		
		E returnItem = (E)obj[front];
		front++;
		size--;
		// TODO Auto-generated method stub
		return returnItem;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() throws Exception {
		if(front == rear)
			throw new Exception("Queue is empty!");

		return (E) obj[front];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
}
