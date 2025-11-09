package ASSIGNMENTS;

class Area{
	int r = 10;
	final double pi = 3.14;
	
void display() {
	System.out.println("Area of Circle = "+ (2*pi*r*r));
}
}
public class FinalKeyword {
	                     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area Obj = new Area();
		Obj.display();
	}	
}
