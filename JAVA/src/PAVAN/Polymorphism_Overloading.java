package PAVAN;

public class Polymorphism_Overloading {
	int a=10;
	int b=20;  
	void Sum()
	{
		System.out.println(a+b);
	}
	void Sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void Sum(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void Sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void Sum(double a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void Sum(int a, double b, int c)
	{
		System.out.println(a+b+c);
	}	

	public static void main(String[] args) {
	
    Polymorphism_Overloading O = new Polymorphism_Overloading();
    O.Sum();
    O.Sum(10,20);
    O.Sum(10,0.5);
    O.Sum(10,20,30);
    O.Sum(5.5,10,20);
    O.Sum(10,5.5,20);  
   		
}

}
