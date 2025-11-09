package PAVAN;

public class ThisUsingConstructor {

	int x,y;
	
	ThisUsingConstructor(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x+y);
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		ThisUsingMethod tk = new ThisUsingMethod();
		tk.add(100,50);
	    tk.show();
		
		ThisUsingConstructor th = new ThisUsingConstructor(200,100);
		th.display();
	}

}
