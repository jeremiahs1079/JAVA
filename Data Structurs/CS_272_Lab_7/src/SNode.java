
public class SNode<E> 
{
	//member variables
	private E data;
	private SNode<E> link;
	
	//constructor
	public SNode(E _data)
	{
		this.data = _data;
	}
	
	public E getData()
	{
		return data;
	}
	
	public void setData(E _data)
	{
		this.data = _data;
	}
	
	public SNode<E> getLink()
	{
		return link;
	}
	
	public void setLink(SNode<E> _link)
	{
		this.link = _link;
	}
}
