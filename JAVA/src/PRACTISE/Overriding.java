package PRACTISE;

public class Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Green obj1 = new Green();     // Creating object for child class     
		obj1.show();                   // Calling method which has overridden
		Red obj = new Red();
		obj.show();
	}
}
class Red{     // Parent class
	void show() {                  //defining same method in parent class
		System.out.println("Stop");
	}
}
class Green extends Red{              // child class
	void show() {                     //defining same method in child class 
		System.out.println("Go");
	}
}

