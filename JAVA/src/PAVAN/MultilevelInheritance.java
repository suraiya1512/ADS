package PAVAN;

class  Mobile
{
	void show()
	{
		System.out.println("Basic Model - I have calling Facility");
	}
}
class Android extends Mobile
{
	void show1()
	{
		System.out.println("Android - I have video calling Facility");
	}
}
class G4 extends Android
{
	void show2()
	{
		System.out.println("4G - Network is Fast");
	}
}
class G5 extends G4
{
	void show3()
	{
		System.out.println("5G - Network is Very Fast");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	G5 O = new G5();
	O.show();
	O.show1();
	O.show2();	
	O.show3();	
	}

}
