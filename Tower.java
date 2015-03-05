package csc300TowersofHanoi;

import java.util.Scanner;

public class Tower {

	private Disc top; 
	private Disc numDiscs; 


	public Tower()
	{
		this.top = null; 
		this.numDiscs = null; 
	}
	
	public boolean addDisc(Disc d)
	{
		if(this.top == null)
		{
			top = d; 
			this.numDiscs++; 
			return true; 
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top); 
			
		}
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
			top.setNextDisc(null); 
			this.numDiscs--; 
		return nodeToReturn;
		}
		else 
		{
			return null; 
		}
		 

	}
	//push

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
		else
		{
			return false; 
		}
	}


	public void display()
	{
		System.out.println("****************");
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
		System.out.println("***********"); 
	}

}
