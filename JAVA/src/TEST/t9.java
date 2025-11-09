package TEST;

import java.util.Scanner;

public class t9 {

	public static void main(String[] args) {
		// Reverse a NO
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a No.");
	int n = in.nextInt();
	int rev = 0;
	in.close();
	
	
	//APPROACH 1
	/*while(n!=0)
	{
		int rem = n%10;
		rev = rev*10+rem;
		n=n/10;
	}*/
	
	//APPROACH 2
	
	for(;n!=0;n=n/10)
	{
		int rem = n%10;
		rev = rev*10+rem;
	}
	System.out.println("Reverse NO is : "+rev);	
		
		
	}

}
