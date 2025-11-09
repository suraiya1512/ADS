package PRACTISE;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Widening Casting which converts smaller value to larger automatically
		byte a = 120;
		int b = 256 ;
		b=a;    
		System.out.println("Widening Casting = "+b);

		//Narrowing Casting
		int c = 257;
		byte d = (byte)c;    // It will modulo with 256 ....i.e.remainder of 257/256 
		System.out.println("Narrowing Casting = "+d);
		
		double e = 256.75;
		int f = (int)e;
		System.out.println("Narrowing Casting = " +f);
		
		// Type Promotion
		byte g = 20;
		byte h = 30;
		int r = g*h; // o/p is out of range of byte hence we can promote to integer.
		System.out.println("Promotion = "+r);
		
		
		
	}

}
