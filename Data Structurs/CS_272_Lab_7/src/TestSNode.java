
public class TestSNode 
{
	public static void main(String args[])
	{
		SNode<Integer> testnode = new SNode<Integer>(5);
		SNode<Integer> testnode2 = new SNode<Integer>(4);
		
		System.out.println("testnode data = " + testnode.getData());
		
		testnode.setLink(testnode2);
		
		System.out.println("testnode data = " + testnode.getLink().getData());
	}
}
