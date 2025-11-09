package ASSIGNMENTS;
/* ASSSIGNMENT 3.1
 * AUTHOR SURAIYA
 * PROGRAM TO ILLUSTRATE SINGLE INHERITANCE - CHILD CLASS INHERITS PARENT CLASS
 */

public class SingleInheritance  // parent class
{
	int l = 10;

	public static void main(String[] args)  // main method
	{
		// TODO Auto-generated method stub
	Cal Obj = new Cal();
    System.out.println("Area of Rectangle =" + Obj.c); //printing value of c from child class
    
	}
}
class Cal extends SingleInheritance  // child class inherits parent class
{
	int b = 20;
	int c = l*b;
}
