package csc300TowersofHanoi;

public class Driver {

	public static void main(String args)
	{
		Tower t = new Tower(); 
		t.addDisc(new Disc(1)); 
		t.addDisc(new Disc(0));
		t.addDisc(new Disc(5));
		t.display();
	}
}
