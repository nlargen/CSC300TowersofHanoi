package csc300TowersofHanoi;

import java.util.Scanner;

public class Game {

	private Tower[] thetowers = new Tower[3]; 



	public void on() throws Exception 
	{
		thetowers[0] = new Tower(); 
		thetowers[1] = new Tower(); 
		thetowers[2] = new Tower(); 
		thetowers[0].addDisc(new Disc(3)); 
		thetowers[0].addDisc(new Disc(2)); 
		thetowers[0].addDisc(new Disc(1)); 
		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to play a game? =>");
		String val = input.nextLine().trim();  
		while(val.equalsIgnoreCase("Yes"))
		{
			this.show();
			System.out.print("Enter Source Tower Index: ");
			int source = input.nextInt();
			System.out.print("Enter Destination Tower Index: ");
			int dest = input.nextInt();
			Disc d2Move = this.thetowers[source].removeDisc();
			if(!this.thetowers[dest].addDisc(d2Move))
			{
				this.thetowers[source].addDisc(d2Move);
				System.out.println("Illegal Move");
			}
			// check for winner
			if(this.thetowers[this.thetowers.length-1].getNumDisc() == 3)
			{
				break; 
			}
			this.show();
			System.out.println("Winner!!!!"); 
		}

	}


	private void show()
	{
		for(int i = 0; i< this.thetowers.length; i++)
		{
			System.out.println("Tower Index:" + i);
			this.thetowers[i].display(); 
			System.out.println(""); 
		}

	}


}
