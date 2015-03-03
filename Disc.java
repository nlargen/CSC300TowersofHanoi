package csc300TowersofHanoi;

public class Disc extends Object{

	private int size; 
	private Disc nextDisc; 
	
	public String toString()
	{
		return "" + this.size; 
	}
	public Disc(int size)
	{
		this.size = size; 
		this.nextDisc = null; 
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Disc getNextDisc() {
		return nextDisc;
	}

	public void setNextDisc(Disc nextDisc) {
		this.nextDisc = nextDisc;
	}
	
	
}
