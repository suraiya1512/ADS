package PRACTISE;

public class MethodParametersEx3 {
	static int method(int x ,int y) {
	//return x*y;	
	return Math.max(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  int z = method(3,5);
      // System.out.println("Product of two numbers = " + method(4,5));
       System.out.println("Biggest number is " + method(4,5));
	}

}
