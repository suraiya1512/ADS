package TEST;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args)
	{
//		String s= " Welcome";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = in.next();
		
		String rev="";
		
		for (int i=0;i<s.length();i++)
		{
		rev = s.charAt(i)+rev;
		}
System.out.println(rev);

in.close();
}
}
