package csc300TowersofHanoi;
import java.util.Scanner;

public class Gameplay {
	
	private Tower thetower;
	private Tower thesecondtower; 
	private Tower thethirdtower; 
	private Tower temptower; 
		
	
	public Gameplay()
	{
		this.thesecondtower = new Tower(); 
		this.thethirdtower = new Tower();
		this.thetower = new Tower(); 
		this.thetower.addDisc(1); 
		this.thetower.addDisc(2); 
		this.thetower.addDisc(3);
		
	}
	public void show()
	{
		// tower 1
		System.out.println("****" + "****");
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
				int num1 = this.thetower.removeDisc().getSize();
				System.out.print(num1);
				this.temptower.addDisc(num1);
				 
				//this.temptower.addDisc(this.thetower.removeDisc());
				//this.show();
			}
			else if (val1.equalsIgnoreCase("2"))
			{
				this.temptower.addDisc(this.thesecondtower.removeDisc()); 
				//this.show();
			}
			else if(val1.equalsIgnoreCase("3"))
			{
				this.temptower.addDisc(this.thethirdtower.removeDisc()); 
				//this.show();
			}
			if(val2.equalsIgnoreCase("1"))
			{
				this.thetower.addDisc(this.temptower.removeDisc());
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
