package PRACTISE;
//CONSTRUCTOR AND METHOD
class Emp
{
	int id, salary;     //declaring local variables
	String name;
Emp(int a , String b , int c)   ///Constructor
{
	id = a;                  // initializing variables
	salary =c; 
	name = b;	
}
void set(int sal) {            // method used to change the value of variable
	salary = sal;
	System.out.println("Id :"+id+" "+"Name :"+name+" "+"Salary : "+salary);
}
void display() {                // method to print
	System.out.println("Id :"+id+" "+"Name :"+name+" "+"Salary : "+salary);
		}
}

public class ConstructorAndMethod {            // main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Emp Ob = new Emp(1,"Asha", 2000);//Object created and parameter passed to constructor
		   Ob.display();
		   Ob.set(3000);           //new value 
		  
		  /* System.out.println("ID : "+Ob.id); 
		  System.out.println("Name : "+Ob.name); 
		  System.out.println("Salary : "+Ob.salary); */
		}
		}
		
