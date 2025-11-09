package ASSIGNMENTS;
/* ASSIGNMENT 3.2
 * AUTHOR SURAIYA
 * PROGRAM TO ILLUSTRATE MULTILEVEL INHERITANCE-CHILD CLASS INHERITS INTERMEDIATE & PARENT CLASS
 */
public class MultilevelInheritance {    

	public static void main(String[] args) {     // main method
		// TODO Auto-generated method stub
		C obj =new C();            // Object created for child class
		obj.basic();        //calling method of parent class
 		obj.net1();         //calling method of intermediate class
		obj.net2();         //calling method of child class class 
	}
}
class A{                         // parent class
	void basic(){
		System.out.println("Calling Facility Available");
}
}
class B extends A{                //intermediate class
	void net1(){
		System.out.println("4G Network");
}
}
class C extends B{                //child class
	void net2(){
		System.out.println("5G Network");
}
}
