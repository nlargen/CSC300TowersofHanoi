package csc300TowersofHanoi;
import java.util.Scanner;

public class Gameplay {
	
	private Tower[] thetower;
	private Tower[] temptower; 
	
		
	
	public void Gameplay()
	{  
		this.thetower = new Tower[3];
		this.temptower = new Tower[3];
	
		
	}
	public void show()
	{
		// tower 1
		System.out.println("****"  +"****");
		System.out.println("****"  + "****");
		System.out.println("****" + "****");
		
		//tower 2
		
		System.out.println("****" + "****");
		System.out.println("****" + "****");
		System.out.println("****" + "****");
		
		//tower 3 
		
		System.out.println("****" + "****");
		System.out.println("****" + "****");
		System.out.println("****" + "****");
		
	}
	public void on() throws Exception
	{
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Would you like to play a game?"); 
		String val = input.nextLine(); 
		while(val.equalsIgnoreCase("Yes"))
		{
			System.out.println("Enter the tower you would like to move from: "); 
			String val1 = input.nextLine(); 
			System.out.println("Enter the tower you would like to move to: ");
			String val2 = input.nextLine(); 
			if(val1.equalsIgnoreCase("1")) 
			{
				this.thetower[0].addDisc(this.thetower[0].removeDisc());
				//this.show();
			}
			else if (val1.equalsIgnoreCase("2"))
			{
				this.temptower[1].addDisc(this.thetower[1].removeDisc()); 
				//this.show();
			}
			else if(val1.equalsIgnoreCase("3"))
			{
				this.temptower[2].addDisc(this.thetower[2].removeDisc()); 
				//this.show();
			}
			if(val2.equalsIgnoreCase("1"))
			{
				this.thetower[0].addDisc(this.temptower[0].removeDisc());
				//this.show();
			}
			else if(val2.equalsIgnoreCase("2"))
			{
				//this.thesecondtower.addDisc(this.temptower.removeDisc()); 
				//this.show();
			}
			else if(val2.equalsIgnoreCase("3"))
			{
				//this.thethirdtower.addDisc(this.temptower.removeDisc()); 
				//this.show();
			}
			
		}
		
	}

}
