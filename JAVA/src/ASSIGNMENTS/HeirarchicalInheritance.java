package ASSIGNMENTS;
/*ASSIGNMENT 3.3
 * AUTHOR - SURAIYA
 * PROGRAM TO ILLUSTRATE HIERCHICAL INHERITANCE - TWO OR MORE CHILD CLASS INHERITS PARENT CLASS
 */
public class HeirarchicalInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Diesel Obj =new Diesel();      //OBJECT CREATED FOR CHILD CLASS 2
    Obj.display();                 //CALLING PARENT CLASS 
    Obj.display2();
    Petrol Obj1 =new Petrol();     //OBJECT CREATED FOR CHILD CLASS 1 
    Obj1.display();                //CALLING PARENT CLASS 
    Obj1.display1();
    Gas Obj2 =new Gas();           //OBJECT CREATED FOR CHILD CLASS 3
    Obj2.display();                //CALLING PARENT CLASS
    Obj2.display3();
    Ev Obj3 =new Ev();             //OBJECT CREATED FOR CHILD CLASS 4
    Obj3.display();                 //CALLING PARENT CLASS 
    Obj3.display4();
	}
}
class Car{                     // PARENT CLASS
	void display() {
		System.out.print("I m a car");	}
}
class Petrol extends Car{         // CHILD CLASS 1 INHERITS PARENT CLASS
	void display1() {
		System.out.println(" running with the help of Petrol");	}
}
class Diesel extends Car{          // CHILD CLASS 2 INHERITS PARENT CLASS
	void display2() {
		System.out.println(" running with the help of Diesel");	}
}
class Gas extends Car{             // CHILD CLASS 3 INHERITS PARENT CLASS
void display3() {
     	System.out.println(" running with the help of Gas");}
}
class Ev extends Car{               // CHILD CLASS 4 INHERITS PARENT CLASS
void display4() {
     	System.out.println(" running with the help of Electric Current");		}
}

