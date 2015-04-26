
import java.util.*;

public class ArraylistStacked<E> implements StackInterface<E> 
{
	//instance variables
	ArrayList<E> arrayList1 = new ArrayList<E>(5);
	
	//constructor
	public ArraylistStacked(E item)
	{
		arrayList1.add(item);
	}

	//interface methods
	@Override
	public boolean isEmpty() 
	{
		return arrayList1.isEmpty();
	}

	@Override
	public E top() throws Exception 
	{
		if(arrayList1.isEmpty())
			throw new Exception("arrayList1 is empty");
		
		return arrayList1.get(arrayList1.size() - 1);
	}

	@Override
	public E pop() throws Exception 
	{
		if(arrayList1.isEmpty())
			throw new Exception("arrayList1 is empty");
		
		E returnValue = arrayList1.get(arrayList1.size() - 1);
		arrayList1.remove(arrayList1.size() - 1);
		return returnValue;
	}

	@Override
	public void push(E item) 
	{
		arrayList1.ensureCapacity(arrayList1.size() + 1);
		arrayList1.add(item);
		
	}

	@Override
	public int size() 
	{
		return arrayList1.size();
	}
	
}
