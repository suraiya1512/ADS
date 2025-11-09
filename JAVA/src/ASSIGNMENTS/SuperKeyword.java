package ASSIGNMENTS;
/*ASSIGNMENT -4.2
 * AUTHOR - SURAIYA
 PROGRAM TO ILLUSTRATE SUPER KEYWORD TO INVOKE PARENT CLASS VARIABLE, METHOD, CONSTRUCTOR */
public class SuperKeyword {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Actor1 Obj = new Actor1();     //creating object for child class1
    Obj.show();
    Actor2 O = new Actor2();        //creating object for child class2 
    O.display();
    Salary1 O1 = new Salary1();
    O1.show();
    }      //creating object for constructor2
}
class Actor{                     // parent class
	String name = "Ajith";
	void print(){
		System.out.println("He knows Fighting");}
}
class Actor1 extends Actor {        //child class1
	String name = "Vijay";
	void show () {
	System.out.println("Actor - "+name);        //print variable of current class
	System.out.println("Actor - "+super.name); //invoke the variable of parent class(Actor)
}
}
class Actor2 extends Actor{           //child class 2
	void print(){
		System.out.println("He knows dancing");
		}
void display() {
	print();           //invoke child class2 method
	super.print();}     // invoke parent class method 
}
class Salary{           //super class for constructor
	Salary(){           //super class constructor
		System.out.println("Ajith Salary is 5 Crore");	}
}
class Salary1 extends Salary{          //sub class for constructor
	Salary1(){                         // subclass constructor
		super();
		System.out.println("Vijay Salary is 6 Crore");	}
	void show() {
		System.out.println("Hello");
	}
}

