package TEST;

import java.util.Scanner;

public class t3 {

	public static void main(String[] args) {
		
		//SMALLEST OF THREE NUMBERS USING IF ELSE
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the First No.");
		int n1 = in.nextInt();
		
		System.out.println("Enter the Second No.");
		int n2 = in.nextInt();
		
		System.out.println("Enter the Third No.");
		int n3 = in.nextInt();
		
		in.close();
		
		if(n1<n2 && n1<n3)
		{
			System.out.println(n1 + "is Smallest ");
		}
		else if(n2<n1 && n2<n3)
		{
			System.out.println(n2 + "is Smallest ");
		}
		else
			System.out.println(n3 + " is smallest");
		
	}

}
