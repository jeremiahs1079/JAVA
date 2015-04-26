import java.util.Stack;
/**
 * Tree Node for AVL tree
 * 
 * @author Huiping Cao
 *
 */
class AVLNode{
	private int data; 	//the element value for this node
	private AVL left;	//the left child of this node
	private AVL right;	//the right child of this node
	private int height; //height of the tree rooted at this node 
		
	public AVLNode()				{	data = 0; left = new AVL(); right = new AVL(); height = 0;}
	public AVLNode(int initData)	{	data = initData; left = new AVL();	right = new AVL();	height = 0;}
	
	/**
	 * Constructor with the initial element, initial left and right children
	 * @param initData: the initial element
	 * @param initLeft: left child
	 * @param initRight: right child
	 */
	public AVLNode(int initData, AVL initLeft, AVL initRight){
		data = initData;
		left = initLeft;
		right = initRight;
		height = 1;
	}

	
	
	public int getData()	{ return data; }
	public AVL getLeft() 	{ return left; }
	public AVL getRight() 	{ return right; }
	public int getHeight()	{ return height;}
	public void setData(int data)	{this.data = data;}
	public void setLeft(AVL left)	{ this.left = left;}
	public void setRight(AVL right)	{ this.right = right;}

	/**
	 * Set the height of the tree rooted at this node
	 */
	public void setHeight()
	{
		this.height = 1+Math.max(getLeftHeight(), getRightHeight());
	}
	
	
	/**
	 * Convert this BTNode to a string
	 */
	public String toString()
	{
		String str="";
		if(left==null) str +="(null)";
		else str +="("+left.getRoot().getData()+")";
		
		str += data;
		
		if(right==null) str +="(null)";
		else str +="("+right.getRoot().getData()+")";
		
		return str;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	//Rebalancing related methods
	
	
	
	/**
	 * Get the height of the left subtree
	 */
	public int getLeftHeight(){
		if(left==null||left.getRoot()==null) 	return 0;
		else return left.getRoot().getHeight();
	}
	
	/**
	 * Get the height of the right subtree
	 * @return: the height of the right sub-tree
	 */
	public int getRightHeight(){
		if(right==null||right.getRoot()==null) 	return 0;
		else return right.getRoot().getHeight();
	}
	
}


public class AVL {
	private AVLNode	root; //instance variable to denote the root of the AVL tree
	
	//Constructors for the AVL tree
	public AVL()		{root = null;}
	public AVL(int e)	{root = new AVLNode(e,new AVL(),new AVL());}
	
	//Basic set and get methods
	public AVLNode getRoot() 			{return root;}
	public void setRoot(AVLNode _root) 	{this.root = _root;}
	public boolean isEmpty()			{return (root==null);}
	
	private AVL getLeftSubtree()	{ return root.getLeft();	}
	private AVL getRightSubtree()	{ return root.getRight();	}
	private void setHeight()		{root.setHeight(); }
	
	/**
	 * Check whether the tree (rooted at this node) is right heavy or not
	 * @return
	 */
	private boolean rightHeavy(){
		return (root.getLeftHeight() < root.getRightHeight());
	}
	
	/**
	 * Check whether the tree (rooted at this node) is left heavy or not
	 * @param node
	 * @return
	 */
	private boolean leftHeavy(){
		return (root.getLeftHeight() > root.getRightHeight());
	}
	
	/**
	 * Check whether the tree (rooted at this node) is right too heavy or not
	 * @return
	 */
	private boolean rightTooHeavy(){
		return ((root.getLeftHeight()+1)< root.getRightHeight());
	}
	
	/**
	 * Check whether the tree (rooted at this node) is left too heavy or not
	 * @param node
	 * @return
	 */
	private boolean leftTooHeavy(){
		return (root.getLeftHeight() > (root.getRightHeight()+1));
	}
	
	
	/**
	 * Traversal the tree in-order and print it
	 */
	public void inOrderTraversal(){
		inOrderTraversal(0);
	}
	
	/**
	 * Private function to print the tree with in-order traversal
	 * @param indentation: the number of space before the data, to make the printing more beautiful
	 */
	private void inOrderTraversal(int indentation){
		if(root!=null){
			if(root.getRight()!=null)root.getRight().inOrderTraversal(indentation+1);
			for(int i=0;i<indentation*2;i++)
				System.out.print(" ");
			System.out.println(root.getData());
			if(root.getLeft()!=null)root.getLeft().inOrderTraversal(indentation+1);
		}
	}
	
	public String inOrderStr()
	{
		if(root!=null)
			return  (root.getLeft().inOrderStr() + " " + root.getData() + " " + root.getRight().inOrderStr());
		else
			return "";
	}

	/**
	 * Print the tree using pre-order traversal strategy recursively.
	 */
	public void preOrderPrtRecursive(){
		if(root==null) return;
		
		System.out.print(root.getData()+" ");
		this.getLeftSubtree().preOrderPrtRecursive();
		this.getRightSubtree().preOrderPrtRecursive();
	}
	
