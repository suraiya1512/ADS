package PAVAN;

class A
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B O = new B();
		O.sub(100, 50);
		O.add(200, 100);
	}

}
