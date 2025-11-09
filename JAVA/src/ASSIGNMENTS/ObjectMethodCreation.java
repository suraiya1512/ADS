package ASSIGNMENTS;
/*
 * ASSIGNEMENT 1
 * AUTHOR - SURAIYA
 * PROGRAM TO ILLUSTRATE CLASS , OBJECT , METHOD CREATION & METHOD INVOKING
 */

public class ObjectMethodCreation {
	void chocolate1() {           // Method Creation
		System.out.println("    Bounty");
	}
	void chocolate2() {          // Method Creation
		System.out.println("    Dairy Milk");
	}
	void chocolate3() {          // Method Creation
		System.out.println("    5-Star");
	}
	void chocolate4() {          // Method Creation
		System.out.println("    Kit Kat");
	}

	public static void main(String[] args) {  // Main Method
		// TODO Auto-generated method stub
		System.out.println("LIST OF CHOCOLATES");
		ObjectMethodCreation Obj = new ObjectMethodCreation();  // Object Creation
		Obj.chocolate1();   // Method Calling
		Obj.chocolate2();   // Method Calling
		Obj.chocolate3();   // Method Calling
		Obj.chocolate4();   // Method Calling
	}

}
