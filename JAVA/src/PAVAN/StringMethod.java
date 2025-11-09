package PAVAN;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "    Welcome";
		String s2 = " to Java";
		String s3 = "Selenium";
		String s4 = "len";
		String s5 = "selenium";
		
		//Concatenation
		String s = s1.concat(s2).concat(s3);
		System.out.println(s);
		System.out.println();
		
		//TRIM Method
		System.out.println(s.trim());
		System.out.println();
		
	    // charAt Method
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(13));
		System.out.println();
		
		
		//Contains
		System.out.println(s3.contains(s4));
		System.out.println(s2.contains("To"));
		System.out.println();
		
	    //== , equals(), equalIgnoreCase() 
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println();
	
	
	
	}
	}
