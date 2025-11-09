package PAVAN;

public class ThisUsingMethod {

	int x,y;
	
	void add(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(x+y);
		System.out.println(x-y);
	}
	
}
