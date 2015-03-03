package csc300TowersofHanoi;

public class Tower {

	private Disc top; 

	public Tower()
	{
		top = null; 
	}

	public Disc peek()
	{
		return top; 
	}
	
	public Disc removeDisc()
	{
		return this.top; 
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
