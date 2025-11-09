package PAVAN;

class Zoo
{
	void m()
	{
		System.out.println("Childrens like Zoo");
	}
}
class Animal extends Zoo
{
	void m1()
	{
		System.out.println("I Afraid of Tiger");
	}
}   
class Birds extends Zoo
{
	void m2()
	{
		System.out.println("Colorful parrot is my Favourite in Birds");
	}
}
class Park extends Zoo
{
	void m3()
	{
		System.out.println("Childrens play in swings");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Park O = new Park();
 O.m();
 O.m3();
 Birds O1 = new Birds();
 O1.m();
 O1.m2();
 
 	}

}
