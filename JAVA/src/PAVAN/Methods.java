package PAVAN;

public class Methods {
	
	void m1()   //No Parameters and No return
	{
		System.out.println("Hi");
	}
	String m2()   //No Parameters but return value
	{
		return("Hello") ;
	}
	void m3(String a)   //Takes Parameters and No return
	{
		System.out.println(a);
	}
	String m4(String b)   //Takes Parameters but return value
	{
		return("Suraiya"+  b) ;
	}

	public static void main(String[] args) {
		
		Methods O = new Methods();
		O.m1();
		System.out.println(O.m2());
		O.m3("Welcome");
		System.out.println(O.m4(" Banu"));
	}
}
