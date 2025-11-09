package TEST;

import java.util.Scanner;

public class t10 {

	public static void main(String[] args) {
		// PALINDROME OR NOT
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();
		in.close();
		
		int num = n;
		int rev = 0;
		
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		if(rev==num)
		
			System.out.println(rev+" is a Palindrome");
		
		else
			System.out.println(num+ " is not a Palindrome");
	}

}
