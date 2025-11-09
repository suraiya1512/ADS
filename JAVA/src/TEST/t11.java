package TEST;

import java.util.Scanner;

public class t11 {

	public static void main(String[] args) {
		// COUNT A DIGIT IN A NO
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a No.");
		int n = in.nextInt();
		int count =0;
		in.close();
		
		while(n!=0) 
		{
		n=n/10;
		count++;
		}
			System.out.println("Count of Digit : "+count);
		

	}

}
