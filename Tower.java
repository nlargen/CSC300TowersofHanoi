package csc300TowersofHanoi;

public class Tower {

	private Disc top; 
	 

	public Tower()
	{
		this.top = null; 
	}
//peek 
	public Disc peek()
	{
		return top; 
	}
	
	//pop 
	public Disc removeDisc()
	{
		Disc nodeToReturn = top; 
		if(this.top != null)
		{
		top = top.getNextDisc();
		}
		return nodeToReturn; 
		
	}
	//push
	public void addDisc(int a)
	{
		Disc n = new Disc(a); 
		if(this.top == null)
		{
			this.top = n; 
		}
		else 
		{
			n.setNextDisc(this.top);
			this.top = n; 
		}
	}
	boolean addDisc(Disc d)
	{
		if(this.top == null)
		{
			top = d; 
			return true; 
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top);
			top = d; 
			return true; 
		}
		return false; 
	}
	

	public void display()
	{
		if(this.top == null)
		{
			System.out.println("The Tower Has Fallen"); 
		}
		else
		{
			 Disc curr = this.top;
			do
			{
				
				System.out.println(curr.getSize()); 
				curr = curr.getNextDisc(); 
			}
			while(curr != null);
		}
	}
	
}
