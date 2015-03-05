package csc300TowersofHanoi;

import java.util.Scanner;

public class Tower {

	private Disc top; 


	public Tower()
	{
		this.top = null; 
	}


	public void on() throws Exception 
	{
		Scanner input = new Scanner(System.in);
		Tower[] thetowers = new Tower[3]; 
		thetowers[0] = new Tower(); 
		thetowers[1] = new Tower(); 
		thetowers[2] = new Tower(); 
		thetowers[0].addDisc(new Disc(3)); 
		thetowers[0].addDisc(new Disc(2)); 
		thetowers[0].addDisc(new Disc(1)); 
		System.out.println("Would you like to play a game? =>");
		String val = input.nextLine().trim();  
		while(val.equalsIgnoreCase("Yes"))
		{

			System.out.print("Enter a command:=>");
			String val1 = input.nextLine().trim();
			if(val1.equalsIgnoreCase("quit"))
			{
				break; 

			}
			else if(val1.equalsIgnoreCase("show"))
			{
				for(int i = 0; i < thetowers.length; i++)
				{
					if(thetowers[i].top == null)
					{
						System.out.println("**********");
						System.out.println("Saruman has left the building");
					}
					else 
					{
						System.out.println("********");
						Disc curr = thetowers[i].top; 
						while(curr !=null)
						{
							System.out.println(curr.getSize());
							curr = curr.getNextDisc(); 
						}
					}
					System.out.println("*****" + i + "***"); 
				}
			}
			else if(val1.equalsIgnoreCase("Move"))
			{
				System.out.println("Tower to move from? ==>"); 
				String fromtower = input.nextLine().trim(); 
				System.out.println("Tower to move to? =>"); 
				String totower = input.nextLine().trim(); 
				if(thetowers[Integer.parseInt(totower)].top == null )
				{
					int temp = thetowers[Integer.parseInt(fromtower)].removeDisc().getSize();
					thetowers[Integer.parseInt(totower)].addDisc(new Disc(temp));
					System.out.println("The Move Was legit I repeat the Move was legit"); 

				}
				else
				{
					if(thetowers[Integer.parseInt(totower)].top.getSize() > thetowers[Integer.parseInt(fromtower)].top.getSize())
					{
						int temp = thetowers[Integer.parseInt(fromtower)].removeDisc().getSize(); 
						thetowers[Integer.parseInt(totower)].addDisc(new Disc(temp)); 
						System.out.println("Another Legit Move!!!!");
					}
					else 
					{
						System.out.println("You fail at life"); 
					}
				}
			}

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
		}
		return nodeToReturn; 

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
