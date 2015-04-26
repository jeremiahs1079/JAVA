
public class StackTest 
{
	public static void main(String args[])
	{
		//begin testing LinkedStack
		System.out.println("****Begin testing LinkedStack****");
		//testing constructor for LinkedStack with Integer type
		LinkedStack<Integer> i_ls1 = new LinkedStack<Integer>(1);
		
		//Testing top, size and isEmpty methods on a Linked Stack with one element
		System.out.println("Testing top, size and isEmpty methods on a Linked Stack with one element.");
		try
		{
			System.out.println("The top value stroed in the stack i_ls1 is: " + i_ls1.top());
			System.out.println("The size of the i_ls1 stack is: " + i_ls1.size());
			if(i_ls1.isEmpty())
				System.out.println("i_ls1 is empty");
			else
				System.out.println("i_ls1 in not empty");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing push method
		System.out.println();
		i_ls1.push(5);
		System.out.println("Testing top method on a Linked Stack with two element.");
		try
		{
			System.out.println("The top value stroed in the stack i_ls1 is: " + i_ls1.top());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on i_lst1
		System.out.println();
		System.out.println("Testing pop method on i_lst1");
		
		try
		{
			Integer popedValue = i_ls1.pop();
			System.out.println("the Value poped of the stack was " + popedValue);
			System.out.println("The top value stroed in the stack i_ls1 after pop method is: " + i_ls1.top());
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on i_lst1
		System.out.println();
		System.out.println("Testing pop method on i_lst1 after pop method the top method will throw NullPointerException");
		
		try
		{
			Integer popedValue = i_ls1.pop();
			System.out.println("the Value poped of the stack was " + popedValue);
			System.out.println("The top value stroed in the stack i_ls1 after pop method is: " + i_ls1.top());
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on i_lst1
		System.out.println();
		System.out.println("Testing pop method on i_lst1 which is empty and will throw NullPointerException");
		
		try
		{
			Integer popedValue = i_ls1.pop();
			System.out.println("the Value poped of the stack was " + popedValue);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing the size and isEmpty methods on an empty LinkedStack
		System.out.println("Testing the size and isEmpty methods on an empty LinkedStack");
		System.out.println("The size of the i_ls1 stack is: " + i_ls1.size());
		if(i_ls1.isEmpty())
			System.out.println("i_ls1 is empty");
		else
			System.out.println("i_ls1 in not empty");
		
		//testing push on an empty stack
		System.out.println();
		i_ls1.push(6);
		System.out.println("Testing top, size and isEmpty methods on a previously empty stack.");
		try
		{
			System.out.println("The top value stroed in the stack i_ls1 is: " + i_ls1.top());
			System.out.println("The size of the i_ls1 stack is: " + i_ls1.size());
			if(i_ls1.isEmpty())
				System.out.println("i_ls1 is empty");
			else
				System.out.println("i_ls1 in not empty");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//begin testing LinkedStack with String type
		//testing constructor for LinkedStack with Integer type
		LinkedStack<String> s_ls1 = new LinkedStack<String>("String 1");
		
		//Testing top, size and isEmpty methods on a Linked Stack with one element
		System.out.println("Testing top, size and isEmpty methods on a Linked Stack with one element.");
		try
		{
			System.out.println("The top value stroed in the stack i_ls1 is: " + s_ls1.top());
			System.out.println("The size of the i_ls1 stack is: " + s_ls1.size());
			if(s_ls1.isEmpty())
				System.out.println("s_ls1 is empty");
			else
				System.out.println("s_ls1 in not empty");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing push method
		System.out.println();
		s_ls1.push("String 2");
		System.out.println("Testing top method on a Linked Stack with two element.");
		try
		{
			System.out.println("The top value stroed in the stack s_ls1 is: " + s_ls1.top());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on s_ls1
		System.out.println();
		System.out.println("Testing pop method on s_ls1");
		
		try
		{
			String spopedValue = new String(s_ls1.pop());
			System.out.println("the Value poped of the stack was " + spopedValue);
			System.out.println("The top value stroed in the stack i_ls1 after pop method is: " + s_ls1.top());
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on i_lst1
		System.out.println();
		System.out.println("Testing pop method on s_ls1 after pop method the top method will throw NullPointerException");
		try
		{
			String spopedValue = new String(s_ls1.pop());
			System.out.println("the Value poped of the stack was " + spopedValue);
			System.out.println("The top value stroed in the stack s_ls1 after pop method is: " + s_ls1.top());
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing pop method on i_lst1
		System.out.println();
		System.out.println("Testing pop method on s_ls1 which is empty and will throw NullPointerException");
		
		try
		{
			String spopedValue = new String(s_ls1.pop());
			System.out.println("the Value poped of the stack was " + spopedValue);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//testing the size and isEmpty methods on an empty LinkedStack
		System.out.println("Testing the size and isEmpty methods on an empty LinkedStack");
		System.out.println("The size of the s_ls1 stack is: " + s_ls1.size());
		if(s_ls1.isEmpty())
			System.out.println("s_ls1 is empty");
		else
			System.out.println("s_ls1 in not empty");
		
		//testing push on an empty stack
		System.out.println();
		s_ls1.push("String 5");
		System.out.println("Testing top, size and isEmpty methods on a previously empty stack.");
		try
		{
			System.out.println("The top value stroed in the stack i_ls1 is: " + s_ls1.top());
			System.out.println("The size of the i_ls1 stack is: " + s_ls1.size());
			if(i_ls1.isEmpty())
				System.out.println("s_ls1 is empty");
			else
				System.out.println("s_ls1 in not empty");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception thrown: " + npe.getMessage());
		}
		
		//begin testing ArraylistStacked
		System.out.println();
		System.out.println("****Begin testing ArraylistStacked****");
		
		ArraylistStacked<Integer> i_als1 = new ArraylistStacked<Integer>(1);
		
		//testing top, size and isEmpty methods for ArraylistStacked
		System.out.println("Testing top, size and isEmpty methods for ArraylistStacked stack with 1 element");
		try
		{
			System.out.println("The value stored in the top of the stack is: " + i_als1.top());
			System.out.println("The size of i_als1 is: " + i_als1.size());
			if(i_als1.isEmpty())
				System.out.println("i_als1 is empty");
			else
				System.out.println("i_als1 is not empty");

		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		//testing push method
		System.out.println();
		i_als1.push(5);
		System.out.println("Testing top and size methods on a ArraylistStacked with two elements.");
		try
		{
			System.out.println("The top value stroed in the stack i_als1 is: " + i_als1.top());
			System.out.println("The size of the stack i_als1 is: " + i_als1.size());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		//testing pop method
		System.out.println();
		System.out.println("Testing pop method on a list with two elements.");
		try
		{
			System.out.println("The size of the stack before the pop method is: " + i_als1.size());
			System.out.println("The top value in the stack before the pop method is: " + i_als1.top());
			Integer ipopedValue = i_als1.pop();
			System.out.println("The value poped off the stack was: " + ipopedValue);
			System.out.println("The size of the stack after the pop method is: " + i_als1.size());
			System.out.println("The top value in the stack after the pop method is: " + i_als1.top());
	
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		//testing pop 
		System.out.println();
		System.out.println("Testing pop method on a list with one element after the pop the top method will trow and excpetion.");
		try
		{
			System.out.println("The size of the stack before the pop method is: " + i_als1.size());
			System.out.println("The top value in the stack before the pop method is: " + i_als1.top());
			Integer ipopedValue = i_als1.pop();
			System.out.println("The value poped off the stack was: " + ipopedValue);
			System.out.println("The size of the stack after the pop method is: " + i_als1.size());
			System.out.println("The top value in the stack after the pop method is: " + i_als1.top());
	
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		System.out.println();
		System.out.println("Testing pop method on an empty list the pop method will trow an excpetion.");
		try
		{
			Integer ipopedValue = i_als1.pop();
			System.out.println("The value poped off the stack was: " + ipopedValue);
	
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		System.out.println();
		System.out.println("Testng the size and isEmpty methods on an empty list");
		System.out.println("The size of the stack after the pop method is: " + i_als1.size());
		if(i_als1.isEmpty())
			System.out.println("i_als1 is empty");
		else
			System.out.println("i_als1 is not empty");
		
		
		System.out.println();
		i_als1.push(10);
		System.out.println("Testing top and size methods on a ArraylistStacked that was empty.");
		try
		{
			System.out.println("The top value stroed in the stack i_als1 is: " + i_als1.top());
			System.out.println("The size of the stack i_als1 is: " + i_als1.size());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
		
		System.out.println();
		for(int i = 0; i < 10; i++)
			i_als1.push(i);
		
		System.out.println("Testing top and size methods on a ArraylistStacked that has added more elements then the initital size of arrayList.");
		try
		{
			System.out.println("The top value stroed in the stack i_als1 is: " + i_als1.top());
			System.out.println("The size of the stack i_als1 is: " + i_als1.size());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
		}
				
	}//end main method

}//end class
