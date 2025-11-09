package PAVAN;

// Parameters passed to the main method

public class StaticMain {

	public static void main(String[] args) {
	//Static.display();
	
	Static O = new Static();
	//O.show();
	O.print();
	System.out.println(Static.s.length());
	
	System.out.println(args.length);
	
	for(String value:args)
	{
		System.out.println(value);
	}
	
	}
}  
