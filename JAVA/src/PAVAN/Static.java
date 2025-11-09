package PAVAN;

public class Static {

	static int a=10;
	int b=20;
	static String s = "Welcome";
	static void display()
	{
		System.out.println("This is static Method");
		}
	void show()
	{
		System.out.println("This is Non static Method");
					
	}
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		display();
		show();
					
	}
		
}
