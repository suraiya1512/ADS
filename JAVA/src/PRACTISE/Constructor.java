 package PRACTISE;


public class Constructor {
	
	int l , b,d; 
	String c;
	
	Constructor(int x, int y, String z){
		l = x;
		b = y;
		c = z;
	    d = x-y;
			}
	 void display() {
		System.out.println(c + (l+b));
	}
	 void display1() {
			System.out.println(c + (l*b));
			System.out.println("Subtracion of two numbers =" + d);
		}
	 void display2() {
			System.out.println(c + Math.pow(l,b));
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Constructor Obj = new Constructor(5,10,"Sum of two numbers =");
      Obj.display();
      Constructor Obj1 = new Constructor(20,10,"Product of two numbers =");
      Obj1.display1();
      Constructor Obj2 = new Constructor(3,2,"Square of number =");
      Obj2.display2();
	}

}