	/**
	 * Mehtod to insert an element into the tree
	 * @param e
	 * element to be inserted
	 * @author Jeremiah Smith
	 */
	public void insert(int e)
	{
		if(root == null)
		{
			root = new AVLNode(e);
			return;
		}
		
		if(e <= root.getData())
		{
			root.getLeft().insert(e);
			setHeight();
			Rebalance();
			return;
		}
		
		if(e > root.getData())
		{
			root.getRight().insert(e);
			setHeight();
			Rebalance();
			return;
		}
		
	}
	
	/**
	 * Recursive method to remove an element from the tree.
	 * @param e
	 * Element to be removed from the tree
	 * @return
	 * true if element was removed false if element was not removed or did not exist in the tree.
	 */
	public boolean remove(int e)
	
	{
		if(root == null)
			return false;
		
		if(e == root.getData())
		{
			if(root.getLeft().root == null && root.getRight().root == null)
			{
				root = null;
				return true;
			}
			
			if(root.getLeft().root != null && root.getRight().root == null)
			{
				root = root.getLeft().root;
				setHeight();
				//Rebalance();
				return true;
			}
				
			
			if(root.getLeft().root == null && root.getRight().root != null)
			{
				root = root.getRight().root;
				setHeight();
				//Rebalance();
				return true;
			}
			
			if(root.getLeft().root != null && root.getRight().root != null)
			{
				
				AVL cursor = this;
				
				while(cursor != null && cursor.root.getRight().root != null)
					cursor = cursor.getRightSubtree();
				
				root.setData(cursor.root.getData());
				cursor.root = null;
				setHeight();
				Rebalance();
				return true;
			}
		}
		
		if(e < root.getData())
		{
			return root.getLeft().remove(e);
		}
		
		if(e > root.getData())
		{
			return root.getRight().remove(e);
		}
		
		
		return false;
	}
	
	
	/**
	 * Method to rotate the tree left
	 * @author Jeremiah Smith
	 */
	public void rotateLeft()
	{
		System.out.println("Rotating Left:");
		AVL b = new AVL();
		b.root = getRightSubtree().root;
		getRightSubtree().setRoot(getRightSubtree().getLeftSubtree().getRoot());
		b.getLeftSubtree().setRoot(root);
		setRoot(b.root);
	}
	
	/**
	 * Method to rotate the tree right
	 * @author Jeremiah Smith
	 */
	public void rotateRight()
	{
		System.out.println("Rotating Right:");
		AVL b = new AVL();
		b.root = getLeftSubtree().root;
		getLeftSubtree().setRoot(getLeftSubtree().getRightSubtree().getRoot());
		b.getRightSubtree().setRoot(root);
		setRoot(b.root);
	}
	
	/**
	 * Method to re-balance the AVL Tree
	 * @author Jeremiah Smith
	 */
	public void Rebalance()
	{
		if(root == null)
			return;
		
		if(rightTooHeavy())
		{
			System.out.println("Right Too Heavy");
			if(rightHeavy())//case 1
			{
				System.out.println("Right Too Heavy -> Right Heavy");
				rotateLeft();
				return;
			}
				
			else if(leftHeavy())//case 3
			{
				System.out.println("Right Too Heavy -> Left Heavyeavy");
				getRightSubtree().rotateRight();
				rotateLeft();
				return;
			}
				
			
		}
		else if(leftTooHeavy())
		{
			System.out.println("Left Too Heavy");
			if(leftHeavy())//case 2
			{
				System.out.println("Left Too Heavy -> Left Heavy");
				rotateRight();
				return;
			}
			else if(rightHeavy())//case 4
			{
				System.out.println("Left Too Heavy -> Right Heavy");
				getLeftSubtree().rotateLeft();
				rotateRight();
				return;
			}
		}
	}
	
	public int countOccurrences(int e)
	{
		int count = 0;
		if(root == null)
			return 0;
		if(root.getData() == e)
			count++;
		count = count + root.getLeft().countOccurrences(e) + root.getRight().countOccurrences(e);
		
		return count;
	}
	
	/**
	 * Method to print the tree with pre-order traversal non-recursive
	 */
	public void preOrderPrtNonRecursive()
	{
		if(root ==null)
			return;
		//stack to hold the nodes of the tree
		Stack<AVLNode> n = new Stack<AVLNode>();
		//push the initial root of the tree
		n.push(root);
		
		//loop while the stack is not empty
		while(!n.empty())
		{
			//declare a node and pop the first node of the stack and print its data
			AVLNode node = n.pop();
			System.out.print(node.getData() + " ");
			
			//if nodes right trees root is not null push it on the stack
			if(node.getRight().root != null)
				n.push(node.getRight().root);
			//if nodes left trees root is not null push it on the stack
			if(node.getLeft().root != null)
				n.push(node.getLeft().root);
				
		}
	}
}

