package assess;


public class Test {
	public static void main(String[] args)
	{
		String s = "Welcome";
	    for(int i=0;i<s.length();i++)
	    {
	    	char c=s.charAt(i);
	    	if(s.indexOf(c) != s.lastIndexOf(c))
	    	{
	    		System.out.println("First Repeated Character is " + c);
	    		return;
	    	}
	    }
	    System.out.println("No Repeated character");
	}
} 